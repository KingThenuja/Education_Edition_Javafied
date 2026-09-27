package dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData;

import dev.thenu.educationjavafied.blockanditems.blockFile.ElementBlocks;
import net.minecraft.world.item.Item;
import java.util.HashMap;
import java.util.Map;

public class ElementRegistry {
    private static final Map<Item, ElementData> ELEMENTS = new HashMap<>();

    public static void init() {
        register(ElementBlocks.HYDROGEN.asItem(), new ElementData("Hydrogen", 1.0080, 13.81, 20.28, 0.00008988, "reactive_nonmetals"));
        register(ElementBlocks.HELIUM.asItem(), new ElementData("Helium", 4.00260, 0.95, 4.22, 0.0001785, "noble_gas"));
        register(ElementBlocks.LITHIUM.asItem(), new ElementData("Lithium", 6.94, 453.65, 1615, 0.534, "alkaline_metal"));
        register(ElementBlocks.BERYLLIUM.asItem(), new ElementData("Beryllium", 9.012183, 1560, 2744, 1.85, "alkaline_earth_metal"));
        register(ElementBlocks.BORON.asItem(), new ElementData("Boron", 10.81, 2348, 4273, 2.37, "metalloids"));
        register(ElementBlocks.CARBON.asItem(), new ElementData("Carbon", 12.011, 3823, 4098, 2.267, "reactive_nonmetals"));
        register(ElementBlocks.NITROGEN.asItem(), new ElementData("Nitrogen", 14.007, 63.15, 77.36, 0.0012506, "reactive_nonmetals"));
        register(ElementBlocks.OXYGEN.asItem(), new ElementData("Oxygen", 15.999, 54.36, 90.20, 0.001429, "reactive_nonmetals"));
        register(ElementBlocks.FLUORINE.asItem(), new ElementData("Fluorine", 18.99840316, 53.53, 85.03, 0.001696, "halogen"));
        register(ElementBlocks.NEON.asItem(), new ElementData("Neon", 20.180, 24.56, 27.07, 0.0008999, "noble_gas"));
        register(ElementBlocks.SODIUM.asItem(), new ElementData("Sodium", 22.990, 370.87, 1156, 0.971, "alkaline_metal"));
        register(ElementBlocks.MAGNESIUM.asItem(), new ElementData("Magnesium", 24.305, 923, 1363, 1.738, "alkaline_earth_metal"));
        register(ElementBlocks.ALUMINUM.asItem(), new ElementData("Aluminum", 26.982, 933.47, 2792, 2.702, "post_transition_metal"));
        register(ElementBlocks.SILICON.asItem(), new ElementData("Silicon", 28.085, 1687, 3538, 2.329, "metalloids"));
        register(ElementBlocks.PHOSPHORUS.asItem(), new ElementData("Phosphorus", 30.974, 317.30, 550.3, 1.823, "reactive_nonmetals"));
        register(ElementBlocks.SULFUR.asItem(), new ElementData("Sulfur", 32.06, 388.36, 717.87, 2.07, "reactive_nonmetals"));
        register(ElementBlocks.CHLORINE.asItem(), new ElementData("Chlorine", 35.45, 171.6, 239.11, 0.003214, "halogen"));
        register(ElementBlocks.ARGON.asItem(), new ElementData("Argon", 39.95, 83.81, 87.30, 0.001784, "noble_gas"));
        register(ElementBlocks.POTASSIUM.asItem(), new ElementData("Potassium", 39.098, 336.53, 1032, 0.862, "alkaline_metal"));
        register(ElementBlocks.CALCIUM.asItem(), new ElementData("Calcium", 40.078, 1115, 1757, 1.55, "alkaline_earth_metal"));
        register(ElementBlocks.SCANDIUM.asItem(), new ElementData("Scandium", 44.956, 1814, 3109, 2.985, "transition_metal"));
        register(ElementBlocks.TITANIUM.asItem(), new ElementData("Titanium", 47.867, 1941, 3560, 4.506, "transition_metal"));
        register(ElementBlocks.VANADIUM.asItem(), new ElementData("Vanadium", 50.942, 2183, 3680, 6.11, "transition_metal"));
        register(ElementBlocks.CHROMIUM.asItem(), new ElementData("Chromium", 51.996, 2180, 2944, 7.15, "transition_metal"));
        register(ElementBlocks.MANGANESE.asItem(), new ElementData("Manganese", 54.938, 1519, 2334, 7.21, "transition_metal"));
        register(ElementBlocks.IRON.asItem(), new ElementData("Iron", 55.845, 1811, 3134, 7.874, "transition_metal"));
        register(ElementBlocks.COBALT.asItem(), new ElementData("Cobalt", 58.933, 1768, 3200, 8.90, "transition_metal"));
        register(ElementBlocks.NICKEL.asItem(), new ElementData("Nickel", 58.693, 1728, 3186, 8.908, "transition_metal"));
        register(ElementBlocks.COPPER.asItem(), new ElementData("Copper", 63.546, 1357.77, 2835, 8.96, "transition_metal"));
        register(ElementBlocks.ZINC.asItem(), new ElementData("Zinc", 65.38, 692.68, 1180, 7.14, "transition_metal"));
        register(ElementBlocks.GALLIUM.asItem(), new ElementData("Gallium", 69.723, 302.91, 2477, 5.91, "post_transition_metal"));
        register(ElementBlocks.GERMANIUM.asItem(), new ElementData("Germanium", 72.630, 1211.4, 3106, 5.323, "metalloids"));
        register(ElementBlocks.ARSENIC.asItem(), new ElementData("Arsenic", 74.922, 1090, 887, 5.727, "metalloids"));
        register(ElementBlocks.SELENIUM.asItem(), new ElementData("Selenium", 78.971, 494, 958, 4.81, "reactive_nonmetals"));
        register(ElementBlocks.BROMINE.asItem(), new ElementData("Bromine", 79.904, 265.8, 332.0, 3.12, "halogen"));
        register(ElementBlocks.KRYPTON.asItem(), new ElementData("Krypton", 83.798, 115.79, 119.93, 0.003749, "noble_gas"));
        register(ElementBlocks.RUBIDIUM.asItem(), new ElementData("Rubidium", 85.468, 312.46, 961, 1.532, "alkaline_metal"));
        register(ElementBlocks.STRONTIUM.asItem(), new ElementData("Strontium", 87.62, 1050, 1655, 2.64, "alkaline_earth_metal"));
        register(ElementBlocks.YTTRIUM.asItem(), new ElementData("Yttrium", 88.906, 1799, 3203, 4.47, "transition_metal"));
        register(ElementBlocks.ZIRCONIUM.asItem(), new ElementData("Zirconium", 91.222, 2128, 4682, 6.52, "transition_metal"));
        register(ElementBlocks.NIOBIUM.asItem(), new ElementData("Niobium", 92.906, 2750, 5017, 8.57, "transition_metal"));
        register(ElementBlocks.MOLYBDENUM.asItem(), new ElementData("Molybdenum", 95.95, 2896, 4912, 10.28, "transition_metal"));
        register(ElementBlocks.TECHNETIUM.asItem(), new ElementData("Technetium", 98.0, 2430, 4538, 11.5, "transition_metal"));
        register(ElementBlocks.RUTHENIUM.asItem(), new ElementData("Ruthenium", 101.07, 2607, 4423, 12.37, "transition_metal"));
        register(ElementBlocks.RHODIUM.asItem(), new ElementData("Rhodium", 102.91, 2237, 3968, 12.41, "transition_metal"));
        register(ElementBlocks.PALLADIUM.asItem(), new ElementData("Palladium", 106.42, 1828.05, 3236, 12.02, "transition_metal"));
        register(ElementBlocks.SILVER.asItem(), new ElementData("Silver", 107.87, 1234.93, 2435, 10.49, "transition_metal"));
        register(ElementBlocks.CADMIUM.asItem(), new ElementData("Cadmium", 112.41, 594.22, 1040, 8.65, "transition_metal"));
        register(ElementBlocks.INDIUM.asItem(), new ElementData("Indium", 114.82, 429.75, 2345, 7.31, "post_transition_metal"));
        register(ElementBlocks.TIN.asItem(), new ElementData("Tin", 118.71, 505.08, 2875, 7.31, "post_transition_metal"));
        register(ElementBlocks.ANTIMONY.asItem(), new ElementData("Antimony", 121.76, 903.78, 1908, 6.697, "metalloids"));
        register(ElementBlocks.TELLURIUM.asItem(), new ElementData("Tellurium", 127.60, 722.66, 1261, 6.24, "metalloids"));
        register(ElementBlocks.IODINE.asItem(), new ElementData("Iodine", 126.90, 386.85, 457.4, 4.93, "halogen"));
        register(ElementBlocks.XENON.asItem(), new ElementData("Xenon", 131.29, 161.4, 165.03, 0.005887, "noble_gas"));
        register(ElementBlocks.CESIUM.asItem(), new ElementData("Cesium", 132.91, 301.59, 944, 1.879, "alkaline_metal"));
        register(ElementBlocks.BARIUM.asItem(), new ElementData("Barium", 137.33, 1000, 2170, 3.51, "alkaline_earth_metal"));
        register(ElementBlocks.LANTHANUM.asItem(), new ElementData("Lanthanum", 138.91, 1193, 3737, 6.15, "lanthanoids"));
        register(ElementBlocks.CERIUM.asItem(), new ElementData("Cerium", 140.12, 1068, 3633, 6.77, "lanthanoids"));
        register(ElementBlocks.PRASEODYMIUM.asItem(), new ElementData("Praseodymium", 140.91, 1208, 3793, 6.77, "lanthanoids"));
        register(ElementBlocks.NEODYMIUM.asItem(), new ElementData("Neodymium", 144.24, 1297, 3347, 7.01, "lanthanoids"));
        register(ElementBlocks.PROMETHIUM.asItem(), new ElementData("Promethium", 145.0, 1315, 3273, 7.26, "lanthanoids"));
        register(ElementBlocks.SAMARIUM.asItem(), new ElementData("Samarium", 150.36, 1345, 2067, 7.52, "lanthanoids"));
        register(ElementBlocks.EUROPIUM.asItem(), new ElementData("Europium", 151.96, 1099, 1802, 5.24, "lanthanoids"));
        register(ElementBlocks.GADOLINIUM.asItem(), new ElementData("Gadolinium", 157.25, 1585, 3546, 7.90, "lanthanoids"));
        register(ElementBlocks.TERBIUM.asItem(), new ElementData("Terbium", 158.93, 1629, 3503, 8.23, "lanthanoids"));
        register(ElementBlocks.DYSPROSIUM.asItem(), new ElementData("Dysprosium", 162.50, 1680, 2840, 8.55, "lanthanoids"));
        register(ElementBlocks.HOLMIUM.asItem(), new ElementData("Holmium", 164.93, 1734, 2993, 8.80, "lanthanoids"));
        register(ElementBlocks.ERBIUM.asItem(), new ElementData("Erbium", 167.26, 1802, 3141, 9.07, "lanthanoids"));
        register(ElementBlocks.THULIUM.asItem(), new ElementData("Thulium", 168.93, 1818, 2223, 9.32, "lanthanoids"));
        register(ElementBlocks.YTTERBIUM.asItem(), new ElementData("Ytterbium", 173.05, 1097, 1469, 6.90, "lanthanoids"));
        register(ElementBlocks.LUTETIUM.asItem(), new ElementData("Lutetium", 174.97, 1936, 3669, 9.84, "lanthanoids"));
        register(ElementBlocks.HAFNIUM.asItem(), new ElementData("Hafnium", 178.49, 2506, 4876, 13.31, "transition_metal"));
        register(ElementBlocks.TANTALUM.asItem(), new ElementData("Tantalum", 180.95, 3290, 5731, 16.65, "transition_metal"));
        register(ElementBlocks.TUNGSTEN.asItem(), new ElementData("Tungsten", 183.84, 3695, 5828, 19.25, "transition_metal"));
        register(ElementBlocks.RHENIUM.asItem(), new ElementData("Rhenium", 186.21, 3459, 5869, 21.02, "transition_metal"));
        register(ElementBlocks.OSMIUM.asItem(), new ElementData("Osmium", 190.23, 3306, 5285, 22.59, "transition_metal"));
        register(ElementBlocks.IRIDIUM.asItem(), new ElementData("Iridium", 192.22, 2719, 4701, 22.56, "transition_metal"));
        register(ElementBlocks.PLATINUM.asItem(), new ElementData("Platinum", 195.08, 2041.4, 4098, 21.45, "transition_metal"));
        register(ElementBlocks.GOLD.asItem(), new ElementData("Gold", 196.97, 1337.33, 3129, 19.32, "transition_metal"));
        register(ElementBlocks.MERCURY.asItem(), new ElementData("Mercury", 200.59, 234.43, 629.88, 13.534, "transition_metal"));
        register(ElementBlocks.THALLIUM.asItem(), new ElementData("Thallium", 204.38, 577, 1746, 11.85, "post_transition_metal"));
        register(ElementBlocks.LEAD.asItem(), new ElementData("Lead", 207.2, 600.61, 2022, 11.34, "post_transition_metal"));
        register(ElementBlocks.BISMUTH.asItem(), new ElementData("Bismuth", 208.98, 544.7, 1837, 9.78, "post_transition_metal"));
        register(ElementBlocks.POLONIUM.asItem(), new ElementData("Polonium", 209.0, 527, 1235, 9.196, "post_transition_metal"));
        register(ElementBlocks.ASTATINE.asItem(), new ElementData("Astatine", 210.0, 575, 610, 7.0, "halogen"));
        register(ElementBlocks.RADON.asItem(), new ElementData("Radon", 222.0, 202, 211.3, 0.00973, "noble_gas"));
        register(ElementBlocks.FRANCIUM.asItem(), new ElementData("Francium", 223.0, 293, 950, 1.87, "alkaline_metal"));
        register(ElementBlocks.RADIUM.asItem(), new ElementData("Radium", 226.0, 973, 2010, 5.5, "alkaline_earth_metal"));
        register(ElementBlocks.ACTINIUM.asItem(), new ElementData("Actinium", 227.0, 1323, 3471, 10.07, "actinoids"));
        register(ElementBlocks.THORIUM.asItem(), new ElementData("Thorium", 232.04, 2023, 5061, 11.72, "actinoids"));
        register(ElementBlocks.PROTACTINIUM.asItem(), new ElementData("Protactinium", 231.04, 1841, 4300, 15.37, "actinoids"));
        register(ElementBlocks.URANIUM.asItem(), new ElementData("Uranium", 238.03, 1405.3, 4404, 19.1, "actinoids"));
        register(ElementBlocks.NEPTUNIUM.asItem(), new ElementData("Neptunium", 237.0, 912, 4174, 20.45, "actinoids"));
        register(ElementBlocks.PLUTONIUM.asItem(), new ElementData("Plutonium", 244.0, 912.5, 3505, 19.82, "actinoids"));
        register(ElementBlocks.AMERICIUM.asItem(), new ElementData("Americium", 243.0, 1449, 2880, 13.67, "actinoids"));
        register(ElementBlocks.CURIUM.asItem(), new ElementData("Curium", 247.0, 1613, 3383, 13.51, "actinoids"));
        register(ElementBlocks.BERKELIUM.asItem(), new ElementData("Berkelium", 247.0, 1336, 0.0, 14.78, "actinoids"));
        register(ElementBlocks.CALIFORNIUM.asItem(), new ElementData("Californium", 251.0, 1173, 0.0, 15.1, "actinoids"));
        register(ElementBlocks.EINSTEINIUM.asItem(), new ElementData("Einsteinium", 252.0, 1133, 0.0, 8.84, "actinoids"));
        register(ElementBlocks.FERMIUM.asItem(), new ElementData("Fermium", 257.0, 1800, 0.0, 0.0, "actinoids"));
        register(ElementBlocks.MENDELEVIUM.asItem(), new ElementData("Mendelevium", 258.0, 1100, 0.0, 0.0, "actinoids"));
        register(ElementBlocks.NOBELIUM.asItem(), new ElementData("Nobelium", 259.0, 1100, 0.0, 0.0, "actinoids"));
        register(ElementBlocks.LAWRENCIUM.asItem(), new ElementData("Lawrencium", 262.0, 1900, 0.0, 0.0, "actinoids"));
        register(ElementBlocks.RUTHERFORDIUM.asItem(), new ElementData("Rutherfordium", 267.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.DUBNIUM.asItem(), new ElementData("Dubnium", 268.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.SEABORGIUM.asItem(), new ElementData("Seaborgium", 269.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.BOHRIUM.asItem(), new ElementData("Bohrium", 270.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.HASSIUM.asItem(), new ElementData("Hassium", 277.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.MEITNERIUM.asItem(), new ElementData("Meitnerium", 278.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.DARMSTADTIUM.asItem(), new ElementData("Darmstadtium", 281.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.ROENTGENIUM.asItem(), new ElementData("Roentgenium", 282.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.COPERNICIUM.asItem(), new ElementData("Copernicium", 285.0, 0.0, 0.0, 0.0, "transition_metal"));
        register(ElementBlocks.NIHONIUM.asItem(), new ElementData("Nihonium", 286.0, 0.0, 0.0, 0.0, "post_transition_metal"));
        register(ElementBlocks.FLEROVIUM.asItem(), new ElementData("Flerovium", 289.0, 0.0, 0.0, 0.0, "post_transition_metal"));
        register(ElementBlocks.MOSCOVIUM.asItem(), new ElementData("Moscovium", 290.0, 0.0, 0.0, 0.0, "post_transition_metal"));
        register(ElementBlocks.LIVERMORIUM.asItem(), new ElementData("Livermorium", 293.0, 0.0, 0.0, 0.0, "post_transition_metal"));
        register(ElementBlocks.TENNESSINE.asItem(), new ElementData("Tennessine", 294.0, 0.0, 0.0, 0.0, "halogen"));
        register(ElementBlocks.OGANESSON.asItem(), new ElementData("Oganesson", 294.0, 0.0, 0.0, 0.0, "noble_gas"));
    }

    private static void register(Item item, ElementData data) {
        ELEMENTS.put(item, data);
    }

    public static ElementData get(Item item) {
        return ELEMENTS.get(item);
    }
}