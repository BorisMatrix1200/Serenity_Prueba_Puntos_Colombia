package com.example.screenplay.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/tricount.feature",
        glue = {"com.example.screenplay.stepdefinitions"},
        plugin = {"pretty"}
)
public class TricountTestRunner {
}


//Comando para abrir la APP desde terminal con bash
// adb shell am start -n com.tribab.tricount.android/com.bunq.tricount.android.ui.activity.LoadingTricountStartupInfoActivity
//glue = {"com.example.screenplay.stepdefinitions", "com.example.screenplay.hooks"},

//Comando para vel el log de appium en CMD
//appium server

//COn este Hooks se abre la app antes de cada escenario
//com.example.screenplay.hooks