package dev.thenu.educationjavafied.blockanditems.creativeModeTab;

import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.blockanditems.blockFile.CompoundItems;
import dev.thenu.educationjavafied.blockanditems.blockFile.ElementBlocks;
import dev.thenu.educationjavafied.blockanditems.blockFile.FoodItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static dev.thenu.educationjavafied.blockanditems.blockFile.CompoundItems.ALL_COMPOUND_ITEMS;

public class SubstanceMadeWithElementTab {
    public static final ResourceKey<CreativeModeTab> SUBSTANCE_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Constants.MOD_ID, "substances_creative_tab"));

    public static final CreativeModeTab SUBSTANCE_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(CompoundItems.BORON_TRIOXIDE.asItem()))
            .title(Component.translatable("item_group.educationeditionjavafied.category.name.substance_creative_tab"))
            .hideTitle()
            .displayItems((_, output) -> {
                for (Item item : ALL_COMPOUND_ITEMS) {
                    output.accept(item);
                }
                output.accept(FoodItems.SALT);
            })
            .build();
}
