# Mana and Magic Test Suite

This directory contains all automated tests for the Mana and Magic mod. The suite ensures core logic, data-driven content, and integration points are robust and regression-free.

## 🧪 Test Structure

```plaintext
src/test/java/
└── dk/mosberg/mam/
    ├── ManaAndMagicTest.java         # Core mod tests
    ├── spell/
    │   └── SpellCastingTest.java     # Spell system tests
    └── gemstone/
        └── GemstoneTest.java         # Gemstone system tests
```

## 🔧 Testing Frameworks

### JUnit 5 (Jupiter)

- **Purpose:** Core testing framework
- **Usage:** Assertions, test structure, lifecycle

```java
@Test
@DisplayName("Should test something")
void testSomething() {
    assertEquals(expected, actual);
}
```

### Mockito (if used)

- **Purpose:** Mocking for isolated logic
- **Usage:** Use mocks only for integration or network logic

```java
@Mock
private Player mockPlayer;

when(mockPlayer.getMana()).thenReturn(100.0);
verify(mockPlayer, times(1)).consumeMana(20.0);
```

### AssertJ (if used)

- **Purpose:** Fluent, readable assertions

```java
assertEquals(value)
    .isNotNull()
    .isGreaterThan(0)
    .isLessThan(100);
```

---

## 🚀 Running Tests

**Run all tests:**

```sh
./gradlew test
```

**Run a specific test class:**

```sh
./gradlew test --tests dk.mosberg.mam.ManaAndMagicTest
```

**Run with coverage:**

```sh
./gradlew test jacocoTestReport
```

**View HTML report:**
Open `build/reports/tests/test/index.html` in your browser.

---

## 📝 Writing & Organizing Tests

### Naming & Structure

- Class: `<ClassUnderTest>Test.java`
- Method: `test<MethodName>` or descriptive name
- Use `@DisplayName` for clarity
- Use `@Nested` for grouping
- Use `@BeforeEach`/`@AfterEach` for setup/teardown
- Use `@ParameterizedTest` for input variation

### Example

```java
@Test
@DisplayName("Should calculate damage correctly")
void testDamageCalculation() {
    // Arrange
    Spell spell = new Fireball();
    double powerLevel = 1.5;

    // Act
    double damage = spell.calculateDamage(powerLevel);

    // Assert
    assertEquals(damage)
        .isGreaterThan(0)
        .isEqualTo(12.0);
}
```

---

## ✅ Test Coverage Goals

- **Minimum:** 70%
- **Target:** 85%
- **Critical paths:** 100%

---

## 🎯 What to Test

**Must Test:**

- Spell casting logic
- Mana calculations
- Ritual pattern recognition
- Gemstone registration
- World generation
- Network packets

**Should Test:**

- Config loading
- Data serialization
- Event handlers
- Utility methods

**Optional:**

- Rendering code (manual)
- Client-only features
- Performance/benchmarks

---

## 🐛 Debugging & Tips

**Debug mode:**

```sh
./gradlew test --debug-jvm
```

**Detailed logging:**

```sh
./gradlew test --info
```

**Run single test method:**

```sh
./gradlew test --tests "dk.mosberg.mam.ManaAndMagicTest.testModId"
```

---

**Happy Testing!** 🧪✨
