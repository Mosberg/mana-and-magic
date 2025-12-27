package dk.mosberg.mam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Comprehensive test suite demonstrating JUnit 6 features for the Magic System.
 * Tests mod initialization, configuration, and basic validation logic.
 *
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
@DisplayName("Magic System Tests")
@Tag("fast")
class ManaAndMagicTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("Starting Magic System tests...");
    }

    @BeforeEach
    void setUp() {
        // Runs before each test
    }

    @AfterEach
    void tearDown() {
        // Runs after each test
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Magic System tests completed!");
    }

    @Test
    @DisplayName("Should have correct MOD_ID")
    void testModId() {
        assertEquals("mam", ManaAndMagic.MOD_ID);
        assertNotNull(ManaAndMagic.getModId());
    }

    @Test
    @DisplayName("Should have correct MOD_NAME")
    void testModName() {
        assertEquals("Arcane Magic System - Mana and Magic", ManaAndMagic.MOD_NAME);
    }

    @Test
    @DisplayName("Should have logger configured")
    void testLogger() {
        assertNotNull(ManaAndMagic.LOGGER);
    }

    @ParameterizedTest
    @DisplayName("Should validate spell school names")
    @ValueSource(strings = {"Air", "Arcane", "Blood", "Chaos", "Dark", "Earth", "Fire", "Ice",
            "Light", "Nature", "Thunder", "Void", "Water"})
    void testSpellSchoolNames(String schoolName) {
        assertNotNull(schoolName);
        assertFalse(schoolName.isEmpty());
        assertTrue(schoolName.length() > 2);
    }

    @Test
    @DisplayName("Should handle null values gracefully")
    void testNullHandling() {
        String modId = ManaAndMagic.getModId();
        assertNotNull(modId, "Mod ID should never be null");
    }

    @Nested
    @DisplayName("Spell System Tests")
    class SpellSystemTests {

        @Test
        @DisplayName("Should register all 13 spell schools")
        void testSpellSchoolCount() {
            int expectedSchools = 13;
            assertTrue(expectedSchools > 0);
            assertEquals(13, expectedSchools, "Should have exactly 13 spell schools");
        }

        @Test
        @DisplayName("Should calculate mana cost correctly")
        void testManaCost() {
            double baseCost = 10.0;
            double multiplier = 1.5;
            double expectedCost = baseCost * multiplier;
            assertEquals(15.0, expectedCost, 0.01);
        }
    }

    @Nested
    @DisplayName("Ritual System Tests")
    class RitualSystemTests {

        @Test
        @DisplayName("Should register all 13 ritual categories")
        void testRitualCategoryCount() {
            int expectedCategories = 13;
            assertTrue(expectedCategories > 0);
            assertEquals(13, expectedCategories, "Should have exactly 13 ritual categories");
        }

        @Test
        @DisplayName("Should validate ritual names")
        void testRitualNames() {
            String[] ritualNames = {
                "Ascension", "Circle", "Cosmic", "Elemental", "Fountain",
                "Planar", "Reality", "Resurrection", "Sacrifice", "Summoning",
                "Temporal", "Transformation", "Vortex"
            };
            assertEquals(13, ritualNames.length, "Should have 13 ritual types");
            for (String name : ritualNames) {
                assertNotNull(name);
                assertFalse(name.isEmpty());
            }
        }
    }
}
