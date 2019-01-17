package com.abraham.automation.vehicles.features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.CoreMatchers.containsString;

public class VehicleSteps {

    @Given("^Juan wants to purchase a vehicle$")
    public void juan_wants_to_purchase_a_vehicle() throws Throwable {
        given()
                .contentType("application/json");
    }

    @When("^he looks the available vehicles$")
    public void he_looks_the_available_vehicles() throws Throwable {
        when()
                .get("http://localhost:3000/vehiculos");
    }

    @Then("^he must see which vehicles are available$")
    public void he_must_see_which_vehicles_are_available() throws Throwable {
        then().statusCode(200)
                .body(containsString("audi"));
    }

}
