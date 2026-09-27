package dev.thenu.educationjavafied.blockanditems.creativeModeTab;

import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.blockanditems.blockFile.ChemistryEquipement;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import static dev.thenu.educationjavafied.blockanditems.blockFile.ChemistryEquipement.ALL_CHEMISTRY_EQUIPEMENT;

public class CompoundTablesTab {
    public static final ResourceKey<CreativeModeTab> COMPOUND_TABLES_CREATIVE_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Constants.MOD_ID, "compound_tables_creative_tab"));

    public static final CreativeModeTab COMPOUND_TABLES_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ChemistryEquipement.MATERIAL_REDUCER.asItem()))
            .title(Component.translatable("item_group.educationeditionjavafied.category.name.compound_tables_creative_tab"))
            .hideTitle()
            .displayItems((_, output) -> {
                for (Block block : ALL_CHEMISTRY_EQUIPEMENT) {
                    output.accept(block);
                }
            })
            .build();
}
