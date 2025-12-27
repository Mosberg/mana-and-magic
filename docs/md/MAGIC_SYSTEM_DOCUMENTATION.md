# Arcane Magic System - Mana and Magic

**Version:** 1.0.0
**Namespace:** `mam`
**Total Systems:** 13 Spell Schools | 13 Ritual Categories | 21 Gemstone Variants

---

## 📚 Table of Contents

- [Arcane Magic System - Mana and Magic](#arcane-magic-system---mana-and-magic)
  - [📚 Table of Contents](#-table-of-contents)
  - [🔮 Spell Schools](#-spell-schools)
  - [🌟 Ritual Categories](#-ritual-categories)
  - [💎 Gemstone Compendium](#-gemstone-compendium)
    - [Legendary Tier](#legendary-tier)
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

---

## 🔮 Spell Schools

| Symbol | School      | Color       | Hex Code  | Focus                   | Primary Gemstones                       |
| :----: | ----------- | ----------- | --------- | ----------------------- | --------------------------------------- |
|   🌀   | **Air**     | Light Gray  | `#C0C0C0` | Mobility & Speed        | Moonstone, Diamond                      |
|   🔮   | **Arcane**  | Purple      | `#9966CC` | Utility & Manipulation  | Amethyst Shard, Tanzanite, Lapis Lazuli |
|   🩸   | **Blood**   | Dark Red    | `#8B0000` | Sacrifice for Power     | Ruby, Carnelian                         |
|   🌪️   | **Chaos**   | Magenta     | `#FF00FF` | Unpredictable Effects   | Tourmaline, Rhodonite                   |
|   🌑   | **Dark**    | Dark Purple | `#2D1B4E` | DOT & Curses            | Sodalite, Hematite                      |
|   🌍   | **Earth**   | Brown       | `#8B4513` | Defense & Stability     | Hematite, Jade, Peridot                 |
|   🔥   | **Fire**    | Orange      | `#FF4500` | Damage & Destruction    | Ruby, Carnelian, Topaz                  |
|   ❄️   | **Ice**     | Cyan        | `#00FFFF` | Control & Freezing      | Sapphire, Aquamarine, Apatite           |
|   ✨   | **Light**   | Pale Yellow | `#FFF8DC` | Holy Power & Protection | Citrine, Topaz, Diamond                 |
|   🌿   | **Nature**  | Green       | `#228B22` | Growth & Life           | Emerald, Jade, Peridot                  |
|   ⚡   | **Thunder** | Yellow      | `#FFD700` | Burst Damage & Energy   | Citrine, Topaz                          |
|   🕳️   | **Void**    | Black       | `#000000` | Dimensional Magic       | Tanzanite, Hematite                     |
|   💧   | **Water**   | Blue        | `#1E90FF` | Healing & Purification  | Apatite, Aquamarine, Prismarine Shard   |

---

## 🌟 Ritual Categories

|  Symbol  | Category           | Color        | Hex Code  | Focus                       | Primary Gemstones                          |
| :------: | ------------------ | ------------ | --------- | --------------------------- | ------------------------------------------ |
|    🔺    | **Ascension**      | Gold         | `#FFD700` | Transcendence & Empowerment | Diamond, Citrine, Topaz                    |
|    ⭕    | **Circle**         | White        | `#FFFFFF` | Bounded Magic & Protection  | Moonstone, Diamond                         |
|    🌌    | **Cosmic**         | Deep Purple  | `#4B0082` | Celestial Alignment         | Tanzanite, Sapphire, Moonstone             |
| 🔥💧🌿⚡ | **Elemental**      | Rainbow      | `#FF6B6B` | Multi-Element Fusion        | Tourmaline, Emerald, Ruby, Sapphire        |
|    ⛲    | **Fountain**       | Aqua         | `#00CED1` | Continuous Flow             | Prismarine Shard, Aquamarine, Lapis Lazuli |
|    🌐    | **Planar**         | Silver       | `#C0C0C0` | Dimension Manipulation      | Tanzanite, Amethyst Shard                  |
|    🔄    | **Reality**        | Prismatic    | `#E0E0E0` | World Alteration            | Diamond, Nether Quartz, Tourmaline         |
|    💫    | **Resurrection**   | Golden White | `#FFF9E3` | Life Restoration            | Diamond, Rhodonite, Citrine                |
|    🗡️    | **Sacrifice**      | Crimson      | `#DC143C` | Power through Offering      | Ruby, Carnelian, Hematite                  |
|    👻    | **Summoning**      | Dark Purple  | `#6A0DAD` | Entity Calling              | Sodalite, Tanzanite, Hematite              |
|    ⏰    | **Temporal**       | Bronze       | `#CD7F32` | Time Manipulation           | Amethyst Shard, Moonstone, Nether Quartz   |
|    🦋    | **Transformation** | Violet       | `#8F00FF` | Form Alteration             | Jade, Peridot, Tourmaline                  |
|    🌀    | **Vortex**         | Storm Gray   | `#708090` | Spiraling Force             | Apatite, Sodalite                          |

---

## 💎 Gemstone Compendium

### Legendary Tier

| Gemstone    | Color      | Hex       | Shape   | Affinity   | Schools    | Rituals                                  |
| ----------- | ---------- | --------- | ------- | ---------- | ---------- | ---------------------------------------- |
| **Diamond** | Cyan White | `#5DCFCF` | Octagon | Durability | Light, Air | Ascension, Circle, Reality, Resurrection |

### Epic Tier

| Gemstone      | Color     | Hex       | Shape    | Affinity | Schools      | Rituals                   |
| ------------- | --------- | --------- | -------- | -------- | ------------ | ------------------------- |
| **Ruby**      | Deep Red  | `#E63946` | Round    | Fire     | Fire, Blood  | Elemental, Sacrifice      |
| **Sapphire**  | Deep Blue | `#2952A3` | Round    | Ice      | Ice          | Elemental, Cosmic         |
| **Tanzanite** | Purple    | `#6B4B9E` | Princess | Void     | Void, Arcane | Planar, Cosmic, Summoning |

### Rare Tier

| Gemstone             | Color         | Hex       | Shape   | Affinity | Schools              | Rituals                            |
| -------------------- | ------------- | --------- | ------- | -------- | -------------------- | ---------------------------------- |
| **Apatite**          | Cyan Blue     | `#2DD4DB` | Round   | Water    | Water, Ice           | Vortex, Fountain                   |
| **Aquamarine**       | Light Blue    | `#7DD3E8` | Diamond | Water    | Water, Ice           | Fountain                           |
| **Emerald**          | Vibrant Green | `#50C878` | Octagon | Nature   | Nature               | Elemental                          |
| **Moonstone**        | Pearly White  | `#E8E5E0` | Oval    | Lunar    | Air                  | Circle, Cosmic, Temporal           |
| **Prismarine Shard** | Aqua Teal     | `#5AB5A5` | Crystal | Ocean    | Water                | Fountain                           |
| **Rhodonite**        | Rose Pink     | `#D66B88` | Round   | Healing  | Chaos                | Resurrection                       |
| **Topaz**            | Amber Orange  | `#D98736` | Oval    | Solar    | Light, Thunder, Fire | Ascension                          |
| **Tourmaline**       | Forest Green  | `#3A7C59` | Round   | Balance  | Chaos                | Elemental, Reality, Transformation |

### Uncommon Tier

| Gemstone           | Color         | Hex       | Shape   | Affinity    | Schools        | Rituals                 |
| ------------------ | ------------- | --------- | ------- | ----------- | -------------- | ----------------------- |
| **Amethyst Shard** | Purple        | `#9966CC` | Crystal | Arcane      | Arcane         | Temporal, Planar        |
| **Carnelian**      | Orange Red    | `#E86938` | Round   | Fire        | Fire, Blood    | Sacrifice               |
| **Citrine**        | Golden Yellow | `#F4B942` | Octagon | Light       | Light, Thunder | Ascension, Resurrection |
| **Jade**           | Medium Green  | `#5FA777` | Round   | Nature      | Nature, Earth  | Transformation          |
| **Lapis Lazuli**   | Deep Blue     | `#1E488F` | Round   | Enchantment | Arcane         | Fountain                |
| **Nether Quartz**  | Cream White   | `#E4D4C8` | Crystal | Nether      | —              | Reality, Temporal       |
| **Peridot**        | Lime Green    | `#A4D65E` | Round   | Nature      | Nature, Earth  | Transformation          |
| **Sodalite**       | Navy Blue     | `#3D5A9C` | Round   | Mind        | Dark           | Summoning, Vortex       |

### Common Tier

| Gemstone     | Color         | Hex       | Shape | Affinity | Schools           | Rituals              |
| ------------ | ------------- | --------- | ----- | -------- | ----------------- | -------------------- |
| **Hematite** | Metallic Gray | `#5A5A5A` | Round | Earth    | Earth, Dark, Void | Sacrifice, Summoning |

---

## 🔗 Gemstone-to-School Mapping

### By Spell School

- **Air**: Moonstone, Diamond
- **Arcane**: Amethyst Shard, Tanzanite, Lapis Lazuli
- **Blood**: Ruby, Carnelian
- **Chaos**: Tourmaline, Rhodonite
- **Dark**: Sodalite, Hematite
- **Earth**: Hematite, Jade, Peridot
- **Fire**: Ruby, Carnelian, Topaz
- **Ice**: Sapphire, Aquamarine, Apatite
- **Light**: Citrine, Topaz, Diamond
- **Nature**: Emerald, Jade, Peridot
- **Thunder**: Citrine, Topaz
- **Void**: Tanzanite, Hematite
- **Water**: Apatite, Aquamarine, Prismarine Shard

---

## 🔗 Gemstone-to-Ritual Mapping

### By Ritual Category

- **Ascension**: Diamond, Citrine, Topaz
- **Circle**: Moonstone, Diamond
- **Cosmic**: Tanzanite, Sapphire, Moonstone
- **Elemental**: Tourmaline, Emerald, Ruby, Sapphire
- **Fountain**: Prismarine Shard, Aquamarine, Lapis Lazuli
- **Planar**: Tanzanite, Amethyst Shard
- **Reality**: Diamond, Nether Quartz, Tourmaline
- **Resurrection**: Diamond, Rhodonite, Citrine
- **Sacrifice**: Ruby, Carnelian, Hematite
- **Summoning**: Sodalite, Tanzanite, Hematite
- **Temporal**: Amethyst Shard, Moonstone, Nether Quartz
- **Transformation**: Jade, Peridot, Tourmaline
- **Vortex**: Apatite, Sodalite

---

## 📁 File Structure

```plaintext
mam/
├── src/main/resources/
│   ├── assets/mam/
│   │   ├── blockstates/
│   │   │   ├── deepslate_emerald_ore.json
│   │   │   ├── emerald_block.json
│   │   │   ├── emerald_ore.json
│   │   │   └── gemstone_ore.json
│   │   ├── models/
│   │   │   ├── block/
│   │   │   │   ├── deepslate_emerald_ore.json
│   │   │   │   ├── emerald_block.json
│   │   │   │   ├── emerald_ore.json
│   │   │   │   └── gemstone_ore.json
│   │   │   └── item/
│   │   │       ├── emerald.json
│   │   │       └── gemstones/*.json (21 files)
│   │   └── textures/
│   │       ├── block/
│   │       │   ├── deepslate_emerald_ore.png
│   │       │   ├── emerald_block.png
│   │       │   ├── emerald_ore.png
│   │       │   └── gemstone_ore.png
│   │       ├── gui/sprites/container/slot/
│   │       │   └── gemstone_slots/*.png (21 files)
│   │       └── item/gemstones/
│   │           └── *.png (21 gemstone textures)
│   └── data/mam/
│       ├── loot_table/blocks/
│       │   ├── deepslate_emerald_ore.json
│       │   ├── emerald_block.json
│       │   ├── emerald_ore.json
│       │   └── gemstone_ore.json
│       ├── recipe/
│       │   ├── emerald_*.json (crafting recipes)
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
│       │   │   ├── emerald_ores.json
│       │   │   └── gemstone_ores.json
│       │   └── item/
│       │       ├── emerald_ores.json
│       │       └── gemstone_ores.json
│       └── worldgen/
│           ├── configured_feature/
│           │   ├── ore_emerald.json
│           │   └── ore_gemstone.json
│           └── placed_feature/
│               ├── ore_emerald.json
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
- **Total Gemstone Variants**: 21
- **Rarity Distribution**:
  - Legendary: 1 (Diamond)
  - Epic: 3 (Ruby, Sapphire, Tanzanite)
  - Rare: 8
  - Uncommon: 8
  - Common: 1 (Hematite)

---

## 🔮 Power Level Recommendations

### Beginner Gemstones (Levels 1-10)

Hematite, Carnelian, Citrine, Jade, Sodalite

### Intermediate Gemstones (Levels 11-30)

Amethyst Shard, Lapis Lazuli, Peridot, Nether Quartz, Moonstone

### Advanced Gemstones (Levels 31-50)

Apatite, Aquamarine, Emerald, Topaz, Rhodonite, Tourmaline, Prismarine Shard

### Expert Gemstones (Levels 51+)

Ruby, Sapphire, Tanzanite, Diamond

---

**Last Updated**: December 27, 2025
**Mod Author**: Mosberg
**License**: All Rights Reserved
