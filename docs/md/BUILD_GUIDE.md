# Build & Development Guide

## Prerequisites

### Required Software
- **Java 21 or higher** (OpenJDK or Oracle JDK)
- **Git** for version control
- **IDE** (IntelliJ IDEA recommended)

### Minecraft Versions
- **Minecraft**: 1.21.10
- **Fabric Loader**: 0.18.3+
- **Fabric API**: 0.138.4+1.21.10

---

## Initial Setup

### 1. Clone the Repository
\`\`\`bash
git clone https://github.com/mosberg/mana-and-magic.git
cd mana-and-magic
\`\`\`

### 2. Generate IDE Files

#### IntelliJ IDEA
\`\`\`bash
./gradlew idea
\`\`\`
Then open the project in IntelliJ IDEA.

#### Eclipse
\`\`\`bash
./gradlew eclipse
\`\`\`

#### Visual Studio Code
Install the Java Extension Pack and Gradle Extension, then open the folder.

### 3. Generate Minecraft Sources
\`\`\`bash
./gradlew genSources
\`\`\`
This decompiles Minecraft sources for development.

---

## Building the Mod

### Development Build
\`\`\`bash
./gradlew build
\`\`\`

Output: `build/libs/mam-1.0.0.jar`

### Clean Build
\`\`\`bash
./gradlew clean build
\`\`\`

### Build Without Tests
\`\`\`bash
./gradlew build -x test
\`\`\`

---

## Running the Mod

### Run Client
\`\`\`bash
./gradlew runClient
\`\`\`
Launches Minecraft with the mod installed.

### Run Server
\`\`\`bash
./gradlew runServer
\`\`\`
Launches a dedicated server with the mod.

### Run Data Generation
\`\`\`bash
./gradlew runDatagen
\`\`\`
Generates data files (recipes, loot tables, etc.).

---

## IDE Run Configurations

### IntelliJ IDEA
After running `./gradlew genSources`, IntelliJ will auto-generate run configurations:
- **Minecraft Client**
- **Minecraft Server**
- **Minecraft Data**

### VS Code
Run configurations are in `.vscode/launch.json` (auto-generated).

---

## Development Workflow

### 1. Make Changes
Edit Java files in `src/main/java/` or `src/client/java/`

### 2. Compile
\`\`\`bash
./gradlew compileJava
\`\`\`

### 3. Test in Game
\`\`\`bash
./gradlew runClient
\`\`\`

### 4. Hot Reload (if supported)
Some changes can be hot-reloaded without restarting Minecraft.

---

## Testing

### Run All Tests
\`\`\`bash
./gradlew test
\`\`\`

### Run Specific Test Class
\`\`\`bash
./gradlew test --tests SpellSystemTest
\`\`\`

### View Test Report
Open `build/reports/tests/test/index.html` in a browser.

---

## Common Tasks

### Update Dependencies
Edit `gradle.properties` and run:
\`\`\`bash
./gradlew --refresh-dependencies
\`\`\`

### Generate Javadoc
\`\`\`bash
./gradlew javadoc
\`\`\`
Output: `build/docs/javadoc/`

### Publish to Maven Local
\`\`\`bash
./gradlew publishToMavenLocal
\`\`\`

### View Project Info
\`\`\`bash
./gradlew projectInfo
\`\`\`

---

## Troubleshooting

### "Could not find fabric-loader"
Run: `./gradlew --refresh-dependencies`

### "Minecraft sources not found"
Run: `./gradlew genSources`

### Build Cache Issues
Run: `./gradlew clean --refresh-dependencies build`

### IDE Sync Issues
- **IntelliJ**: File → Invalidate Caches → Restart
- **VS Code**: Reload window (Ctrl+Shift+P → Reload Window)

---

## Performance Optimization

### Increase Gradle Memory
Edit `gradle.properties`:
\`\`\`properties
org.gradle.jvmargs=-Xmx6G -XX:+UseG1GC
\`\`\`

### Enable Parallel Builds
Already enabled in `gradle.properties`:
\`\`\`properties
org.gradle.parallel=true
org.gradle.caching=true
\`\`\`

---

## Debugging

### Client Debugging
1. Run `./gradlew runClient --debug-jvm`
2. Attach debugger to port **5005**

### IntelliJ Debugging
Use the generated "Minecraft Client" run configuration with debugging enabled.

---

## Publishing

### Modrinth
1. Build the mod: `./gradlew build`
2. Upload `build/libs/mam-1.0.0.jar` to [Modrinth](https://modrinth.com/)

### CurseForge
1. Build the mod
2. Upload to [CurseForge](https://www.curseforge.com/)

### GitHub Releases
\`\`\`bash
git tag v1.0.0
git push origin v1.0.0
\`\`\`
Then create a release on GitHub.

---

**Need Help?** Open an issue on GitHub!
