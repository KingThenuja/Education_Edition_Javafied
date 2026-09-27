package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.gui;

import dev.thenu.educationjavafied.Constants;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;

public class MaterialReducerScreen extends AbstractContainerScreen<MaterialReducerMenu> {

    private static final Identifier TEXTURE =
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "textures/gui/material_reducer_gui.png");

    public MaterialReducerScreen(MaterialReducerMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title, 176, 197);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float delta) {
        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;

        graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, x, y, 0f, 0f, this.imageWidth, this.imageHeight, 176, 197);
    }
}