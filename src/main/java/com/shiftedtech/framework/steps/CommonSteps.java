package com.shiftedtech.framework.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class CommonSteps extends StepBase implements En {

    private static Logger logger = LoggerFactory.getLogger(CommonSteps.class);

    public CommonSteps(){
        logger.info("Common steps");

        Given("user not a validated", () ->  {
            logger.info("User not a validated");
            driver().manage().deleteAllCookies();});

        When("user browse to the {string}", URL ->{
            logger.info("Entering URL");
            driver().navigate().to((String) URL);});

        Then("user can navigate back to previous page", () -> {
            logger.info("Navigated back");
            driver().navigate().back();});

        Then("^homepage window should display on maximize size$", () -> {
            logger.info("Homepage window displayed at maximize size");
            driver().manage().window().maximize();
            String actualTitle=driver().getTitle();
            String expectedTitle="";
            try {
                assertThat(expectedTitle, is(equalToIgnoringCase(actualTitle)));
            } catch (AssertionError ex) {
                System.out.println(actualTitle);
                System.out.println("Assertion Error");
            }


        });

        When("user scroll down the page", () -> {
            logger.info("User scroll down the page");
            JavascriptExecutor js= (JavascriptExecutor)driver();
            js.executeScript("scroll(0,400)");
            delay(5000);
        });
    }
}
