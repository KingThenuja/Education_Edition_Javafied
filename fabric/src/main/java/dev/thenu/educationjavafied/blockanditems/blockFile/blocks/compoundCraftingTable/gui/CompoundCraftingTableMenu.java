package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.compoundCraftingTable.gui;

import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class CompoundCraftingTableMenu extends AbstractContainerMenu {
    private final Container container;

    public CompoundCraftingTableMenu(int syncId, Inventory playerInventory) {
        this(syncId, playerInventory, new SimpleContainer(10));
    }

    // Server-side constructor
    public CompoundCraftingTableMenu(int syncId, Inventory playerInventory, Container container) {
        super(MenuType.CRAFTING, syncId);
        this.container = container;
        checkContainerSize(container, 10);

        // 3x3 Input Grid (Slots 0 to 8) - accepts stacked items
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 3; ++col) {
                this.addSlot(new Slot(container, col + (row * 3), 30 + (col * 18), 17 + (row * 18)));
            }
        }

        // Output Slot (Slot 9)
        this.addSlot(new Slot(container, 9, 124, 35) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }
        });

        // Player Inventory
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + (row * 9) + 9, 8 + (col * 18), 84 + (row * 18)));
            }
        }

        // Player Hotbar
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + (col * 18), 142));
        }
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.clearContainer(player, this.container);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack originalStack = slot.getItem();
            newStack = originalStack.copy();

            if (index < 10) {
                if (!this.moveItemStackTo(originalStack, 10, 46, true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(originalStack, 0, 9, false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return newStack;
    }
}