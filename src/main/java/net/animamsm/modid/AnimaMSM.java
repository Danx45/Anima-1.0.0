package net.animamsm.modid;

import net.animamsm.modid.block.ModBlocks;
import net.animamsm.modid.item.ModItemGroups;
import net.animamsm.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimaMSM implements ModInitializer {
   public static final String MOD_ID = "animamsm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_BLOCK, RenderLayer.getTranslucent());
	}
}