package dev.thenu.educationjavafied.compat.modmenu;

import com.mojang.blaze3d.platform.InputConstants;
import dev.thenu.educationjavafied.blockanditems.appendedTooltips.DensityMode;
import dev.thenu.educationjavafied.blockanditems.appendedTooltips.TemperatureMode;
import dev.thenu.educationjavafied.compat.modmenu.tooltipModules.TooltipModuleSlot;
import me.shedaniel.clothconfig2.api.*;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.lwjgl.glfw.GLFW;

public class ModConfigScreen {
    public static Screen create(Screen parent) {

        ConfigBuilder builder = ConfigBuilder.create().setParentScreen(parent).setTitle(Component.translatable("text.educationeditionjavafied.config.title")).setSavingRunnable(ModConfigManager::saveConfig);

        //Categories
        ConfigCategory general = builder.getOrCreateCategory(Component.translatable("text.educationeditionjavafied.config.category.general"));
        ConfigCategory tooltipCustomiserTab = builder.getOrCreateCategory(Component.translatable("text.educationeditionjavafied.config.category.tooltips"));
        ConfigCategory tooltipColorCustomiserTab = builder.getOrCreateCategory(Component.translatable("text.educationeditionjavafied.config.category.tooltips_color"));

        ConfigEntryBuilder entryBuilder = builder.entryBuilder();
        ModConfig config = ModConfigManager.CONFIG;

        ModifierKeyCode initialKey = ModifierKeyCode.of(InputConstants.Type.KEYSYM.getOrCreate(config.moreDetailKeybind), Modifier.none());

        //General Config
        general.addEntry(entryBuilder.startEnumSelector(Component.translatable("text.educationeditionjavafied.config.option.temperature_mode"), TemperatureMode.class, config.temperatureMode).setDefaultValue(TemperatureMode.KELVIN).setSaveConsumer(newValue -> config.temperatureMode = newValue).setEnumNameProvider(mode -> Component.literal(((TemperatureMode) mode).getDisplayName())).build());
        general.addEntry(entryBuilder.startEnumSelector(Component.translatable("text.educationeditionjavafied.config.option.conversion_mode"), DensityMode.class, config.unitConversionMode).setDefaultValue(DensityMode.GramCm).setSaveConsumer(newValue -> config.unitConversionMode = newValue).setEnumNameProvider(mode -> Component.literal(((DensityMode) mode).getDisplayName())).build());
        general.addEntry(entryBuilder.startModifierKeyCodeField(Component.translatable("text.educationeditionjavafied.config.option.more_detail_keybind"), initialKey).setDefaultValue(ModifierKeyCode.of(InputConstants.Type.KEYSYM.getOrCreate(GLFW.GLFW_KEY_LEFT_SHIFT), Modifier.none())).setModifierSaveConsumer(newValue -> {config.moreDetailKeybind = newValue.getKeyCode().getValue();}).build());

        //Tooltip Element Type Color Config
        tooltipCustomiserTab.addEntry(entryBuilder.startBooleanToggle(Component.translatable("text.educationeditionjavafied.config.option.show_tooltips"), config.enableTooltips).setDefaultValue(config.enableTooltips).setSaveConsumer(newValue -> config.enableTooltips = newValue).build());

        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.element_type_title_color"), config.elementTypeTitleColor).setDefaultValue(config.elementTypeTitleColor).setSaveConsumer(newValue -> config.elementTypeTitleColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.reactive_nonmetals_color"), config.reactiveNonMetalsColor).setDefaultValue(config.reactiveNonMetalsColor).setSaveConsumer(newValue -> config.reactiveNonMetalsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.noble_gas_color"), config.nobleGasColor).setDefaultValue(config.nobleGasColor).setSaveConsumer(newValue -> config.nobleGasColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.halogens_color"), config.halogensColor).setDefaultValue(config.halogensColor).setSaveConsumer(newValue -> config.halogensColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.metalloids_color"), config.metalloidsColor).setDefaultValue(config.metalloidsColor).setSaveConsumer(newValue -> config.metalloidsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.post_transition_metals_color"), config.post_TransitionMetalsColor).setDefaultValue(config.post_TransitionMetalsColor).setSaveConsumer(newValue -> config.post_TransitionMetalsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.transition_metals_color"), config.transitionMetalsColor).setDefaultValue(config.transitionMetalsColor).setSaveConsumer(newValue -> config.transitionMetalsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.alkaline_earth_metals_color"), config.alkalineEarthMetalsColor).setDefaultValue(config.alkalineEarthMetalsColor).setSaveConsumer(newValue -> config.alkalineEarthMetalsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.alkaline_metals_color"), config.alkalineMetalsColor).setDefaultValue(config.alkalineMetalsColor).setSaveConsumer(newValue -> config.alkalineMetalsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.lanthanoids_color"), config.lanthanoidsColor).setDefaultValue(config.lanthanoidsColor).setSaveConsumer(newValue -> config.lanthanoidsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.actinoids_color"), config.actinoidsColor).setDefaultValue(config.actinoidsColor).setSaveConsumer(newValue -> config.actinoidsColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.atomic_mass_title_color"), config.atomicMassTitleColor).setDefaultValue(config.atomicMassTitleColor).setSaveConsumer(newValue -> config.atomicMassTitleColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.atomic_mass_color"), config.atomicMassColor).setDefaultValue(config.atomicMassColor).setSaveConsumer(newValue -> config.atomicMassColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.melting_point_title_color"), config.meltingPointTitleColor).setDefaultValue(config.meltingPointTitleColor).setSaveConsumer(newValue -> config.meltingPointTitleColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.melting_point_color"), config.meltingPointColor).setDefaultValue(config.meltingPointColor).setSaveConsumer(newValue -> config.meltingPointColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.boiling_point_title_color"), config.boilingPointTitleColor).setDefaultValue(config.boilingPointTitleColor).setSaveConsumer(newValue -> config.boilingPointTitleColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.boiling_point_color"), config.boilingPointColor).setDefaultValue(config.boilingPointColor).setSaveConsumer(newValue -> config.boilingPointColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.density_title_color"), config.densityTitleColor).setDefaultValue(config.densityTitleColor).setSaveConsumer(newValue -> config.densityTitleColor = newValue).build());
        tooltipColorCustomiserTab.addEntry(entryBuilder.startColorField(Component.translatable("text.educationeditionjavafied.config.option.density_color"), config.densityColor).setDefaultValue(config.densityColor).setSaveConsumer(newValue -> config.densityColor = newValue).build());

        /*for (TooltipModuleConfig module : config.tooltipModules) {
            tooltipCustomiserTab.addEntry(entryBuilder.startBooleanToggle(
                            Component.translatable("text.educationeditionjavafied.config.option.module." + module.id),
                            module.enabled)
                    .setDefaultValue(true)
                    .setSaveConsumer(newValue -> module.enabled = newValue)
                    .build());
        }*/

        tooltipCustomiserTab.addEntry(entryBuilder.startEnumSelector(
                        Component.translatable("text.educationeditionjavafied.config.option.slot1"),
                        TooltipModuleSlot.class,
                        config.slot1)
                .setDefaultValue(TooltipModuleSlot.ELEMENT_TYPE)
                .setSaveConsumer(newValue -> config.slot1 = newValue)
                .setEnumNameProvider(mode -> Component.literal(((TooltipModuleSlot) mode).getDisplayName()))
                .build());

        tooltipCustomiserTab.addEntry(entryBuilder.startEnumSelector(
                        Component.translatable("text.educationeditionjavafied.config.option.slot2"),
                        TooltipModuleSlot.class,
                        config.slot2)
                .setDefaultValue(TooltipModuleSlot.ATOMIC_MASS)
                .setSaveConsumer(newValue -> config.slot2 = newValue)
                .setEnumNameProvider(mode -> Component.literal(((TooltipModuleSlot) mode).getDisplayName()))
                .build());

        tooltipCustomiserTab.addEntry(entryBuilder.startEnumSelector(
                        Component.translatable("text.educationeditionjavafied.config.option.slot3"),
                        TooltipModuleSlot.class,
                        config.slot3)
                .setDefaultValue(TooltipModuleSlot.TEMPERATURES)
                .setSaveConsumer(newValue -> config.slot3 = newValue)
                .setEnumNameProvider(mode -> Component.literal(((TooltipModuleSlot) mode).getDisplayName()))
                .build());

        tooltipCustomiserTab.addEntry(entryBuilder.startEnumSelector(
                        Component.translatable("text.educationeditionjavafied.config.option.slot4"),
                        TooltipModuleSlot.class,
                        config.slot4)
                .setDefaultValue(TooltipModuleSlot.DENSITY)
                .setSaveConsumer(newValue -> config.slot4 = newValue)
                .setEnumNameProvider(mode -> Component.literal(((TooltipModuleSlot) mode).getDisplayName()))
                .build());

        return builder.build();
    }
}