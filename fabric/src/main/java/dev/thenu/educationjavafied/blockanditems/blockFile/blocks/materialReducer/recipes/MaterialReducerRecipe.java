package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.recipes;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.thenu.educationjavafied.blockanditems.blockFile.BlockRecipes;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

import java.util.List;

public record MaterialReducerRecipe(Ingredient inputItem, List<ItemStackTemplate> outputs) implements Recipe<SingleRecipeInput> {
    public static MapCodec<MaterialReducerRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Ingredient.CODEC.fieldOf("ingredients").forGetter(MaterialReducerRecipe::inputItem),
            ItemStackTemplate.CODEC.listOf().fieldOf("results").forGetter(MaterialReducerRecipe::outputs)
    ).apply(inst, MaterialReducerRecipe::new));

    public static StreamCodec<RegistryFriendlyByteBuf, MaterialReducerRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC,
                    MaterialReducerRecipe::inputItem,

                    ItemStackTemplate.STREAM_CODEC.apply(ByteBufCodecs.list()),
                    MaterialReducerRecipe::outputs,

                    MaterialReducerRecipe::new);

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    public List<ItemStack> getOutputs() {
        return outputs.stream().map(ItemStackTemplate::create).toList();
    }

    @Override
    public boolean matches(SingleRecipeInput pInput, Level pLevel) {
        if(pLevel.isClientSide()) {
            return false;
        }

        return inputItem.test(pInput.getItem(0));
    }

    @Override
    public ItemStack assemble(SingleRecipeInput pInput) {
        throw new IllegalStateException();
    }

    @Override
    public boolean showNotification() {
        return true;
    }

    @Override
    public String group() {
        return "Material Reduction";
    }


    @Override
    public RecipeSerializer<MaterialReducerRecipe> getSerializer() {
        return BlockRecipes.MATERIAL_REDUCER_RECIPE_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<SingleRecipeInput>> getType() {
        return BlockRecipes.MATERIAL_REDUCER_RECIPE_RECIPE_TYPE;
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.NOT_PLACEABLE;
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }
}