package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.compoundCraftingTable.gui;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;

public class CompoundCraftingTableScreen extends AbstractContainerScreen<CompoundCraftingTableMenu> {
    // Points directly to Minecraft's vanilla crafting table texture
    private static final Identifier TEXTURE =
            Identifier.fromNamespaceAndPath("minecraft", "textures/gui/container/crafting_table.png");

    public CompoundCraftingTableScreen(CompoundCraftingTableMenu handler, Inventory inventory, Component title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public void extractBackground(final GuiGraphicsExtractor graphics, final int mouseX, final int mouseY, final float a) {
        super.extractBackground(graphics, mouseX, mouseY, a);
        int xo = this.leftPos;
        int yo = (this.height - this.imageHeight) / 2;
        graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, xo, yo, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 256, 256);
    }
}