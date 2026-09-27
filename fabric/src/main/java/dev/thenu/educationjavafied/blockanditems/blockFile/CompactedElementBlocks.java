package dev.thenu.educationjavafied.blockanditems.blockFile;

import dev.thenu.educationjavafied.Constants;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import java.util.List;

import static dev.thenu.educationjavafied.utils.registering.Registering.registerBlock;

public class CompactedElementBlocks {
    public static int helperInt = 1;

    public static void register(){
        Constants.LOG.info("Successfully registered Periodic Table Elements");
    }

    public static String nameMaker(String name){
        String formattedName = helperInt + "_compacted_" + name;
        helperInt += 1;
        return formattedName;
    }

    public static final Block COMPACTED_HYDROGEN = registerBlock(nameMaker("hydrogen"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block COMPACTED_HELIUM = registerBlock(nameMaker("helium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_LITHIUM = registerBlock(nameMaker("lithium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block COMPACTED_BERYLLIUM = registerBlock(nameMaker("beryllium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_BORON = registerBlock(nameMaker("boron"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block COMPACTED_CARBON = registerBlock(nameMaker("carbon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_NITROGEN = registerBlock(nameMaker("nitrogen"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_OXYGEN = registerBlock(nameMaker("oxygen"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block COMPACTED_FLUORINE = registerBlock(nameMaker("fluorine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block COMPACTED_NEON = registerBlock(nameMaker("neon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_SODIUM = registerBlock(nameMaker("sodium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block COMPACTED_MAGNESIUM = registerBlock(nameMaker("magnesium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_ALUMINUM = registerBlock(nameMaker("aluminum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_SILICON = registerBlock(nameMaker("silicon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block COMPACTED_PHOSPHORUS = registerBlock(nameMaker("phosphorus"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block COMPACTED_SULFUR = registerBlock(nameMaker("sulfur"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block COMPACTED_CHLORINE = registerBlock(nameMaker("chlorine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block COMPACTED_ARGON = registerBlock(nameMaker("argon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_POTASSIUM = registerBlock(nameMaker("potassium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block COMPACTED_CALCIUM = registerBlock(nameMaker("calcium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_SCANDIUM = registerBlock(nameMaker("scandium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_TITANIUM = registerBlock(nameMaker("titanium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_VANADIUM = registerBlock(nameMaker("vanadium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_CHROMIUM = registerBlock(nameMaker("chromium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_MANGANESE = registerBlock(nameMaker("manganese"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_IRON = registerBlock(nameMaker("iron"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_COBALT = registerBlock(nameMaker("cobalt"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_NICKEL = registerBlock(nameMaker("nickel"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_COPPER = registerBlock(nameMaker("copper"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_ZINC = registerBlock(nameMaker("zinc"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_GALLIUM = registerBlock(nameMaker("gallium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_GERMANIUM = registerBlock(nameMaker("germanium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block COMPACTED_ARSENIC = registerBlock(nameMaker("arsenic"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block COMPACTED_SELENIUM = registerBlock(nameMaker("selenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GREEN)));
    public static final Block COMPACTED_BROMINE = registerBlock(nameMaker("bromine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block COMPACTED_KRYPTON = registerBlock(nameMaker("krypton"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_RUBIDIUM = registerBlock(nameMaker("rubidium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block COMPACTED_STRONTIUM = registerBlock(nameMaker("strontium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_YTTRIUM = registerBlock(nameMaker("yttrium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_ZIRCONIUM = registerBlock(nameMaker("zirconium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_NIOBIUM = registerBlock(nameMaker("niobium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_MOLYBDENUM = registerBlock(nameMaker("molybdenum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_TECHNETIUM = registerBlock(nameMaker("technetium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_RUTHENIUM = registerBlock(nameMaker("ruthenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_RHODIUM = registerBlock(nameMaker("rhodium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_PALLADIUM = registerBlock(nameMaker("palladium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_SILVER = registerBlock(nameMaker("silver"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_CADMIUM = registerBlock(nameMaker("cadmium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_INDIUM = registerBlock(nameMaker("indium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_TIN = registerBlock(nameMaker("tin"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_ANTIMONY = registerBlock(nameMaker("antimony"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block COMPACTED_TELLURIUM = registerBlock(nameMaker("tellurium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block COMPACTED_IODINE = registerBlock(nameMaker("iodine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block COMPACTED_XENON = registerBlock(nameMaker("xenon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_CESIUM = registerBlock(nameMaker("cesium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block COMPACTED_BARIUM = registerBlock(nameMaker("barium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_LANTHANUM = registerBlock(nameMaker("lanthanum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_CERIUM = registerBlock(nameMaker("cerium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_PRASEODYMIUM = registerBlock(nameMaker("praseodymium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_NEODYMIUM = registerBlock(nameMaker("neodymium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_PROMETHIUM = registerBlock(nameMaker("promethium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_SAMARIUM = registerBlock(nameMaker("samarium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_EUROPIUM = registerBlock(nameMaker("europium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_GADOLINIUM = registerBlock(nameMaker("gadolinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_TERBIUM = registerBlock(nameMaker("terbium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_DYSPROSIUM = registerBlock(nameMaker("dysprosium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_HOLMIUM = registerBlock(nameMaker("holmium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_ERBIUM = registerBlock(nameMaker("erbium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_THULIUM = registerBlock(nameMaker("thulium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_YTTERBIUM = registerBlock(nameMaker("ytterbium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_LUTETIUM = registerBlock(nameMaker("lutetium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_HAFNIUM = registerBlock(nameMaker("hafnium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_TANTALUM = registerBlock(nameMaker("tantalum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_TUNGSTEN = registerBlock(nameMaker("tungsten"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_RHENIUM = registerBlock(nameMaker("rhenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_OSMIUM = registerBlock(nameMaker("osmium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_IRIDIUM = registerBlock(nameMaker("iridium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_PLATINUM = registerBlock(nameMaker("platinum"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_GOLD = registerBlock(nameMaker("gold"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_MERCURY = registerBlock(nameMaker("mercury"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_THALLIUM = registerBlock(nameMaker("thallium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_LEAD = registerBlock(nameMaker("lead"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_BISMUTH = registerBlock(nameMaker("bismuth"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_POLONIUM = registerBlock(nameMaker("polonium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_RED)));
    public static final Block COMPACTED_ASTATINE = registerBlock(nameMaker("astatine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block COMPACTED_RADON = registerBlock(nameMaker("radon"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_FRANCIUM = registerBlock(nameMaker("francium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_BLUE)));
    public static final Block COMPACTED_RADIUM = registerBlock(nameMaker("radium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_CYAN)));
    public static final Block COMPACTED_ACTINIUM = registerBlock(nameMaker("actinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_THORIUM = registerBlock(nameMaker("thorium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_PROTACTINIUM = registerBlock(nameMaker("protactinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_URANIUM = registerBlock(nameMaker("uranium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_NEPTUNIUM = registerBlock(nameMaker("neptunium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_PLUTONIUM = registerBlock(nameMaker("plutonium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_AMERICIUM = registerBlock(nameMaker("americium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_CURIUM = registerBlock(nameMaker("curium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_BERKELIUM = registerBlock(nameMaker("berkelium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_CALIFORNIUM = registerBlock(nameMaker("californium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_EINSTEINIUM = registerBlock(nameMaker("einsteinium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_FERMIUM = registerBlock(nameMaker("fermium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_MENDELEVIUM = registerBlock(nameMaker("mendelevium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_NOBELIUM = registerBlock(nameMaker("nobelium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_LAWRENCIUM = registerBlock(nameMaker("lawrencium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));
    public static final Block COMPACTED_RUTHERFORDIUM = registerBlock(nameMaker("rutherfordium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_DUBNIUM = registerBlock(nameMaker("dubnium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_SEABORGIUM = registerBlock(nameMaker("seaborgium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_BOHRIUM = registerBlock(nameMaker("bohrium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_HASSIUM = registerBlock(nameMaker("hassium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_MEITNERIUM = registerBlock(nameMaker("meitnerium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_DARMSTADTIUM = registerBlock(nameMaker("darmstadtium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_ROENTGENIUM = registerBlock(nameMaker("roentgenium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_COPERNICIUM = registerBlock(nameMaker("copernicium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_GRAY)));
    public static final Block COMPACTED_NIHONIUM = registerBlock(nameMaker("nihonium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_FLEROVIUM = registerBlock(nameMaker("flerovium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_MOSCOVIUM = registerBlock(nameMaker("moscovium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_LIVERMORIUM = registerBlock(nameMaker("livermorium"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block COMPACTED_TENNESSINE = registerBlock(nameMaker("tennessine"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_ORANGE)));
    public static final Block COMPACTED_OGANESSON = registerBlock(nameMaker("oganesson"), props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PINK)));
    public static final Block COMPACTED_UNKNOWN_ELEMENT = registerBlock("compacted_unknown_element", props -> new Block(props.strength(1.2f, 0f).instabreak().mapColor(MapColor.COLOR_PURPLE)));

    public static final List<Block> ALL_ELEMENT_BLOCKS = List.of(
            CompactedElementBlocks.COMPACTED_HYDROGEN, CompactedElementBlocks.COMPACTED_HELIUM, CompactedElementBlocks.COMPACTED_LITHIUM, CompactedElementBlocks.COMPACTED_BERYLLIUM, CompactedElementBlocks.COMPACTED_BORON, CompactedElementBlocks.COMPACTED_CARBON, CompactedElementBlocks.COMPACTED_NITROGEN, CompactedElementBlocks.COMPACTED_OXYGEN, CompactedElementBlocks.COMPACTED_FLUORINE, CompactedElementBlocks.COMPACTED_NEON, CompactedElementBlocks.COMPACTED_SODIUM, CompactedElementBlocks.COMPACTED_MAGNESIUM, CompactedElementBlocks.COMPACTED_ALUMINUM, CompactedElementBlocks.COMPACTED_SILICON, CompactedElementBlocks.COMPACTED_PHOSPHORUS, CompactedElementBlocks.COMPACTED_SULFUR, CompactedElementBlocks.COMPACTED_CHLORINE, CompactedElementBlocks.COMPACTED_ARGON, CompactedElementBlocks.COMPACTED_POTASSIUM, CompactedElementBlocks.COMPACTED_CALCIUM, CompactedElementBlocks.COMPACTED_SCANDIUM, CompactedElementBlocks.COMPACTED_TITANIUM, CompactedElementBlocks.COMPACTED_VANADIUM, CompactedElementBlocks.COMPACTED_CHROMIUM, CompactedElementBlocks.COMPACTED_MANGANESE, CompactedElementBlocks.COMPACTED_IRON, CompactedElementBlocks.COMPACTED_COBALT, CompactedElementBlocks.COMPACTED_NICKEL, CompactedElementBlocks.COMPACTED_COPPER, CompactedElementBlocks.COMPACTED_ZINC, CompactedElementBlocks.COMPACTED_GALLIUM, CompactedElementBlocks.COMPACTED_GERMANIUM, CompactedElementBlocks.COMPACTED_ARSENIC, CompactedElementBlocks.COMPACTED_SELENIUM, CompactedElementBlocks.COMPACTED_BROMINE, CompactedElementBlocks.COMPACTED_KRYPTON, CompactedElementBlocks.COMPACTED_RUBIDIUM, CompactedElementBlocks.COMPACTED_STRONTIUM, CompactedElementBlocks.COMPACTED_YTTRIUM, CompactedElementBlocks.COMPACTED_ZIRCONIUM, CompactedElementBlocks.COMPACTED_NIOBIUM, CompactedElementBlocks.COMPACTED_MOLYBDENUM, CompactedElementBlocks.COMPACTED_TECHNETIUM, CompactedElementBlocks.COMPACTED_RUTHENIUM, CompactedElementBlocks.COMPACTED_RHODIUM, CompactedElementBlocks.COMPACTED_PALLADIUM, CompactedElementBlocks.COMPACTED_SILVER, CompactedElementBlocks.COMPACTED_CADMIUM, CompactedElementBlocks.COMPACTED_INDIUM, CompactedElementBlocks.COMPACTED_TIN, CompactedElementBlocks.COMPACTED_ANTIMONY, CompactedElementBlocks.COMPACTED_TELLURIUM, CompactedElementBlocks.COMPACTED_IODINE, CompactedElementBlocks.COMPACTED_XENON, CompactedElementBlocks.COMPACTED_CESIUM, CompactedElementBlocks.COMPACTED_BARIUM, CompactedElementBlocks.COMPACTED_LANTHANUM, CompactedElementBlocks.COMPACTED_CERIUM, CompactedElementBlocks.COMPACTED_PRASEODYMIUM, CompactedElementBlocks.COMPACTED_NEODYMIUM, CompactedElementBlocks.COMPACTED_PROMETHIUM, CompactedElementBlocks.COMPACTED_SAMARIUM, CompactedElementBlocks.COMPACTED_EUROPIUM, CompactedElementBlocks.COMPACTED_GADOLINIUM, CompactedElementBlocks.COMPACTED_TERBIUM, CompactedElementBlocks.COMPACTED_DYSPROSIUM, CompactedElementBlocks.COMPACTED_HOLMIUM, CompactedElementBlocks.COMPACTED_ERBIUM, CompactedElementBlocks.COMPACTED_THULIUM, CompactedElementBlocks.COMPACTED_YTTERBIUM, CompactedElementBlocks.COMPACTED_LUTETIUM, CompactedElementBlocks.COMPACTED_HAFNIUM, CompactedElementBlocks.COMPACTED_TANTALUM, CompactedElementBlocks.COMPACTED_TUNGSTEN, CompactedElementBlocks.COMPACTED_RHENIUM, CompactedElementBlocks.COMPACTED_OSMIUM, CompactedElementBlocks.COMPACTED_IRIDIUM, CompactedElementBlocks.COMPACTED_PLATINUM, CompactedElementBlocks.COMPACTED_GOLD, CompactedElementBlocks.COMPACTED_MERCURY, CompactedElementBlocks.COMPACTED_THALLIUM, CompactedElementBlocks.COMPACTED_LEAD, CompactedElementBlocks.COMPACTED_BISMUTH, CompactedElementBlocks.COMPACTED_POLONIUM, CompactedElementBlocks.COMPACTED_ASTATINE, CompactedElementBlocks.COMPACTED_RADON, CompactedElementBlocks.COMPACTED_FRANCIUM, CompactedElementBlocks.COMPACTED_RADIUM, CompactedElementBlocks.COMPACTED_ACTINIUM, CompactedElementBlocks.COMPACTED_THORIUM, CompactedElementBlocks.COMPACTED_PROTACTINIUM, CompactedElementBlocks.COMPACTED_URANIUM, CompactedElementBlocks.COMPACTED_NEPTUNIUM, CompactedElementBlocks.COMPACTED_PLUTONIUM, CompactedElementBlocks.COMPACTED_AMERICIUM, CompactedElementBlocks.COMPACTED_CURIUM, CompactedElementBlocks.COMPACTED_BERKELIUM, CompactedElementBlocks.COMPACTED_CALIFORNIUM, CompactedElementBlocks.COMPACTED_EINSTEINIUM, CompactedElementBlocks.COMPACTED_FERMIUM, CompactedElementBlocks.COMPACTED_MENDELEVIUM, CompactedElementBlocks.COMPACTED_NOBELIUM, CompactedElementBlocks.COMPACTED_LAWRENCIUM, CompactedElementBlocks.COMPACTED_RUTHERFORDIUM, CompactedElementBlocks.COMPACTED_DUBNIUM, CompactedElementBlocks.COMPACTED_SEABORGIUM, CompactedElementBlocks.COMPACTED_BOHRIUM, CompactedElementBlocks.COMPACTED_HASSIUM, CompactedElementBlocks.COMPACTED_MEITNERIUM, CompactedElementBlocks.COMPACTED_DARMSTADTIUM, CompactedElementBlocks.COMPACTED_ROENTGENIUM, CompactedElementBlocks.COMPACTED_COPERNICIUM, CompactedElementBlocks.COMPACTED_NIHONIUM, CompactedElementBlocks.COMPACTED_FLEROVIUM, CompactedElementBlocks.COMPACTED_MOSCOVIUM, CompactedElementBlocks.COMPACTED_LIVERMORIUM, CompactedElementBlocks.COMPACTED_TENNESSINE, CompactedElementBlocks.COMPACTED_OGANESSON, CompactedElementBlocks.COMPACTED_UNKNOWN_ELEMENT
    );
}