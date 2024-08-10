package net.animamsm.modid.datagen;

import net.animamsm.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MAPLE_BLOCK);
        addDrop(ModBlocks.BLOCK_OF_STRIPE);
        addDrop(ModBlocks.ADOBE_BRICKS);
        addDrop(ModBlocks.STURDY_BRICKS);
        addDrop(ModBlocks.REFRACTORY_BRICKS);
//addDrop(ModBlocks.MISC_ORE, copperLikeOreDrops(ModBlocks.MISC_ORE, ModItems.RAW_MISC));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}