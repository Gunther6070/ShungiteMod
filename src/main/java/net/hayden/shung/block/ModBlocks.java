package net.hayden.shung.block;

import net.hayden.shung.Shung;
import net.hayden.shung.block.custom.ShungiteStoveBlock;
import net.hayden.shung.item.ModCreativeModeTab;
import net.hayden.shung.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Shung.MOD_ID);

    public static final RegistryObject<Block> SHUNGITE = registerBlock("shungite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> POLISHED_SHUNGITE_BLOCK = registerBlock("polished_shungite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> POLISHED_SHUNGITE_BRICKS = registerBlock("polished_shungite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> POLISHED_SHUNGITE_SLAB = registerBlock("polished_shungite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> POLISHED_SHUNGITE_STAIRS = registerBlock("polished_shungite_stairs",
            () -> new StairBlock(() -> ModBlocks.SHUNGITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> SHUNGITE_SLAB = registerBlock("shungite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> SHUNGITE_STAIRS = registerBlock("shungite_stairs",
            () -> new StairBlock(() -> ModBlocks.SHUNGITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> POLISHED_SHUNGITE_BRICK_STAIRS = registerBlock("polished_shungite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SHUNGITE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> POLISHED_SHUNGITE_BRICK_SLAB = registerBlock("polished_shungite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> SHUNGITE_WALL = registerBlock("shungite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> POLISHED_SHUNGITE_BRICK_WALL = registerBlock("polished_shungite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHUN_TAB);

    public static final RegistryObject<Block> SHUNGITE_STOVE = registerBlock("shungite_stove",
            () -> new ShungiteStoveBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.SHUN_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
