package com.shiftedtech.script.TestNG;

import org.testng.annotations.*;

public class BaseScriptTestNG {

    @BeforeClass
    public void beforeAll(){
        System.out.println("Before class");
    }


   @BeforeMethod
   public void setUp(){
       System.out.println("Before Method");
   }

   @Test
   public void testOne(){
       System.out.println("Test");
   }
   @Test
   public void testTwo(){
       System.out.println("Tes");
   }


   @AfterMethod
    public void tearDown(){
       System.out.println("After Method");
   }

   @AfterClass
    public void afterAll(){
       System.out.println("After Class");
   }


}
