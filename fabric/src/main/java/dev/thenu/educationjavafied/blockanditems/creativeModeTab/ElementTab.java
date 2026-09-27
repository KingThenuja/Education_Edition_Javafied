package dev.thenu.educationjavafied.blockanditems.creativeModeTab;

import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.blockanditems.blockFile.ElementBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import static dev.thenu.educationjavafied.blockanditems.blockFile.ElementBlocks.ALL_ELEMENT_BLOCKS;

public class ElementTab {
    public static final ResourceKey<CreativeModeTab> ELEMENTS_CREATIVE_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Constants.MOD_ID, "elements_creative_tab_key"));

    public static final CreativeModeTab ELEMENTS_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ElementBlocks.HYDROGEN.asItem()))
            .title(Component.translatable("item_group.educationeditionjavafied.category.name.elements_creative_tab"))
            .hideTitle()
            .displayItems((_, output) -> {
                for (Block block : ALL_ELEMENT_BLOCKS) {
                    output.accept(block);
                }
            })
            .build();


}
