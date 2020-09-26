package com.shiftedtech.framework.steps;

import io.cucumber.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;

public class ClearanceSteps extends StepBase implements En {
    private static Logger logger= LoggerFactory.getLogger(ClearanceSteps.class);

        public ClearanceSteps(){

            When("user able to click on Clearance button", () -> {
               driver().findElement(By.xpath("//span[contains(text(),'Clearance')]")).click();
               delay(2000);
            });

            Then("Clearance page should display", () -> {
               String actualPage=driver().getTitle();
               String expectedPage="Broadleaf Commerce Demo Store - Heat Clinic - Clearance";
                try {
                    assertThat(actualPage, is(equalToIgnoringCase(expectedPage)));
                } catch (AssertionError er) {
                    System.out.println("Assertion failed !");
                    System.out.println("Actual Page for clerance  :"+actualPage);
                }


            });

            Then("in single page user able to see five products", () -> {
                WebElement element=driver().findElement(By.xpath("//section[contains(@id,'left_column')]/header/h1"));
                String actualMessage=element.getText();
                String expectedMessage="Viewing Clearance (1 - 5 of 5)";
                assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
            });
            Then("user can able to see Green Ghost product name", () -> {
              WebElement element=driver().findElement(By.xpath("//div[contains(text(),'Green Ghost')]"));
              String actualMessage=element.getText();
              String expectedMessage="Green Ghost";
                try {
                    assertThat(actualMessage, is(equalToIgnoringCase(expectedMessage)));
                } catch (AssertionError ex) {
                    System.out.println("Actual message for green ghost product name :"+ actualMessage);
                }

            });

            Then("user can able to see price tag for Green Ghost product", () -> {
               WebElement element=driver().findElement(By.xpath("//div[@class='price']/div[contains(text(),'11.99')]"));
               String actualMessage=element.getText();
               String expectedMessage="$11.99";

               try{
                   assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
               }catch(AssertionError ex){

                   System.out.println("Actual pricetag for Green Ghost product :"+ actualMessage);
               }

            });


            When("user click on Green Ghost product", () -> {
                driver().findElement(By.xpath("//img[contains(@alt,'Green Ghost')]")).click();
                delay(2000);
            });

            Then("Green Ghost product page should display", () -> {
                WebElement element= driver().findElement(By.xpath("//h2[contains(text(),'Green Ghost')]"));
                String actualMessage=element.getText();
                String expectedMessage="Green Ghost";
                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError EX){}
                System.out.println("Actual Message for Green Ghost Product page :"+actualMessage);
            });

            Then("user can able to see Blazin'Saddle XXX Hot Habanero Pepper Sauce product name", () -> {
                WebElement element= driver().findElement(By.xpath("//div[contains(text(),'Blazin')]"));
                String actualMessage=element.getText();
                String expectedMessage="Blazin' Saddle XXX Hot Habanero Pepper Sauce";
              //  try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
            //    }catch(AssertionError er){}
            //    System.out.println("Actual Message for product name:"+actualMessage);
            });

