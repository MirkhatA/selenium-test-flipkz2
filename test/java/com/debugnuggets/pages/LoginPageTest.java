package com.debugnuggets.pages;

import com.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        LoginPage loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginTest() {
        homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }

}
