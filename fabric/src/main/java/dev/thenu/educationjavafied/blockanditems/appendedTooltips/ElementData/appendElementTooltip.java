package dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData;

import com.mojang.blaze3d.platform.InputConstants;
import dev.thenu.educationjavafied.blockanditems.appendedTooltips.AtomicMassModuleClass;
import dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementSeriesModule;
import dev.thenu.educationjavafied.blockanditems.appendedTooltips.TemperatureModule;
import dev.thenu.educationjavafied.blockanditems.appendedTooltips.DensityModule;
import dev.thenu.educationjavafied.compat.modmenu.ModConfigManager;
import dev.thenu.educationjavafied.compat.modmenu.tooltipModules.TooltipModuleSlot;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import java.util.function.Consumer;

public class appendElementTooltip {
    public static void appendElementTooltips(ItemStack stack, Consumer<Component> textConsumer) {
        //Check if tooltips are enabled globally in the config
        if (!ModConfigManager.CONFIG.enableTooltips) return;

        //Look up the element data instantly from your registry map
        ElementData data = ElementRegistry.get(stack.getItem());
        if (data == null) return;

        //Process each UI slot sequentially based on what the player selected in the config screen
        if(ModConfigManager.CONFIG.enableTooltips = true){
            if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow(), ModConfigManager.CONFIG.moreDetailKeybind)) {
                processSlot(ModConfigManager.CONFIG.slot1, textConsumer, data);
                processSlot(ModConfigManager.CONFIG.slot2, textConsumer, data);
                processSlot(ModConfigManager.CONFIG.slot3, textConsumer, data);
                processSlot(ModConfigManager.CONFIG.slot4, textConsumer, data);
            } else {
                Component keyName = InputConstants.Type.KEYSYM.getOrCreate(ModConfigManager.CONFIG.moreDetailKeybind).getDisplayName();

                textConsumer.accept(Component.translatable("tooltip.educationeditionjavafied.hold_for_more", keyName)
                      .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.ITALIC));
            }
        }
    }

    private static void processSlot(TooltipModuleSlot slot, Consumer<Component> textConsumer, ElementData data) {
        switch (slot) {
            case TEMPERATURES -> TemperatureModule.appendTemperatures(textConsumer, data);
            case DENSITY -> DensityModule.appendDensity(textConsumer, data);
            case ATOMIC_MASS -> AtomicMassModuleClass.appendAtomicMass(textConsumer, data);
            case ELEMENT_TYPE -> ElementSeriesModule.appendElementType(textConsumer, data);
            case NONE -> {}
        }
    }
}