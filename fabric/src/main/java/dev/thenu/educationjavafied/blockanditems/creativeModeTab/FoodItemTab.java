package dev.thenu.educationjavafied.blockanditems.creativeModeTab;

import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.blockanditems.blockFile.FoodItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static dev.thenu.educationjavafied.blockanditems.blockFile.FoodItems.ALL_FOOD_ITEMS;

public class FoodItemTab {
    public static final ResourceKey<CreativeModeTab> FOOD_ITEM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Constants.MOD_ID, "food_creative_tab"));

    public static final CreativeModeTab FOOD_ITEM_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(FoodItems.SALT.asItem()))
            .title(Component.translatable("item_group.educationeditionjavafied.category.name.food_item_creative_tab"))
            .hideTitle()
            .displayItems((_, output) -> {
                for (Item item : ALL_FOOD_ITEMS) {
                    output.accept(item);
                }
            })
            .build();
}
