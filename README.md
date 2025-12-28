# Mana and Magic: Arcane Magic System (Minecraft Fabric Mod)

**Version:** 1.0.0
**Namespace:** `mam`
**Content:** 13 Spell Schools | 13 Ritual Categories | 15 Gemstone Variants

---

## 🧭 Project Overview

Mana and Magic is a hybrid data-driven Minecraft mod for Fabric, featuring a deep magic system with spells, rituals, and gemstones. All gameplay content is defined in JSON and CSV, with Java code for registration and custom logic. See [docs/md/MAGIC_SYSTEM_DOCUMENTATION.md](docs/md/MAGIC_SYSTEM_DOCUMENTATION.md) for canonical details.

---

## 📚 Table of Contents

- [Mana and Magic: Arcane Magic System (Minecraft Fabric Mod)](#mana-and-magic-arcane-magic-system-minecraft-fabric-mod)
  - [🧭 Project Overview](#-project-overview)
  - [📚 Table of Contents](#-table-of-contents)
  - [🔮 Spell Schools](#-spell-schools)
  - [🌟 Ritual Categories](#-ritual-categories)
  - [💎 Gemstone Compendium](#-gemstone-compendium)
    - [Epic Tier](#epic-tier)
    - [Rare Tier](#rare-tier)
    - [Uncommon Tier](#uncommon-tier)
    - [Common Tier](#common-tier)
  - [🔗 Gemstone-to-School Mapping](#-gemstone-to-school-mapping)
    - [By Spell School](#by-spell-school)
  - [🔗 Gemstone-to-Ritual Mapping](#-gemstone-to-ritual-mapping)
    - [By Ritual Category](#by-ritual-category)
  - [📁 File Structure](#-file-structure)
  - [🎯 Implementation Guidelines](#-implementation-guidelines)
    - [Spell JSON Structure](#spell-json-structure)
    - [Ritual JSON Structure](#ritual-json-structure)
  - [📊 Quick Stats](#-quick-stats)
  - [🔮 Power Level Recommendations](#-power-level-recommendations)
    - [Beginner Gemstones (Levels 1-10)](#beginner-gemstones-levels-1-10)
    - [Intermediate Gemstones (Levels 11-30)](#intermediate-gemstones-levels-11-30)
    - [Advanced Gemstones (Levels 31-50)](#advanced-gemstones-levels-31-50)
    - [Expert Gemstones (Levels 51+)](#expert-gemstones-levels-51)
  - [🚀 Quickstart \& Build](#-quickstart--build)
  - [🤝 Contributing](#-contributing)
  - [📖 Documentation](#-documentation)

---

## 🔮 Spell Schools

| Symbol | School      | Color       | Hex Code  | Focus                   | Primary Gemstones             |
| :----: | ----------- | ----------- | --------- | ----------------------- | ----------------------------- |
|   🌀   | **Air**     | Light Gray  | `#C0C0C0` | Mobility & Speed        | Moonstone                     |
|   🔮   | **Arcane**  | Purple      | `#9966CC` | Utility & Manipulation  | Tanzanite                     |
|   🩸   | **Blood**   | Dark Red    | `#8B0000` | Sacrifice for Power     | Ruby, Carnelian               |
|   🌪️   | **Chaos**   | Magenta     | `#FF00FF` | Unpredictable Effects   | Tourmaline, Rhodonite         |
|   🌑   | **Dark**    | Dark Purple | `#2D1B4E` | DOT & Curses            | Sodalite, Hematite            |
|   🌍   | **Earth**   | Brown       | `#8B4513` | Defense & Stability     | Hematite, Jade, Peridot       |
|   🔥   | **Fire**    | Orange      | `#FF4500` | Damage & Destruction    | Ruby, Carnelian, Topaz        |
|   ❄️   | **Ice**     | Cyan        | `#00FFFF` | Control & Freezing      | Sapphire, Aquamarine, Apatite |
|   ✨   | **Light**   | Pale Yellow | `#FFF8DC` | Holy Power & Protection | Citrine, Topaz                |
|   🌿   | **Nature**  | Green       | `#228B22` | Growth & Life           | Jade, Peridot                 |
|   ⚡   | **Thunder** | Yellow      | `#FFD700` | Burst Damage & Energy   | Citrine, Topaz                |
|   🕳️   | **Void**    | Black       | `#000000` | Dimensional Magic       | Tanzanite, Hematite           |
|   💧   | **Water**   | Blue        | `#1E90FF` | Healing & Purification  | Apatite, Aquamarine           |

---

## 🌟 Ritual Categories

|  Symbol  | Category           | Color        | Hex Code  | Focus                       | Primary Gemstones              |
| :------: | ------------------ | ------------ | --------- | --------------------------- | ------------------------------ |
|    🔺    | **Ascension**      | Gold         | `#FFD700` | Transcendence & Empowerment | Citrine, Topaz                 |
|    ⭕    | **Circle**         | White        | `#FFFFFF` | Bounded Magic & Protection  | Moonstone                      |
|    🌌    | **Cosmic**         | Deep Purple  | `#4B0082` | Celestial Alignment         | Tanzanite, Sapphire, Moonstone |
| 🔥💧🌿⚡ | **Elemental**      | Rainbow      | `#FF6B6B` | Multi-Element Fusion        | Tourmaline, Ruby, Sapphire     |
|    ⛲    | **Fountain**       | Aqua         | `#00CED1` | Continuous Flow             | Aquamarine                     |
|    🌐    | **Planar**         | Silver       | `#C0C0C0` | Dimension Manipulation      | Tanzanite                      |
|    🔄    | **Reality**        | Prismatic    | `#E0E0E0` | World Alteration            | Tourmaline                     |
|    💫    | **Resurrection**   | Golden White | `#FFF9E3` | Life Restoration            | Rhodonite, Citrine             |
|    🗡️    | **Sacrifice**      | Crimson      | `#DC143C` | Power through Offering      | Ruby, Carnelian, Hematite      |
|    👻    | **Summoning**      | Dark Purple  | `#6A0DAD` | Entity Calling              | Sodalite, Tanzanite, Hematite  |
|    ⏰    | **Temporal**       | Bronze       | `#CD7F32` | Time Manipulation           | Moonstone                      |
|    🦋    | **Transformation** | Violet       | `#8F00FF` | Form Alteration             | Jade, Peridot, Tourmaline      |
|    🌀    | **Vortex**         | Storm Gray   | `#708090` | Spiraling Force             | Apatite, Sodalite              |

---

## 💎 Gemstone Compendium

### Epic Tier

| Gemstone      | Color     | Hex       | Shape    | Affinity | Schools      | Rituals                   |
| ------------- | --------- | --------- | -------- | -------- | ------------ | ------------------------- |
| **Ruby**      | Deep Red  | `#E63946` | Round    | Fire     | Fire, Blood  | Elemental, Sacrifice      |
| **Sapphire**  | Deep Blue | `#2952A3` | Round    | Ice      | Ice          | Elemental, Cosmic         |
| **Tanzanite** | Purple    | `#6B4B9E` | Princess | Void     | Void, Arcane | Planar, Cosmic, Summoning |

### Rare Tier

| Gemstone       | Color        | Hex       | Shape   | Affinity | Schools              | Rituals                            |
| -------------- | ------------ | --------- | ------- | -------- | -------------------- | ---------------------------------- |
| **Apatite**    | Cyan Blue    | `#2DD4DB` | Round   | Water    | Water, Ice           | Vortex, Fountain                   |
| **Aquamarine** | Light Blue   | `#7DD3E8` | Diamond | Water    | Water, Ice           | Fountain                           |
| **Moonstone**  | Pearly White | `#E8E5E0` | Oval    | Lunar    | Air                  | Circle, Cosmic, Temporal           |
| **Rhodonite**  | Rose Pink    | `#D66B88` | Round   | Healing  | Chaos                | Resurrection                       |
| **Topaz**      | Amber Orange | `#D98736` | Oval    | Solar    | Light, Thunder, Fire | Ascension                          |
| **Tourmaline** | Forest Green | `#3A7C59` | Round   | Balance  | Chaos                | Elemental, Reality, Transformation |

### Uncommon Tier

| Gemstone      | Color         | Hex       | Shape   | Affinity | Schools        | Rituals                 |
| ------------- | ------------- | --------- | ------- | -------- | -------------- | ----------------------- |
| **Carnelian** | Orange Red    | `#E86938` | Round   | Fire     | Fire, Blood    | Sacrifice               |
| **Citrine**   | Golden Yellow | `#F4B942` | Octagon | Light    | Light, Thunder | Ascension, Resurrection |
| **Jade**      | Medium Green  | `#5FA777` | Round   | Nature   | Nature, Earth  | Transformation          |
| **Peridot**   | Lime Green    | `#A4D65E` | Round   | Nature   | Nature, Earth  | Transformation          |
| **Sodalite**  | Navy Blue     | `#3D5A9C` | Round   | Mind     | Dark           | Summoning, Vortex       |

### Common Tier

| Gemstone     | Color         | Hex       | Shape | Affinity | Schools           | Rituals              |
| ------------ | ------------- | --------- | ----- | -------- | ----------------- | -------------------- |
| **Hematite** | Metallic Gray | `#5A5A5A` | Round | Earth    | Earth, Dark, Void | Sacrifice, Summoning |

---

## 🔗 Gemstone-to-School Mapping

### By Spell School

- **Air**: Moonstone
- **Arcane**: Tanzanite
- **Blood**: Ruby, Carnelian
- **Chaos**: Tourmaline, Rhodonite
- **Dark**: Sodalite, Hematite
- **Earth**: Hematite, Jade, Peridot
- **Fire**: Ruby, Carnelian, Topaz
- **Ice**: Sapphire, Aquamarine, Apatite
- **Light**: Citrine, Topaz
- **Nature**: Jade, Peridot
- **Thunder**: Citrine, Topaz
- **Void**: Tanzanite, Hematite
- **Water**: Apatite, Aquamarine

---

## 🔗 Gemstone-to-Ritual Mapping

### By Ritual Category

- **Ascension**: Citrine, Topaz
- **Circle**: Moonstone
- **Cosmic**: Tanzanite, Sapphire, Moonstone
- **Elemental**: Tourmaline, Ruby, Sapphire
- **Fountain**: Aquamarine
- **Planar**: Tanzanite
- **Reality**: Tourmaline
- **Resurrection**: Rhodonite, Citrine
- **Sacrifice**: Ruby, Carnelian, Hematite
- **Summoning**: Sodalite, Tanzanite, Hematite
- **Temporal**: Moonstone
- **Transformation**: Jade, Peridot, Tourmaline
- **Vortex**: Apatite, Sodalite

---

## 📁 File Structure

```plaintext
mam/
├── src/main/resources/
│   ├── assets/mam/
│   │   ├── blockstates/
│   │   │   └── gemstone_ore.json
│   │   ├── models/
│   │   │   ├── block/
│   │   │   │   └── gemstone_ore.json
│   │   │   └── item/
│   │   │       └── gemstones/*.json (15 files)
│   │   └── textures/
│   │       ├── block/
│   │       │   └── gemstone_ore.png
│   │       ├── gui/sprites/container/slot/
│   │       │   └── gemstone_slots/*.png (15 files)
│   │       └── item/gemstones/
│   │           └── *.png (15 gemstone textures)
│   └── data/mam/
│       ├── loot_table/blocks/
│       │   └── gemstone_ore.json
│       ├── recipe/
│       │   └── gemstone_*.json (gemstone recipes)
│       ├── rituals/
│       │   ├── ascension/
│       │   │   └── apotheosis_ritual.json
│       │   ├── chaos/
│       │   │   └── chaos_maelstrom.json
│       │   ├── cosmic/
│       │   │   └── cosmic_alignment.json
│       │   ├── elemental/
│       │   │   └── elemental_convergence.json
│       │   ├── fountain/
│       │   │   └── mana_fountain.json
│       │   ├── nature/
│       │   │   └── nature_rebirth.json
│       │   ├── planar/
│       │   │   └── planar_shift.json
│       │   ├── reality/
│       │   │   └── reality_anchor.json
│       │   ├── resurrection/
│       │   │   └── resurrection_circle.json
│       │   ├── sacrifice/
│       │   │   └── ritual_sacrifice.json
│       │   ├── summoning/
│       │   │   └── primordial_summoning.json
│       │   ├── temporal/
│       │   │   └── time_freeze.json
│       │   ├── transformation/
│       │   │   └── metamorphosis_circle.json
│       │   └── void/
│       │       └── void_gateway.json
│       ├── spells/
│       │   ├── air/
│       │   │   ├── air_strike.json
│       │   │   └── wind_slash.json
│       │   ├── arcane/
│       │   │   ├── arcane_implosion.json
│       │   │   ├── arcane_missile.json
│       │   │   └── spell_weave.json
│       │   ├── blood/
│       │   │   ├── blood_strike.json
│       │   │   ├── blood_torrent.json
│       │   │   └── bloodthirst.json
│       │   ├── chaos/
│       │   │   ├── chaos_bolt.json
│       │   │   └── chaos_rift_strike.json
│       │   ├── dark/
│       │   │   ├── shadow_bolt.json
│       │   │   └── shadow_nova.json
│       │   ├── fire/
│       │   │   ├── fire_strike.json
│       │   │   ├── fireball.json
│       │   │   ├── inferno_nova.json
│       │   │   └── phoenix_rise.json
│       │   ├── ice/
│       │   │   ├── blizzard_storm.json
│       │   │   ├── frost_bolt.json
│       │   │   └── ice_comet.json
│       │   ├── light/
│       │   │   ├── celestial_beam.json
│       │   │   ├── heal.json
│       │   │   ├── holy_blast.json
│       │   │   ├── holy_fire.json
│       │   │   └── radiant_judgment.json
│       │   ├── nature/
│       │   │   ├── nature_strike.json
│       │   │   ├── nature_wrath.json
│       │   │   └── verdant_surge.json
│       │   ├── thunder/
│       │   │   ├── chain_lightning.json
│       │   │   ├── lightning_bolt.json
│       │   │   └── storm_caller.json
│       │   ├── void/
│       │   │   └── void_lance.json
│       │   └── water/
│       │       └── water_strike.json
│       ├── tags/
│       │   ├── block/
│       │   │   └── gemstone_ores.json
│       │   └── item/
│       │       └── gemstone_ores.json
│       └── worldgen/
│           ├── configured_feature/
│           │   └── ore_gemstone.json
│           └── placed_feature/
│               └── ore_gemstone.json
```

---

## 🎯 Implementation Guidelines

### Spell JSON Structure

```json
{
  "id": "namespace:spell_name",
  "name": "Spell Display Name",
  "school": "school_id",
  "description": "What the spell does",
  "castType": "projectile|utility|aoe",
  "manaCost": 0.0,
  "castTime": 0.0,
  "cooldown": 0.0,
  "tier": 1,
  "requiredLevel": 1,
  "damage": 0.0,
  "range": 0.0,
  "projectileSpeed": 0.0,
  "aoeRadius": 0.0,
  "statusEffects": [],
  "customData": {},
  "sound": "minecraft:sound_event",
  "vfx": {
    "particleType": "particle_name",
    "particleCount": 0,
    "color": "HEXCODE"
  }
}
```

### Ritual JSON Structure

```json
{
  "id": "namespace:ritual_name",
  "name": "Ritual Display Name",
  "category": "category_id",
  "description": "What the ritual does",
  "ritual_items": ["item_1", "item_2"],
  "mana_cost": 0.0,
  "duration_seconds": 0,
  "cooldown_seconds": 0,
  "level_requirement": 0,
  "pattern": {
    "type": "pattern_type",
    "center_block": "block_id",
    "ring1": {
      "material": "block_id",
      "count": 0,
      "radius": 0,
      "height": 0
    }
  },
  "effect": {
    "type": "effect_type"
  },
  "particles": {
    "type": "particle_type",
    "particle": "particle_name",
    "count": 0,
    "duration": 0
  },
  "sound": "minecraft:sound_event",
  "synergy_schools": ["School1", "School2"],
  "requirements": {
    "time_of_day": "any|day|night",
    "weather": "any|clear|rain|thunder",
    "biome": "any|specific_biome",
    "surface": ["block_type"]
  }
}
```

---

## 📊 Quick Stats

- **Total Spell Schools**: 13
- **Total Ritual Categories**: 13
- **Total Gemstone Variants**: 15
- **Rarity Distribution**:
  - Epic: 3 (Ruby, Sapphire, Tanzanite)
  - Rare: 6 (Apatite, Aquamarine, Moonstone, Rhodonite, Topaz, Tourmaline)
  - Uncommon: 5 (Carnelian, Citrine, Jade, Peridot, Sodalite)
  - Common: 1 (Hematite)

---

## 🔮 Power Level Recommendations

### Beginner Gemstones (Levels 1-10)

Hematite, Carnelian, Citrine, Jade, Sodalite

### Intermediate Gemstones (Levels 11-30)

Peridot, Moonstone

### Advanced Gemstones (Levels 31-50)

Apatite, Aquamarine, Topaz, Rhodonite, Tourmaline

### Expert Gemstones (Levels 51+)

Ruby, Sapphire, Tanzanite

---

## 🚀 Quickstart & Build

1. Install Java 21 and Fabric 0.18.3.
2. Clone this repo and run:

- `./gradlew build` (output: `build/libs/`)
- `./gradlew runClient` or `./gradlew runServer`
- `./gradlew test` for tests

1. In-game, use `/reload` to refresh data packs.
2. See logs in `logs/latest.log`.

## 🤝 Contributing

- All gameplay content is data-driven. Update `docs/` (CSV, JSON, MD) first, then JSON/data, then Java/assets.
- Use canonical IDs from `docs/csv/` and cross-check with [MAGIC_SYSTEM_DOCUMENTATION.md](docs/md/MAGIC_SYSTEM_DOCUMENTATION.md).
- Follow naming conventions: PascalCase (Java classes), camelCase (methods), UPPER_SNAKE_CASE (constants), snake_case (JSON IDs).
- Always copy an existing gemstone/spell/ritual file as a template for new content.

## 📖 Documentation

- See [docs/md/MAGIC_SYSTEM_DOCUMENTATION.md](docs/md/MAGIC_SYSTEM_DOCUMENTATION.md) for the full system, mappings, and cross-links.
- See [docs/csv/](docs/csv/) and [docs/json/](docs/json/) for canonical data.
- For AI/automation, see [.github/copilot-instructions.md](.github/copilot-instructions.md).

---

**Last Updated:** December 28, 2025
**Mod Author:** Mosberg
**License:** All Rights Reserved
