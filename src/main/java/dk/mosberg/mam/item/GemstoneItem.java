package dk.mosberg.mam.item;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import dk.mosberg.mam.gemstone.GemstoneRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

/**
 * Custom gemstone item with rarity, affinity, and visual metadata.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public class GemstoneItem extends Item {
    private final GemstoneRarity rarity;
    private final String affinity;
    private final int color;

    public GemstoneItem(@NotNull GemstoneRarity rarity, @NotNull String affinity, int color,
            @NotNull Settings settings) {
        super(settings);
        this.rarity = rarity;
        this.affinity = affinity;
        this.color = color;
    }

    public GemstoneRarity getRarity() {
        return rarity;
    }

    public String getAffinity() {
        return affinity;
    }

    public int getColor() {
        return color;
    }

    public float getManaCapacity() {
        return rarity.getManaCapacity();
    }


    public void TooltipContext(@NotNull ItemStack stack, @Nullable World world,
            @NotNull List<Text> tooltip, @NotNull TooltipContext context) {

        // Rarity line
        tooltip.add(Text.empty().append(Text.literal("Rarity: ").formatted(Formatting.GRAY))
                .append(rarity.getDisplayName()));

        // Affinity line
        tooltip.add(Text.empty().append(Text.literal("Affinity: ").formatted(Formatting.GRAY))
                .append(Text.literal(affinity.substring(0, 1).toUpperCase() + affinity.substring(1))
                        .formatted(getAffinityFormatting(affinity))));

        // Mana capacity
        tooltip.add(Text.empty().append(Text.literal("Mana: ").formatted(Formatting.GRAY)).append(
                Text.literal(String.format("%.0f", getManaCapacity())).formatted(Formatting.AQUA)));

        // Spell power bonus
        float bonus = (rarity.getSpellPowerMultiplier() - 1.0f) * 100;
        if (bonus > 0) {
            tooltip.add(Text.empty().append(Text.literal("Power: ").formatted(Formatting.GRAY))
                    .append(Text.literal(String.format("+%.0f%%", bonus))
                            .formatted(Formatting.GOLD)));
        }
    }

    private Formatting getAffinityFormatting(String affinity) {
        return switch (affinity.toLowerCase()) {
            case "fire" -> Formatting.RED;
            case "water", "ice" -> Formatting.BLUE;
            case "earth" -> Formatting.DARK_GREEN;
            case "air" -> Formatting.WHITE;
            case "light" -> Formatting.YELLOW;
            case "dark" -> Formatting.DARK_PURPLE;
            case "nature" -> Formatting.GREEN;
            case "void" -> Formatting.BLACK;
            case "chaos" -> Formatting.LIGHT_PURPLE;
            case "thunder" -> Formatting.GOLD;
            default -> Formatting.GRAY;
        };
    }

    @Override
    public boolean hasGlint(@NotNull ItemStack stack) {
        return rarity == GemstoneRarity.EPIC;
    }
}
