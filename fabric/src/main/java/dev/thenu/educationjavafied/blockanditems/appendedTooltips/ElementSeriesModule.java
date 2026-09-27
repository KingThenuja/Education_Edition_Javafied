package dev.thenu.educationjavafied.blockanditems.appendedTooltips;

import dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData.ElementData;
import dev.thenu.educationjavafied.compat.modmenu.ModConfigManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;

import java.util.function.Consumer;

public class ElementSeriesModule {
    public static void appendElementType(Consumer<Component> textConsumer, ElementData data) {
        textConsumer.accept(Component.empty().append(Component.translatable("tooltip.educationeditionjavafied.element_type.title").withColor(TextColor.fromRgb(ModConfigManager.CONFIG.elementTypeTitleColor))));

        String categoryLangKey = switch (data.categoryKey()) {
            case "reactive_nonmetals" -> "tooltip.educationeditionjavafied.category.reactive_nonmetals";
            case "noble_gas" -> "tooltip.educationeditionjavafied.category.noble_gas";
            case "actinoids" -> "tooltip.educationeditionjavafied.category.actinoids";
            case "lanthanoids" -> "tooltip.educationeditionjavafied.category.lanthanoids";
            case "halogen" -> "tooltip.educationeditionjavafied.category.halogen";
            case "metalloids" -> "tooltip.educationeditionjavafied.category.metalloids";
            case "post_transition_metal" -> "tooltip.educationeditionjavafied.category.post_transition_metal";
            case "transition_metal", "transtion_metal" -> "tooltip.educationeditionjavafied.category.transition_metal";
            case "alkaline_earth_metal" -> "tooltip.educationeditionjavafied.category.alkaline_earth_metal";
            case "alkaline_metal" -> "tooltip.educationeditionjavafied.category.alkaline_metal";
            default -> "tooltip.educationeditionjavafied.category.unknown";
        };

        int color = switch (data.categoryKey()) {
            case "reactive_nonmetals" -> ModConfigManager.CONFIG.reactiveNonMetalsColor;
            case "noble_gas" -> ModConfigManager.CONFIG.nobleGasColor;
            case "actinoids" -> ModConfigManager.CONFIG.actinoidsColor;
            case "lanthanoids" -> ModConfigManager.CONFIG.lanthanoidsColor;
            case "halogen" -> ModConfigManager.CONFIG.halogensColor;
            case "metalloids" -> ModConfigManager.CONFIG.metalloidsColor;
            case "post_transition_metal" -> ModConfigManager.CONFIG.post_TransitionMetalsColor;
            case "transition_metal", "transtion_metal" -> ModConfigManager.CONFIG.transitionMetalsColor;
            case "alkaline_earth_metal" -> ModConfigManager.CONFIG.alkalineEarthMetalsColor;
            case "alkaline_metal" -> ModConfigManager.CONFIG.alkalineMetalsColor;
            default -> 0xFFFFFF;
        };

        textConsumer.accept(Component.empty().append(Component.translatable(categoryLangKey).withColor(TextColor.fromRgb(color))));
    }
}
