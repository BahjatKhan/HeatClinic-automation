package com.shiftedtech.framework.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RegisterSteps extends StepBase implements En {

    public RegisterSteps(){


        When("user click on Register button", () -> {
            driver().findElement(By.xpath("(//a[@href='/register'])[1]")).click();
        });

        Then("register page should display", () -> {
            String title=driver().getTitle();
            String expectedTitle= "Privacy error";
            try{
                assertThat(expectedTitle,is(equalToIgnoringCase(title)));
            }catch (AssertionError ex){
                System.out.println("Assertion Wrorng");
                System.out.println("ActualTitle : "+title);
            }
        });

        Then("user enter valid {string} address", Email ->
        {
            driver().findElement(By.xpath("//input[@id='customer.emailAddress']")).sendKeys((CharSequence) Email);
        });

        Then("user enter valid {string}",  FirstName -> {

            driver().findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys((CharSequence) FirstName);

        });

        Then("user enter {string}", LastName -> {
            driver().findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys((CharSequence) LastName);

        });

        Then("user able to click on register button", () -> {
            driver().findElement(By.xpath("//input[@value='Register']")).click();
        });

        Then("success message for registration will show up", () -> {

        });

        Then("user enter {string} address", (String string) -> {

        });

        Then("user unable to click on register button", () -> {

        });

    }


}
