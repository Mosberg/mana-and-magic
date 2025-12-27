# Copilot Instructions: Arcane Magic System - Mana and Magic

**Version:** 1.0.0
**Minecraft:** 1.21.10 | **Fabric:** 0.18.3 | **Java:** 21
**Mod ID:** `mam` | **Namespace:** `dk.mosberg.mam`

---

## 🎯 Project Identity

This is a **Fabric-based Minecraft mod** implementing a comprehensive **data-driven magic system**[file:14][file:18]:

- **13 Spell Schools** (Air, Arcane, Blood, Chaos, Dark, Earth, Fire, Ice, Light, Nature, Thunder, Void, Water)
- **13 Ritual Categories** (Ascension, Circle, Cosmic, Elemental, Fountain, Planar, Reality, Resurrection, Sacrifice, Summoning, Temporal, Transformation, Vortex)
- **21 Gemstone Variants** (rarity tiers: Common → Legendary)
- **31+ Spells & 13 Rituals** defined via JSON

**Architecture:** Hybrid model with Java logic (`src/main/java/`, `src/client/java/`) and extensive data-driven content (`src/main/resources/`)[file:16].

---

## 📁 Critical Directories

### Java Source Code

```

src/main/java/dk/mosberg/mam/
├── ManaAndMagic.java \# Main mod initializer (server/common)
├── block/ \# Custom blocks (ores, ritual structures)
├── item/ \# Custom items (gemstones, spell books)
├── spell/ \# Spell system logic
│ ├── school/ \# Spell school implementations
│ └── effect/ \# Spell effect handlers
├── ritual/ \# Ritual system logic
│ ├── pattern/ \# Multi-block pattern recognition
│ └── catalyst/ \# Ritual catalyst handlers
├── mana/ \# Mana pool management
├── entity/ \# Custom entities
├── world/ \# World generation (ore gen)
├── network/ \# Client-server packets
└── util/ \# Helper utilities

src/client/java/dk/mosberg/mam/client/
├── ManaAndMagicClient.java \# Client initializer
├── render/ \# Entity/block renderers
├── gui/ \# GUI screens (spell selection, mana HUD)
├── particle/ \# Particle effects
└── keybind/ \# Keybinding handlers

```

### Resource Assets (Client-Side)[file:16]

```

src/main/resources/assets/mam/
├── blockstates/ \# Block state definitions
├── models/
│ ├── block/ \# Block models
│ └── item/ \# Item models (21 gemstones)
├── textures/
│ ├── block/ \# Block textures (ores)
│ ├── item/gemstones/ \# Gemstone textures (21 files)
│ ├── gui/sprites/container/slot/gemstones/ \# Slot icons (21 files)
│ ├── entity/ \# Entity textures
│ └── particle/ \# Particle textures
├── lang/ \# Translations (en_us.json)
└── sounds/ \# Sound definitions

```

### Game Data (Server-Side)[file:16]

```

src/main/resources/data/mam/
├── loot_table/blocks/ \# Block drop tables
├── recipe/ \# Crafting/smelting recipes
├── spells/ \# Spell definitions (31+ JSON files)
│ ├── air/
│ ├── arcane/
│ ├── blood/
│ └── [10 more schools]
├── rituals/ \# Ritual definitions (13 JSON files)
│ ├── ascension/
│ ├── cosmic/
│ └── [11 more categories]
├── tags/
│ ├── block/ \# Block tags (emerald_ores, gemstone_ores)
│ └── item/ \# Item tags
└── worldgen/
├── configured_feature/ \# Ore generation features
└── placed_feature/ \# Ore placement rules

```

### Documentation (Source of Truth)[file:18]

```

docs/
├── csv/
│ ├── gemstones.csv \# 21 gemstones with properties
│ ├── spell_schools.csv \# 13 spell schools
│ └── ritual_categories.csv \# 13 ritual categories
├── json/
│ ├── magic_system_master.json \# Complete system config
│ └── quick_reference_lookup.json \# Fast lookup tables
├── md/
│ └── MAGIC_SYSTEM_DOCUMENTATION.md \# Full magic system details
└── txt/
└── SYSTEM_SUMMARY.txt \# Quick reference summary

```

---

## 🏗️ Architecture & Design Patterns[file:10]

### Code Standards

