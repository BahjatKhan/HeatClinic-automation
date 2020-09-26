package com.shiftedtech.repository.manager;

import com.shiftedtech.repository.serviceRequirementSpecification.IObjectRepository;
import org.openqa.selenium.By;

public abstract class ObjectRepository implements IObjectRepository {

    public abstract void load(String... fileNames);
    public abstract void reset();

    public By getLocator(String key){
        By by = null;

        String locatorBy = getLocatorType(key);
        String locator = getLocatorString(key);

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

    protected abstract String get(String key);
    protected abstract String getLocatorType(String key);
    protected abstract String getLocatorString(String key);

}
