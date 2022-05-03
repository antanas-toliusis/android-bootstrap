## Android Bootstrap

![Language](https://img.shields.io/github/languages/top/cortinico/kotlin-android-template?color=blue&logo=kotlin)

- [Project Structure](#project-structure)

- [Terminal Commands](#terminal-commands)

- [Navigation](#navigation)

- [Modules Graph](#modules-graph)

- [LIBRARIES API_Changethis](#libraries-api_changethis)

### Project Structure

```
./gradlew -q project

+--- Project ':app'
+--- Project ':features'
|    +--- Project ':features:launch'
|    \--- Project ':features:main'
\--- Project ':libraries'
     +--- Project ':libraries:core'
     \--- Project ':libraries:remote'
```

***IMPORTANT: After cloning the project, refactor a package name in :app's manifest file and
packages.***

### Terminal Commands

```
./gradlew -q project
./gradlew projectDependencyGraph (Results will be stored in build/reports)
./gradlew dependencyUpdates (Ben Manes plugin)
```

### Navigation

- Navigation between modules is done using ```"com.gaelmarhic.quadrant"``` plugin

- Navigation inside the module is using Architecture Components

### Modules Graph

![Result](https://i.pinimg.com/originals/8f/0c/bb/8f0cbbbfeb6cce4ad104406af6951589.png)

### LIBRARIES API_Changethis

**After importing the module**, expose it to the **:app module** (So it can include NetworkModule to
the dependency graph) from your **feature's build.gradle:**

For instance:

```
android-template/features/uidemos/build.gradle.kts

dependencies {
    api(project(LIB_API_CHANGETHIS))
}
```