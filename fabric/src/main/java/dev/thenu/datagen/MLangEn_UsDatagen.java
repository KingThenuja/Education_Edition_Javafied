package dev.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class MLangEn_UsDatagen extends FabricLanguageProvider {
    protected MLangEn_UsDatagen(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        //Configurations
        translationBuilder.add("text.educationeditionjavafied.config.title", "Education Edition: Javafied's Config");
        translationBuilder.add("text.educationeditionjavafied.config.category.general", "General");
        translationBuilder.add("text.educationeditionjavafied.config.category.tooltips", "Tooltips");
        translationBuilder.add("text.educationeditionjavafied.config.category.tooltips_color", "Tooltip Color Customizer");
        translationBuilder.add("text.educationeditionjavafied.config.option.temperature_mode", "Temperature Type");
        translationBuilder.add("text.educationeditionjavafied.config.option.conversion_mode", "Unit Type");
        translationBuilder.add("text.educationeditionjavafied.config.option.more_detail_keybind", "More Tooltip Info Keybind");
        translationBuilder.add("tooltip.educationeditionjavafied.hold_for_more", "Press %s for more details");
        translationBuilder.add("text.educationeditionjavafied.config.option.show_tooltips", "Show Tooltips");
        translationBuilder.add("text.educationeditionjavafied.config.option.element_type_title_color", "Element Series Title Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.reactive_nonmetals_color", "Reactive Nonmetals Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.noble_gas_color", "Noble Gas Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.halogens_color", "Halogens Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.metalloids_color", "Metalloids Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.post_transition_metals_color", "Post-Transition Metals Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.transition_metals_color", "Transition Metals Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.alkaline_earth_metals_color", "Alkaline Earth Metals Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.alkaline_metals_color", "Alkaline Metals Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.lanthanoids_color", "Lanthanoids Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.actinoids_color", "Actinoids Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.atomic_mass_title_color", "Atomic Mass Title Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.atomic_mass_color", "Atomic Mass Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.density_title_color", "Density Title Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.density_color", "Density Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.melting_point_title_color", "Melting Point Title Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.melting_point_color", "Melting Point Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.boiling_point_title_color", "Boiling Point Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.boiling_point_color", "Boiling Point Color");
        translationBuilder.add("text.educationeditionjavafied.config.option.slot1", "Tooltip Slot 1");
        translationBuilder.add("text.educationeditionjavafied.config.option.slot2", "Tooltip Slot 2");
        translationBuilder.add("text.educationeditionjavafied.config.option.slot3", "Tooltip Slot 3");
        translationBuilder.add("text.educationeditionjavafied.config.option.slot4", "Tooltip Slot 4");

        translationBuilder.add("tooltip.educationeditionjavafied.density.title", "Density:");
        translationBuilder.add("tooltip.educationeditionjavafied.density.format", "%s %s");
        translationBuilder.add("tooltip.educationeditionjavafied.unit.gram_cm", "g/cm³");
        translationBuilder.add("tooltip.educationeditionjavafied.unit.lb_inch", "lb/inch³");
        translationBuilder.add("tooltip.educationeditionjavafied.element_type.title", "Type:");
        translationBuilder.add("tooltip.educationeditionjavafied.category.reactive_nonmetals", "Reactive Nonmetal");
        translationBuilder.add("tooltip.educationeditionjavafied.category.noble_gas","Noble Gas");
        translationBuilder.add("tooltip.educationeditionjavafied.category.actinoids", "Actinoid");
        translationBuilder.add("tooltip.educationeditionjavafied.category.lanthanoids", "Lanthanoid");
        translationBuilder.add("tooltip.educationeditionjavafied.category.halogen", "Halogen");
        translationBuilder.add("tooltip.educationeditionjavafied.category.metalloids", "Metalloid");
        translationBuilder.add("tooltip.educationeditionjavafied.category.post_transition_metal", "Post-Transition Metal");
        translationBuilder.add("tooltip.educationeditionjavafied.category.transition_metal", "Transition Metal");
        translationBuilder.add("tooltip.educationeditionjavafied.category.alkaline_earth_metal", "Alkaline Earth Metal");
        translationBuilder.add("tooltip.educationeditionjavafied.category.alkaline_metal", "Alkaline Metal");
        translationBuilder.add("tooltip.educationeditionjavafied.category.unknown", "Unknown");
        translationBuilder.add("tooltip.educationeditionjavafied.melting_point.title", "Melting Point: ");
        translationBuilder.add("tooltip.educationeditionjavafied.boiling_point.title", "Boiling Point: ");
        translationBuilder.add("tooltip.educationeditionjavafied.temperature.format", "%s %s");
        translationBuilder.add("tooltip.educationeditionjavafied.unit.celsius", "°C");
        translationBuilder.add("tooltip.educationeditionjavafied.unit.fahrenheit", "°F");
        translationBuilder.add("tooltip.educationeditionjavafied.unit.kelvin", "K");
        translationBuilder.add("tooltip.educationeditionjavafied.atomic_mass.title", "Atomic Mass: ");
        translationBuilder.add("tooltip.educationeditionjavafied.atomic_mass.format", "%s u");

        //ElementBlocks
        translationBuilder.add("block.educationeditionjavafied.1_hydrogen", "1 - Hydrogen");
        translationBuilder.add("block.educationeditionjavafied.2_helium", "2 - Helium");
        translationBuilder.add("block.educationeditionjavafied.3_lithium", "3 - Lithium");
        translationBuilder.add("block.educationeditionjavafied.4_beryllium", "4 - Beryllium");
        translationBuilder.add("block.educationeditionjavafied.5_boron", "5 - Boron");
        translationBuilder.add("block.educationeditionjavafied.6_carbon", "6 - Carbon");
        translationBuilder.add("block.educationeditionjavafied.7_nitrogen", "7 - Nitrogen");
        translationBuilder.add("block.educationeditionjavafied.8_oxygen", "8 - Oxygen");
        translationBuilder.add("block.educationeditionjavafied.9_fluorine", "9 - Fluorine");
        translationBuilder.add("block.educationeditionjavafied.10_neon", "10 - Neon");
        translationBuilder.add("block.educationeditionjavafied.11_sodium", "11 - Sodium");
        translationBuilder.add("block.educationeditionjavafied.12_magnesium", "12 - Magnesium");
        translationBuilder.add("block.educationeditionjavafied.13_aluminum", "13 - Aluminum");
        translationBuilder.add("block.educationeditionjavafied.14_silicon", "14 - Silicon");
        translationBuilder.add("block.educationeditionjavafied.15_phosphorus", "15 - Phosphorus");
        translationBuilder.add("block.educationeditionjavafied.16_sulfur", "16 - Sulfur");
        translationBuilder.add("block.educationeditionjavafied.17_chlorine", "17 - Chlorine");
        translationBuilder.add("block.educationeditionjavafied.18_argon", "18 - Argon");
        translationBuilder.add("block.educationeditionjavafied.19_potassium", "19 - Potassium");
        translationBuilder.add("block.educationeditionjavafied.20_calcium", "20 - Calcium");
        translationBuilder.add("block.educationeditionjavafied.21_scandium", "21 - Scandium");
        translationBuilder.add("block.educationeditionjavafied.22_titanium", "22 - Titanium");
        translationBuilder.add("block.educationeditionjavafied.23_vanadium", "23 - Vanadium");
        translationBuilder.add("block.educationeditionjavafied.24_chromium", "24 - Chromium");
        translationBuilder.add("block.educationeditionjavafied.25_manganese", "25 - Manganese");
        translationBuilder.add("block.educationeditionjavafied.26_iron", "26 - Iron");
        translationBuilder.add("block.educationeditionjavafied.27_cobalt", "27 - Cobalt");
        translationBuilder.add("block.educationeditionjavafied.28_nickel", "28 - Nickel");
        translationBuilder.add("block.educationeditionjavafied.29_copper", "29 - Copper");
        translationBuilder.add("block.educationeditionjavafied.30_zinc", "30 - Zinc");
        translationBuilder.add("block.educationeditionjavafied.31_gallium", "31 - Gallium");
        translationBuilder.add("block.educationeditionjavafied.32_germanium", "32 - Germanium");
        translationBuilder.add("block.educationeditionjavafied.33_arsenic", "33 - Arsenic");
        translationBuilder.add("block.educationeditionjavafied.34_selenium", "34 - Selenium");
        translationBuilder.add("block.educationeditionjavafied.35_bromine", "35 - Bromine");
        translationBuilder.add("block.educationeditionjavafied.36_krypton", "36 - Krypton");
        translationBuilder.add("block.educationeditionjavafied.37_rubidium", "37 - Rubidium");
        translationBuilder.add("block.educationeditionjavafied.38_strontium", "38 - Strontium");
        translationBuilder.add("block.educationeditionjavafied.39_yttrium", "39 - Yttrium");
        translationBuilder.add("block.educationeditionjavafied.40_zirconium", "40 - Zirconium");
        translationBuilder.add("block.educationeditionjavafied.41_niobium", "41 - Niobium");
        translationBuilder.add("block.educationeditionjavafied.42_molybdenum", "42 - Molybdenum");
        translationBuilder.add("block.educationeditionjavafied.43_technetium", "43 - Technetium");
        translationBuilder.add("block.educationeditionjavafied.44_ruthenium", "44 - Ruthenium");
        translationBuilder.add("block.educationeditionjavafied.45_rhodium", "45 - Rhodium");
        translationBuilder.add("block.educationeditionjavafied.46_palladium", "46 - Palladium");
        translationBuilder.add("block.educationeditionjavafied.47_silver", "47 - Silver");
        translationBuilder.add("block.educationeditionjavafied.48_cadmium", "48 - Cadmium");
        translationBuilder.add("block.educationeditionjavafied.49_indium", "49 - Indium");
        translationBuilder.add("block.educationeditionjavafied.50_tin", "50 - Tin");
        translationBuilder.add("block.educationeditionjavafied.51_antimony", "51 - Antimony");
        translationBuilder.add("block.educationeditionjavafied.52_tellurium", "52 - Tellurium");
        translationBuilder.add("block.educationeditionjavafied.53_iodine", "53 - Iodine");
        translationBuilder.add("block.educationeditionjavafied.54_xenon", "54 - Xenon");
        translationBuilder.add("block.educationeditionjavafied.55_cesium", "55 - Cesium");
        translationBuilder.add("block.educationeditionjavafied.56_barium", "56 - Barium");
        translationBuilder.add("block.educationeditionjavafied.57_lanthanum", "57 - Lanthanum");
        translationBuilder.add("block.educationeditionjavafied.58_cerium", "58 - Cerium");
        translationBuilder.add("block.educationeditionjavafied.59_praseodymium", "59 - Praseodymium");
        translationBuilder.add("block.educationeditionjavafied.60_neodymium", "60 - Neodymium");
        translationBuilder.add("block.educationeditionjavafied.61_promethium", "61 - Promethium");
        translationBuilder.add("block.educationeditionjavafied.62_samarium", "62 - Samarium");
        translationBuilder.add("block.educationeditionjavafied.63_europium", "63 - Europium");
        translationBuilder.add("block.educationeditionjavafied.64_gadolinium", "64 - Gadolinium");
        translationBuilder.add("block.educationeditionjavafied.65_terbium", "65 - Terbium");
        translationBuilder.add("block.educationeditionjavafied.66_dysprosium", "66 - Dysprosium");
        translationBuilder.add("block.educationeditionjavafied.67_holmium", "67 - Holmium");
        translationBuilder.add("block.educationeditionjavafied.68_erbium", "68 - Erbium");
        translationBuilder.add("block.educationeditionjavafied.69_thulium", "69 - Thulium");
        translationBuilder.add("block.educationeditionjavafied.70_ytterbium", "70 - Ytterbium");
        translationBuilder.add("block.educationeditionjavafied.71_lutetium", "71 - Lutetium");
        translationBuilder.add("block.educationeditionjavafied.72_hafnium", "72 - Hafnium");
        translationBuilder.add("block.educationeditionjavafied.73_tantalum", "73 - Tantalum");
        translationBuilder.add("block.educationeditionjavafied.74_tungsten", "74 - Tungsten");
        translationBuilder.add("block.educationeditionjavafied.75_rhenium", "75 - Rhenium");
        translationBuilder.add("block.educationeditionjavafied.76_osmium", "76 - Osmium");
        translationBuilder.add("block.educationeditionjavafied.77_iridium", "77 - Iridium");
        translationBuilder.add("block.educationeditionjavafied.78_platinum", "78 - Platinum");
        translationBuilder.add("block.educationeditionjavafied.79_gold", "79 - Gold");
        translationBuilder.add("block.educationeditionjavafied.80_mercury", "80 - Mercury");
        translationBuilder.add("block.educationeditionjavafied.81_thallium", "81 - Thallium");
        translationBuilder.add("block.educationeditionjavafied.82_lead", "82 - Lead");
        translationBuilder.add("block.educationeditionjavafied.83_bismuth", "83 - Bismuth");
        translationBuilder.add("block.educationeditionjavafied.84_polonium", "84 - Polonium");
        translationBuilder.add("block.educationeditionjavafied.85_astatine", "85 - Astatine");
        translationBuilder.add("block.educationeditionjavafied.86_radon", "86 - Radon");
        translationBuilder.add("block.educationeditionjavafied.87_francium", "87 - Francium");
        translationBuilder.add("block.educationeditionjavafied.88_radium", "88 - Radium");
        translationBuilder.add("block.educationeditionjavafied.89_actinium", "89 - Actinium");
        translationBuilder.add("block.educationeditionjavafied.90_thorium", "90 - Thorium");
        translationBuilder.add("block.educationeditionjavafied.91_protactinium", "91 - Protactinium");
        translationBuilder.add("block.educationeditionjavafied.92_uranium", "92 - Uranium");
        translationBuilder.add("block.educationeditionjavafied.93_neptunium", "93 - Neptunium");
        translationBuilder.add("block.educationeditionjavafied.94_plutonium", "94 - Plutonium");
        translationBuilder.add("block.educationeditionjavafied.95_americium", "95 - Americium");
        translationBuilder.add("block.educationeditionjavafied.96_curium", "96 - Curium");
        translationBuilder.add("block.educationeditionjavafied.97_berkelium", "97 - Berkelium");
        translationBuilder.add("block.educationeditionjavafied.98_californium", "98 - Californium");
        translationBuilder.add("block.educationeditionjavafied.99_einsteinium", "99 - Einsteinium");
        translationBuilder.add("block.educationeditionjavafied.100_fermium", "100 - Fermium");
        translationBuilder.add("block.educationeditionjavafied.101_mendelevium", "101 - Mendelevium");
        translationBuilder.add("block.educationeditionjavafied.102_nobelium", "102 - Nobelium");
        translationBuilder.add("block.educationeditionjavafied.103_lawrencium", "103 - Lawrencium");
        translationBuilder.add("block.educationeditionjavafied.104_rutherfordium", "104 - Rutherfordium");
        translationBuilder.add("block.educationeditionjavafied.105_dubnium", "105 - Dubnium");
        translationBuilder.add("block.educationeditionjavafied.106_seaborgium", "106 - Seaborgium");
        translationBuilder.add("block.educationeditionjavafied.107_bohrium", "107 - Bohrium");
        translationBuilder.add("block.educationeditionjavafied.108_hassium", "108 - Hassium");
        translationBuilder.add("block.educationeditionjavafied.109_meitnerium", "109 - Meitnerium");
        translationBuilder.add("block.educationeditionjavafied.110_darmstadtium", "110 - Darmstadtium");
        translationBuilder.add("block.educationeditionjavafied.111_roentgenium", "111 - Roentgenium");
        translationBuilder.add("block.educationeditionjavafied.112_copernicium", "112 - Copernicium");
        translationBuilder.add("block.educationeditionjavafied.113_nihonium", "113 - Nihonium");
        translationBuilder.add("block.educationeditionjavafied.114_flerovium", "114 - Flerovium");
        translationBuilder.add("block.educationeditionjavafied.115_moscovium", "115 - Moscovium");
        translationBuilder.add("block.educationeditionjavafied.116_livermorium", "116 - Livermorium");
        translationBuilder.add("block.educationeditionjavafied.117_tennessine", "117 - Tennessine");
        translationBuilder.add("block.educationeditionjavafied.118_oganesson", "118 - Oganesson");
        translationBuilder.add("block.educationeditionjavafied.unknown_element", "Unknown Element");

        //Items, Food
        translationBuilder.add("item.educationeditionjavafied.salt", "Salt");
        translationBuilder.add("tooltip.educationeditionjavafied.salt", "Combine Salt with Meat to");
        translationBuilder.add("tooltip.educationeditionjavafied.salt2", "make them give more saturation");
        translationBuilder.add("item.educationeditionjavafied.salted_cooked_chicken", "Salted Cooked Chicken");
        translationBuilder.add("item.educationeditionjavafied.salted_cooked_porkchop", "Salted Cooked Porkchop");
        translationBuilder.add("item.educationeditionjavafied.salted_cooked_steak", "Salted Cooked Steak");
        translationBuilder.add("item.educationeditionjavafied.salted_cooked_mutton", "Salted Cooked Mutton");
        translationBuilder.add("item.educationeditionjavafied.salted_cooked_rabbit", "Salted Cooked Rabbit");
        translationBuilder.add("item.educationeditionjavafied.salted_cooked_cod", "Salted Cooked Cod");
        translationBuilder.add("item.educationeditionjavafied.salted_cooked_salmon", "Salted Cooked Salmon");
        translationBuilder.add("item.educationeditionjavafied.salted_baked_potato", "Salted Baked Potato");
        translationBuilder.add("item.educationeditionjavafied.salted_dried_kelp", "Salted Dried Kelp");
        translationBuilder.add("item.educationeditionjavafied.salted_beetroot_stew", "Salted Beetroot Stew");
        translationBuilder.add("item.educationeditionjavafied.salted_mushroom_stew", "Salted Mushroom Stew");
        translationBuilder.add("item.educationeditionjavafied.salted_rabbit_stew", "Salted Rabbit Stew");
        translationBuilder.add("item.educationeditionjavafied.salted_suspicious_stew", "Salted Suspicious Stew");

        //Items, Compound
        translationBuilder.add("item.educationeditionjavafied.aluminum_oxide", "Aluminum Oxide");
        translationBuilder.add("item.educationeditionjavafied.ammonia", "Ammonia");
        translationBuilder.add("item.educationeditionjavafied.barium_sulfate", "Barium Sulfate");
        translationBuilder.add("item.educationeditionjavafied.benzene", "Benzene");
        translationBuilder.add("item.educationeditionjavafied.boron_trioxide", "Boron Trioxide");
        translationBuilder.add("item.educationeditionjavafied.calcium_bromide", "Calcium Bromide");
        translationBuilder.add("item.educationeditionjavafied.crude_oil", "Crude Oil");
        translationBuilder.add("item.educationeditionjavafied.glue", "Glue (Cyanoacrylate)");
        translationBuilder.add("item.educationeditionjavafied.hydrogen_peroxide", "Hydrogen Peroxide");
        translationBuilder.add("item.educationeditionjavafied.iron_sulfide", "Iron Sulfide");
        translationBuilder.add("item.educationeditionjavafied.lithium_hydride", "Lithium Hydride");
        translationBuilder.add("item.educationeditionjavafied.luminol", "Luminol");
        translationBuilder.add("item.educationeditionjavafied.lye", "Lye");
        translationBuilder.add("item.educationeditionjavafied.magnesium_nitrate", "Magnesium Nitrate");
        translationBuilder.add("item.educationeditionjavafied.magnesium_oxide", "Magnesium Oxide");
        translationBuilder.add("item.educationeditionjavafied.polyethylene", "Polyethylene");
        translationBuilder.add("item.educationeditionjavafied.potassium_iodide", "Potassium Iodide");
        translationBuilder.add("item.educationeditionjavafied.soap", "Soap");
        translationBuilder.add("item.educationeditionjavafied.sodium_acetate", "Sodium Acetate");
        translationBuilder.add("item.educationeditionjavafied.sodium_fluorite", "Sodium Fluorite");
        translationBuilder.add("item.educationeditionjavafied.sodium_hydride", "Sodium Hydride");
        translationBuilder.add("item.educationeditionjavafied.sodium_hypochlorite", "Sodium Hypochlorite");
        translationBuilder.add("item.educationeditionjavafied.sodium_oxide", "Sodium Oxide");
        translationBuilder.add("item.educationeditionjavafied.sulfate", "Sulfate");
        translationBuilder.add("item.educationeditionjavafied.calcium_chloride", "Calcium Chloride");
        translationBuilder.add("item.educationeditionjavafied.cerium_chloride", "Cerium Chloride");
        translationBuilder.add("item.educationeditionjavafied.mercuric_chloride", "Mercuric Chloride");
        translationBuilder.add("item.educationeditionjavafied.potassium_chloride", "Potassium Chloride");
        translationBuilder.add("item.educationeditionjavafied.tungsten_chloride", "Tungsten Chloride");
        translationBuilder.add("item.educationeditionjavafied.water_beaker", "Water");

        //Equipment
        translationBuilder.add("block.educationeditionjavafied.material_reducer", "Material Reducer");
        translationBuilder.add("block.educationeditionjavafied.material_reducer.open_menu", "Material Reducer");

        //Tags
        translationBuilder.add("tag.block.educationeditionjavafied.periodic_table_elements", "Periodic Table Elements");
        translationBuilder.add("tag.item.educationeditionjavafied.salted_food", "Salted Foods");

        //Item Group
        translationBuilder.add("item_group.educationeditionjavafied.category.name.elements_creative_tab", "EEJ: Element Creative Tab");
        translationBuilder.add("item_group.educationeditionjavafied.category.name.substance_creative_tab", "EEJ: Substance Creative Tab");
        translationBuilder.add("item_group.educationeditionjavafied.category.name.food_item_creative_tab", "EEJ: Food Item Creative Tab");

    }
}
