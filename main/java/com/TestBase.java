package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static WebDriver webDriver;
    public static Properties properties;

    private static void sleep(long second) {
        long milis = second * 1000;

        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };

    public TestBase() {
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("C:\\Mirkhat\\uni\\course3\\testing\\project\\selenium-test-flipkz\\selenium-test-flipkz\\src\\main\\java\\com\\config\\config.properties");
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void initialization() {
        String browserName = properties.getProperty("browser");
        String url = properties.getProperty("url");

//        if (browserName.equals("chrome")) {
//            System.setProperty("webdriver.chrome.driver","C:\\Mirkhat\\coding\\testing\\drivers\\chromedriver.exe");
//            webDriver = new ChromeDriver();
//        } else if (browserName.equals("fireFox")) {
//            System.setProperty("webdriver.chrome.driver","C:\\Mirkhat\\coding\\testing\\drivers\\geckodriver.exe");
//            webDriver = new FirefoxDriver();
//        }

//        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_LONG, TimeUnit.SECONDS);

        webDriver = new FirefoxDriver();
        webDriver.get(url);

        sleep(4);
    }
}
