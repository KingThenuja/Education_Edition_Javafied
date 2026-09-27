package dev.thenu.educationjavafied.blockanditems.blockFile;

import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.recipes.MaterialReducerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public class BlockRecipes {
    public static final RecipeSerializer<MaterialReducerRecipe> MATERIAL_REDUCER_RECIPE_RECIPE_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "material_reducer"),
            new RecipeSerializer<>(MaterialReducerRecipe.CODEC, MaterialReducerRecipe.STREAM_CODEC));
    public static final RecipeType<MaterialReducerRecipe> MATERIAL_REDUCER_RECIPE_RECIPE_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "material_reducer"),
            new RecipeType<MaterialReducerRecipe>() {
                @Override
                public String toString() {
                    return "material_reducer";
                }
            });
/*
    public static final RecipeSerializer<CraftingRecipe> COMPOUND_CRAFTING_TABLE_RECIPE_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "compound_crafting_table"),
            new RecipeSerializer<>(CraftingRecipe.KEY_CODEC, CraftingRecipe.STREAM_CODEC));
    public static final RecipeType<MaterialReducerRecipe> COMPOUND_CRAFTING_TABLE_RECIPE_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "compound_crafting_table"),
            new RecipeType<CraftingRecipe>() {
                @Override
                public String toString() {
                    return "material_reducer";
                }
            });*/


    public static void register(){}
}
