package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.gui;

import dev.thenu.educationjavafied.blockanditems.blockFile.BlockRecipes;
import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.recipes.MaterialReducerRecipe;
import dev.thenu.menus.menuTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;

import java.util.List;

public class MaterialReducerMenu extends AbstractContainerMenu {
    private final Container container;
    private final Player player;

    public MaterialReducerMenu(int syncId, Inventory playerInventory) {
        this(syncId, playerInventory, new SimpleContainer(10));
    }

    public MaterialReducerMenu(int syncId, Inventory playerInventory, Container container) {
        super(menuTypes.MATERIAL_REDUCER_MENU, syncId);
        this.container = container;
        this.player = playerInventory.player;
        checkContainerSize(container, 10);

        // Slot 0: Top Input Slot (Centered)
        this.addSlot(new Slot(container, 0, 80, 13));

        // Slots 1-5: Upper Output Row
        int upperOffset = 59;
        this.addSlot(new Slot(container, 1, 8, upperOffset));
        this.addSlot(new Slot(container, 2, 44, upperOffset));
        this.addSlot(new Slot(container, 3, 80, upperOffset));
        this.addSlot(new Slot(container, 4, 116, upperOffset));
        this.addSlot(new Slot(container, 5, 152, upperOffset));

        // Slots 6-9: Lower Output Row
        int lowerOffset = 78;
        this.addSlot(new Slot(container, 6, 26, lowerOffset));
        this.addSlot(new Slot(container, 7, 62, lowerOffset));
        this.addSlot(new Slot(container, 8, 98, lowerOffset));
        this.addSlot(new Slot(container, 9, 134, lowerOffset));

        // Top Row (Inv: slots 9-17)
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col + 9, 8 + (col * 18), 112));
        }

        // Middle Row (Inv: slots 18-26) - Fixed index from 19 to 18
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col + 18, 8 + (col * 18), 131));
        }

        // Bottom Row (Inv: slots 27-35)
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col + 27, 8 + (col * 18), 150));
        }

        // Player hotbar (slots 0-8)
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + (col * 18), 173));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        if (!player.level().isClientSide()) {
            this.clearContainer(player, this.container);
        }
    }

    @Override
    protected boolean moveItemStackTo(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
        boolean movedAny = false;
        int currentIndex = reverseDirection ? endIndex - 1 : startIndex;

        if (stack.isStackable()) {
            while (!stack.isEmpty()) {
                if (reverseDirection ? currentIndex < startIndex : currentIndex >= endIndex) {
                    break;
                }
                Slot slot = this.slots.get(currentIndex);
                ItemStack existingStack = slot.getItem();
                if (!existingStack.isEmpty() && ItemStack.isSameItemSameComponents(stack, existingStack)) {
                    int combinedSize = existingStack.getCount() + stack.getCount();
                    int maxStackSize = Math.min(slot.getMaxStackSize(existingStack), stack.getMaxStackSize());

                    if (combinedSize <= maxStackSize) {
                        stack.setCount(0);
                        existingStack.setCount(combinedSize);
                        slot.setChanged();
                        movedAny = true;
                    } else if (existingStack.getCount() < maxStackSize) {
                        stack.shrink(maxStackSize - existingStack.getCount());
                        existingStack.setCount(maxStackSize);
                        slot.setChanged();
                        movedAny = true;
                    }
                }
                currentIndex += reverseDirection ? -1 : 1;
            }
        }
        if (!stack.isEmpty()) {
            currentIndex = reverseDirection ? endIndex - 1 : startIndex;
            while (!stack.isEmpty()) {
                if (reverseDirection ? currentIndex < startIndex : currentIndex >= endIndex) {
                    break;
                }
                Slot slot = this.slots.get(currentIndex);
                ItemStack existingStack = slot.getItem();
                if (existingStack.isEmpty() && slot.mayPlace(stack)) {
                    int maxStackSize = Math.min(slot.getMaxStackSize(stack), stack.getMaxStackSize());
                    if (stack.getCount() > maxStackSize) {
                        slot.setByPlayer(stack.split(maxStackSize));
                    } else {
                        slot.setByPlayer(stack.split(stack.getCount()));
                    }
                    slot.setChanged();
                    movedAny = true;
                    break;
                }
                currentIndex += reverseDirection ? -1 : 1;
            }
        }
        return movedAny;
    }

    @Override
    public void slotsChanged(Container container) {
        super.slotsChanged(container);
        if (this.container instanceof SimpleContainer simpleContainer) {
            ItemStack inputStack = simpleContainer.getItem(0);
            if (!inputStack.isEmpty()) {
                Level level = this.player.level();
                if (level instanceof ServerLevel serverLevel) {
                    SingleRecipeInput input = new SingleRecipeInput(inputStack);
                    RecipeHolder<MaterialReducerRecipe> recipeHolder = serverLevel.recipeAccess()
                            .getRecipeFor(BlockRecipes.MATERIAL_REDUCER_RECIPE_RECIPE_TYPE, input, serverLevel)
                            .orElse(null);
                    if (recipeHolder != null) {
                        MaterialReducerRecipe recipe = recipeHolder.value();
                        List<ItemStack> outputs = recipe.getOutputs();
                        if (canOutput(simpleContainer, outputs)) {
                            inputStack.shrink(1);
                            for (int i = 0; i < outputs.size() && (i + 1) < simpleContainer.getContainerSize(); i++) {
                                simpleContainer.setItem(i + 1, outputs.get(i).copy());
                            }
                            this.broadcastChanges();
                        }
                    }
                }
            }
        }
    }

    private boolean canOutput(Container container, List<ItemStack> outputs) {
        for (int i = 0; i < outputs.size(); i++) {
            if (!container.getItem(i + 1).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }
}