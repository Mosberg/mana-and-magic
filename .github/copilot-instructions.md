# Copilot Instructions for Mana and Magic Mod

## Project Overview

This repository is a Minecraft mod focused on gemstones, emeralds, rituals, and magic systems. The project is organized as a pure resource/data pack, with all content defined via JSON and assets—no Java code or build scripts are present in this repo. The structure is designed for compatibility with Minecraft's resource and data pack system.

## Key Directories & Files

- `src/main/resources/assets/mam/` — Block/item models, blockstates, and textures. Subfolders:
  - `blockstates/`, `models/block/`, `models/item/`, `items/`, `textures/`
- `src/main/resources/data/mam/` — Game data: loot tables, recipes, rituals, spells, tags, and worldgen configs. Subfolders:
  - `loot_table/blocks/`, `recipe/`, `rituals/`, `spells/`, `tags/block/`, `tags/item/`, `worldgen/`
- `docs/` — Documentation and reference data (e.g., `gemstones.csv`, `magic_system_master.json`)

## Patterns and Conventions

- **Naming:** All files use snake_case and follow Minecraft resource conventions. Resource names must match across blockstates, models, items, and recipes.
- **Content Addition:** New blocks/items require updates in multiple locations: blockstates, models, textures, loot tables, recipes, and tags. Use existing emerald/gemstone files as templates.
- **Recipes:** Defined in `data/mam/recipe/` as JSON. File names describe the process and result (e.g., `emerald_from_smelting_emerald_ore.json`).
- **Rituals/Spells:** Rituals are grouped by category in `data/mam/rituals/`, spells by school in `data/mam/spells/`.
- **Worldgen:** Ore and feature generation is configured in `data/mam/worldgen/configured_feature/` and `placed_feature/`.
- **Tags:** Use `tags/block/` and `tags/item/` to group related resources for recipes and loot tables.

## Developer Workflows

- **No build/test scripts in this repo.** Mod packaging and testing are handled externally (e.g., via Gradle or Minecraft modding tools not included here).
- **To add new content:**
  1.  Duplicate and edit existing JSON files for new blocks/items/recipes/rituals.
  2.  Update documentation in `docs/` as needed (e.g., add new gemstone to `gemstones.csv`).
  3.  Ensure all resource references are consistent across assets and data folders.
- **Debugging:** Use Minecraft's resource/data pack reloading and in-game logs to debug issues. No automated test or CI/CD pipeline is present.

## Integration Points

- **Minecraft Resource/Data Pack System:** All content is loaded by Minecraft as a resource/data pack. No external dependencies or custom scripts are present.
- **Documentation:** Reference `docs/` for gemstone and magic system details. Use these as the source of truth for adding or updating content.

## Example: Adding a New Gemstone

1. Add a new row to `docs/csv/gemstones.csv` and update any relevant JSON in `docs/json/`.
2. Duplicate and edit an existing gemstone's files in `assets/mam/` (blockstates, models, textures, items).
3. Add/modify recipes, loot tables, and tags in `data/mam/`.
4. Update worldgen configs if the gemstone should generate in the world.

## AI Agent Guidance

- Always follow the structure and naming of existing files—consistency is critical for Minecraft resource loading.
- When adding new content, use emerald/gemstone files as templates.
- Reference `docs/` for canonical lists and properties.
- If adding code or build scripts, document the workflow in this file.

---

_Last updated: December 27, 2025_
