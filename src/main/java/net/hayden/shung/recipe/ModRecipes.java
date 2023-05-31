package net.hayden.shung.recipe;

import net.hayden.shung.Shung;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Shung.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ShungiteStoveRecipe>> GEM_INFUSING_SERIALIZER =
            SERIALIZERS.register("gem_infusing", () -> ShungiteStoveRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}