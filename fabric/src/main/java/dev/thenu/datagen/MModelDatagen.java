package dev.thenu.datagen;

import dev.thenu.educationjavafied.Constants;
import dev.thenu.educationjavafied.blockanditems.blockFile.CompactedElementBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Optional;

import static dev.thenu.educationjavafied.blockanditems.blockFile.CompoundItems.ALL_COMPOUND_ITEMS;
import static dev.thenu.educationjavafied.blockanditems.blockFile.ElementBlocks.ALL_ELEMENT_BLOCKS;
import static dev.thenu.educationjavafied.blockanditems.blockFile.FoodItems.ALL_FOOD_ITEMS;

public class MModelDatagen extends FabricModelProvider {
    public MModelDatagen(FabricPackOutput output) {
        super(output);
    }

    public static final ModelTemplate COMPACTED_CUBE_TEMPLATE = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath(Constants.MOD_ID, "block/compacted_frame")),
            Optional.empty(),
            TextureSlot.TEXTURE,
            TextureSlot.CROSS
    );

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        for (Block block : ALL_ELEMENT_BLOCKS) {
            blockModelGenerators.createTrivialCube(block);
        }

        for (Block compactedBlock : CompactedElementBlocks.ALL_ELEMENT_BLOCKS) {
            Identifier blockId = BuiltInRegistries.BLOCK.getKey(compactedBlock);
            String blockPath = blockId.getPath();

            String baseElementName = blockPath.replaceFirst("^\\d+_compacted_", "");

            TextureMapping textureMapping = new TextureMapping()
                    .put(TextureSlot.TEXTURE, new Material(Identifier.fromNamespaceAndPath("educationjavafied", "block/" + baseElementName)))
                    .put(TextureSlot.CROSS, new Material(Identifier.fromNamespaceAndPath("educationjavafied", "block/compacted_frame")));

            TexturedModel.Provider compactedProvider = TexturedModel.createDefault(
                    b -> textureMapping,
                    COMPACTED_CUBE_TEMPLATE
            );

            blockModelGenerators.createTrivialBlock(compactedBlock, compactedProvider);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        for (Block block : ALL_ELEMENT_BLOCKS) {
            itemModelGenerators.generateFlatItem(
                    block.asItem(),
                    ModelTemplates.FLAT_ITEM
            );
        }
        for (Item item : ALL_FOOD_ITEMS) {
            itemModelGenerators.generateFlatItem(
                    item.asItem(),
                    ModelTemplates.FLAT_ITEM
            );
        }
        for (Item item : ALL_COMPOUND_ITEMS) {
            itemModelGenerators.generateFlatItem(
                    item.asItem(),
                    ModelTemplates.FLAT_ITEM
            );
        }
        for (Block compactedBlock : CompactedElementBlocks.ALL_ELEMENT_BLOCKS) {
            itemModelGenerators.generateFlatItem(
                    compactedBlock.asItem(),
                    ModelTemplates.FLAT_ITEM
            );
        }
    }
}
