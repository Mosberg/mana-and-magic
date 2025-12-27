package dk.mosberg.mam;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dk.mosberg.mam.registry.MamItemGroups;
import dk.mosberg.mam.registry.MamItems;
import net.fabricmc.api.ModInitializer;

/**
 * Arcane Magic System - Mana and Magic Main mod initializer for server and common code
 *
 * @author Mosberg
 * @version 1.0.0
 */
public class ManaAndMagic implements ModInitializer {
    /**
     * Mod identifier for registration and namespacing
     */
    public static final String MOD_ID = "mam";

    /**
     * Human-readable mod name
     */
    public static final String MOD_NAME = "Arcane Magic System - Mana and Magic";

    /**
     * Logger instance for mod logging
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing {} v1.0.0", MOD_NAME);

        // Register mod content in proper order
        // MamBlocks.register();
        MamItems.register();
        // MamSpells.register();
        // MamRituals.register();
        // MamWorldGens.register();
        // MamNetworkings.register();
        MamItemGroups.register();

        LOGGER.info("{} initialized successfully!", MOD_NAME);
    }

    /**
     * Get the mod ID
     *
     * @return The mod identifier
     */
    @NotNull
    public static String getModId() {
        return MOD_ID;
    }
}
