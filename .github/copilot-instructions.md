# Copilot Instructions: Mana and Magic (Minecraft Fabric Mod)

## Project Architecture & Data Flow

- **Hybrid data-driven system:**
  - All spells, rituals, and gemstones are defined in JSON under `src/main/resources/data/mam/` (see `spells/`, `rituals/`, `tags/`, `worldgen/`).
  - Java code in `src/main/java/dk/mosberg/mam/` provides registration, custom logic, and integration. Core logic is in `registry/`, `item/`, `gemstone/`.
  - **Registration is always centralized** in `ManaAndMagic.java` and `Mam*` classes.
- **Canonical data:**
  - The `docs/` directory (CSV, JSON, MD) is the single source of truth for all content, mappings, and cross-links. **Always update docs first** before code or assets.
- **Resource ID discipline:**
  - Resource IDs (snake_case) must be consistent across JSON, Java, models, textures, recipes, tags, and loot tables. See `docs/csv/gemstones.csv`, `spell_schools.csv`, `ritual_categories.csv` for canonical IDs.

## Key Developer Workflows

### Adding Content

- **Gemstones:**
  1.  Add to `docs/csv/gemstones.csv` and `docs/json/magic_system_master.json` **first**.
  2.  Copy+edit a gemstone model/texture in `assets/mam/models/item/` and `assets/mam/textures/item/gemstone/`.
  3.  Update recipes, tags (`data/mam/tags/items/gemstones.json`), and worldgen as needed.
  4.  Register in Java only for custom logic (see `MamItems.java`).
- **Spells:**
  1.  Create JSON in `data/mam/spells/<school>/`.
  2.  Implement Java logic (extend `Spell`, override `cast()`) only if needed.
  3.  Register in `ManaAndMagic` if logic is required.
  4.  Add translations in `assets/mam/lang/en_us.json`.
- **Rituals:**
  1.  Create JSON in `data/mam/rituals/<category>/`.
  2.  Java logic is optional and only for custom effects.

### Build, Test, Debug

- **Build:** `./gradlew build` (output: `build/libs/`)
- **Run:** `./gradlew runClient` or `./gradlew runServer`
- **Test:** `./gradlew test`
- **Reload data packs:** `/reload` in-game
- **Logs:** `logs/latest.log`

## Project-Specific Conventions

- **Data-first:** All gameplay content is data-driven. Java is for registration, integration, or new mechanics only.
- **Naming:**
  - Java: PascalCase (classes), camelCase (methods), UPPER_SNAKE_CASE (constants)
  - JSON: snake_case for IDs
- **Documentation:** Use Javadoc with `@param`, `@return`, `@throws`, `@since 1.0.0` (see `docs/md/MAGIC_SYSTEM_DOCUMENTATION.md`).
- **Templates:** Always copy an existing gemstone/spell/ritual file as a base for new content.
- **Update order:** Always update `docs/` first, then JSON/data, then Java/assets. Never the reverse.

## Cross-Component Patterns

- **Mappings:** All gemstone, spell, and ritual mappings are in `docs/csv/` and `docs/md/MAGIC_SYSTEM_DOCUMENTATION.md`.
- **Worldgen:** Ore features in `data/mam/worldgen/`.
- **Tags:** Gemstone/ore tags in `data/mam/tags/`.
- **Assets:** Models and textures in `assets/mam/models/` and `assets/mam/textures/`.
- **Error-prone areas:** Resource ID mismatches, missing doc updates, and inconsistent asset names are the most common sources of bugs. Always cross-check with docs and templates.

## Examples

- **Spell JSON:** `data/mam/spells/fire/fireball.json`
- **Gemstone model:** `assets/mam/models/item/ruby.json`
- **Java registration:** `ManaAndMagic.java`, `MamItems.java`

---

**Last updated:** December 28, 2025
