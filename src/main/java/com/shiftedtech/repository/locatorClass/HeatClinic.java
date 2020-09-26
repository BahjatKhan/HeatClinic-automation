package com.shiftedtech.repository.locatorClass;

import org.openqa.selenium.By;

public class HeatClinic {



    public static class LoginPage{

        public static final By Email_TextBox=By.xpath("//input[contains(@type,'email')]");
        public static final By Password_TextBox=By.xpath("//input[contains(@type,'password')]");
        public static final By Verify_LoginPage=By.xpath("//h3/span[text()='Login to Your Account']");
        public static final By ClickOn_Button=By.xpath("(//input[contains(@type,'submit')])[2]");
        public static final By Verify_MemberSignInFormText=By.xpath("//span[contains(text(),'Already a member? Sign in using the form below')]");
      //  public static final By
    }





}
