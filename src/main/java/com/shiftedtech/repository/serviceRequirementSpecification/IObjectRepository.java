package com.shiftedtech.repository.serviceRequirementSpecification;

import org.openqa.selenium.By;

public interface IObjectRepository {
    void load(String... fileNames);
    void reset();
    By getLocator(String key);

}
