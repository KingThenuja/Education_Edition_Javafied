package dev.thenu.educationjavafied.blockanditems.appendedTooltips;

public enum TemperatureMode {
    KELVIN("Kelvin (K)"),
    CELSIUS("Celsius (°C)"),
    FAHRENHEIT("Fahrenheit (°F)");

    private final String displayName;

    TemperatureMode(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

