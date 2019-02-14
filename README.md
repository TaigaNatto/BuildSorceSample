# BuildSorceSample
Gradle-Dependency-Management sample with buildSrc

# use
1. create `buildSrc` directory in project-root
2. create `build.gradle.kts` file in `buildSrc`
3. sync project
4. write it for `build.gradle.kts`
```
plugins {
    `kotlin-dsl`
}
```
5. create src/main/java directory in `buildSrc`
6. create Dependency-file in src/main/java !
