package org.example.pages;

import org.openqa.selenium.By;
//Just For GitHub
public class LoginPage extends BasePage{
    private final By userName  = By.id("user-name") ;
    private final By passWord = By.id("password");
    private final By button  = By.id("login-button");
    private final By errorMessage  = By.cssSelector("#login_button_container h3");



    public  void setUserName( String text){
        set(userName, text);
    }
    public  void setPassWord( String text){
        set(passWord, text);
    }
    public  ProductPage clickButton(){
        click(button);
        return new ProductPage();
    }
    public String getErrorMsg(){

        return find(errorMessage).getText();

    }

    public ProductPage logInApplication(String username , String password){
        setUserName(username);
        setPassWord(password);
        return clickButton();
    }

}
