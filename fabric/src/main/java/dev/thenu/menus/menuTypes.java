package dev.thenu.menus;

import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.compoundCraftingTable.gui.CompoundCraftingTableMenu;
import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.gui.MaterialReducerMenu;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;

public class menuTypes {
    public static final MenuType<MaterialReducerMenu> MATERIAL_REDUCER_MENU = Registry.register(
            BuiltInRegistries.MENU,
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "material_reducer"),
            new MenuType<>(MaterialReducerMenu::new, FeatureFlags.DEFAULT_FLAGS)
    );
    public static final MenuType<CompoundCraftingTableMenu> COMPOUND_CRAFTING_TABLE_MENU = Registry.register(
            BuiltInRegistries.MENU,
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "compound_crafting_table"),
            new MenuType<>(CompoundCraftingTableMenu::new, FeatureFlags.DEFAULT_FLAGS)
    );
}
