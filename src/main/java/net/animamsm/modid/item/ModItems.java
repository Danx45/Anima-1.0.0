package net.animamsm.modid.item;

import net.animamsm.modid.AnimaMSM;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BOTTLE_OF_MAPLE_SYRUP = registerItem("bottle_of_maple_syrup", new Item(new FabricItemSettings()));
    public static final Item HEART_OF_THE_WOODS = registerItem("heart_of_the_woods", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {}
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AnimaMSM.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AnimaMSM.LOGGER.info("Registering mod items for" + AnimaMSM.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
