package dev.thenu.educationjavafied.blockanditems.blockFile;

import com.mojang.blaze3d.platform.InputConstants;
import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.compat.modmenu.ModConfigManager;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.List;
import java.util.function.Consumer;

import static dev.thenu.educationjavafied.utils.registering.Registering.registerItem;

public class FoodItems {

    public static final Item SALT = registerItem("salt", properties -> new Item(properties) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            if(ModConfigManager.CONFIG.enableTooltips){
                if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow(), ModConfigManager.CONFIG.moreDetailKeybind)) {
                    builder.accept(Component.translatable("tooltip.educationeditionjavafied.salt").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
                    builder.accept(Component.translatable("tooltip.educationeditionjavafied.salt2").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
                } else {
                    Component keyName = InputConstants.Type.KEYSYM.getOrCreate(ModConfigManager.CONFIG.moreDetailKeybind).getDisplayName();
                    builder.accept(Component.translatable("tooltip.educationeditionjavafied.hold_for_more", keyName)
                            .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
                }
            }
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });

    public static final Item SALTED_COOKED_CHICKEN = registerItem("salted_cooked_chicken",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(0.9F).build())));

    public static final Item SALTED_COOKED_PORKCHOP = registerItem("salted_cooked_porkchop",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(12).saturationModifier(1.1F).build())));

    public static final Item SALTED_COOKED_STEAK = registerItem("salted_cooked_steak",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(12).saturationModifier(1.1F).build())));

    public static final Item SALTED_COOKED_MUTTON = registerItem("salted_cooked_mutton",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final Item SALTED_COOKED_RABBIT = registerItem("salted_cooked_rabbit",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(9).saturationModifier(1.0F).build())));

    public static final Item SALTED_COOKED_COD = registerItem("salted_cooked_cod",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(9).saturationModifier(0.9F).build())));

    public static final Item SALTED_COOKED_SALMON = registerItem("salted_cooked_salmon",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final Item SALTED_BAKED_POTATO = registerItem("salted_baked_potato",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final Item SALTED_DRIED_KELP = registerItem("salted_dried_kelp",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final Item SALTED_BEETROOT_STEW = registerItem("salted_beetroot_stew",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final Item SALTED_MUSHROOM_STEW = registerItem("salted_mushroom_stew",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final Item SALTED_RABBIT_STEW = registerItem("salted_rabbit_stew",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final Item SALTED_SUSPICIOUS_STEW = registerItem("salted_suspicious_stew",
            properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.1F).build())));

    public static final List<Item> ALL_FOOD_ITEMS = List.of(FoodItems.SALT, FoodItems.SALTED_COOKED_CHICKEN, FoodItems.SALTED_COOKED_PORKCHOP, FoodItems.SALTED_COOKED_STEAK, FoodItems.SALTED_COOKED_MUTTON, FoodItems.SALTED_COOKED_RABBIT, FoodItems.SALTED_COOKED_COD, FoodItems.SALTED_COOKED_SALMON, FoodItems.SALTED_BAKED_POTATO, FoodItems.SALTED_DRIED_KELP, FoodItems.SALTED_BEETROOT_STEW, FoodItems.SALTED_MUSHROOM_STEW, FoodItems.SALTED_RABBIT_STEW, FoodItems.SALTED_SUSPICIOUS_STEW);


    public static void register(){Constants.LOG.info("Successfully registered Food Items");
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            for (Item item : ALL_FOOD_ITEMS) {
                output.accept(item);
            }
        });}
}
