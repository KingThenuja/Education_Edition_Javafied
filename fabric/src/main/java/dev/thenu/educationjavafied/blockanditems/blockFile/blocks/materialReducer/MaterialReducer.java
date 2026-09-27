package dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer;

import dev.thenu.educationjavafied.blockanditems.blockFile.blocks.materialReducer.gui.MaterialReducerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.BlockHitResult;

import java.util.List;

public class MaterialReducer extends Block {
    public MaterialReducer(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            player.openMenu(new SimpleMenuProvider(
                    (syncId, inventory, p) -> new MaterialReducerMenu(syncId, inventory),
                    Component.translatable("block.educationeditionjavafied.material_reducer.open_menu")
            ));
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            player.openMenu(new SimpleMenuProvider(
                    (syncId, inventory, p) -> new MaterialReducerMenu(syncId, inventory),
                    Component.translatable("block.educationeditionjavafied.material_reducer.open_menu")
            ));
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected List<ItemStack> getDrops(BlockState state, LootParams.Builder params) {
        return super.getDrops(state, params);
    }
}
