package dev.thenu.educationjavafied;

import dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData.ElementRegistry;
import dev.thenu.educationjavafied.blockanditems.blockFile.*;
import dev.thenu.educationjavafied.compat.modmenu.ModConfigManager;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.CompoundTablesTab.COMPOUND_TABLES_CREATIVE_TAB;
import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.CompoundTablesTab.COMPOUND_TABLES_CREATIVE_TAB_KEY;
import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.ElementTab.ELEMENTS_CREATIVE_TAB;
import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.ElementTab.ELEMENTS_CREATIVE_TAB_KEY;
import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.FoodItemTab.FOOD_ITEM_CREATIVE_TAB;
import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.FoodItemTab.FOOD_ITEM_CREATIVE_TAB_KEY;
import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.SubstanceMadeWithElementTab.SUBSTANCE_CREATIVE_TAB;
import static dev.thenu.educationjavafied.blockanditems.creativeModeTab.SubstanceMadeWithElementTab.SUBSTANCE_CREATIVE_TAB_KEY;

public class EducationEditionJavafied implements ModInitializer {

    @Override
    public void onInitialize() {

        ElementBlocks.register();
        CompoundItems.register();
        FoodItems.register();
        ModConfigManager.loadConfig();
        ElementRegistry.init();
        ChemistryEquipement.register();
        BlockRecipes.register();
        CompactedElementBlocks.register();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ELEMENTS_CREATIVE_TAB_KEY, ELEMENTS_CREATIVE_TAB);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, SUBSTANCE_CREATIVE_TAB_KEY, SUBSTANCE_CREATIVE_TAB);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FOOD_ITEM_CREATIVE_TAB_KEY, FOOD_ITEM_CREATIVE_TAB);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, COMPOUND_TABLES_CREATIVE_TAB_KEY, COMPOUND_TABLES_CREATIVE_TAB);

        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
