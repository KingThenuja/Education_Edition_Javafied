package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.recipes;

import net.minecraft.advancements.triggers.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class MaterialReducerRecipeBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final List<ItemStackTemplate> results;
    private final Ingredient ingredient;
    private final RecipeUnlockAdvancementBuilder advancementBuilder = new RecipeUnlockAdvancementBuilder();
    private @Nullable String group;

    private MaterialReducerRecipeBuilder(RecipeCategory category, Ingredient ingredient, List<ItemStackTemplate> results) {
        this.category = category;
        this.results = results;
        this.ingredient = ingredient;
    }

    public static MaterialReducerRecipeBuilder materialReducer(RecipeCategory category, Ingredient inputItem, List<ItemStackTemplate> items) {
        return new MaterialReducerRecipeBuilder(category, inputItem, items);
    }
    public static MaterialReducerRecipeBuilder materialReducerFromStacks(RecipeCategory category, Ingredient inputItem, List<ItemStack> items) {
        List<ItemStackTemplate> templates = items.stream()
                .map(ItemStackTemplate::fromStack)
                .toList();
        return new MaterialReducerRecipeBuilder(category, inputItem, templates);
    }

    @Override
    public RecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        advancementBuilder.unlockedBy(name, criterion);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String group) {
        this.group = group;
        return this;
    }

    @Override
    public ResourceKey<Recipe<?>> defaultId() {
        return RecipeBuilder.getDefaultRecipeId(this.results.getFirst());
    }

    @Override
    public void save(RecipeOutput output, ResourceKey<Recipe<?>> id) {
        MaterialReducerRecipe recipe = new MaterialReducerRecipe(this.ingredient, this.results);
        output.accept(id, recipe, this.advancementBuilder.build(output, id, this.category));
    }
}