- **Naming:** Java (PascalCase classes, camelCase methods, UPPER_SNAKE_CASE constants), JSON (snake_case resource IDs)
- **Formatting:** 4-space indent (Java), 2-space indent (JSON), 120 char max line length
- **Documentation:** Comprehensive Javadoc with `@param`, `@return`, `@throws`, `@example`, `@since 1.0.0`, `@author Mosberg`
- **Safety:** `@Nullable`/`@NotNull` annotations, parameter validation, SLF4J logging

### Data-Driven Content

- **All spells, rituals, and gemstones are JSON-defined**[file:18]
- Adding new content requires **zero Java code changes** (only JSON/asset updates)
- Templates: Use existing emerald/gemstone files as copy-paste bases

### Consistency Requirements

**Critical:** Resource IDs must match across **all** locations:

- Blockstates (`assets/mam/blockstates/gemstone_ore.json`)
- Models (`assets/mam/models/block/gemstone_ore.json`)
- Textures (`assets/mam/textures/block/gemstone_ore.png`)
- Loot tables (`data/mam/loot_table/blocks/gemstone_ore.json`)
- Tags (`data/mam/tags/block/gemstone_ores.json`)
- Recipes (`data/mam/recipe/gemstone_from_smelting.json`)

---

## 🛠️ Development Workflows

### Workflow 1: Add a New Gemstone[file:18]

**Goal:** Create a new gemstone variant (e.g., "Onyx")

**Steps:**

1. **Update Documentation**

   - Add row to `docs/csv/gemstones.csv` with properties (name, color, hex, shape, rarity, affinity, schools, rituals)
   - Update `docs/json/magic_system_master.json` gemstones array

2. **Create Item Model & Texture**

   - Copy `assets/mam/models/item/gemstones/ruby.json` → `onyx.json`
   - Edit texture path: `"layer0": "mam:item/gemstones/onyx"`
   - Create `assets/mam/textures/item/gemstones/onyx.png` (16x16 pixel texture)
   - Create `assets/mam/textures/gui/sprites/container/slot/gemstones/onyx.png` (slot icon)

3. **Add Crafting Recipes (Optional)**

   - Copy `data/mam/recipe/emerald_from_smelting_emerald_ore.json`
   - Replace all `emerald` references with `onyx`

4. **Tag Integration**

   - Add `"mam:onyx"` to `data/mam/tags/item/gemstone_ores.json`

5. **Worldgen (If Ore-Based)**

   - Update `data/mam/worldgen/configured_feature/ore_gemstone.json` state list
   - Adjust spawn rates in `data/mam/worldgen/placed_feature/ore_gemstone.json`

6. **Java Registration** (If Custom Item)
   - Add to `src/main/java/dk/mosberg/mam/item/ModItems.java`:

```

public static final Item ONYX = Registry.register(
Registries.ITEM,
Identifier.of(ManaAndMagic.MOD_ID, "onyx"),
new Item(new Item.Settings())
);

```

### Workflow 2: Create a New Spell[file:18]

**Goal:** Add a spell to an existing school (e.g., "Meteor Strike" for Fire school)

**Steps:**

1. **Define Spell JSON**

- Create `data/mam/spells/fire/meteor_strike.json`:

```

{
"id": "mam:meteor_strike",
"name": "Meteor Strike",
"school": "fire",
"description": "Summon a meteor from the sky",
"castType": "projectile",
"manaCost": 50.0,
"castTime": 2.0,
"cooldown": 10.0,
"tier": 3,
"damage": 25.0,
"range": 50.0,
"gemstones": ["ruby", "carnelian", "topaz"],
"vfx": {
"particleType": "flame",
"particleCount": 100,
"color": "\#FF4500"
}
}

```

2. **Implement Spell Logic** (Java)

- Create `src/main/java/dk/mosberg/mam/spell/fire/MeteorStrikeSpell.java`
- Extend `Spell` base class
- Implement `cast()` method with projectile logic

3. **Register Spell**

- Add to `ManaAndMagic.registerSpells()`:

```

SpellRegistry.register(new MeteorStrikeSpell());

```

4. **Add Translation**

- Update `assets/mam/lang/en_us.json`:

```

"spell.mam.meteor_strike": "Meteor Strike",
"spell.mam.meteor_strike.desc": "Summon a meteor from the sky"

```

### Workflow 3: Design a New Ritual[file:18]

**Goal:** Create a ritual (e.g., "Dragon Awakening" for Summoning category)

**Steps:**

1. **Define Ritual JSON**

- Create `data/mam/rituals/summoning/dragon_awakening.json`:

