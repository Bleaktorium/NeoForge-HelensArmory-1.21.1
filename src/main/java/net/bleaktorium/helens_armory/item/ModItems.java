package net.bleaktorium.helens_armory.item;

import net.bleaktorium.helens_armory.Helens_Armory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Helens_Armory.MOD_ID);

    //  BASIC ARMOR PATTERNS
    public static final DeferredItem<Item> BLANK_ARMOR_PATTERN = ITEMS.register("blank_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEATHER_ARMOR_PATTERN = ITEMS.register("leather_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAINMAIL_ARMOR_PATTERN = ITEMS.register("chainmail_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_ARMOR_PATTERN = ITEMS.register("gold_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_ARMOR_PATTERN = ITEMS.register("iron_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_ARMOR_PATTERN = ITEMS.register("diamond_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_ARMOR_PATTERN = ITEMS.register("netherite_armor_pattern",
            () -> new Item(new Item.Properties()));

    //  RARE ARMOR PATTERNS
    public static final DeferredItem<Item> RARE_LEATHER_ARMOR_PATTERN = ITEMS.register("rare_leather_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RARE_CHAINMAIL_ARMOR_PATTERN = ITEMS.register("rare_chainmail_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RARE_GOLD_ARMOR_PATTERN = ITEMS.register("rare_gold_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RARE_IRON_ARMOR_PATTERN = ITEMS.register("rare_iron_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RARE_DIAMOND_ARMOR_PATTERN = ITEMS.register("rare_diamond_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RARE_NETHERITE_ARMOR_PATTERN = ITEMS.register("rare_netherite_armor_pattern",
            () -> new Item(new Item.Properties()));

    //  LEGENDARY ARMOR PATTERNS
    public static final DeferredItem<Item> LEGENDARY_LEATHER_ARMOR_PATTERN = ITEMS.register("legendary_leather_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEGENDARY_CHAINMAIL_ARMOR_PATTERN = ITEMS.register("legendary_chainmail_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEGENDARY_GOLD_ARMOR_PATTERN = ITEMS.register("legendary_gold_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEGENDARY_IRON_ARMOR_PATTERN = ITEMS.register("legendary_iron_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEGENDARY_DIAMOND_ARMOR_PATTERN = ITEMS.register("legendary_diamond_armor_pattern",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEGENDARY_NETHERITE_ARMOR_PATTERN = ITEMS.register("legendary_netherite_armor_pattern",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
