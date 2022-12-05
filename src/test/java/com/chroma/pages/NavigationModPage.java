package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.chroma.web.WebDriverUtils;

/**
 * use below mothod Dynamic Xpath for module
 */

public class NavigationModPage {
    public static WebElement dynamicModule(String module) {

        return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + module + "')]"));

    }

}
