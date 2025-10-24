package Tests;

import org.example.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
    ProductPage productPage = new ProductPage();
    @Test
    public void ProdTest(){
        productPage = loginPage.logInApplication("standard_user" , "secret_sauce");
        Assert.assertTrue(productPage.productHeadDisplayed(),"NOT HERE");
    }
}
