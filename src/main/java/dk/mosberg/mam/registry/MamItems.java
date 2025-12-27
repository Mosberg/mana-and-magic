package dk.mosberg.mam.registry;

import org.jetbrains.annotations.NotNull;
import dk.mosberg.mam.ManaAndMagic;
import dk.mosberg.mam.gemstone.GemstoneRarity;
import dk.mosberg.mam.gemstone.GemstoneSchool;
import dk.mosberg.mam.item.GemstoneItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

/**
 * Complete registry for all 21 Mana and Magic gemstone items - VANILLA CONFLICT FREE. Uses unique
 * names to avoid clashes with lapis_lazuli, emerald, nether_quartz, amethyst_shard,
 * prismarine_shard, and diamond.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public final class MamItems {

        // Common Tier (1)
        public static final GemstoneItem HEMATITE =
                        register("hematite", GemstoneRarity.COMMON, GemstoneSchool.ARCANE);

        // Uncommon Tier (8)
        public static final GemstoneItem CARNELIAN =
                        register("carnelian", GemstoneRarity.UNCOMMON, GemstoneSchool.FIRE);
        public static final GemstoneItem CITRINE =
                        register("citrine", GemstoneRarity.UNCOMMON, GemstoneSchool.LIGHT);
        public static final GemstoneItem JADE =
                        register("jade", GemstoneRarity.UNCOMMON, GemstoneSchool.EARTH);
        public static final GemstoneItem LAPIS_GEM =
                        register("lapis_gem", GemstoneRarity.UNCOMMON, GemstoneSchool.ARCANE); // ≠
                                                                                               // lapis_lazuli
        public static final GemstoneItem QUARTZ_GEM =
                        register("quartz_gem", GemstoneRarity.UNCOMMON, GemstoneSchool.FIRE); // ≠
                                                                                              // nether_quartz
        public static final GemstoneItem PERIDOT =
                        register("peridot", GemstoneRarity.UNCOMMON, GemstoneSchool.NATURE);
        public static final GemstoneItem SODALITE =
                        register("sodalite", GemstoneRarity.UNCOMMON, GemstoneSchool.WATER);

        // Rare Tier (8)
        public static final GemstoneItem AMETHYST_GEM =
                        register("amethyst_gem", GemstoneRarity.RARE, GemstoneSchool.VOID); // ≠
                                                                                            // amethyst_shard
        public static final GemstoneItem APATITE =
                        register("apatite", GemstoneRarity.RARE, GemstoneSchool.EARTH);
        public static final GemstoneItem AQUAMARINE =
                        register("aquamarine", GemstoneRarity.RARE, GemstoneSchool.WATER);
        public static final GemstoneItem EMERALD_GEM =
                        register("emerald_gem", GemstoneRarity.RARE, GemstoneSchool.NATURE); // ≠
                                                                                             // emerald
        public static final GemstoneItem MOONSTONE =
                        register("moonstone", GemstoneRarity.RARE, GemstoneSchool.LIGHT);
        public static final GemstoneItem PRISMARINE_GEM =
                        register("prismarine_gem", GemstoneRarity.RARE, GemstoneSchool.WATER); // ≠
                                                                                               // prismarine_shard
        public static final GemstoneItem RHODONITE =
                        register("rhodonite", GemstoneRarity.RARE, GemstoneSchool.BLOOD);
        public static final GemstoneItem TOURMALINE =
                        register("tourmaline", GemstoneRarity.RARE, GemstoneSchool.THUNDER);

        // Epic Tier (3)
        public static final GemstoneItem TOPAZ =
                        register("topaz", GemstoneRarity.EPIC, GemstoneSchool.THUNDER);
        public static final GemstoneItem RUBY =
                        register("ruby", GemstoneRarity.EPIC, GemstoneSchool.FIRE);
        public static final GemstoneItem SAPPHIRE =
                        register("sapphire", GemstoneRarity.EPIC, GemstoneSchool.ICE);

        // Legendary Tier (1)
        public static final GemstoneItem TANZANITE =
                        register("tanzanite", GemstoneRarity.LEGENDARY, GemstoneSchool.CHAOS);
        public static final GemstoneItem ARCANE_DIAMOND =
                        register("arcane_diamond", GemstoneRarity.LEGENDARY, GemstoneSchool.LIGHT); // ≠
                                                                                                    // diamond

        private MamItems() {
                throw new AssertionError("Utility class");
        }

        @NotNull
        private static GemstoneItem register(String name, GemstoneRarity rarity,
                        GemstoneSchool school) {
                Identifier id = Identifier.of(ManaAndMagic.MOD_ID, name);
                RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
                GemstoneItem item = new GemstoneItem(rarity, school,
                                new Item.Settings().registryKey(key));
                return Registry.register(Registries.ITEM, key, item);
        }

        public static void register() {
                ManaAndMagic.LOGGER.info(
                                "✅ Registered 21 unique gemstone items (vanilla conflict-free)");
        }
}
