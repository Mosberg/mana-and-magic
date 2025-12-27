package dk.mosberg.mam.gemstone;

import org.jetbrains.annotations.NotNull;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

/**
 * Balanced gemstone rarity system with progressive mana capacities. Progression:
 * Common→Uncommon→Rare→Epic (1:3:8:15 ratio)
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public enum GemstoneRarity {
    COMMON(100f, Formatting.GRAY, 1.0f), UNCOMMON(300f, Formatting.GREEN, 1.2f), RARE(800f,
            Formatting.BLUE, 1.5f), EPIC(1500f, Formatting.LIGHT_PURPLE, 2.0f);

    private final float manaCapacity;
    private final Formatting formatting;
    private final float spellPowerMultiplier;

    GemstoneRarity(float manaCapacity, Formatting formatting, float spellPowerMultiplier) {
        this.manaCapacity = manaCapacity;
        this.formatting = formatting;
        this.spellPowerMultiplier = spellPowerMultiplier;
    }

    public float getManaCapacity() {
        return manaCapacity;
    }

    public Formatting getFormatting() {
        return formatting;
    }

    public float getSpellPowerMultiplier() {
        return spellPowerMultiplier;
    }

    @NotNull
    public Text getDisplayName() {
        return Text.literal(name().substring(0, 1) + name().substring(1).toLowerCase())
                .formatted(formatting);
    }

    /**
     * Gets rarity weight for loot tables (higher = more common).
     *
     * @return Loot table weight
     * @since 1.0.0
     */
    public int getLootWeight() {
        return switch (this) {
            case COMMON -> 100;
            case UNCOMMON -> 60;
            case RARE -> 20;
            case EPIC -> 5;
        };
    }
}
