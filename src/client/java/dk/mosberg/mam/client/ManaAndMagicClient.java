package dk.mosberg.mam.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ClientModInitializer;

/**
 * Arcane Magic System - Mana and Magic Client-side initialization for rendering, UI, and
 * client-only features
 *
 * @author Mosberg
 * @version 1.0.0
 */
public class ManaAndMagicClient implements ClientModInitializer {
    /**
     * Client-specific logger
     */
    public static final Logger LOGGER = LoggerFactory.getLogger("MAM-Client");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing Arcane Magic System client...");

        // Register client-side handlers
        // MamModels.register();
        // MamRenderers.register();
        // MamScreens.register();
        // MamKeyBindings.register();
        // MamParticles.register();
        // MamNetworkHandlers.register();
        LOGGER.info("Arcane Magic System client initialized!");
    }
}
