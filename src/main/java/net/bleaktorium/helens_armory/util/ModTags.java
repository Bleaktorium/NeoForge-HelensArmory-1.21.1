package net.bleaktorium.helens_armory.util;

import net.bleaktorium.helens_armory.Helens_Armory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    // BLOCK TAG CLASS
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Helens_Armory.MOD_ID, name));
        }
    }


    // ITEM TAG CLASS
    public static class Items {

        // ARMOR PATTERN TAGS
        public static final TagKey<Item> BASIC_ARMOR_PATTERNS = createTag("basic_armor_patterns");
        public static final TagKey<Item> RARE_ARMOR_PATTERNS = createTag("rare_armor_patterns");
        public static final TagKey<Item> LEGENDARY_ARMOR_PATTERNS = createTag("legendary_armor_patterns");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Helens_Armory.MOD_ID, name));
        }
    }
}