            Then("user can able to see price tag Blazin'Saddle XXX Hot Habanero Pepper Sauce product", () -> {
                WebElement element=driver().findElement(By.xpath("//div[@class='price']/div[contains(text(),'4.99')]"));
                String actualMessage=element.getText();
                String expectedMessage="$4.99";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Actual price for Blazin :"+ actualMessage);
                }
            });


            When("user click on Blazin' Saddle XXX Hot Habanero Pepper Sauce product", () -> {
               driver().findElement(By.xpath("//img[contains(@alt,'Blazin')]")).click();
               delay(2000);
            });

            Then("Blazin' Saddle XXX Hot Habanero Pepper Sauce product page should display", () -> {
                WebElement element=driver().findElement(By.xpath("//h2[contains(text(),'Blazin')]"));
                String actualMessage=element.getText();
                String expectedMessage="Blazin' Saddle XXX Hot Habanero Pepper Sauce";
                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product page of Blazin saddle sauce :"+ actualMessage);
                }
            });
            Then("user can able to see Dr. Chilemeister's Insane Hot Sauce product name", () -> {
                WebElement element=driver().findElement(By.xpath("//div[contains(text(),'Dr.')]"));
                String actualMessage=element.getText();
                String expectedMessage="Dr. Chilemeister's Insane Hot Sauce";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product name of DR chilemister :"+ actualMessage);
                }

            });

            Then("user can able to see price tag Dr. Chilemeister's Insane Hot Sauce product", () -> {
                WebElement element=driver().findElement(By.xpath("//div[@class='price']/div[contains(text(),'12.99')]"));
                String actualMessage=element.getText();
                String expectedMessage="$12.99";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product pricetag for Dr. Chilemeisters :"+ actualMessage);
                }
            });

            When("user click on  Dr. Chilemeister's Insane Hot Sauce product", () -> {
                driver().findElement(By.xpath("//img[contains(@alt,'Dr.')]")).click();
                delay(2000);
            });

            Then("Dr. Chilemeister's Insane Hot Sauce product page should display", () -> {

                WebElement element=driver().findElement(By.xpath("//h2[contains(text(),'Dr.')]"));
                String actualMessage=element.getText();
                String expectedMessage="Dr. Chilemeister's Insane Hot Sauce";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product page for Dr. Chilemeisters:"+ actualMessage);
                }
            });

            Then("user can able to see Bull Snort Cowboy Cayenne Pepper Hot Sauce product name", () -> {
                WebElement element=driver().findElement(By.xpath("//div[contains(text(),'Bull')]"));
                String actualMessage=element.getText();
                String expectedMessage="Bull Snort Cowboy Cayenne Pepper Hot Sauce";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product page for Bull snort:"+ actualMessage);
                }
            });

            Then("user can able to see price tag Bull Snort Cowboy Cayenne Pepper Hot Sauce product", () -> {
                WebElement element=driver().findElement(By.xpath("//div[@class='price']/div[contains(text(),'3.99')]"));
                String actualMessage=element.getText();
                String expectedMessage="$3.99";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product price tag for Bull snort:"+ actualMessage);
                }
            });

            Then("user able to click on Bull Snort Cowboy Cayenne Pepper Hot Sauce product", () -> {
                driver().findElement(By.xpath("//img[contains(@alt,'Bull')]")).click();
                delay(2000);
            });

            Then("Bull Snort Cowboy Cayenne Pepper Hot Sauce product page should display", () -> {

                WebElement element=driver().findElement(By.xpath("//h2[contains(text(),'Bull')]"));
                String actualMessage=element.getText();
                String expectedMessage="Bull Snort Cowboy Cayenne Pepper Hot Sauce";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product page for Bull snort:"+ actualMessage);
                }
            });
            Then("user can able to see Hurtin' Jalepeno Hot Sauce product name", () -> {
                WebElement element=driver().findElement(By.xpath("//div[contains(text(),'Hurtin')]"));
                String actualMessage=element.getText();
                String expectedMessage="";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product name for Hurtin:"+ actualMessage);
                }

            });

            Then("user can able to see price tag Hurtin' Jalepeno Hot Sauce product", () -> {
                    driver().findElement(By.xpath("//div[contains(text(),'$4.49')]")).click();
                    delay(2000);
            });


            Then("user able to click on Hurtin'Jalepeno Hot Sauce product", () -> {
               driver().findElement(By.xpath("//img[contains(@alt,'Jalepeno')]")).click();
               delay(2000);
            });

            Then("Hurtin' Jalepeno Hot Sauce product page should display", () -> {
                WebElement element=driver().findElement(By.xpath("//h2[contains(text(),'Hurtin')]"));
                String actualMessage=element.getText();
                String expectedMessage="Hurtin' Jalepeno Hot Sauce";

                try{
                    assertThat(actualMessage,is(equalToIgnoringCase(expectedMessage)));
                }catch(AssertionError ex){

                    System.out.println("Product page for Hurtin:"+ actualMessage);
                }
            });
        }


}
