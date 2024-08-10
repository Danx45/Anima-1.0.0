package net.animamsm.modid.datagen;

import net.animamsm.modid.block.ModBlocks;
import net.animamsm.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    //private static List<ItemConvertible>MISC_ORE_SMELTABLES = List.of(ModItems.RAW_MIS, ModBlocks.MISC_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerSmelting(exporter, MISC_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.MISC,0.5f, 200, "MISC");
        //offerBlasting(exporter, MISC_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.MISC,0.5f, 100, "MISC");

        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MAPLE_BLOCK, ModItems.BOTTLE_OF_MAPLE_SYRUP);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BOTTLE_OF_MAPLE_SYRUP, 4)
                .input(ModBlocks.MAPLE_BLOCK)
                .input(Items.GLASS_BOTTLE, 4)
                .criterion("has_maple_block", conditionsFromItem(ModBlocks.MAPLE_BLOCK))
                .offerTo(exporter);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ADOBE_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STURDY_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.REFRACTORY_BRICKS, Blocks.BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_STRIPE, Blocks.BLACK_CONCRETE);
    }
}
