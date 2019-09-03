package com.codecool.GlassDocumentation.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue={"cucumber","classpath/productAddingTests",}
        )
public class RunCucumberTest {
}
