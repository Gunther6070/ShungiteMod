package net.hayden.shung.item;

import net.hayden.shung.Shung;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Shung.MOD_ID);

    public static final RegistryObject<Item> SHUNGITE = ITEMS.register("shungite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB)));
    public static final RegistryObject<Item> RAW_SHUNGITE = ITEMS.register( "raw_shungite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHUN_TAB)));


    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
    }
}
