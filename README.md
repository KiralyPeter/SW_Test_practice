# Practice for software test exam
## 2023-05-22

__Necessary libraries:__

* [Junit 5, Jupiter API 5.9.2](https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.9.2/junit-jupiter-api-5.9.2.jar)\
* [Junit 5, Platform Console API 5.9.2](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.2/junit-platform-console-standalone-1.9.2.jar)

Put them in a Library directory and add them in Java projects / Referenced Libraries...\
And check settings.json:

```json

{
    "java.project.sourcePaths": ["src", "test"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/**/*.jar",       
        "/home/peter/Dev/Java_Library/junit-jupiter-api-5.9.2.jar",
        "/home/peter/Dev/Java_Library/junit-platform-console-standalone-1.9.2.jar"
    ]
}

```