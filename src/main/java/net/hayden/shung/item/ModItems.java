package net.hayden.shung.item;

import net.hayden.shung.Shung;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Shung.MOD_ID);

    public static final RegistryObject<Item> POLISHED_SHUNGITE = ITEMS.register("polished_shungite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB)));

    public static final RegistryObject<Item> RAW_SHUNGITE = ITEMS.register( "raw_shungite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB)));

    public static final RegistryObject<AxeItem> SHUNGITE_AXE = ITEMS.register( "shungite_axe",
            () -> new AxeItem(new ForgeTier(3, 743, 12.0F, 0, 22, null,
                    () -> Ingredient.of(ModItems.POLISHED_SHUNGITE.get())),
                    8, -3F, new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB).stacksTo(1)));

    public static final RegistryObject<PickaxeItem> SHUNGITE_PICKAXE = ITEMS.register( "shungite_pickaxe",
            () -> new PickaxeItem(new ForgeTier(3, 743, 12.0F, 0, 22, null,
                    () -> Ingredient.of(ModItems.POLISHED_SHUNGITE.get())),
                    3, -2.8F, new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB).stacksTo(1)));

    public static final RegistryObject<ShovelItem> SHUNGITE_SHOVEL = ITEMS.register( "shungite_shovel",
            () -> new ShovelItem(new ForgeTier(3, 743, 12.0F, 0, 22, null,
                    () -> Ingredient.of(ModItems.POLISHED_SHUNGITE.get())),
                    3.5f, -3F, new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB).stacksTo(1)));

    public static final RegistryObject<SwordItem> SHUNGITE_SWORD = ITEMS.register( "shungite_sword",
            () -> new SwordItem(new ForgeTier(3, 743, 12.0F, 0, 22, null,
                    () -> Ingredient.of(ModItems.POLISHED_SHUNGITE.get())),
                    6, -2.4F, new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB).stacksTo(1)));

    public static final RegistryObject<HoeItem> SHUNGITE_HOE = ITEMS.register( "shungite_hoe",
            () -> new HoeItem(new ForgeTier(3, 743, 12.0F, 0, 22, null,
                    () -> Ingredient.of(ModItems.POLISHED_SHUNGITE.get())),
                    0, -2.8F, new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
    }
}
