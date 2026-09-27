package dev.thenu.educationjavafied.blockanditems;

import dev.thenu.educationjavafied.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class modTags {
    public static class Blocks  {

        public static final TagKey<Block> PERIODIC_TABLE_ELEMENTS = createTag("periodic_table_elements");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
        }
    }
    public static class Items  {

        public static final TagKey<Item> SALTED_FOOD = createTag("salted_food");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
        }
    }
}
