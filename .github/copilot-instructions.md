# Copilot Instructions: Mana and Magic (Minecraft Fabric Mod)

## Project Architecture & Data Flow

- **Hybrid data-driven system**: All spells, rituals, and gemstones are defined in JSON under `src/main/resources/data/mam/` (see `spells/`, `rituals/`, `tags/`, `worldgen/`). Java code in `src/main/java/dk/mosberg/mam/` provides logic for registration, custom behaviors, and integration.
- **Canonical data**: The `docs/` directory (CSV, JSON, MD) is always the source of truth for content, mappings, and cross-links. Update these first for any new content.
- **Resource ID discipline**: Resource IDs (snake_case) must be consistent across JSON, Java, models, textures, recipes, tags, and loot tables. See `docs/csv/gemstones.csv`, `spell_schools.csv`, `ritual_categories.csv`.
- **Java structure**: Core logic is in `dk.mosberg.mam.*` (see `registry/`, `item/`, `gemstone/`). Registration is centralized in `ManaAndMagic.java` and `Mam*` classes.

## Key Developer Workflows

### Adding Content

- **Gemstones**: Add to `docs/csv/gemstones.csv` and `docs/json/magic_system_master.json` first. Copy+edit a gemstone model/texture in `assets/mam/models/item/` and `assets/mam/textures/item/gemstone/`. Update recipes, tags, and worldgen as needed. Register in Java only for custom logic.
- **Spells**: Create JSON in `data/mam/spells/<school>/`. Implement Java logic (extend `Spell`, override `cast()`) only if needed. Register in `ManaAndMagic` if logic is required. Add translations in `assets/mam/lang/en_us.json`.
- **Rituals**: Create JSON in `data/mam/rituals/<category>/`. Java logic is optional and only for custom effects.

### Build, Test, Debug

- **Build**: `./gradlew build` (output: `build/libs/`)
- **Run**: `./gradlew runClient` or `./gradlew runServer`
- **Test**: `./gradlew test`
- **Reload data packs**: `/reload` in-game
- **Logs**: `logs/latest.log`

## Project-Specific Conventions

- **Data-first**: All gameplay content is data-driven. Java is for registration, integration, or new mechanics only.
- **Naming**: Java uses PascalCase (classes), camelCase (methods), UPPER_SNAKE_CASE (constants). JSON uses snake_case for IDs.
- **Documentation**: Use Javadoc with `@param`, `@return`, `@throws`, `@since 1.0.0` (see `docs/md/MAGIC_SYSTEM_DOCUMENTATION.md`).
- **Templates**: Always copy an existing gemstone/spell/ritual file as a base for new content.

## Cross-Component Patterns

- **Mappings**: All gemstone, spell, and ritual mappings are in `docs/csv/` and `docs/md/MAGIC_SYSTEM_DOCUMENTATION.md`.
- **Worldgen**: Ore features in `data/mam/worldgen/`.
- **Tags**: Gemstone/ore tags in `data/mam/tags/`.
- **Assets**: Models and textures in `assets/mam/models/` and `assets/mam/textures/`.

## Examples

- **Spell JSON**: `data/mam/spells/fire/fireball.json`
- **Gemstone model**: `assets/mam/models/item/ruby.json`
- **Java registration**: `ManaAndMagic.java`, `MamItems.java`

---

**Last updated:** December 28, 2025
