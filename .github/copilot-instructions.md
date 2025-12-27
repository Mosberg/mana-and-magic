# Copilot Instructions for Mana and Magic Mod

## Project Overview

This project is a Minecraft mod, organized primarily under `src/main/resources`. It adds new blocks, items, recipes, world generation features, and loot tables, with a focus on gemstones and emerald-related content.

## Key Directories

- `src/main/resources/assets/mam/` — Contains block/item models, blockstates, and textures.
- `src/main/resources/data/mam/` — Contains loot tables, recipes, tags, and worldgen configuration.
- `docs/gemstones.json` — Documents gemstone variants and their properties (id, name, color, hex).

## Patterns and Conventions

- **Naming:** File and directory names use snake_case and match the Minecraft resource naming conventions.
- **Block/Item Definitions:** Each block/item has corresponding files in `blockstates/`, `models/`, and `items/` or `block/`/`item/` subfolders.
- **Recipes:** Recipes are defined as JSON in `data/mam/recipe/`, with clear naming for input/output and process (e.g., `emerald_from_smelting_emerald_ore.json`).
- **Worldgen:** Ore generation is configured in `data/mam/worldgen/configured_feature/` and `placed_feature/`.
- **Tags:** Use `tags/block/` and `tags/item/` to group related resources (e.g., `emerald_ores.json`).

## Developer Workflows

- **No build/test scripts are present in this repo.** Mod development likely relies on an external build system (e.g., Gradle) not included here. Add build instructions if/when code is added.
- **Add new content by duplicating and editing existing JSON files.** For example, to add a new gemstone, update `docs/gemstones.json` and create corresponding files in `assets/mam/` and `data/mam/`.

## Integration Points

- **Minecraft Resource System:** All files follow Minecraft's resource pack structure for compatibility.
- **No external dependencies or custom scripts** are present in this repo as of this writing.

## Example: Adding a New Gemstone

1. Add a new entry to `docs/gemstones.json`.
2. Create new model, texture, and blockstate files in `assets/mam/`.
3. Add recipes, loot tables, and tags in `data/mam/` as needed.

## Recommendations for AI Agents

- When generating new content, follow the structure and naming of existing files.
- Reference `docs/gemstones.json` for gemstone properties and variants.
- If adding code or build scripts, document the workflow in this file.

---

_Last updated: December 27, 2025_
