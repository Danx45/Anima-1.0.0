package net.animamsm.modid.item;

import net.animamsm.modid.AnimaMSM;
import net.animamsm.modid.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PotionItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item BOTTLE_OF_MAPLE_SYRUP = registerItem("bottle_of_maple_syrup", new MapleBottleItem(new FabricItemSettings().food(ModFoodComponents.BOTTLE_OF_MAPLE_SYRUP)));
    public static final Item CAN_OF_PEPSI = registerItem("can_of_pepsi", new SodaItem(new FabricItemSettings().food(ModFoodComponents.SODA).maxCount(16).rarity(Rarity.UNCOMMON)));
    public static final Item FISH_KNIFE = registerItem("fish_knife", new SwordItem(ModToolMaterial.MASAIAN,7,0.2f,new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item HEART_OF_THE_WOODS = registerItem("heart_of_the_woods", new WoodHeartItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item MASAIAN_CONDUIT = registerItem("masaian_conduit", new MasaiaFlightItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item EMPTY_ARTIFACT = registerItem("empty_artifact", new EmptyArtifactItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {}
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnimaMSM.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AnimaMSM.LOGGER.info("Registering mod items for" + AnimaMSM.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
