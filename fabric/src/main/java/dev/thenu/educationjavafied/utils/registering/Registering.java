package dev.thenu.educationjavafied.utils.registering;

import dev.thenu.educationjavafied.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import java.util.function.Function;

public class Registering {
    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> blockFactory, Function<Block, BlockItem> itemFactory) {
        Block toRegister = blockFactory.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(Constants.MOD_ID, name))));
        Registry.register(BuiltInRegistries.ITEM,
                Identifier.fromNamespaceAndPath(Constants.MOD_ID, name),
                itemFactory.apply(toRegister));
        return Registry.register(BuiltInRegistries.BLOCK,
                Identifier.fromNamespaceAndPath(Constants.MOD_ID, name), toRegister);

    }
    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> blockFactory) {
        return registerBlock(name, blockFactory, block -> new BlockItem(block, itemProps(name)));
    }
    public static Item.Properties itemProps(String name) {
        return new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM,
                        Identifier.fromNamespaceAndPath(Constants.MOD_ID, name)));

    }

    public static Item registerItem(String name, Function<Item.Properties, Item> factory) {
        Identifier location = Identifier.fromNamespaceAndPath(Constants.MOD_ID, name);
        Item existing = BuiltInRegistries.ITEM.getOptional(location).orElse(null);
        if (existing != null) {
            return existing;
        }
        Item item = factory.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, location)));
        return Registry.register(BuiltInRegistries.ITEM, location, item);
    }
}

