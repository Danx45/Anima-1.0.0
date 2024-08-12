package net.animamsm.modid.item.custom;

import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class MasaiaFlightItem extends TrinketItem {
    public MasaiaFlightItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.animamsm.masaian_conduit.tooltip").formatted(Formatting.ITALIC).formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("tooltip.animamsm.masaian_conduit.tooltip2").formatted(Formatting.ITALIC).formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}