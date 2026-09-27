package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.compoundCraftingTable;

import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.compoundCraftingTable.gui.CompoundCraftingTableMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CompoundCraftingTable extends Block {

    public CompoundCraftingTable(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            player.openMenu(new SimpleMenuProvider(
                    (syncId, playerInventory, p) -> new CompoundCraftingTableMenu(syncId, playerInventory),
                    Component.literal("Compound Creator")
            ));
        }
        return InteractionResult.SUCCESS;
    }

}
