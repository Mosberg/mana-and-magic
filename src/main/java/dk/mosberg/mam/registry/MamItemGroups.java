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
 * Custom creative tab for gemstone items, organized by rarity.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public final class MamItemGroups {

    public static final RegistryKey<ItemGroup> GEMSTONE_GROUP_KEY = RegistryKey
            .of(RegistryKeys.ITEM_GROUP, Identifier.of(ManaAndMagic.MOD_ID, "gemstones"));

    public static final ItemGroup GEMSTONE_GROUP =
            FabricItemGroup.builder().icon(() -> new ItemStack(MamItems.RUBY))
                    .displayName(Text.translatable("itemGroup.mam.gemstones"))
                    .entries((context, entries) -> {
                        // Epic tier (glowing)
                        entries.add(MamItems.RUBY);
                        entries.add(MamItems.SAPPHIRE);
                        entries.add(MamItems.TANZANITE);

                        // Rare tier
                        entries.add(MamItems.APATITE);
                        entries.add(MamItems.AQUAMARINE);
                        entries.add(MamItems.MOONSTONE);
                        entries.add(MamItems.RHODONITE);
                        entries.add(MamItems.TOPAZ);
                        entries.add(MamItems.TOURMALINE);

                        // Uncommon tier
                        entries.add(MamItems.CARNELIAN);
                        entries.add(MamItems.CITRINE);
                        entries.add(MamItems.JADE);
                        entries.add(MamItems.PERIDOT);
                        entries.add(MamItems.SODALITE);

                        // Common tier
                        entries.add(MamItems.HEMATITE);
                    }).build();

    private MamItemGroups() {
        throw new AssertionError("Utility class");
    }

    public static void register() {
        ManaAndMagic.LOGGER.info("Registering gemstone item groups");

        Registry.register(Registries.ITEM_GROUP, GEMSTONE_GROUP_KEY, GEMSTONE_GROUP);

        // Add to vanilla Ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MamItems.HEMATITE);
            entries.add(MamItems.CARNELIAN);
            entries.add(MamItems.CITRINE);
            entries.add(MamItems.JADE);
            entries.add(MamItems.PERIDOT);
            entries.add(MamItems.SODALITE);
            entries.add(MamItems.APATITE);
            entries.add(MamItems.AQUAMARINE);
            entries.add(MamItems.MOONSTONE);
            entries.add(MamItems.RHODONITE);
            entries.add(MamItems.TOPAZ);
            entries.add(MamItems.TOURMALINE);
            entries.add(MamItems.RUBY);
            entries.add(MamItems.SAPPHIRE);
            entries.add(MamItems.TANZANITE);
        });
    }
}
