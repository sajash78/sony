package org.example.HomeClassPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {
    @FindBy(id = "searchBoxLabel")
    WebElement searchbox;
    @FindBy(id = "nav-search-input")
    WebElement search;

    public void games(){
    searchbox.click();
    search.sendKeys("play station");
    search.sendKeys(Keys.ENTER);
    }


}
