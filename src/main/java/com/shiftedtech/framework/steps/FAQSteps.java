package com.shiftedtech.framework.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

public class FAQSteps extends StepBase implements En {

    public FAQSteps(){

        Then("user can able to click on faq button", () -> {
        driver().findElement(By.xpath("//a[@href='/faq']")).click();
        });

        When("user click on click here button", () -> {
            driver().findElement(By.xpath("//a[text()='Click Here']")).click();
        });

        Then("user redirect to broadleafCommerce website", () -> {

        });



    }


}
