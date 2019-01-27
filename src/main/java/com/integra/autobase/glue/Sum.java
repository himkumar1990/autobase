package com.integra.autobase.glue;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sum {
    int x, y;
    int result;

    @Given("^two numbers (\\d+) and (\\d+)$")
    public void two_numbers_and(int a, int b) throws Throwable {
        x = a;
        y = b;
    }

    @When("^the numbers are added$")
    public void the_numbers_are_added() throws Throwable {
        result = x + y;
    }

    @Then("^the sum should be (\\d+)$")
    public void the_sum_should_be(int c) throws Throwable {
        Assert.assertEquals(c, result);
    }

}
