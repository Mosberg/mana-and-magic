# Copilot Instructions: Mana and Magic (Minecraft Fabric Mod)

## Project Overview

- **Hybrid data-driven magic system** for Minecraft 1.21.10 (Fabric 0.18.3, Java 21)
- **Key content:** 13 spell schools, 13 ritual categories, 21 gemstones, 31+ spells, 13+ rituals
- **Architecture:**
  - Java logic in `src/main/java/dk/mosberg/mam/` (core, spells, rituals, items, worldgen, etc.)
  - Data/content in `src/main/resources/` (JSON spells/rituals, assets, recipes, tags)
  - Documentation in `docs/` (CSV, JSON, MD; always canonical)

## Essential Patterns & Conventions

- **Data-first:** All spells, rituals, gemstones are defined in JSON. Java only for new logic.
- **Resource ID consistency:** IDs must match across all files (blockstates, models, textures, recipes, tags, loot tables).
- **Naming:**
  - Java: PascalCase (classes), camelCase (methods), UPPER_SNAKE_CASE (constants)
  - JSON: snake_case for resource IDs
- **Documentation:** Javadoc with `@param`, `@return`, `@throws`, `@since 1.0.0` (see `docs/md/CODE_STANDARDS.md`)
- **Templates:** Always copy an existing gemstone/spell/ritual file as a base for new content.
- **Canonical data:** Always update `docs/csv/` and `docs/json/` first when adding new content.

## Key Workflows

### Add a Gemstone

1. Add to `docs/csv/gemstones.csv` and `docs/json/magic_system_master.json`
2. Copy+edit model/texture: `assets/mam/models/item/gemstones/`, `assets/mam/textures/item/gemstones/`, `assets/mam/textures/gui/sprites/container/slot/gemstones/`
3. Add/modify recipe, tag, worldgen, loot table as needed
4. Register in Java only if custom logic is needed

### Add a Spell

1. Create JSON in `data/mam/spells/<school>/`
2. Implement Java logic in `spell/<school>/` if needed (extend `Spell`, override `cast()`)
3. Register in `ManaAndMagic.registerSpells()`
4. Add translation in `assets/mam/lang/en_us.json`

### Add a Ritual

1. Create JSON in `data/mam/rituals/<category>/`
2. Implement Java logic in `ritual/<category>/` if needed

## Build, Test, Debug

- **Build:** `./gradlew build` → output in `build/libs/`
- **Run client/server:** `./gradlew runClient` / `./gradlew runServer`
- **Test:** `./gradlew test`
- **Reload data packs:** `/reload` in-game
- **Logs:** `logs/latest.log`

## Cross-Component Patterns

- **Gemstone, spell, ritual mappings:** See `docs/csv/gemstones.csv` and `MAGIC_SYSTEM_DOCUMENTATION.md` for all cross-links
- **Worldgen:** Ore features in `data/mam/worldgen/`
- **Tags:** All gemstone/ore tags in `data/mam/tags/`

## AI Agent Guidance

1. **Always reference `docs/` for source of truth**
2. **Maintain resource ID consistency** across all content and code
3. **Use templates** for new JSON/assets
4. **Update documentation first** before code/assets
5. **Follow naming and formatting conventions** strictly

## Examples

- **Spell JSON:** See `data/mam/spells/fire/fireball.json`
- **Gemstone model:** See `assets/mam/models/item/gemstones/ruby.json`
- **Java spell:** See `spell/fire/FireballSpell.java` (extends `Spell`, implements `cast()`)

---

**Last updated:** December 27, 2025
