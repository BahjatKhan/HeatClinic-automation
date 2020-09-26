package com.shiftedtech.framework.keyWordDriven;

import org.openqa.selenium.By;

public class KeyWordDrivenLine {



   private String step;
   private String description;
   private String action;
   private String locator;
   private String locatorType;
   private String data;

    public KeyWordDrivenLine(String [] line) {
        this(line[0],line[1],line[2],line[3],line[4],line[5]);
    }
    public KeyWordDrivenLine(String step, String description, String action, String locator, String locatorType, String data) {
        this.step = step;
        this.description = description;
        this.action = action;
        this.locator = locator;
        this.locatorType = locatorType;
        this.data = data;
    }



    public String getStep() {
        return step;
    }

    public String getDescription() {
        return description;
    }

    public String getAction() {
        return action;
    }

    public String getLocator() {
        return locator;
    }

    public String getLocatorType() {
        return locatorType;
    }

    public String[] getData(){
        String[] parts=null;
        if(this.data!=null){
            parts=this.data.split("\\|");
        }
        return parts;
    }
    public By getByLocator(){
        return getLocatorBy(this.locatorType,this.locator);
    }

    private By getLocatorBy(String locatorBy,String locator){
        By by = null;

        if(locatorBy != null && locator != null) {
            if (locatorBy.equalsIgnoreCase("LINK_TEXT")) {
                by = By.linkText(locator);
            } else if (locatorBy.equalsIgnoreCase("PARTIAL_LINK_TEXT")) {
                by = By.partialLinkText(locator);
            } else if (locatorBy.equalsIgnoreCase("ID")) {
                by = By.id(locator);
            } else if (locatorBy.equalsIgnoreCase("NAME")) {
                by = By.name(locator);
            } else if (locatorBy.equalsIgnoreCase("CSS")) {
                by = By.cssSelector(locator);
            } else if (locatorBy.equalsIgnoreCase("TAG_NAME")) {
                by = By.tagName(locator);
            } else if (locatorBy.equalsIgnoreCase("XPATH")) {
                by = By.xpath(locator);
            } else if (locatorBy.equalsIgnoreCase("CLASS_NAME")) {
                by = By.className(locator);
            }
        }
        return  by;
    }


    @Override
    public String toString() {
        return "KeyWordDrivenLine{" +
                "step='" + step + '\'' +
                ", description='" + description + '\'' +
                ", action='" + action + '\'' +
                ", locator='" + locator + '\'' +
                ", locatorType='" + locatorType + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

}
