package dev.thenu.educationjavafied.blockanditems.appendedTooltips;

import dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData.ElementData;
import dev.thenu.educationjavafied.compat.modmenu.ModConfigManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;

import java.util.function.Consumer;

public class DensityModule {

    public static double gcmToLbInch(double gcm) {
        return gcm * 0.0361273;
    }

    private static Component getFormattedDensityComponent(double density, int color) {
        if (density <= 0.0) {
            return Component.literal("N/A").withColor(TextColor.fromRgb(color));
        }

        double densityToDisplay = density;
        String unitKey = "tooltip.educationeditionjavafied.unit.gram_cm";

        switch (ModConfigManager.CONFIG.unitConversionMode) {
            case LbInch -> {
                densityToDisplay = gcmToLbInch(densityToDisplay);
                unitKey = "tooltip.educationeditionjavafied.unit.lb_inch";
            }
            case GramCm -> {}
        }

        String formattedDensity = String.format("%g", densityToDisplay);

        return Component.translatable("tooltip.educationeditionjavafied.density.format", formattedDensity, Component.translatable(unitKey))
                .withColor(TextColor.fromRgb(color));
    }

    public static void appendDensity(Consumer<Component> textConsumer, ElementData data) {
        textConsumer.accept(Component.translatable("tooltip.educationeditionjavafied.density.title")
                .withColor(TextColor.fromRgb(ModConfigManager.CONFIG.densityTitleColor)));

        textConsumer.accept(Component.empty()
                .append(getFormattedDensityComponent(data.density(), ModConfigManager.CONFIG.densityColor)));
    }
}