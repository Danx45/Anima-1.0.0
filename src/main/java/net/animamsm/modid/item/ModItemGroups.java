package net.animamsm.modid.item;

import net.animamsm.modid.AnimaMSM;
import net.animamsm.modid.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ANIMA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AnimaMSM.MOD_ID,"anima"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.anima"))
                    .icon(() -> new ItemStack(ModItems.MASAIAN_CONDUIT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HEART_OF_THE_WOODS);
                        entries.add(ModItems.BOTTLE_OF_MAPLE_SYRUP);
                        entries.add(ModItems.MASAIAN_CONDUIT);
                        entries.add(ModItems.EMPTY_ARTIFACT);

                        entries.add(ModBlocks.MAPLE_BLOCK);
                        entries.add(ModBlocks.ADOBE_BRICKS);
                        entries.add(ModBlocks.STURDY_BRICKS);
                        entries.add(ModBlocks.REFRACTORY_BRICKS);
                        entries.add(ModBlocks.BLOCK_OF_STRIPE);

                    }).build());

    public static void registerItemGroups() {
        AnimaMSM.LOGGER.info("Registering Item Groups for" + AnimaMSM.MOD_ID);
    }
}
