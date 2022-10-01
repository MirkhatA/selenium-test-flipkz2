package com.pages;

import com.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    private WebDriver webDriver = new ChromeDriver();;

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(id = "enter_button")
    WebElement loginBtn;

    @FindBy(id = "to-recovery-password")
    WebElement forgotPassBtn;

    public LoginPage() {
        PageFactory.initElements(webDriver, this);
    }

   public HomePage login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();

        return new HomePage();
   }

}
