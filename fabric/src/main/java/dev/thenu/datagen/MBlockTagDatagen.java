package dev.thenu.datagen;

import dev.thenu.educationjavafied.blockanditems.modTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import static dev.thenu.educationjavafied.blockanditems.blockFile.ElementBlocks.ALL_ELEMENT_BLOCKS;

public class MBlockTagDatagen extends FabricTagsProvider.BlockTagsProvider {
    public MBlockTagDatagen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        var periodicTableTag = tag(modTags.Blocks.PERIODIC_TABLE_ELEMENTS);
        var pickaxeTag = tag(BlockTags.MINEABLE_WITH_PICKAXE);
        var stoneToolTag = tag(BlockTags.NEEDS_STONE_TOOL);

        for (Block block : ALL_ELEMENT_BLOCKS) {
            periodicTableTag.add(block.properties().blockIdOrThrow());
            pickaxeTag.add(block.properties().blockIdOrThrow());
            stoneToolTag.add(block.properties().blockIdOrThrow());
        }
    }
}
