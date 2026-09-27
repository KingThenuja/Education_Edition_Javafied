package dev.thenu.educationjavafied.compat.modmenu;

import dev.thenu.educationjavafied.blockanditems.appendedTooltips.DensityMode;
import dev.thenu.educationjavafied.blockanditems.appendedTooltips.TemperatureMode;
import dev.thenu.educationjavafied.compat.modmenu.tooltipModules.TooltipModuleConfig;
import dev.thenu.educationjavafied.compat.modmenu.tooltipModules.TooltipModuleSlot;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModConfig {
    // 0 = Kelvin, 1 = Celsius, 2 = Fahrenheit
    public TemperatureMode temperatureMode = TemperatureMode.KELVIN;
    // 0 = g/cm³, 1 = lb/inch³
    public DensityMode unitConversionMode = DensityMode.GramCm;

    public int moreDetailKeybind = GLFW.GLFW_KEY_LEFT_SHIFT;

    //Tooltips
    public boolean enableTooltips = true;
    public int elementTypeTitleColor = 0xaaaaaa;
    public int reactiveNonMetalsColor = 0x78ae40;
    public int nobleGasColor = 0xb768ea;
    public int halogensColor = 0xef9231;
    public int metalloidsColor = 0xc3938f;
    public int post_TransitionMetalsColor = 0x6e6959;
    public int transitionMetalsColor = 0x595959;
    public int alkalineEarthMetalsColor = 0x42afcc;
    public int alkalineMetalsColor = 0x6888f2;
    public int lanthanoidsColor = 0xdf93d2;
    public int actinoidsColor = 0x36146a;
    public int atomicMassTitleColor = 0xaaaaaa;
    public int atomicMassColor = 0xffff55;
    public int densityTitleColor = 0xaaaaaa;
    public int densityColor = 0xffffff;
    public int meltingPointTitleColor = 0xaaaaaa;
    public int meltingPointColor = 0xaa0000;
    public int boilingPointTitleColor = 0xaaaaaa;
    public int boilingPointColor = 0x00aaaa;

    public List<TooltipModuleConfig> tooltipModules = new ArrayList<>();
    public List<String> tooltipOrder = Arrays.asList("element_type", "atomic_mass","temperatures", "density");
    public TooltipModuleSlot slot1 = TooltipModuleSlot.ELEMENT_TYPE;
    public TooltipModuleSlot slot2 = TooltipModuleSlot.ATOMIC_MASS;
    public TooltipModuleSlot slot3 = TooltipModuleSlot.TEMPERATURES;
    public TooltipModuleSlot slot4 = TooltipModuleSlot.DENSITY;
    public ModConfig() {
        tooltipModules.add(new TooltipModuleConfig("element_type", true));
        tooltipModules.add(new TooltipModuleConfig("atomic_mass", true));
        tooltipModules.add(new TooltipModuleConfig("temperatures", true));
        tooltipModules.add(new TooltipModuleConfig("density", true));
    }
}

