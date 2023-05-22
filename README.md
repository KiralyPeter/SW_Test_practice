# Practice for software test exam
## 2023-05-22

<u>Necessary libraries:</u>

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
Import in tets Classes

```java
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
```
Neccessary @'s:

```java
    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test
    public void testCalcBudyIndex1(){
        double actual = this.mainFrame.calcBodyIndex(100, 1.8);
        double expected = 30.86;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testCheckInputAlpha(){
        boolean actual = this.mainFrame.checkInput("a");        
        assertFalse(actual);        
    }

    @Test
    public void testCheckInputNumeric(){
        boolean actual = this.mainFrame.checkInput("55");        
        assertTrue(actual);        
    }



```