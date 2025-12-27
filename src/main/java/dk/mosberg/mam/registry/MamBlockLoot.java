package dk.mosberg.mam.registry;

import dk.mosberg.mam.ManaAndMagic;

/**
 * Block loot table registry placeholder. Actual loot tables are defined in
 * data/mam/loot_table/blocks/
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public final class MamBlockLoot {

    private MamBlockLoot() {
        throw new AssertionError("Utility class");
    }

    /**
     * Initializes block loot table registration. Loot tables are loaded from JSON files in data
     * pack.
     */
    public static void register() {
        ManaAndMagic.LOGGER.info("Registering block loot tables");
    }
}
