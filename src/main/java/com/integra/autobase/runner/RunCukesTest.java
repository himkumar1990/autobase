package com.integra.autobase.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(

        features = "src/resources/features", plugin = { "json:target/cucumber-json/cukes.json" }, glue = { "com.integra.autobase.glue" }, tags = {
                "@autotest-1" }

)

public class RunCukesTest extends ProjectCucumberRunner {

}
