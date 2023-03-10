package org.ndviet.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.ndviet.definitions",
        plugin = {"pretty", "html:target/feature-SearchFlights-report.html"}
)

public class SearchFlightsTestRunner extends AbstractTestNGCucumberTests {
}