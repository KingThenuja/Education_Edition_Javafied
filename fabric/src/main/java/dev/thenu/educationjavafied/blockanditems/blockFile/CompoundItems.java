package dev.thenu.educationjavafied.blockanditems.blockFile;

import dev.thenu.educationjavafied.Constants;
import net.minecraft.world.item.Item;

import java.util.List;

import static dev.thenu.educationjavafied.utils.registering.Registering.registerItem;

public class CompoundItems {
    public static void register(){Constants.LOG.info("Successfully registered Compound Element");}

    public static final Item ALUMINUM_OXIDE = registerItem("aluminum_oxide", properties -> new Item(properties));
    public static final Item AMMONIA = registerItem("ammonia", properties -> new Item(properties));
    public static final Item BARIUM_SULFATE = registerItem("barium_sulfate", properties -> new Item(properties));
    public static final Item BENZENE = registerItem("benzene", properties -> new Item(properties));
    public static final Item BORON_TRIOXIDE = registerItem("boron_trioxide", properties -> new Item(properties));
    public static final Item CALCIUM_BROMIDE = registerItem("calcium_bromide", properties -> new Item(properties));
    public static final Item CRUDE_OIL = registerItem("crude_oil", properties -> new Item(properties));
    public static final Item GLUE = registerItem("glue", properties -> new Item(properties));
    public static final Item HYDROGEN_PEROXIDE = registerItem("hydrogen_peroxide", properties -> new Item(properties));
    public static final Item IRON_SULFIDE = registerItem("iron_sulfide", properties -> new Item(properties));
    public static final Item LITHIUM_HYDRIDE = registerItem("lithium_hydride", properties -> new Item(properties));
    public static final Item LUMINOL = registerItem("luminol", properties -> new Item(properties));
    public static final Item LYE = registerItem("lye", properties -> new Item(properties));
    public static final Item MAGNESIUM_NITRATE = registerItem("magnesium_nitrate", properties -> new Item(properties));
    public static final Item MAGNESIUM_OXIDE = registerItem("magnesium_oxide", properties -> new Item(properties));
    public static final Item POLYETHYLENE = registerItem("polyethylene", properties -> new Item(properties));
    public static final Item POTASSIUM_IODIDE = registerItem("potassium_iodide", properties -> new Item(properties));
    public static final Item SOAP = registerItem("soap", properties -> new Item(properties));
    public static final Item SODIUM_ACETATE = registerItem("sodium_acetate", properties -> new Item(properties));
    public static final Item SODIUM_FLUORIDE = registerItem("sodium_fluorite", properties -> new Item(properties));
    public static final Item SODIUM_HYDRIDE = registerItem("sodium_hydride", properties -> new Item(properties));
    public static final Item SODIUM_HYPOCHLORITE = registerItem("sodium_hypochlorite", properties -> new Item(properties));
    public static final Item SODIUM_OXIDE = registerItem("sodium_oxide", properties -> new Item(properties));
    public static final Item SULFATE = registerItem("sulfate", properties -> new Item(properties));
    public static final Item CALCIUM_CHLORIDE = registerItem("calcium_chloride", properties -> new Item(properties));
    public static final Item CERIUM_CHLORIDE = registerItem("cerium_chloride", properties -> new Item(properties));
    public static final Item MERCURIC_CHLORIDE = registerItem("mercuric_chloride", properties -> new Item(properties));
    public static final Item POTASSIUM_CHLORIDE = registerItem("potassium_chloride", properties -> new Item(properties));
    public static final Item TUNGSTEN_CHLORIDE = registerItem("tungsten_chloride", properties -> new Item(properties));
    public static final Item WATER_BEAKER = registerItem("water_beaker", properties -> new Item(properties));

    public static final List<Item> ALL_COMPOUND_ITEMS = List.of(ALUMINUM_OXIDE, AMMONIA, BARIUM_SULFATE, BENZENE, BORON_TRIOXIDE, CALCIUM_BROMIDE, CRUDE_OIL, GLUE, HYDROGEN_PEROXIDE, IRON_SULFIDE, LITHIUM_HYDRIDE, LUMINOL, LYE, MAGNESIUM_NITRATE, MAGNESIUM_OXIDE, POLYETHYLENE, POTASSIUM_IODIDE, SOAP, SODIUM_ACETATE, SODIUM_FLUORIDE, SODIUM_HYDRIDE, SODIUM_HYPOCHLORITE, SODIUM_OXIDE, SULFATE, CALCIUM_CHLORIDE, CERIUM_CHLORIDE, MERCURIC_CHLORIDE, POTASSIUM_CHLORIDE, TUNGSTEN_CHLORIDE, WATER_BEAKER);

}
