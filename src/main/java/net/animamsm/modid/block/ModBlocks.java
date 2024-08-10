package net.animamsm.modid.block;

import net.animamsm.modid.AnimaMSM;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MAPLE_BLOCK = registerBlock("maple_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));
    public static final Block ADOBE_BRICKS = registerBlock("adobe_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block STRIPE_BLOCK = registerBlock("block_of_stripe",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AnimaMSM.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AnimaMSM.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        AnimaMSM.LOGGER.info("Registering ModBlocks for " + AnimaMSM.MOD_ID);
    }
}