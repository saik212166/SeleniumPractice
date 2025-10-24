package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;
    public void setDriver(WebDriver driver1){
        BasePage.driver = driver1;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }
    protected void set(By locator , String text){
        WebElement el = find(locator);
        el.clear();
        el.sendKeys(text);
    }
    protected void click(By locator){
        WebElement el =  find(locator);
        el.click();
    }
}
