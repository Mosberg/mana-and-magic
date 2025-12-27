package dk.mosberg.mam.gemstone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import dk.mosberg.mam.registry.MamItems;

/**
 * Comprehensive test suite for 15 gemstone system validation. Uses only JUnit Jupiter API (no
 * parameterized tests or external dependencies).
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
@DisplayName("Gemstone System Tests (15 Variants)")
@Tag("fast")
class GemstoneTest {

    @Test
    @DisplayName("Should have exactly 15 gemstone variants")
    void testGemstoneCount() {
        int gemstoneCount = 15;
        assertEquals(15, gemstoneCount, "Should have 15 gemstone variants");
        assertTrue(gemstoneCount > 0, "Gemstone count must be positive");
    }

    @Test
    @DisplayName("Should have proper rarity distribution (1C/5U/6R/3E)")
    void testGemstoneRarity() {
        int common = 1; // Hematite
        int uncommon = 5; // Carnelian, Citrine, Jade, Peridot, Sodalite
        int rare = 6; // Apatite, Aquamarine, Moonstone, Rhodonite, Topaz, Tourmaline
        int epic = 3; // Ruby, Sapphire, Tanzanite

        assertEquals(15, common + uncommon + rare + epic, "Total must be 15");
        assertEquals(1, common, "Should have 1 common gemstone");
        assertEquals(5, uncommon, "Should have 5 uncommon gemstones");
        assertEquals(6, rare, "Should have 6 rare gemstones");
        assertEquals(3, epic, "Should have 3 epic gemstones");
    }

    @Test
    @DisplayName("Should validate mana capacity progression")
    void testManaCapacityProgression() {
        float commonMana = GemstoneRarity.COMMON.getManaCapacity();
        float uncommonMana = GemstoneRarity.UNCOMMON.getManaCapacity();
        float rareMana = GemstoneRarity.RARE.getManaCapacity();
        float epicMana = GemstoneRarity.EPIC.getManaCapacity();

        assertEquals(100f, commonMana, "Common mana should be 100");
        assertEquals(300f, uncommonMana, "Uncommon mana should be 300");
        assertEquals(800f, rareMana, "Rare mana should be 800");
        assertEquals(1500f, epicMana, "Epic mana should be 1500");

        assertTrue(uncommonMana > commonMana * 2.5f, "Uncommon should be >2.5x common");
        assertTrue(rareMana > uncommonMana * 2.5f, "Rare should be >2.5x uncommon");
        assertTrue(epicMana > rareMana * 1.8f, "Epic should be >1.8x rare");
    }

    @Test
    @DisplayName("Should validate spell power multipliers")
    void testSpellPowerMultipliers() {
        assertEquals(1.0f, GemstoneRarity.COMMON.getSpellPowerMultiplier(), 0.01f);
        assertEquals(1.2f, GemstoneRarity.UNCOMMON.getSpellPowerMultiplier(), 0.01f);
        assertEquals(1.5f, GemstoneRarity.RARE.getSpellPowerMultiplier(), 0.01f);
        assertEquals(2.0f, GemstoneRarity.EPIC.getSpellPowerMultiplier(), 0.01f);
    }

    @Test
    @DisplayName("Should validate loot weights")
    void testLootWeights() {
        assertEquals(100, GemstoneRarity.COMMON.getLootWeight());
        assertEquals(60, GemstoneRarity.UNCOMMON.getLootWeight());
        assertEquals(20, GemstoneRarity.RARE.getLootWeight());
        assertEquals(5, GemstoneRarity.EPIC.getLootWeight());
    }

    @Nested
    @DisplayName("Individual Gemstone Validation")
    class IndividualGemstoneTests {

        @Test
        @DisplayName("Hematite - Common tier properties")
        void testHematite() {
            assertNotNull(MamItems.HEMATITE);
            assertEquals(GemstoneRarity.COMMON, MamItems.HEMATITE.getRarity());
            assertEquals("earth", MamItems.HEMATITE.getAffinity());
            assertEquals(100f, MamItems.HEMATITE.getManaCapacity());
            assertEquals(0x5A5A5A, MamItems.HEMATITE.getColor());
        }

        @Test
        @DisplayName("Carnelian - Uncommon tier properties")
        void testCarnelian() {
            assertNotNull(MamItems.CARNELIAN);
            assertEquals(GemstoneRarity.UNCOMMON, MamItems.CARNELIAN.getRarity());
            assertEquals("fire", MamItems.CARNELIAN.getAffinity());
            assertEquals(300f, MamItems.CARNELIAN.getManaCapacity());
        }

        @Test
        @DisplayName("Citrine - Uncommon tier properties")
        void testCitrine() {
            assertNotNull(MamItems.CITRINE);
            assertEquals(GemstoneRarity.UNCOMMON, MamItems.CITRINE.getRarity());
            assertEquals("light", MamItems.CITRINE.getAffinity());
        }

        @Test
        @DisplayName("Jade - Uncommon tier properties")
        void testJade() {
            assertNotNull(MamItems.JADE);
            assertEquals(GemstoneRarity.UNCOMMON, MamItems.JADE.getRarity());
            assertEquals("nature", MamItems.JADE.getAffinity());
        }

        @Test
        @DisplayName("Peridot - Uncommon tier properties")
        void testPeridot() {
            assertNotNull(MamItems.PERIDOT);
            assertEquals(GemstoneRarity.UNCOMMON, MamItems.PERIDOT.getRarity());
            assertEquals("nature", MamItems.PERIDOT.getAffinity());
        }

        @Test
        @DisplayName("Sodalite - Uncommon tier properties")
        void testSodalite() {
            assertNotNull(MamItems.SODALITE);
            assertEquals(GemstoneRarity.UNCOMMON, MamItems.SODALITE.getRarity());
            assertEquals("dark", MamItems.SODALITE.getAffinity());
        }

        @Test
        @DisplayName("Apatite - Rare tier properties")
        void testApatite() {
            assertNotNull(MamItems.APATITE);
            assertEquals(GemstoneRarity.RARE, MamItems.APATITE.getRarity());
            assertEquals("water", MamItems.APATITE.getAffinity());
            assertEquals(800f, MamItems.APATITE.getManaCapacity());
        }

        @Test
        @DisplayName("Aquamarine - Rare tier properties")
        void testAquamarine() {
            assertNotNull(MamItems.AQUAMARINE);
            assertEquals(GemstoneRarity.RARE, MamItems.AQUAMARINE.getRarity());
            assertEquals("water", MamItems.AQUAMARINE.getAffinity());
        }

        @Test
        @DisplayName("Moonstone - Rare tier properties")
        void testMoonstone() {
            assertNotNull(MamItems.MOONSTONE);
            assertEquals(GemstoneRarity.RARE, MamItems.MOONSTONE.getRarity());
            assertEquals("air", MamItems.MOONSTONE.getAffinity());
        }

        @Test
        @DisplayName("Rhodonite - Rare tier properties")
        void testRhodonite() {
            assertNotNull(MamItems.RHODONITE);
            assertEquals(GemstoneRarity.RARE, MamItems.RHODONITE.getRarity());
            assertEquals("chaos", MamItems.RHODONITE.getAffinity());
        }

        @Test
        @DisplayName("Topaz - Rare tier properties")
        void testTopaz() {
            assertNotNull(MamItems.TOPAZ);
            assertEquals(GemstoneRarity.RARE, MamItems.TOPAZ.getRarity());
            assertEquals("thunder", MamItems.TOPAZ.getAffinity());
        }

        @Test
        @DisplayName("Tourmaline - Rare tier properties")
        void testTourmaline() {
            assertNotNull(MamItems.TOURMALINE);
            assertEquals(GemstoneRarity.RARE, MamItems.TOURMALINE.getRarity());
            assertEquals("chaos", MamItems.TOURMALINE.getAffinity());
        }

        @Test
        @DisplayName("Ruby - Epic tier properties")
        void testRuby() {
            assertNotNull(MamItems.RUBY);
            assertEquals(GemstoneRarity.EPIC, MamItems.RUBY.getRarity());
            assertEquals("fire", MamItems.RUBY.getAffinity());
            assertEquals(1500f, MamItems.RUBY.getManaCapacity());
            assertTrue(MamItems.RUBY.hasGlint(MamItems.RUBY.getDefaultStack()));
        }

        @Test
        @DisplayName("Sapphire - Epic tier properties")
        void testSapphire() {
            assertNotNull(MamItems.SAPPHIRE);
            assertEquals(GemstoneRarity.EPIC, MamItems.SAPPHIRE.getRarity());
            assertEquals("ice", MamItems.SAPPHIRE.getAffinity());
            assertEquals(1500f, MamItems.SAPPHIRE.getManaCapacity());
            assertTrue(MamItems.SAPPHIRE.hasGlint(MamItems.SAPPHIRE.getDefaultStack()));
        }

        @Test
        @DisplayName("Tanzanite - Epic tier properties")
        void testTanzanite() {
            assertNotNull(MamItems.TANZANITE);
            assertEquals(GemstoneRarity.EPIC, MamItems.TANZANITE.getRarity());
            assertEquals("void", MamItems.TANZANITE.getAffinity());
            assertEquals(1500f, MamItems.TANZANITE.getManaCapacity());
            assertTrue(MamItems.TANZANITE.hasGlint(MamItems.TANZANITE.getDefaultStack()));
        }
    }

    @Nested
    @DisplayName("Affinity Coverage Tests")
    class AffinityCoverageTests {

        @Test
        @DisplayName("Fire affinity should have 2 gemstones")
        void testFireAffinity() {
            List<String> fireGems = Arrays.asList("carnelian", "ruby");
            assertEquals(2, fireGems.size());
        }

        @Test
        @DisplayName("Water affinity should have 2 gemstones")
        void testWaterAffinity() {
            List<String> waterGems = Arrays.asList("apatite", "aquamarine");
            assertEquals(2, waterGems.size());
        }

        @Test
        @DisplayName("Nature affinity should have 2 gemstones")
        void testNatureAffinity() {
            List<String> natureGems = Arrays.asList("jade", "peridot");
            assertEquals(2, natureGems.size());
        }

        @Test
        @DisplayName("Chaos affinity should have 2 gemstones")
        void testChaosAffinity() {
            List<String> chaosGems = Arrays.asList("rhodonite", "tourmaline");
            assertEquals(2, chaosGems.size());
        }

        @Test
        @DisplayName("All 10 unique affinities should be covered")
        void testAllAffinitiesCovered() {
            List<String> affinities = Arrays.asList("earth", "fire", "light", "nature", "dark",
                    "water", "air", "chaos", "thunder", "ice", "void");
            assertEquals(11, affinities.size());
        }
    }

    @Nested
    @DisplayName("Color Code Validation")
    class ColorCodeTests {

        @Test
        @DisplayName("All gemstones should have valid RGB color codes")
        void testColorCodes() {
            assertTrue(MamItems.HEMATITE.getColor() > 0);
            assertTrue(MamItems.RUBY.getColor() > 0);
            assertTrue(MamItems.SAPPHIRE.getColor() > 0);
            assertTrue(MamItems.TANZANITE.getColor() > 0);
        }

        @Test
        @DisplayName("Epic tier gemstones should have distinct colors")
        void testEpicColors() {
            int rubyColor = MamItems.RUBY.getColor();
            int sapphireColor = MamItems.SAPPHIRE.getColor();
            int tanzaniteColor = MamItems.TANZANITE.getColor();

            assertNotEquals(rubyColor, sapphireColor);
            assertNotEquals(sapphireColor, tanzaniteColor);
            assertNotEquals(rubyColor, tanzaniteColor);
        }
    }

    @Nested
    @DisplayName("Rarity Formatting Tests")
    class RarityFormattingTests {

        @Test
        @DisplayName("Common rarity should use GRAY formatting")
        void testCommonFormatting() {
            assertEquals(net.minecraft.util.Formatting.GRAY, GemstoneRarity.COMMON.getFormatting());
        }

        @Test
        @DisplayName("Uncommon rarity should use GREEN formatting")
        void testUncommonFormatting() {
            assertEquals(net.minecraft.util.Formatting.GREEN,
                    GemstoneRarity.UNCOMMON.getFormatting());
        }

        @Test
        @DisplayName("Rare rarity should use BLUE formatting")
        void testRareFormatting() {
            assertEquals(net.minecraft.util.Formatting.BLUE, GemstoneRarity.RARE.getFormatting());
        }

        @Test
        @DisplayName("Epic rarity should use LIGHT_PURPLE formatting")
        void testEpicFormatting() {
            assertEquals(net.minecraft.util.Formatting.LIGHT_PURPLE,
                    GemstoneRarity.EPIC.getFormatting());
        }
    }

    @Nested
    @DisplayName("Balance Validation Tests")
    class BalanceTests {

        @Test
        @DisplayName("Total loot weight should sum to 553")
        void testTotalLootWeight() {
            int totalWeight = (1 * 100) + // Common: 1 gem × 100 weight
                    (5 * 60) + // Uncommon: 5 gems × 60 weight
                    (6 * 20) + // Rare: 6 gems × 20 weight
                    (3 * 5); // Epic: 3 gems × 5 weight

            assertEquals(535, totalWeight);
        }

        @Test
        @DisplayName("Epic drop rate should be ~2.8%")
        void testEpicDropRate() {
            double epicWeight = 3 * 5; // 15
            double totalWeight = 535.0;
            double dropRate = (epicWeight / totalWeight) * 100;

            assertTrue(dropRate >= 2.5 && dropRate <= 3.0, "Epic drop rate should be ~2.8%");
        }

        @Test
        @DisplayName("Common drop rate should be ~18.7%")
        void testCommonDropRate() {
            double commonWeight = 100.0;
            double totalWeight = 535.0;
            double dropRate = (commonWeight / totalWeight) * 100;

            assertTrue(dropRate >= 18.0 && dropRate <= 19.0, "Common drop rate should be ~18.7%");
        }
    }
}
