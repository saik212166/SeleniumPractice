package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage{
    private By productHead = By.xpath("//span[text() = 'Products']");
    public boolean productHeadDisplayed(){
        return find(productHead).isDisplayed();
    }
}
