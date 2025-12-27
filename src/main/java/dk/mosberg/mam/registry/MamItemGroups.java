package dk.mosberg.mam.registry;

import dk.mosberg.mam.ManaAndMagic;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * Registers custom creative item groups for the Mana and Magic mod.
 *
 * <p>
 * Creates a dedicated tab for all gemstone items and hooks them into both the custom tab and
 * vanilla groups when appropriate.
 * </p>
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public final class MamItemGroups {

    /**
     * Registry key for the Mana and Magic gemstone group.
     */
    public static final RegistryKey<ItemGroup> GEMSTONE_GROUP_KEY = RegistryKey
            .of(RegistryKeys.ITEM_GROUP, Identifier.of(ManaAndMagic.MOD_ID, "gemstones"));

    /**
     * Custom creative tab containing the 21 gemstones.
     */
    public static final ItemGroup GEMSTONE_GROUP =
            FabricItemGroup.builder().icon(() -> new ItemStack(MamItems.RUBY))
                    .displayName(Text.translatable("itemGroup.mam.gemstones"))
                    .entries((context, entries) -> {
                        entries.add(MamItems.HEMATITE);
                        entries.add(MamItems.CARNELIAN);
                        entries.add(MamItems.CITRINE);
                        entries.add(MamItems.JADE);
                        entries.add(MamItems.LAPIS_GEM); // Updated
                        entries.add(MamItems.QUARTZ_GEM); // Updated
                        entries.add(MamItems.PERIDOT);
                        entries.add(MamItems.SODALITE);
                        entries.add(MamItems.AMETHYST_GEM); // Updated
                        entries.add(MamItems.APATITE);
                        entries.add(MamItems.AQUAMARINE);
                        entries.add(MamItems.EMERALD_GEM);
                        entries.add(MamItems.MOONSTONE);
                        entries.add(MamItems.PRISMARINE_GEM); // Updated
                        entries.add(MamItems.RHODONITE);
                        entries.add(MamItems.TOURMALINE);
                        entries.add(MamItems.TOPAZ);
                        entries.add(MamItems.RUBY);
                        entries.add(MamItems.SAPPHIRE);
                        entries.add(MamItems.TANZANITE);
                        entries.add(MamItems.ARCANE_DIAMOND); // Updated
                    }).build();

    private MamItemGroups() {
        throw new AssertionError("MamItemGroups is a utility class and cannot be instantiated");
    }

    /**
     * Registers the custom item group and wires gemstone items into vanilla tabs.
     *
     * <p>
     * Called from {@link dk.mosberg.mam.ManaAndMagic#onInitialize()} after
     * {@link MamItems#register()}.
     * </p>
     *
     * @since 1.0.0
     * @author Mosberg
     * @example
     *
     *          <pre>
     *          MamItems.register();
     *          MamItemGroups.register();
     *          </pre>
     */
    public static void register() {
        ManaAndMagic.LOGGER.info("Registering item groups for mod: {}", ManaAndMagic.MOD_ID);

        // Register custom creative tab.[web:37][web:40]
        Registry.register(Registries.ITEM_GROUP, GEMSTONE_GROUP_KEY, GEMSTONE_GROUP);

        // Optionally also add gemstones into vanilla categories (Ingredients fits
        // best).[web:40][web:44]
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MamItems.HEMATITE);
            entries.add(MamItems.CARNELIAN);
            entries.add(MamItems.CITRINE);
            entries.add(MamItems.JADE);
            entries.add(MamItems.LAPIS_GEM);
            entries.add(MamItems.QUARTZ_GEM);
            entries.add(MamItems.PERIDOT);
            entries.add(MamItems.SODALITE);
            entries.add(MamItems.AMETHYST_GEM);
            entries.add(MamItems.APATITE);
            entries.add(MamItems.AQUAMARINE);
            entries.add(MamItems.EMERALD_GEM);
            entries.add(MamItems.MOONSTONE);
            entries.add(MamItems.PRISMARINE_GEM);
            entries.add(MamItems.RHODONITE);
            entries.add(MamItems.TOURMALINE);
            entries.add(MamItems.TOPAZ);
            entries.add(MamItems.RUBY);
            entries.add(MamItems.SAPPHIRE);
            entries.add(MamItems.TANZANITE);
            entries.add(MamItems.ARCANE_DIAMOND);
        });
    }
}
