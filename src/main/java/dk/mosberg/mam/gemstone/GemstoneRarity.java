package dk.mosberg.mam.gemstone;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

/**
 * Gemstone rarity tiers with mana capacities and formatting.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public enum GemstoneRarity {
    COMMON(50f, Formatting.GRAY), UNCOMMON(150f, Formatting.GREEN), RARE(400f,
            Formatting.BLUE), EPIC(800f,
                    Formatting.LIGHT_PURPLE), LEGENDARY(1500f, Formatting.GOLD);

    private final float manaCapacity;
    private final Formatting formatting;

    GemstoneRarity(float manaCapacity, Formatting formatting) {
        this.manaCapacity = manaCapacity;
        this.formatting = formatting;
    }

    public float getManaCapacity() {
        return manaCapacity;
    }

    public Formatting getFormatting() {
        return formatting;
    }

    /**
     * Gets the localized and formatted name of this rarity.
     *
     * @return the formatted rarity name
     * @since 1.0.0
     */
    public Text getName() {
        return Text.translatable("rarity.mam." + name().toLowerCase()).formatted(formatting);
    }
}
