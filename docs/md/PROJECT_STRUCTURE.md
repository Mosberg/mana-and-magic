# Mana and Magic - Complete Project Structure

**Version:** 1.0.0  
**Last Updated:** December 27, 2025

---

## 📁 Root Directory Structure

\`\`\`plaintext
mana-and-magic/
├── 📁 .github/                    # GitHub specific files (CI/CD, issue templates)
├── 📁 .gradle/                    # Gradle cache (git-ignored)
├── 📁 build/                      # Build outputs (git-ignored)
├── 📁 docs/                       # Project documentation
│   ├── 📁 csv/                    # CSV reference tables
│   │   ├── gemstones.csv
│   │   ├── ritual_categories.csv
│   │   └── spell_schools.csv
│   ├── 📁 json/                   # JSON configuration files
│   │   ├── magic_system_master.json
│   │   └── quick_reference_lookup.json
│   ├── 📁 md/                     # Markdown documentation
│   │   └── MAGIC_SYSTEM_DOCUMENTATION.md
│   └── 📁 txt/                    # Text summaries
│       └── SYSTEM_SUMMARY.txt
├── 📁 gradle/                     # Gradle wrapper files
│   └── 📁 wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── 📁 run/                        # Minecraft client run directory (git-ignored)
├── 📁 run-server/                 # Minecraft server run directory (git-ignored)
├── 📁 src/                        # Source code root
│   ├── 📁 client/                 # Client-only code
│   │   └── 📁 java/
│   │       └── 📁 dk/mosberg/mam/client/
│   │           ├── ManaAndMagicClient.java
│   │           ├── 📁 render/     # Rendering code
│   │           ├── 📁 gui/        # GUI screens
│   │           ├── 📁 particle/   # Particle effects
│   │           └── 📁 keybind/    # Keybindings
│   └── 📁 main/                   # Main source code
│       ├── 📁 java/
│       │   └── 📁 dk/mosberg/mam/
│       │       ├── ManaAndMagic.java
│       │       ├── 📁 block/      # Custom blocks
│       │       ├── 📁 item/       # Custom items
│       │       ├── 📁 spell/      # Spell system
│       │       ├── 📁 ritual/     # Ritual system
│       │       ├── 📁 mana/       # Mana system
│       │       ├── 📁 entity/     # Custom entities
│       │       ├── 📁 world/      # World generation
│       │       ├── 📁 network/    # Networking
│       │       └── 📁 util/       # Utility classes
│       └── 📁 resources/
│           ├── 📁 assets/mam/     # Client assets
│           │   ├── icon.png
│           │   ├── 📁 blockstates/
│           │   │   ├── deepslate_emerald_ore.json
│           │   │   ├── emerald_block.json
│           │   │   ├── emerald_ore.json
│           │   │   └── gemstone_ore.json
│           │   ├── 📁 lang/       # Translations
│           │   │   └── en_us.json
│           │   ├── 📁 models/
│           │   │   ├── 📁 block/
│           │   │   │   ├── deepslate_emerald_ore.json
│           │   │   │   ├── emerald_block.json
│           │   │   │   ├── emerald_ore.json
│           │   │   │   └── gemstone_ore.json
│           │   │   └── 📁 item/
│           │   │       ├── emerald.json
│           │   │       └── 📁 gemstones/
│           │   │           ├── apatite.json
│           │   │           ├── aquamarine.json
│           │   │           ├── carnelian.json
│           │   │           ├── citrine.json
│           │   │           ├── diamond.json
│           │   │           ├── emerald.json
│           │   │           ├── hematite.json
│           │   │           ├── jade.json
│           │   │           ├── lapis_lazuli.json
│           │   │           ├── moonstone.json
│           │   │           ├── nether_quartz.json
│           │   │           ├── peridot.json
│           │   │           ├── prismarine_shard.json
│           │   │           ├── rhodonite.json
│           │   │           ├── ruby.json
│           │   │           ├── sapphire.json
│           │   │           ├── sodalite.json
│           │   │           ├── tanzanite.json
│           │   │           ├── topaz.json
│           │   │           └── tourmaline.json
│           │   ├── 📁 sounds/     # Sound definitions
│           │   │   └── sounds.json
│           │   └── 📁 textures/
│           │       ├── 📁 block/
│           │       │   ├── deepslate_emerald_ore.png
│           │       │   ├── emerald_block.png
│           │       │   ├── emerald_ore.png
│           │       │   └── gemstone_ore.png
│           │       ├── 📁 entity/  # Entity textures
│           │       ├── 📁 gui/
│           │       │   └── 📁 sprites/container/slot/
│           │       │       └── 📁 gemstones/
│           │       │           └── [21 gemstone slot icons].png
│           │       ├── 📁 item/
│           │       │   ├── emerald.png
│           │       │   └── 📁 gemstones/
│           │       │       ├── apatite.png
│           │       │       ├── aquamarine.png
│           │       │       ├── carnelian.png
│           │       │       ├── citrine.png
│           │       │       ├── hematite.png
│           │       │       ├── jade.png
│           │       │       ├── moonstone.png
│           │       │       ├── peridot.png
│           │       │       ├── rhodonite.png
│           │       │       ├── ruby.png
│           │       │       ├── sapphire.png
│           │       │       ├── sodalite.png
│           │       │       ├── tanzanite.png
│           │       │       ├── topaz.png
│           │       │       └── tourmaline.png
│           │       └── 📁 particle/ # Particle textures
│           └── 📁 data/mam/        # Game data
│               ├── 📁 advancement/ # Advancements
│               ├── 📁 loot_table/
│               │   └── 📁 blocks/
│               │       ├── deepslate_emerald_ore.json
│               │       ├── emerald_block.json
│               │       ├── emerald_ore.json
│               │       └── gemstone_ore.json
│               ├── 📁 recipe/
│               │   ├── emerald_block.json
│               │   ├── emerald_from_blasting_deepslate_emerald_ore.json
│               │   ├── emerald_from_blasting_emerald_ore.json
│               │   ├── emerald_from_smelting_deepslate_emerald_ore.json
│               │   ├── emerald_from_smelting_emerald_ore.json
│               │   └── emerald.json
│               ├── 📁 rituals/     # Ritual definitions
│               │   ├── 📁 ascension/
│               │   │   └── apotheosis_ritual.json
│               │   ├── 📁 chaos/
│               │   │   └── chaos_maelstrom.json
│               │   ├── 📁 cosmic/
│               │   │   └── cosmic_alignment.json
│               │   ├── 📁 elemental/
│               │   │   └── elemental_convergence.json
│               │   ├── 📁 fountain/
│               │   │   └── mana_fountain.json
│               │   ├── 📁 nature/
│               │   │   └── nature_rebirth.json
│               │   ├── 📁 planar/
│               │   │   └── planar_shift.json
│               │   ├── 📁 reality/
│               │   │   └── reality_anchor.json
│               │   ├── 📁 resurrection/
│               │   │   └── resurrection_circle.json
│               │   ├── 📁 sacrifice/
│               │   │   └── ritual_sacrifice.json
│               │   ├── 📁 summoning/
│               │   │   └── primordial_summoning.json
│               │   ├── 📁 temporal/
│               │   │   └── time_freeze.json
│               │   ├── 📁 transformation/
│               │   │   └── metamorphosis_circle.json
│               │   └── 📁 void/
│               │       └── void_gateway.json
│               ├── 📁 spells/      # Spell definitions
│               │   ├── 📁 air/
│               │   │   ├── air_strike.json
│               │   │   └── wind_slash.json
│               │   ├── 📁 arcane/
│               │   │   ├── arcane_implosion.json
│               │   │   ├── arcane_missile.json
│               │   │   └── spell_weave.json
│               │   ├── 📁 blood/
│               │   │   ├── blood_strike.json
│               │   │   ├── blood_torrent.json
│               │   │   └── bloodthirst.json
│               │   ├── 📁 chaos/
│               │   │   ├── chaos_bolt.json
│               │   │   └── chaos_rift_strike.json
│               │   ├── 📁 dark/
│               │   │   ├── shadow_bolt.json
│               │   │   └── shadow_nova.json
│               │   ├── 📁 fire/
│               │   │   ├── fire_strike.json
│               │   │   ├── fireball.json
│               │   │   ├── inferno_nova.json
│               │   │   └── phoenix_rise.json
│               │   ├── 📁 ice/
│               │   │   ├── blizzard_storm.json
│               │   │   ├── frost_bolt.json
│               │   │   └── ice_comet.json
│               │   ├── 📁 light/
│               │   │   ├── celestial_beam.json
│               │   │   ├── heal.json
│               │   │   ├── holy_blast.json
│               │   │   ├── holy_fire.json
│               │   │   └── radiant_judgment.json
│               │   ├── 📁 nature/
│               │   │   ├── nature_strike.json
│               │   │   ├── nature_wrath.json
│               │   │   └── verdant_surge.json
│               │   ├── 📁 thunder/
│               │   │   ├── chain_lightning.json
│               │   │   ├── lightning_bolt.json
│               │   │   └── storm_caller.json
│               │   ├── 📁 void/
│               │   │   └── void_lance.json
│               │   └── 📁 water/
│               │       └── water_strike.json
│               ├── 📁 tags/
│               │   ├── 📁 block/
│               │   │   ├── emerald_ores.json
│               │   │   └── gemstone_ores.json
│               │   └── 📁 item/
│               │       ├── emerald_ores.json
│               │       └── gemstone_ores.json
│               └── 📁 worldgen/
│                   ├── 📁 configured_feature/
│                   │   ├── ore_emerald.json
│                   │   └── ore_gemstone.json
│                   └── 📁 placed_feature/
│                       ├── ore_emerald.json
│                       └── ore_gemstone.json
├── .gitattributes                 # Git attributes for line endings
├── .gitignore                     # Git ignore patterns
├── build.gradle                   # Gradle build configuration
├── CHANGELOG.md                   # Project changelog
├── CONTRIBUTING.md                # Contribution guidelines
├── gradle.properties              # Gradle and mod properties
├── gradlew                        # Gradle wrapper script (Unix)
├── gradlew.bat                    # Gradle wrapper script (Windows)
├── LICENSE                        # MIT License
├── README.md                      # Project documentation
└── settings.gradle                # Gradle settings
\`\`\`

---

## 📋 Directory Purpose Guide

### `/docs/`
Comprehensive documentation including magic system configurations, reference tables, and implementation guides.

### `/src/main/java/`
Core mod logic implementing spell systems, rituals, items, blocks, and mana mechanics.

### `/src/client/java/`
Client-only code for rendering, UI, particles, and keybindings.

### `/src/main/resources/assets/mam/`
Client-side assets: textures, models, sounds, and translations.

### `/src/main/resources/data/mam/`
Server-side data: recipes, loot tables, world generation, spells, and rituals.

---

## 🎯 Key Files

| File | Purpose |
|------|---------|
| `ManaAndMagic.java` | Main mod initializer |
| `ManaAndMagicClient.java` | Client initializer |
| `fabric.mod.json` | Mod metadata |
| `build.gradle` | Build configuration |
| `gradle.properties` | Project properties |
| `magic_system_master.json` | Complete magic system config |

---

## 🚀 Quick Start

1. **Clone the repository**
   \`\`\`bash
   git clone https://github.com/mosberg/mana-and-magic.git
   cd mana-and-magic
   \`\`\`

2. **Build the mod**
   \`\`\`bash
   ./gradlew build
   \`\`\`

3. **Run in development**
   \`\`\`bash
   ./gradlew runClient
   \`\`\`

4. **Generate sources**
   \`\`\`bash
   ./gradlew genSources
   \`\`\`

---

**Last Updated:** December 27, 2025  
**Structure Version:** 1.0.0
