package net.animamsm.modid.block;

import net.animamsm.modid.AnimaMSM;
import net.animamsm.modid.block.custom.MapleBlock;
import net.animamsm.modid.block.custom.MasaianTerracottaBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.block.HoneyBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MAPLE_BLOCK = registerBlock("maple_block",
            new MapleBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));
    public static final Block MOIST_PLUSH = registerBlock("moist_plush",
            new MapleBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final Block ADOBE_BRICKS = registerBlock("adobe_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block REFRACTORY_BRICKS = registerBlock("refractory_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block STURDY_BRICKS = registerBlock("sturdy_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block BLOCK_OF_STRIPE = registerBlock("block_of_stripe",
            new MasaianTerracottaBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).strength(2.0F,1200.0F).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
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
