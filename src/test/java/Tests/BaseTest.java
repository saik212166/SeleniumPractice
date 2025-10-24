package Tests;

import org.example.pages.BasePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;
    BasePage basePage;
    LoginPage loginPage;
    String url = "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage =  new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();


    }
    @AfterClass
    public void tearDown(){

        driver.quit();
    }

}
