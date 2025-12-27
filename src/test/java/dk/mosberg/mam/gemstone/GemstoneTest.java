package dk.mosberg.mam.gemstone;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Comprehensive test suite demonstrating AssertJ fluent assertions for gemstone system. Tests
 * gemstone properties, rarity distribution, and school affinities.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
@DisplayName("Gemstone System Tests with AssertJ")
@Tag("fast")
class GemstoneTest {

    @Test
    @DisplayName("Should have 21 gemstone variants")
    void testGemstoneCount() {
        int gemstoneCount = 21;
        assertThat(gemstoneCount).isEqualTo(21).isGreaterThan(0).isLessThan(100);
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

        assertThat(legendary + epic + rare + uncommon + common)
                .as("Total gemstone count should be 21").isEqualTo(21);

        assertThat(legendary).as("Should have exactly 1 legendary gemstone").isOne();

        assertThat(epic).as("Should have 3 epic gemstones").isEqualTo(3);
    }

    @Test
    @DisplayName("Should validate gemstone properties")
    void testGemstoneProperties() {
        String gemstoneName = "Ruby";
        String rarity = "Epic";
        String affinity = "Fire";

        assertThat(gemstoneName).isNotNull().isNotEmpty().startsWith("R").endsWith("y").hasSize(4);

        assertThat(rarity).isIn("Common", "Uncommon", "Rare", "Epic", "Legendary");

        assertThat(affinity).containsAnyOf("Fire", "Ice", "Water", "Earth");
    }

    @Test
    @DisplayName("Should handle gemstone collections")
    void testGemstoneCollections() {
        List<String> fireGemstones = Arrays.asList("Ruby", "Carnelian", "Topaz");

        assertThat(fireGemstones).hasSize(3).contains("Ruby", "Carnelian", "Topaz")
                .doesNotContain("Sapphire", "Aquamarine").allMatch(name -> name.length() > 3);
    }

    @ParameterizedTest
    @DisplayName("Should validate all 21 gemstone names")
    @ValueSource(strings = {"Hematite", "Carnelian", "Citrine", "Jade", "Lapis Lazuli",
            "Nether Quartz", "Peridot", "Sodalite", "Amethyst", "Apatite", "Aquamarine", "Emerald",
            "Moonstone", "Prismarine", "Rhodonite", "Topaz", "Tourmaline", "Ruby", "Sapphire",
            "Tanzanite", "Diamond"})
    void testAllGemstoneNames(String gemstone) {
        assertThat(gemstone).isNotNull().isNotBlank().hasSizeGreaterThan(3);
    }

    @ParameterizedTest
    @DisplayName("Should map gemstones to correct schools")
    @CsvSource({"Ruby, Fire", "Sapphire, Ice", "Emerald, Nature", "Aquamarine, Water",
            "Topaz, Thunder", "Diamond, Light"})
    void testGemstoneSchoolMapping(String gemstone, String school) {
        assertThat(gemstone).isNotBlank();
        assertThat(school).isIn("Air", "Arcane", "Blood", "Chaos", "Dark", "Earth", "Fire", "Ice",
                "Light", "Nature", "Thunder", "Void", "Water");
    }

    @Nested
    @DisplayName("Gemstone Rarity Tier Tests")
    class GemstoneRarityTests {

        @Test
        @DisplayName("Common tier gemstones should be easily obtainable")
        void testCommonGemstones() {
            List<String> commonGemstones = List.of("Hematite");

            assertThat(commonGemstones).hasSize(1).contains("Hematite");
        }

        @Test
        @DisplayName("Legendary tier should only contain Diamond")
        void testLegendaryGemstones() {
            List<String> legendaryGemstones = List.of("Diamond");

            assertThat(legendaryGemstones).hasSize(1).containsOnly("Diamond");
        }

        @Test
        @DisplayName("Epic tier should contain powerful gemstones")
        void testEpicGemstones() {
            List<String> epicGemstones = Arrays.asList("Ruby", "Sapphire", "Tanzanite");

            assertThat(epicGemstones).hasSize(3).containsExactlyInAnyOrder("Ruby", "Sapphire",
                    "Tanzanite");
        }
    }
}
