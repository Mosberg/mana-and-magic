package dk.mosberg.mam.registry;

import dk.mosberg.mam.ManaAndMagic;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

/**
 * Registry for all mod blocks including animated gemstone ores.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public final class MamBlocks {

    public static final Block GEMSTONE_ORE = register("gemstone_ore",
            new Block(Block.Settings.copy(Blocks.EMERALD_ORE).mapColor(MapColor.STONE_GRAY)));

    public static final Block DEEPSLATE_GEMSTONE_ORE = register("deepslate_gemstone_ore", new Block(
            Block.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.DEEPSLATE_GRAY)));

    private MamBlocks() {
        throw new AssertionError("Utility class");
    }

    /**
     * Registers a block and its corresponding block item.
     *
     * @param id Registry ID
     * @param block Block instance
     * @return Registered block
     */
    private static Block register(String id, Block block) {
        Identifier identifier = Identifier.of(ManaAndMagic.MOD_ID, id);

        // Register block
        Block registeredBlock = Registry.register(Registries.BLOCK, identifier, block);

        // Register block item
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, identifier);
        BlockItem blockItem =
                new BlockItem(registeredBlock, new Item.Settings().registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, blockItem);

        return registeredBlock;
    }

    /**
     * Initializes block registration and adds to creative tabs.
     */
    public static void register() {
        ManaAndMagic.LOGGER.info("Registering gemstone ore blocks");

        // Add to Natural Blocks creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(GEMSTONE_ORE);
            entries.add(DEEPSLATE_GEMSTONE_ORE);
        });
    }
}
