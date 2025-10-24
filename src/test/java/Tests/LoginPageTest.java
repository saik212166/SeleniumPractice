package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
    @Test
    public void LoginErrorMessage(){
        loginPage.setUserName("standard_user");
        loginPage.setPassWord("1234");
        loginPage.clickButton();
        String actualMsg = loginPage.getErrorMsg();
        Assert.assertTrue(actualMsg.contains("sadface"));

    }
}
