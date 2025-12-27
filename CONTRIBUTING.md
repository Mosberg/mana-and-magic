# Contributing to Arcane Magic System

Thank you for considering contributing to Arcane Magic System! This document provides guidelines and instructions for contributing.

## Getting Started

1. **Fork the Repository**: Create your own fork of the repository
2. **Clone Your Fork**: `git clone https://github.com/YOUR_USERNAME/mana-and-magic.git`
3. **Create a Branch**: `git checkout -b feature/your-feature-name`
4. **Make Changes**: Implement your feature or bugfix
5. **Test Your Changes**: Run the mod in-game to ensure everything works
6. **Commit**: `git commit -m "Add: your feature description"`
7. **Push**: `git push origin feature/your-feature-name`
8. **Submit a Pull Request**: Open a PR from your fork to the main repository

## Code Style

- Follow standard Java conventions
- Use meaningful variable and method names
- Add Javadoc comments for public methods and classes
- Keep methods focused and concise
- Use `@Override` annotations where appropriate

## Project Structure

- **Core Logic**: `/src/main/java/dk/mosberg/mam/`
- **Client Code**: `/src/client/java/dk/mosberg/mam/client/`
- **Resources**: `/src/main/resources/`
- **Data Files**: `/src/main/resources/data/mam/`
- **Documentation**: `/docs/`

## Adding New Features

### Adding a New Spell

1. Create spell JSON in `/data/mam/spells/<school>/`
2. Follow the spell JSON structure documented in README.md
3. Add spell logic in Java if needed
4. Test the spell in-game

### Adding a New Gemstone

1. Add gemstone data to `magic_system_master.json`
2. Create texture in `/textures/item/gemstones/`
3. Add item model JSON
4. Register in item registry
5. Update documentation

### Adding a New Ritual

1. Create ritual JSON in `/data/mam/rituals/<category>/`
2. Follow the ritual JSON structure
3. Implement ritual pattern recognition
4. Test ritual activation in-game

## Testing

- Test all changes in both single-player and multiplayer
- Verify compatibility with Fabric API
- Check for console errors and warnings
- Test with other popular mods if possible

## Documentation

- Update README.md if you add new features
- Document any new JSON structures
- Add code comments for complex logic
- Update CHANGELOG.md

## Reporting Bugs

- Use the GitHub issue tracker
- Provide detailed steps to reproduce
- Include Minecraft version and mod versions
- Attach relevant log files

## Questions?

Feel free to open an issue for questions or join our community discussions!

Thank you for contributing! 🔮✨
