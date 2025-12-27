package dk.mosberg.mam.gemstone;

import net.minecraft.util.Formatting;

/**
 * Magic school affinities for gemstones (13 schools).
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public enum GemstoneSchool {
    AIR(Formatting.AQUA), ARCANE(Formatting.DARK_AQUA), BLOOD(Formatting.DARK_RED), CHAOS(
            Formatting.DARK_PURPLE), DARK(Formatting.DARK_GRAY), EARTH(Formatting.DARK_GREEN), FIRE(
                    Formatting.RED), ICE(Formatting.WHITE), LIGHT(Formatting.YELLOW), NATURE(
                            Formatting.GREEN), THUNDER(Formatting.GOLD), VOID(
                                    Formatting.BLACK), WATER(Formatting.BLUE);

    private final Formatting color;

    GemstoneSchool(Formatting color) {
        this.color = color;
    }

    public Formatting getColor() {
        return color;
    }

    /**
     * Returns the resource ID for this school in snake_case.
     *
     * @return the school name in snake_case
     * @since 1.0.0
     */
    public String getName() {
        // Convert enum name (e.g., DARK_GREEN) to snake_case (dark_green)
        return name().toLowerCase();
    }
}
