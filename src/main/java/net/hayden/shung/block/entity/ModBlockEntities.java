package net.hayden.shung.block.entity;

import net.hayden.shung.Shung;
import net.hayden.shung.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Shung.MOD_ID);

    public static final RegistryObject<BlockEntityType<ShungiteStoveBlockEntity>> SHUNGITE_STOVE =
            BLOCK_ENTITIES.register("shungite_stove", () ->
                    BlockEntityType.Builder.of(ShungiteStoveBlockEntity::new,
                            ModBlocks.SHUNGITE_STOVE.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}