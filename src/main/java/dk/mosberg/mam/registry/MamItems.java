package dk.mosberg.mam.registry;

import org.jetbrains.annotations.NotNull;
import dk.mosberg.mam.ManaAndMagic;
import dk.mosberg.mam.gemstone.GemstoneRarity;
import dk.mosberg.mam.item.GemstoneItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

/**
 * Complete registry for all 15 gemstone items with balanced mana capacities and school affinities.
 * Rarity Distribution: 1 Common, 5 Uncommon, 6 Rare, 3 Epic
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public final class MamItems {

        // ===== COMMON TIER (1) =====
        public static final GemstoneItem HEMATITE =
                        registerGem("hematite", GemstoneRarity.COMMON, "earth", 0x5A5A5A);

        // ===== UNCOMMON TIER (5) =====
        public static final GemstoneItem CARNELIAN =
                        registerGem("carnelian", GemstoneRarity.UNCOMMON, "fire", 0xE86938);
        public static final GemstoneItem CITRINE =
                        registerGem("citrine", GemstoneRarity.UNCOMMON, "light", 0xF4B942);
        public static final GemstoneItem JADE =
                        registerGem("jade", GemstoneRarity.UNCOMMON, "nature", 0x5FA777);
        public static final GemstoneItem PERIDOT =
                        registerGem("peridot", GemstoneRarity.UNCOMMON, "nature", 0xA4D65E);
        public static final GemstoneItem SODALITE =
                        registerGem("sodalite", GemstoneRarity.UNCOMMON, "dark", 0x3D5A9C);

        // ===== RARE TIER (6) =====
        public static final GemstoneItem APATITE =
                        registerGem("apatite", GemstoneRarity.RARE, "water", 0x2DD4DB);
        public static final GemstoneItem AQUAMARINE =
                        registerGem("aquamarine", GemstoneRarity.RARE, "water", 0x7DD3E8);
        public static final GemstoneItem MOONSTONE =
                        registerGem("moonstone", GemstoneRarity.RARE, "air", 0xE8E5E0);
        public static final GemstoneItem RHODONITE =
                        registerGem("rhodonite", GemstoneRarity.RARE, "chaos", 0xD66B88);
        public static final GemstoneItem TOPAZ =
                        registerGem("topaz", GemstoneRarity.RARE, "thunder", 0xD98736);
        public static final GemstoneItem TOURMALINE =
                        registerGem("tourmaline", GemstoneRarity.RARE, "chaos", 0x3A7C59);

        // ===== EPIC TIER (3) =====
        public static final GemstoneItem RUBY =
                        registerGem("ruby", GemstoneRarity.EPIC, "fire", 0xE63946);
        public static final GemstoneItem SAPPHIRE =
                        registerGem("sapphire", GemstoneRarity.EPIC, "ice", 0x2952A3);
        public static final GemstoneItem TANZANITE =
                        registerGem("tanzanite", GemstoneRarity.EPIC, "void", 0x6B4B9E);

        private MamItems() {
                throw new AssertionError("Utility class");
        }

        /**
         * Registers a gemstone item with rarity, affinity, and color metadata.
         *
         * @param name Registry name (e.g., "ruby")
         * @param rarity Gemstone rarity tier
         * @param affinity Primary magical affinity/school
         * @param color RGB color code for rendering/tooltips
         * @return Registered gemstone item
         * @throws NullPointerException if any parameter is null
         * @since 1.0.0
         */
        @NotNull
        private static GemstoneItem registerGem(@NotNull String name,
                        @NotNull GemstoneRarity rarity, @NotNull String affinity, int color) {
                if (name == null || name.isBlank()) {
                        throw new IllegalArgumentException("Gemstone name cannot be null or blank");
                }
                if (rarity == null) {
                        throw new NullPointerException("Rarity cannot be null for " + name);
                }

                Identifier id = Identifier.of(ManaAndMagic.MOD_ID, name);
                RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

                GemstoneItem item = new GemstoneItem(rarity, affinity, color,
                                new Item.Settings().registryKey(key));

                return Registry.register(Registries.ITEM, key, item);
        }

        /**
         * Initializes all gemstone item registrations. Called from
         * {@link ManaAndMagic#onInitialize()}.
         *
         * @since 1.0.0
         */
        public static void register() {
                ManaAndMagic.LOGGER.info("✅ Registered 15 gemstone items (1C/5U/6R/3E)");
        }
}
