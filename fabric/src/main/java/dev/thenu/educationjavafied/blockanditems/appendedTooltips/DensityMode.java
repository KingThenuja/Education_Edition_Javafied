package dev.thenu.educationjavafied.blockanditems.appendedTooltips;

public enum DensityMode {
    LbInch("Lb/Inch³"),
    GramCm("Gram/Cm³");

    private final String displayName;

    DensityMode(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
