package dev.thenu.educationjavafied.blockanditems.appendedTooltips;

import dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData.ElementData;
import dev.thenu.educationjavafied.compat.modmenu.ModConfigManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;

import java.util.function.Consumer;

public class TemperatureModule {

    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9.0 / 5.0 + 32.0;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    private static Component getFormattedTemperatureComponent(double kelvin, int color) {
        if (kelvin <= 0.0) {
            return Component.literal("N/A").withColor(TextColor.fromRgb(color));
        }

        double value;
        String unitKey;

        switch (ModConfigManager.CONFIG.temperatureMode) {
            case CELSIUS -> {
                value = kelvinToCelsius(kelvin);
                unitKey = "tooltip.educationeditionjavafied.unit.celsius";
            }
            case FAHRENHEIT -> {
                value = kelvinToFahrenheit(kelvin);
                unitKey = "tooltip.educationeditionjavafied.unit.fahrenheit";
            }
            default -> {
                value = kelvin;
                unitKey = "tooltip.educationeditionjavafied.unit.kelvin";
            }
        }

        String formattedValue = String.format("%.2f", value);
        return Component.translatable("tooltip.educationeditionjavafied.temperature.format", formattedValue, Component.translatable(unitKey))
                .withColor(TextColor.fromRgb(color));
    }

    public static void appendTemperatures(Consumer<Component> textConsumer, ElementData data) {
        textConsumer.accept(Component.empty()
                .append(Component.translatable("tooltip.educationeditionjavafied.melting_point.title")
                        .withColor(TextColor.fromRgb(ModConfigManager.CONFIG.meltingPointTitleColor)))
                .append(getFormattedTemperatureComponent(data.meltingPoint(), ModConfigManager.CONFIG.meltingPointColor)));

        textConsumer.accept(Component.empty()
                .append(Component.translatable("tooltip.educationeditionjavafied.boiling_point.title")
                        .withColor(TextColor.fromRgb(ModConfigManager.CONFIG.boilingPointTitleColor)))
                .append(getFormattedTemperatureComponent(data.boilingPoint(), ModConfigManager.CONFIG.boilingPointColor)));
    }
}