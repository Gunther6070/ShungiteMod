package net.hayden.shung.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab SHUN_TAB = new CreativeModeTab("shuntab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_SHUNGITE.get());
        }
    };
}