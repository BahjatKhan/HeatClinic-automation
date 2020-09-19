package com.shiftedtech.script.keywordDriven;

import com.shiftedtech.framework.keyWordDriven.KWScriptBase;
import com.shiftedtech.framework.keyWordDriven.KeyWordDrivenLine;
import com.shiftedtech.utils.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;


public class Spree extends KWScriptBase {

    @Test
    public void test1(){
      setKeywordFile("keywordScriptValue.xlsx");
      getKeywordFile();
    }









}
