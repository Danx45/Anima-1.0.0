package net.animamsm.modid.datagen;

import net.animamsm.modid.block.ModBlocks;
import net.animamsm.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADOBE_BRICKS);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STURDY_BRICKS);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFRACTORY_BRICKS);
            blockStateModelGenerator.registerSouthDefaultHorizontalFacing(
                    TexturedModel.TEMPLATE_GLAZED_TERRACOTTA,
                    ModBlocks.BLOCK_OF_STRIPE
                    
            );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BOTTLE_OF_MAPLE_SYRUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAN_OF_PEPSI, Models.GENERATED);

        itemModelGenerator.register(ModItems.MASAIAN_CONDUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPTY_ARTIFACT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEART_OF_THE_WOODS, Models.GENERATED);

        itemModelGenerator.register(ModItems.FISH_KNIFE, Models.HANDHELD);
    }
}
