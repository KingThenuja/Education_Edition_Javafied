package dev.thenu.educationjavafied.blockanditems.blockFile;

import dev.thenu.educationjavafied.Constants;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import java.util.List;

import static dev.thenu.educationjavafied.utils.registering.Registering.registerBlock;

public class ElementBlocks {
    public static int helperInt = 1;

    public static void register(){
        Constants.LOG.info("Successfully registered Periodic Table Elements");
    }
    public static String nameMaker(String name){name = helperInt + "_" + name;helperInt += 1;return name;}

    public static final Block HYDROGEN = registerBlock(nameMaker("hydrogen"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block HELIUM = registerBlock(nameMaker("helium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block LITHIUM = registerBlock(nameMaker("lithium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block BERYLLIUM = registerBlock(nameMaker("beryllium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block BORON = registerBlock(nameMaker("boron"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block CARBON = registerBlock(nameMaker("carbon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block NITROGEN = registerBlock(nameMaker("nitrogen"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block OXYGEN = registerBlock(nameMaker("oxygen"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block FLUORINE = registerBlock(nameMaker("fluorine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block NEON = registerBlock(nameMaker("neon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block SODIUM = registerBlock(nameMaker("sodium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block MAGNESIUM = registerBlock(nameMaker("magnesium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block ALUMINUM = registerBlock(nameMaker("aluminum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block SILICON = registerBlock(nameMaker("silicon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block PHOSPHORUS = registerBlock(nameMaker("phosphorus"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block SULFUR = registerBlock(nameMaker("sulfur"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block CHLORINE = registerBlock(nameMaker("chlorine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block ARGON = registerBlock(nameMaker("argon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));;
    public static final Block POTASSIUM = registerBlock(nameMaker("potassium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block CALCIUM = registerBlock(nameMaker("calcium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block SCANDIUM = registerBlock(nameMaker("scandium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block TITANIUM = registerBlock(nameMaker("titanium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block VANADIUM = registerBlock(nameMaker("vanadium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block CHROMIUM = registerBlock(nameMaker("chromium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block MANGANESE = registerBlock(nameMaker("manganese"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block IRON = registerBlock(nameMaker("iron"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COBALT = registerBlock(nameMaker("cobalt"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block NICKEL = registerBlock(nameMaker("nickel"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COPPER = registerBlock(nameMaker("copper"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block ZINC = registerBlock(nameMaker("zinc"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block GALLIUM = registerBlock(nameMaker("gallium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block GERMANIUM = registerBlock(nameMaker("germanium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block ARSENIC = registerBlock(nameMaker("arsenic"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block SELENIUM = registerBlock(nameMaker("selenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block BROMINE = registerBlock(nameMaker("bromine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block KRYPTON = registerBlock(nameMaker("krypton"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block RUBIDIUM = registerBlock(nameMaker("rubidium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block STRONTIUM = registerBlock(nameMaker("strontium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block YTTRIUM = registerBlock(nameMaker("yttrium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block ZIRCONIUM = registerBlock(nameMaker("zirconium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block NIOBIUM = registerBlock(nameMaker("niobium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block MOLYBDENUM = registerBlock(nameMaker("molybdenum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block TECHNETIUM = registerBlock(nameMaker("technetium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block RUTHENIUM = registerBlock(nameMaker("ruthenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block RHODIUM = registerBlock(nameMaker("rhodium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block PALLADIUM = registerBlock(nameMaker("palladium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block SILVER = registerBlock(nameMaker("silver"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block CADMIUM = registerBlock(nameMaker("cadmium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block INDIUM = registerBlock(nameMaker("indium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block TIN = registerBlock(nameMaker("tin"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block ANTIMONY = registerBlock(nameMaker("antimony"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block TELLURIUM = registerBlock(nameMaker("tellurium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block IODINE = registerBlock(nameMaker("iodine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block XENON = registerBlock(nameMaker("xenon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block CESIUM = registerBlock(nameMaker("cesium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block BARIUM = registerBlock(nameMaker("barium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block LANTHANUM = registerBlock(nameMaker("lanthanum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block CERIUM = registerBlock(nameMaker("cerium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block PRASEODYMIUM = registerBlock(nameMaker("praseodymium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block NEODYMIUM = registerBlock(nameMaker("neodymium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block PROMETHIUM = registerBlock(nameMaker("promethium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block SAMARIUM = registerBlock(nameMaker("samarium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block EUROPIUM = registerBlock(nameMaker("europium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block GADOLINIUM = registerBlock(nameMaker("gadolinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block TERBIUM = registerBlock(nameMaker("terbium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block DYSPROSIUM = registerBlock(nameMaker("dysprosium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block HOLMIUM = registerBlock(nameMaker("holmium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block ERBIUM = registerBlock(nameMaker("erbium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block THULIUM = registerBlock(nameMaker("thulium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block YTTERBIUM = registerBlock(nameMaker("ytterbium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block LUTETIUM = registerBlock(nameMaker("lutetium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block HAFNIUM = registerBlock(nameMaker("hafnium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block TANTALUM = registerBlock(nameMaker("tantalum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block TUNGSTEN = registerBlock(nameMaker("tungsten"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block RHENIUM = registerBlock(nameMaker("rhenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block OSMIUM = registerBlock(nameMaker("osmium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block IRIDIUM = registerBlock(nameMaker("iridium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block PLATINUM = registerBlock(nameMaker("platinum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block GOLD = registerBlock(nameMaker("gold"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block MERCURY = registerBlock(nameMaker("mercury"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block THALLIUM = registerBlock(nameMaker("thallium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block LEAD = registerBlock(nameMaker("lead"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block BISMUTH = registerBlock(nameMaker("bismuth"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block POLONIUM = registerBlock(nameMaker("polonium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block ASTATINE = registerBlock(nameMaker("astatine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block RADON = registerBlock(nameMaker("radon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block FRANCIUM = registerBlock(nameMaker("francium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block RADIUM = registerBlock(nameMaker("radium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block ACTINIUM = registerBlock(nameMaker("actinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block THORIUM = registerBlock(nameMaker("thorium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block PROTACTINIUM = registerBlock(nameMaker("protactinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block URANIUM = registerBlock(nameMaker("uranium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block NEPTUNIUM = registerBlock(nameMaker("neptunium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block PLUTONIUM = registerBlock(nameMaker("plutonium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block AMERICIUM = registerBlock(nameMaker("americium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block CURIUM = registerBlock(nameMaker("curium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block BERKELIUM = registerBlock(nameMaker("berkelium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block CALIFORNIUM = registerBlock(nameMaker("californium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block EINSTEINIUM = registerBlock(nameMaker("einsteinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block FERMIUM = registerBlock(nameMaker("fermium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block MENDELEVIUM = registerBlock(nameMaker("mendelevium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block NOBELIUM = registerBlock(nameMaker("nobelium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block LAWRENCIUM = registerBlock(nameMaker("lawrencium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block RUTHERFORDIUM = registerBlock(nameMaker("rutherfordium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block DUBNIUM = registerBlock(nameMaker("dubnium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block SEABORGIUM = registerBlock(nameMaker("seaborgium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block BOHRIUM = registerBlock(nameMaker("bohrium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block HASSIUM = registerBlock(nameMaker("hassium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block MEITNERIUM = registerBlock(nameMaker("meitnerium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block DARMSTADTIUM = registerBlock(nameMaker("darmstadtium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block ROENTGENIUM = registerBlock(nameMaker("roentgenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COPERNICIUM = registerBlock(nameMaker("copernicium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block NIHONIUM = registerBlock(nameMaker("nihonium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block FLEROVIUM = registerBlock(nameMaker("flerovium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block MOSCOVIUM = registerBlock(nameMaker("moscovium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block LIVERMORIUM = registerBlock(nameMaker("livermorium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block TENNESSINE = registerBlock(nameMaker("tennessine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block OGANESSON = registerBlock(nameMaker("oganesson"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block UNKNOWN_ELEMENT = registerBlock("unknown_element", props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));


    public static final List<Block> ALL_ELEMENT_BLOCKS = List.of(
            ElementBlocks.HYDROGEN, ElementBlocks.HELIUM, ElementBlocks.LITHIUM, ElementBlocks.BERYLLIUM, ElementBlocks.BORON, ElementBlocks.CARBON, ElementBlocks.NITROGEN, ElementBlocks.OXYGEN, ElementBlocks.FLUORINE, ElementBlocks.NEON, ElementBlocks.SODIUM, ElementBlocks.MAGNESIUM, ElementBlocks.ALUMINUM, ElementBlocks.SILICON, ElementBlocks.PHOSPHORUS, ElementBlocks.SULFUR, ElementBlocks.CHLORINE, ElementBlocks.ARGON, ElementBlocks.POTASSIUM, ElementBlocks.CALCIUM, ElementBlocks.SCANDIUM, ElementBlocks.TITANIUM, ElementBlocks.VANADIUM, ElementBlocks.CHROMIUM, ElementBlocks.MANGANESE, ElementBlocks.IRON, ElementBlocks.COBALT, ElementBlocks.NICKEL, ElementBlocks.COPPER, ElementBlocks.ZINC, ElementBlocks.GALLIUM, ElementBlocks.GERMANIUM, ElementBlocks.ARSENIC, ElementBlocks.SELENIUM, ElementBlocks.BROMINE, ElementBlocks.KRYPTON, ElementBlocks.RUBIDIUM, ElementBlocks.STRONTIUM, ElementBlocks.YTTRIUM, ElementBlocks.ZIRCONIUM, ElementBlocks.NIOBIUM, ElementBlocks.MOLYBDENUM, ElementBlocks.TECHNETIUM, ElementBlocks.RUTHENIUM, ElementBlocks.RHODIUM, ElementBlocks.PALLADIUM, ElementBlocks.SILVER, ElementBlocks.CADMIUM, ElementBlocks.INDIUM, ElementBlocks.TIN, ElementBlocks.ANTIMONY, ElementBlocks.TELLURIUM, ElementBlocks.IODINE, ElementBlocks.XENON, ElementBlocks.CESIUM, ElementBlocks.BARIUM, ElementBlocks.LANTHANUM, ElementBlocks.CERIUM, ElementBlocks.PRASEODYMIUM, ElementBlocks.NEODYMIUM, ElementBlocks.PROMETHIUM, ElementBlocks.SAMARIUM, ElementBlocks.EUROPIUM, ElementBlocks.GADOLINIUM, ElementBlocks.TERBIUM, ElementBlocks.DYSPROSIUM, ElementBlocks.HOLMIUM, ElementBlocks.ERBIUM, ElementBlocks.THULIUM, ElementBlocks.YTTERBIUM, ElementBlocks.LUTETIUM, ElementBlocks.HAFNIUM, ElementBlocks.TANTALUM, ElementBlocks.TUNGSTEN, ElementBlocks.RHENIUM, ElementBlocks.OSMIUM, ElementBlocks.IRIDIUM, ElementBlocks.PLATINUM, ElementBlocks.GOLD, ElementBlocks.MERCURY, ElementBlocks.THALLIUM, ElementBlocks.LEAD, ElementBlocks.BISMUTH, ElementBlocks.POLONIUM, ElementBlocks.ASTATINE, ElementBlocks.RADON, ElementBlocks.FRANCIUM, ElementBlocks.RADIUM, ElementBlocks.ACTINIUM, ElementBlocks.THORIUM, ElementBlocks.PROTACTINIUM, ElementBlocks.URANIUM, ElementBlocks.NEPTUNIUM, ElementBlocks.PLUTONIUM, ElementBlocks.AMERICIUM, ElementBlocks.CURIUM, ElementBlocks.BERKELIUM, ElementBlocks.CALIFORNIUM, ElementBlocks.EINSTEINIUM, ElementBlocks.FERMIUM, ElementBlocks.MENDELEVIUM, ElementBlocks.NOBELIUM, ElementBlocks.LAWRENCIUM, ElementBlocks.RUTHERFORDIUM, ElementBlocks.DUBNIUM, ElementBlocks.SEABORGIUM, ElementBlocks.BOHRIUM, ElementBlocks.HASSIUM, ElementBlocks.MEITNERIUM, ElementBlocks.DARMSTADTIUM, ElementBlocks.ROENTGENIUM, ElementBlocks.COPERNICIUM, ElementBlocks.NIHONIUM, ElementBlocks.FLEROVIUM, ElementBlocks.MOSCOVIUM, ElementBlocks.LIVERMORIUM, ElementBlocks.TENNESSINE, ElementBlocks.OGANESSON, ElementBlocks.UNKNOWN_ELEMENT
    );
}
