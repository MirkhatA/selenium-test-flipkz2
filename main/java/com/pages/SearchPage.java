package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private static WebElement element = null;

    public static WebElement textboxSearch(WebDriver webDriver) {

        element = webDriver.findElement(By.name("search"));
        return element;

    }

    public static WebElement buttonSearch(WebDriver webDriver) {

        element = webDriver.findElement(By.xpath("//input[@value='Найти']"));
        return element;

    }

}
