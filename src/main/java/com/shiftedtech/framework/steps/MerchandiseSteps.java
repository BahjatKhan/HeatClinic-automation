package com.shiftedtech.framework.steps;

import io.cucumber.java8.En;
import org.apache.poi.ss.usermodel.PrintCellComments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class MerchandiseSteps extends StepBase implements En {


    public MerchandiseSteps(){

        When("user mouse hover on merchandise button", () -> {
            Actions act= new Actions(driver());
            WebElement element =driver().findElement(By.xpath("//span[text()='Merchandise']"));
            act.moveToElement(element).perform();
        });
        Then("user can able to see men's product page", () -> {
                WebElement element= driver().findElement(By.xpath("/div[@id='content']//h1[1]"));
                String actualMessage= element.getText();
            try {
                assertThat(actualMessage, equalTo("hey"));
            } catch (AssertionError er) {
                System.out.println("Assertion failed for mens product page");
                System.out.println("Actual assertion is : "+ actualMessage);
            }
        });
        When("user able to click on Hawt Like a Habanero Shirt \\(Men's) t-shirt button", () -> {
            driver().findElement(By.xpath("//a[contains(@href,'/merchandise')]/img[contains(@alt,'Hawt')]")).click();
        });
        Then("Habanero Shirt \\(Men's) page should display", () -> {
                String actual=driver().getTitle();
                String expected="Broadleaf Commerce Demo Store - Heat Clinic - Hawt Like a Habanero Shirt (Men's)";
                try{
                assertThat(actual,is(equalToIgnoringCase(expected)));
                } catch (AssertionError ex){
                    System.out.println("Habanero shirt page is not valid !");
                    System.out.println("The actual page shown is :"+actual);
                }
        });
        When("user able to click Heat Clinic Hand-Drawn \\(Men's) t-shirt button", () -> {
                driver().findElement(By.xpath("//*[@id=\"products\"]/li[2]/div[1]/a/img")).click();
        });
        Then("Heat Clinic Hand-Drawn \\(Men's) page should display", () -> {
            ////h2[contains(text(),'Heat')]
            WebElement element=driver().findElement(By.xpath("//h2[contains(text(),'Heat')]"));
            String actual=element.getText();
            String expected="Heat Clinic Hand-Drawn (Men's)";
            try{
                assertThat(actual,is(equalToIgnoringCase(expected)));
            } catch (AssertionError ex){
                System.out.println("Heat Clinic Hand-drawn shirt page is not valid !");
                System.out.println("The actual page shown is :"+actual);
            }
        });

        When("user click Heat Clinic Mascot \\(Men's) product", () -> {
            driver().findElement(By.xpath("(//img[contains(@alt,'Heat')])[2]")).click();
        });
        Then("Heat Clinic Mascot \\(Men's) page should display", () -> {
            ////h2[contains(text(),'Heat')]
            WebElement element=driver().findElement(By.xpath("//h2[contains(text(),'Heat')]"));
            String actual=element.getText();
            String expected="Heat Clinic Mascot (Men's)";
            try{
                assertThat(actual,is(equalToIgnoringCase(expected)));
            } catch (AssertionError ex){
                System.out.println("Heat Clinic Mascot page is not valid !");
                System.out.println("The actual page shown is :"+actual);
            }
        });
        Then("merchandise page should display", () -> {
            String actualTitle=driver().getTitle();
            String expectedTitle="Broadleaf Commerce Demo Store - Heat Clinic - Mens";
            try {
                assertThat(actualTitle,is(equalToIgnoringCase(expectedTitle)));
            } catch (AssertionError er) {
                System.out.println("Incorrect Page title for merchandise page");
                System.out.println("Actual Assertion :"+ actualTitle);
            }
        });
        When("user can click on men feature button", () ->
        {//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Mens'])")));
            driver().findElement(By.xpath("//a[@href='/mens']")).click();
        });

        Then("^on the product picture price \"([^\"]*)\" for Hawt Like a" +
                " Habanero Shirt \\(Men's\\) product would be visible for user$",Price-> {
            WebElement element=driver().findElement(By.xpath("//div[contains(text(),'$14.99')]"));
            String actual=element.getText();
            try{
                assertThat(actual,is(equalToIgnoringCase((String) Price)));
            } catch (AssertionError ex){
                System.out.println("Habanero shirt product price is not valid !");
                System.out.println("The actual price shown is :"+actual);
            }

        });
        And("^on the product picture price \"([^\"]*)\" for Heat Clinic" +
                " Hand-Drawn \\(Men's\\) product would be visible for user$", Price -> {
            WebElement element=driver().findElement(By.xpath("//div[contains(text(),'$15.99')]"));
            String actual=element.getText();
            try{
                assertThat(actual,is(equalToIgnoringCase((String) Price)));
            } catch (AssertionError ex){
                System.out.println("Hand-Drawn product price is not valid !");
                System.out.println("The actual price  is :"+actual);
            }

        });
        And("^on the product picture price \"([^\"]*)\" for Heat Clinic " +
                "Mascot \\(Men's\\) product would be visible for user$", Price -> {
            WebElement element=driver().findElement(By.xpath("//div[contains(text(),'$15.99')]"));
            String actual=element.getText();
            try{
                assertThat(actual,is(equalToIgnoringCase((String) Price)));
            } catch (AssertionError ex){
                System.out.println("Heat Clinic Mascot price is not valid !");
                System.out.println("The actual price is :"+actual);
            }
        });
        Then("^user can select Red color$", () -> {
            driver().findElement(By.xpath("//a[contains(text(),'Red')]")).click();
        });
        And("^Shirt color will be red$", () -> {
            //span[contains(text(),'Red')]
            WebElement element=driver().findElement(By.xpath("//span[contains(text(),'Red')]"));
            String actual=element.getText();
            try{
                assertThat(actual,is(equalToIgnoringCase("Red")));
            } catch (AssertionError ex){
                System.out.println("Red color is not valid !");
                System.out.println("The actual color is :"+actual);
            }
        });
        And("^Red color t-shirt will display$", () -> {
            //img[@id='main_image']
            WebElement element=driver().findElement(By.xpath("//img[@id='main_image']"));
            String actual=element.getText();
            try{
                assertThat(actual,is(equalToIgnoringCase("Red")));
            } catch (AssertionError ex){
                System.out.println("Red color t-shirt is not valid !");
                System.out.println("The actual color is :"+actual);
            }
        });
        Then("^user can select Black color$", () -> {
            driver().findElement(By.xpath("//a[contains(text(),'Black')]")).click();
        });
        And("^Shirt color will be Black$", () -> {
            WebElement element=driver().findElement(By.xpath("//span[contains(text(),'Black')]"));
            String actual=element.getText();
            try{
                assertThat(actual,is(equalToIgnoringCase("Black")));
            } catch (AssertionError ex){
                System.out.println("Black color is not valid !");
                System.out.println("The actual color is :"+actual);
            }
        });
        And("^Black color t-shirt will display$", () -> {
            WebElement element=driver().findElement(By.xpath("//img[@src='/cmsstatic/img/merch/habanero_mens_black.jpg?browse']"));
            String actual=element.getText();
            try{
                assertThat(actual,is(equalToIgnoringCase("Black")));
            } catch (AssertionError ex){
                System.out.println("Black color t-shirt is not valid !");
                System.out.println("The actual color is :"+actual);
            }
        });
        When("^user able to click all the following \"([^\"]*)\"$", tshirtColors -> {


            if(tshirtColors.equals("Black")){
                //a[@data-tags='Black']
                driver().findElement(By.xpath("//a[@data-tags='Black']")).click();
                delay(5000);
                WebElement element=driver().findElement(By.xpath("//a[@data-tags='Black']"));
                String actual=element.getText();
                try{
                    assertThat(actual,is(equalToIgnoringCase("Black")));
                } catch (AssertionError ex){
                    System.out.println("Black color t-shirt is not valid !");
                    System.out.println("The actual color is :"+actual);
                }
            }else if(tshirtColors.equals("Red")){
                driver().findElement(By.xpath("//a[@data-tags='Red']")).click();
                delay(5000);
                WebElement element=driver().findElement(By.xpath("//a[@data-tags='Red']"));
                String actual=element.getText();
                try{
                    assertThat(actual,is(equalToIgnoringCase("Red")));
                } catch (AssertionError ex){
                    System.out.println("Red color t-shirt is not valid !");
                    System.out.println("The actual color is :"+actual);
                }
            }else if(tshirtColors.equals("Silver")){
                driver().findElement(By.xpath("//a[@data-tags='Silver']")).click();
                delay(5000);
                WebElement element=driver().findElement(By.xpath("//a[@data-tags='Silver']"));
                String actual=element.getText();
                try{
                    assertThat(actual,is(equalToIgnoringCase("Silver")));
                } catch (AssertionError ex){
                    System.out.println("Silver color t-shirt is not valid !");
                    System.out.println("The actual color is :"+actual);
                }
            }
        });
        When("^Shirt size will display while user clicks following \"([^\"]*)\"$", Sizes -> {
            if(Sizes.equals("S")){
                //a[@data-tags='Black']
                driver().findElement(By.xpath("//a[text()='S']")).click();
                delay(5000);
                WebElement element=driver().findElement(By.xpath("//span[text()='S']"));
                String actual=element.getText();
                try{
                    assertThat(actual,is(equalToIgnoringCase("S")));
                } catch (AssertionError ex){
                    System.out.println("S size is not valid !");
                    System.out.println("The actual size is :"+actual);
                }
            }else if(Sizes.equals("M")){
                driver().findElement(By.xpath("//a[text()='M']")).click();
                delay(5000);
                WebElement element=driver().findElement(By.xpath("//span[text()='M']"));
                String actual=element.getText();
                try{
                    assertThat(actual,is(equalToIgnoringCase("M")));
                } catch (AssertionError ex){
                    System.out.println("M size is not valid !");
                    System.out.println("The actual size is :"+actual);
                }
            }else if(Sizes.equals("L")){
                driver().findElement(By.xpath("//a[text()='L']")).click();
                delay(5000);
                WebElement element=driver().findElement(By.xpath("//span[text()='L']"));
                String actual=element.getText();
                try{
                    assertThat(actual,is(equalToIgnoringCase("L")));
                } catch (AssertionError ex){
                    System.out.println("L size is not valid !");
                    System.out.println("The actual size is :"+actual);
                }
            }else if(Sizes.equals("XL")){
                driver().findElement(By.xpath("//a[text()='XL']")).click();
                delay(5000);
                WebElement element=driver().findElement(By.xpath("//span[text()='XL']"));
                String actual=element.getText();
                try{
                    assertThat(actual,is(equalToIgnoringCase("XL")));
                } catch (AssertionError ex){
                    System.out.println("XL size is not valid !");
                    System.out.println("The actual size is :"+actual);
                }
            }
        });
        And("^user can view the description for Habanero Shirt product$", () -> {
            WebElement element=driver().findElement(By.xpath("//div[@id='description']"));
            String actual=element.getText();
            String expectedDescription="Men's Habanero collection standard short sleeve screen-printed tee" +
                    " shirt in soft 30 singles cotton in regular fit.";
            try{
                assertThat(actual,is(equalToIgnoringCase(expectedDescription)));
            } catch (AssertionError ex){
                System.out.println("Description is not matching !");
                System.out.println("The actual description is :"+actual);
            }
        });
        // (//span[contains(text(),'All')])[1]
        When("user click on buy now product", () -> {
            driver().findElement(By.xpath("(//input[@value='Buy Now!'])[1]")).click();
        });

        When("cannot proceed for checkout page", () -> {
            WebElement element=driver().findElement(By.xpath("(//span[contains(text(),'All options are required')])[1]"));
            String actual=element.getText();
            String expectedDescription="";
            try{
                assertThat(actual,is(equalToIgnoringCase(expectedDescription)));
            } catch (AssertionError ex){
                System.out.println("Error message is not matching !");
                System.out.println("The actual error message is :"+actual);
            }
        });
        Then("^user can view price tag on the product page$", () -> {
            WebElement element=driver().findElement(By.xpath("//div[text()='$14.99']"));
            String actual=element.getText();
            String expectedDescription="$14.99";
            try{
                assertThat(actual,is(equalToIgnoringCase(expectedDescription)));
            } catch (AssertionError ex){
                System.out.println("Product price is not matching !");
                System.out.println("The actual price is :"+actual);
            }
        });

        Then("^Product title \"([^\"]*)\" should display on product page$", ProductTitle -> {
            WebElement element=driver().findElement(By.xpath("//h2[contains(text(),'Hawt')]"));
            String actual=element.getText();
            try {
                assertThat(actual,is(equalToIgnoringCase((String) ProductTitle)));
            } catch (AssertionError ex){
                System.out.println("Product title is not matching !");
                System.out.println("The actual title is :"+actual);
            }
        });

    }
}
