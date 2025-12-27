# Mana and Magic - Code Standards

## Java Code Style

### General Principles
- **Clean Code**: Write self-documenting code with clear naming
- **SOLID Principles**: Follow object-oriented design principles
- **DRY**: Don't Repeat Yourself - extract common logic
- **KISS**: Keep It Simple, Stupid - avoid over-engineering

### Naming Conventions

#### Classes
\`\`\`java
// PascalCase for class names
public class ManaPoolManager { }
public class SpellCastingHandler { }
public class GemstoneItem { }
\`\`\`

#### Methods
\`\`\`java
// camelCase for method names
public void castSpell() { }
public boolean canCastSpell() { }
public int calculateManaCost() { }
\`\`\`

#### Variables
\`\`\`java
// camelCase for variables
private int manaPoints;
private String spellName;
private List<Gemstone> gemstones;
\`\`\`

#### Constants
\`\`\`java
// UPPER_SNAKE_CASE for constants
public static final String MOD_ID = "mam";
public static final int MAX_MANA = 1000;
public static final float SPELL_COOLDOWN = 2.5f;
\`\`\`

### Code Organization

#### Package Structure
\`\`\`
dk.mosberg.mam/
├── block/              # Blocks and block entities
├── item/               # Items and item handlers
├── spell/              # Spell system
│   ├── school/         # Spell schools
│   └── effect/         # Spell effects
├── ritual/             # Ritual system
│   ├── pattern/        # Ritual patterns
│   └── catalyst/       # Ritual catalysts
├── mana/               # Mana management
├── entity/             # Custom entities
├── world/              # World generation
├── network/            # Networking packets
└── util/               # Utility classes
\`\`\`

### Documentation

#### Class Javadoc
\`\`\`java
/**
 * Manages mana pools for players and entities.
 * Handles mana regeneration, consumption, and synchronization.
 * 
 * @author Mosberg
 * @version 1.0.0
 * @since 1.0.0
 */
public class ManaPoolManager {
    // ...
}
\`\`\`

#### Method Javadoc
\`\`\`java
/**
 * Casts a spell from the specified school with the given power level.
 * 
 * @param player The player casting the spell
 * @param spell The spell to cast
 * @param powerLevel The power level multiplier (0.0 - 1.0)
 * @return true if the spell was cast successfully
 * @throws InsufficientManaException if player lacks required mana
 */
public boolean castSpell(Player player, Spell spell, float powerLevel) {
    // ...
}
\`\`\`

### Code Formatting

#### Indentation
- Use **4 spaces** for indentation (no tabs)
- Continuation indent: 8 spaces

#### Braces
\`\`\`java
// Opening brace on same line
if (condition) {
    doSomething();
}

// Always use braces, even for single statements
if (condition) {
    doOneThing();
}
\`\`\`

#### Line Length
- Maximum **120 characters** per line
- Break long lines at logical points

#### Imports
\`\`\`java
// Organize imports alphabetically
import dk.mosberg.mam.spell.Spell;
import dk.mosberg.mam.spell.SpellSchool;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
\`\`\`

### Best Practices

#### Null Safety
\`\`\`java
// Use @Nullable and @NotNull annotations
public void processItem(@Nullable ItemStack stack) {
    if (stack == null || stack.isEmpty()) {
        return;
    }
    // Process item
}
\`\`\`

#### Error Handling
\`\`\`java
// Use specific exceptions
public class InsufficientManaException extends Exception {
    public InsufficientManaException(String message) {
        super(message);
    }
}

// Log errors appropriately
try {
    castSpell(player, spell);
} catch (InsufficientManaException e) {
    LOGGER.warn("Player {} lacks mana: {}", player.getName(), e.getMessage());
}
\`\`\`

#### Resource Management
\`\`\`java
// Use try-with-resources
try (InputStream stream = new FileInputStream(file)) {
    // Process stream
} catch (IOException e) {
    LOGGER.error("Failed to read file", e);
}
\`\`\`

### Testing

#### Unit Tests
\`\`\`java
@Test
public void testManaCost() {
    Spell fireball = new Fireball();
    assertEquals(15.0f, fireball.getManaCost());
}

@Test
public void testSpellCasting() {
    Player player = createMockPlayer();
    Spell spell = new Fireball();
    assertTrue(spellManager.canCast(player, spell));
}
\`\`\`

### JSON Standards

#### Spell JSON
\`\`\`json
{
  "id": "mam:fireball",
  "name": "Fireball",
  "school": "fire",
  "manaCost": 15.0,
  "damage": 8.0
}
\`\`\`

#### Consistent Formatting
- 2-space indentation for JSON
- camelCase for property names
- Alphabetical ordering where logical

### Git Commit Messages

#### Format
\`\`\`
Type: Brief summary (50 chars max)

Detailed explanation if needed (72 chars per line)

- Bullet points for multiple changes
- Reference issues: Fixes #123
\`\`\`

#### Types
- **Add**: New features
- **Fix**: Bug fixes
- **Update**: Changes to existing features
- **Refactor**: Code refactoring
- **Docs**: Documentation changes
- **Test**: Test additions/changes
- **Style**: Code style changes

#### Examples
\`\`\`
Add: Implement fire spell school with 4 spells

- Add Fireball, Fire Strike, Inferno Nova, Phoenix Rise
- Implement fire damage calculations
- Add particle effects for fire spells

Fixes #42
\`\`\`

---

**Maintained by:** Mosberg  
**Last Updated:** December 27, 2025
