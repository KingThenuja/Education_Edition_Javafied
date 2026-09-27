package dev.thenu.educationjavafied;

import dev.thenu.educationjavafied.blockanditems.appendedTooltips.ElementData.appendElementTooltip;
import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.compoundCraftingTable.gui.CompoundCraftingTableScreen;
import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.gui.MaterialReducerScreen;
import dev.thenu.menus.menuTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.client.gui.screens.MenuScreens;

public class EducationEditionJavafiedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, _, _, lines) -> appendElementTooltip.appendElementTooltips(stack, lines::add));
        MenuScreens.register(menuTypes.MATERIAL_REDUCER_MENU, MaterialReducerScreen::new);
        MenuScreens.register(menuTypes.COMPOUND_CRAFTING_TABLE_MENU, CompoundCraftingTableScreen::new);
    }

}
