package com.example.screenplay.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/tricount.feature",
        glue = "com.example.screenplay.stepdefinitions",
        plugin = {"pretty"}
)
public class TricountTestRunner {
}
