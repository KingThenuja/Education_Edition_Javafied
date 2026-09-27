package dev.thenu.educationjavafied.blockanditems.blockFile;

import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.compoundCraftingTable.CompoundCraftingTable;
import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.MaterialReducer;
import net.minecraft.world.level.block.Block;

import java.util.List;

import static dev.thenu.educationjavafied.utils.registering.Registering.registerBlock;

public class ChemistryEquipement {

    public static final Block MATERIAL_REDUCER = registerBlock("material_reducer", props -> new
            MaterialReducer(props.strength(1.2f, 0f).instabreak()));

    public static final Block COMPOUND_CRAFTING_TABLE = registerBlock("compound_crafting_table", props -> new
            CompoundCraftingTable(props.strength(1.2f, 0f).instabreak()));


    public static void register(){}

    public static List<Block> ALL_CHEMISTRY_EQUIPEMENT = List.of(
            MATERIAL_REDUCER, COMPOUND_CRAFTING_TABLE
    );
}
