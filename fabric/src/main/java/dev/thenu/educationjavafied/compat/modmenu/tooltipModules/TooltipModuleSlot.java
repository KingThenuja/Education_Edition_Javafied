package dev.thenu.educationjavafied.compat.modmenu.tooltipModules;

public enum TooltipModuleSlot {
    NONE("None"),
    ELEMENT_TYPE("Element Type"),
    ATOMIC_MASS("Atomic Mass"),
    TEMPERATURES("TemperatureModule"),
    DENSITY("Density");

    private final String displayName;

    TooltipModuleSlot(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
}
