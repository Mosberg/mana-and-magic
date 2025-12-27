# Test Suite Documentation

This directory contains the test suite for Mana and Magic mod.

## 🧪 Test Structure

```plaintext
src/test/java/
└── dk/mosberg/mam/
    ├── ManaAndMagicTest.java         # Core mod tests
    ├── spell/
    │   └── SpellCastingTest.java     # Spell system tests (Mockito)
    └── gemstone/
        └── GemstoneTest.java         # Gemstone tests (AssertJ)
```

## 🔧 Testing Frameworks

### JUnit 5 (Jupiter)

- **Purpose**: Core testing framework
- **Version**: 5.11.4
- **Usage**: Basic assertions and test structure

```java
@Test
@DisplayName("Should test something")
void testSomething() {
    assertEquals(expected, actual);
}
```

### Mockito

- **Purpose**: Mocking framework
- **Version**: 5.15.2
- **Usage**: Mock objects for isolated testing

```java
@Mock
private Player mockPlayer;

when(mockPlayer.getMana()).thenReturn(100.0);
verify(mockPlayer, times(1)).consumeMana(20.0);
```

### AssertJ

- **Purpose**: Fluent assertions
- **Version**: 3.27.3
- **Usage**: Readable, chainable assertions

```java
assertThat(value)
    .isNotNull()
    .isGreaterThan(0)
    .isLessThan(100);
```

## 🚀 Running Tests

### Run All Tests

```bash
./gradlew test
```

### Run Specific Test Class

```bash
./gradlew test --tests ManaAndMagicTest
```

### Run with Coverage

```bash
./gradlew test jacocoTestReport
```

### View Test Report

Open `build/reports/tests/test/index.html` in your browser.

## 📝 Writing Tests

### Test Naming Convention

- Class: `<ClassUnderTest>Test.java`
- Method: `test<MethodName>` or descriptive name
- Use `@DisplayName` for human-readable names

### Test Organization

- Use `@Nested` classes for grouping related tests
- Use `@BeforeEach` and `@AfterEach` for setup/teardown
- Use `@ParameterizedTest` for testing multiple inputs

### Example Test

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
    assertThat(damage)
        .isGreaterThan(0)
        .isEqualTo(12.0);
}
```

## ✅ Test Coverage Goals

- **Minimum**: 70% code coverage
- **Target**: 85% code coverage
- **Critical paths**: 100% coverage

## 🎯 What to Test

### Must Test

- Spell casting logic
- Mana calculations
- Ritual pattern recognition
- Gemstone registration
- World generation
- Network packets

### Should Test

- Configuration loading
- Data serialization
- Event handlers
- Utility methods

### Optional

- Rendering code (test manually)
- Client-only features
- Performance benchmarks

## 🐛 Debugging Tests

### Run Tests in Debug Mode

```bash
./gradlew test --debug-jvm
```

### Enable Detailed Logging

```bash
./gradlew test --info
```

### Run Single Test Method

```bash
./gradlew test --tests "ManaAndMagicTest.testModId"
```

---

**Happy Testing!** 🧪✨
