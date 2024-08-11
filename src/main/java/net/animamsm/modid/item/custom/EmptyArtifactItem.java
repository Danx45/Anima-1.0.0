package net.animamsm.modid.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class EmptyArtifactItem extends Item {
    public EmptyArtifactItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.animamsm.empty_artifact.tooltip").formatted(Formatting.ITALIC).formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}