```

{
"id": "mam:dragon_awakening",
"name": "Dragon Awakening",
"category": "summoning",
"description": "Summon an ancient dragon ally",
"ritual_items": ["mam:dragon_scale", "mam:tanzanite", "mam:sodalite"],
"mana_cost": 500.0,
"duration_seconds": 300,
"level_requirement": 50,
"pattern": {
"type": "multi_ring",
"center_block": "minecraft:dragon_egg",
"ring1": {
"material": "minecraft:obsidian",
"count": 8,
"radius": 3,
"height": 0
}
},
"requirements": {
"time_of_day": "night",
"weather": "thunder",
"surface": ["minecraft:end_stone"]
}
}

```

2. **Implement Ritual Logic**

- Create `src/main/java/dk/mosberg/mam/ritual/summoning/DragonAwakeningRitual.java`
- Implement pattern validation
- Handle dragon entity spawning

3. **Test In-Game**

- Build ritual structure in The End
- Verify pattern recognition
- Test dragon summoning mechanics

---

## 🔗 System Interconnections[file:18]

### Gemstone → Spell School Mappings

Each gemstone links to 1-3 spell schools:

- **Ruby** (Epic) → Fire, Blood
- **Sapphire** (Epic) → Ice
- **Diamond** (Legendary) → Light, Air
- _(See `docs/csv/gemstones.csv` for complete mappings)_

### Gemstone → Ritual Category Mappings

Each gemstone powers 2-4 ritual types:

- **Tanzanite** → Planar, Cosmic, Summoning
- **Diamond** → Ascension, Circle, Reality, Resurrection
- _(See `MAGIC_SYSTEM_DOCUMENTATION.md` for full details)_

### School → Ritual Synergies

Spells from specific schools amplify rituals:

- **Fire School** → +20% power to Elemental & Sacrifice rituals
- **Arcane School** → +15% stability to Planar & Temporal rituals

---

## ⚙️ Build & Testing

### Commands

```

# Generate sources (mappings)

./gradlew genSources

# Run client (development)

./gradlew runClient

# Run server (development)

./gradlew runServer

# Build mod JAR

./gradlew build

# Output: build/libs/mam-1.0.0.jar

# Run tests

./gradlew test

```

### Debugging

- **In-Game Reload:** `/reload` command for data packs
- **Logs:** Check `logs/latest.log` for errors
- **Hot Reload:** Use IDE hot-swap for Java code changes

---

## 🤖 AI Agent Guidance

### Critical Rules

1. ✅ **Always reference `docs/` for canonical data** (gemstones, schools, rituals)[file:18]
2. ✅ **Maintain resource ID consistency** across all files (blockstates, models, textures, recipes)
3. ✅ **Use templates:** Copy existing emerald/gemstone files as base for new content
4. ✅ **Follow naming conventions:** snake_case (JSON resources), PascalCase (Java classes)[file:10]
5. ✅ **Update documentation first:** Modify CSVs/JSONs in `docs/` before implementing code

### When Adding Content

- **New Gemstone:** Update 7+ files (CSV, JSON, model, texture, recipe, tag, worldgen)
- **New Spell:** Update 3+ files (spell JSON, Java class, translation)
- **New Ritual:** Update 2+ files (ritual JSON, Java class)

### Code Generation Standards[file:10]

```

/\*\*

- Example spell implementation for Fire school.
-
- @author Mosberg
- @version 1.0.0
- @since 1.0.0
  \*/
  public class FireballSpell extends Spell {
  private static final float MANA_COST = 15.0f;

/\*\*
_ Cast the fireball spell.
_
_ @param caster Player casting the spell
_ @param powerLevel Gemstone quality multiplier (0.0-1.0)
_ @return true if cast successfully
_ @throws InsufficientManaException if player lacks mana
\*/
@Override
public boolean cast(@NotNull PlayerEntity caster, float powerLevel)
throws InsufficientManaException {
// Implementation
}
}

```

---

## 📊 Quick Stats[file:14]

- **Total Java Files:** 2 (starter templates)
- **Total JSON Files:** 60+ (spells, rituals, recipes, worldgen)
- **Total Textures:** 42+ (gemstones, ores, GUI)
- **Total Documentation:** 8 files
- **Build Size:** ~2-5 MB (estimated)

---

**Last Updated:** December 27, 2025
**Maintained by:** Mosberg
**License:** MIT
