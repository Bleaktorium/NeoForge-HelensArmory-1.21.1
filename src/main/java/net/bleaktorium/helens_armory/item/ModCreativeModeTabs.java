package net.bleaktorium.helens_armory.item;

import net.bleaktorium.helens_armory.Helens_Armory;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Helens_Armory.MOD_ID);

    public static final Supplier<CreativeModeTab> HELENS_ARMORY_TAB = CREATIVE_MODE_TAB.register("helens_armory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RARE_NETHERITE_ARMOR_PATTERN.get()))
                    .title(Component.translatable("creativetab.helens_armory.helens_armory"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // BASIC ARMOR PATTERNS
                        output.accept(ModItems.BLANK_ARMOR_PATTERN);
                        output.accept(ModItems.LEATHER_ARMOR_PATTERN);
                        output.accept(ModItems.CHAINMAIL_ARMOR_PATTERN);
                        output.accept(ModItems.GOLD_ARMOR_PATTERN);
                        output.accept(ModItems.IRON_ARMOR_PATTERN);
                        output.accept(ModItems.DIAMOND_ARMOR_PATTERN);
                        output.accept(ModItems.NETHERITE_ARMOR_PATTERN);

                        // RARE ARMOR PATTERNS
                        output.accept(ModItems.RARE_LEATHER_ARMOR_PATTERN);
                        output.accept(ModItems.RARE_CHAINMAIL_ARMOR_PATTERN);
                        output.accept(ModItems.RARE_GOLD_ARMOR_PATTERN);
                        output.accept(ModItems.RARE_IRON_ARMOR_PATTERN);
                        output.accept(ModItems.RARE_DIAMOND_ARMOR_PATTERN);
                        output.accept(ModItems.RARE_NETHERITE_ARMOR_PATTERN);

                        // LEGENDARY ARMOR PATTERNS
                        output.accept(ModItems.LEGENDARY_LEATHER_ARMOR_PATTERN);
                        output.accept(ModItems.LEGENDARY_CHAINMAIL_ARMOR_PATTERN);
                        output.accept(ModItems.LEGENDARY_GOLD_ARMOR_PATTERN);
                        output.accept(ModItems.LEGENDARY_IRON_ARMOR_PATTERN);
                        output.accept(ModItems.LEGENDARY_DIAMOND_ARMOR_PATTERN);
                        output.accept(ModItems.LEGENDARY_NETHERITE_ARMOR_PATTERN);

                        output.accept(ModItems.LEATHER_HELMET);
                        output.accept(ModItems.LEATHER_CHESTPLATE);
                        output.accept(ModItems.LEATHER_LEGGINGS);
                        output.accept(ModItems.LEATHER_BOOTS);


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
