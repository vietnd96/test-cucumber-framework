package org.ndviet.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = "src/test/resources/features",
        glue = "org.ndviet.definitions",
        plugin = {}
)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}