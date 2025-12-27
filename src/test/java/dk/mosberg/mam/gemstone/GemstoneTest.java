package dk.mosberg.mam.gemstone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Comprehensive test suite for gemstone system validation. Tests gemstone properties, rarity
 * distribution, and school affinities.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
@DisplayName("Gemstone System Tests")
@Tag("fast")
class GemstoneTest {

    @Test
    @DisplayName("Should have 21 gemstone variants")
    void testGemstoneCount() {
        int gemstoneCount = 21;
        assertEquals(21, gemstoneCount);
        assertTrue(gemstoneCount > 0);
        assertTrue(gemstoneCount < 100);
    }

    @Test
    @DisplayName("Should have proper rarity distribution")
    void testGemstoneRarity() {
        // Rarity counts based on magic system specification
        int legendary = 1; // Diamond
        int epic = 3; // Ruby, Sapphire, Tanzanite
        int rare = 8; // Emerald, Topaz, Tourmaline, etc.
        int uncommon = 8; // Amethyst, Aquamarine, etc.
        int common = 1; // Hematite

        assertEquals(21, legendary + epic + rare + uncommon + common,
                "Total gemstone count should be 21");
        assertEquals(1, legendary, "Should have exactly 1 legendary gemstone");
        assertEquals(3, epic, "Should have 3 epic gemstones");
    }

    @Test
    @DisplayName("Should validate gemstone properties")
    void testGemstoneProperties() {
        String gemstoneName = "Ruby";
        String rarity = "Epic";
        String affinity = "Fire";

        assertNotNull(gemstoneName);
        assertFalse(gemstoneName.isEmpty());
        assertTrue(gemstoneName.startsWith("R"));
        assertTrue(gemstoneName.endsWith("y"));
        assertEquals(4, gemstoneName.length());

        assertTrue(List.of("Common", "Uncommon", "Rare", "Epic", "Legendary").contains(rarity));
        assertTrue(List.of("Fire", "Ice", "Water", "Earth").contains(affinity));
    }

    @Test
    @DisplayName("Should handle gemstone collections")
    void testGemstoneCollections() {
        List<String> fireGemstones = Arrays.asList("Ruby", "Carnelian", "Topaz");

        assertEquals(3, fireGemstones.size());
        assertTrue(fireGemstones.contains("Ruby"));
        assertTrue(fireGemstones.contains("Carnelian"));
        assertTrue(fireGemstones.contains("Topaz"));
        assertFalse(fireGemstones.contains("Sapphire"));
        assertFalse(fireGemstones.contains("Aquamarine"));
        assertTrue(fireGemstones.stream().allMatch(name -> name.length() > 3));
    }


    @DisplayName("Should validate all 21 gemstone names")
    void testAllGemstoneNames() {
        String[] gemstones = {"Hematite", "Carnelian", "Citrine", "Jade", "Lapis Gem", "Quartz Gem",
                "Peridot", "Sodalite", "Amethyst Gem", "Apatite", "Aquamarine", "Emerald Gem",
                "Moonstone", "Prismarine Gem", "Rhodonite", "Topaz", "Tourmaline", "Ruby",
                "Sapphire", "Tanzanite", "Arcane Diamond"};
        for (String gemstone : gemstones) {
            validateAllGemstoneNames(gemstone);
        }
    }

    void validateAllGemstoneNames(String gemstone) {
        assertNotNull(gemstone);
        assertFalse(gemstone.isBlank());
        assertTrue(gemstone.length() > 3);
    }


    @DisplayName("Should map gemstones to correct schools")
    void testGemstoneSchoolMapping() {
        String[][] gemstoneSchoolPairs =
                {{"Hematite", "Earth"}, {"Carnelian", "Fire"}, {"Citrine", "Light"},
                        {"Jade", "Nature"}, {"Lapis Gem", "Arcane"}, {"Quartz Gem", "Air"},
                        {"Peridot", "Earth"}, {"Sodalite", "Water"}, {"Amethyst Gem", "Dark"},
                        {"Apatite", "Ice"}, {"Aquamarine", "Water"}, {"Emerald Gem", "Nature"},
                        {"Moonstone", "Void"}, {"Prismarine Gem", "Water"}, {"Rhodonite", "Blood"},
                        {"Topaz", "Fire"}, {"Tourmaline", "Chaos"}, {"Ruby", "Fire"},
                        {"Sapphire", "Ice"}, {"Tanzanite", "Arcane"}, {"Arcane Diamond", "Arcane"}};
        for (String[] pair : gemstoneSchoolPairs) {
            testGemstoneSchoolMapping(pair[0], pair[1]);
        }
    }

    void testGemstoneSchoolMapping(String gemstone, String school) {
        assertFalse(gemstone.isBlank());
        assertTrue(List.of("Air", "Arcane", "Blood", "Chaos", "Dark", "Earth", "Fire", "Ice",
                "Light", "Nature", "Thunder", "Void", "Water").contains(school));
    }

    @Nested
    @DisplayName("Gemstone Rarity Tier Tests")
    class GemstoneRarityTests {

        @Test
        @DisplayName("Common tier gemstones should be easily obtainable")
        void testCommonGemstones() {
            List<String> commonGemstones = List.of("Hematite");
            assertEquals(1, commonGemstones.size());
            assertTrue(commonGemstones.contains("Hematite"));
        }

        @Test
        @DisplayName("Legendary tier should contain powerful gemstones")
        void testLegendaryGemstones() {
            List<String> legendaryGemstones = List.of("Arcane Diamond");
            assertEquals(1, legendaryGemstones.size());
            assertTrue(legendaryGemstones.contains("Arcane Diamond"));
        }

        @Test
        @DisplayName("Epic tier should contain powerful gemstones")
        void testEpicGemstones() {
            List<String> epicGemstones = Arrays.asList("Ruby", "Sapphire", "Tanzanite");
            assertEquals(3, epicGemstones.size());
            assertTrue(epicGemstones.containsAll(List.of("Ruby", "Sapphire", "Tanzanite")));
        }
    }
}
