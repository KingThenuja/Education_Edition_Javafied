package dev.thenu.educationjavafied.blockanditems.appendedTooltips;

import dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData.ElementData;
import dev.thenu.educationjavafied.compat.modmenu.ModConfigManager;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;

import java.util.function.Consumer;

public class AtomicMassModuleClass {
    public static void appendAtomicMass(Consumer<Component> textConsumer, ElementData data) {
        // Formats to 3 decimal places to clean up trailing numbers
        String formattedMass = String.format("%.3f", data.atomic_mass());

        textConsumer.accept(Component.empty()
                .append(Component.translatable("tooltip.educationeditionjavafied.atomic_mass.title")
                        .withColor(TextColor.fromRgb(ModConfigManager.CONFIG.atomicMassTitleColor)))
                .append(Component.translatable("tooltip.educationeditionjavafied.atomic_mass.format", formattedMass)
                        .withColor(TextColor.fromRgb(ModConfigManager.CONFIG.atomicMassColor))));
    }
}
