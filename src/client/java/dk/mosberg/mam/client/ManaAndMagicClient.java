package dk.mosberg.mam.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dk.mosberg.mam.registry.MamBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

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

        // Register block render layers for transparency/translucency
        BlockRenderLayerMap.putBlock(MamBlocks.GEMSTONE_ORE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MamBlocks.DEEPSLATE_GEMSTONE_ORE, BlockRenderLayer.CUTOUT);

        LOGGER.info("Arcane Magic System client initialized!");
    }
}
