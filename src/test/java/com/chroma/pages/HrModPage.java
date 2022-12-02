package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.chroma.web.WebDriverUtils;

public class HrModPage {

    /* below method used to dynamically locate a module */

    public static WebElement dynamicModule1(String module) {
        return WebDriverUtils.driver.findElement(By.xpath("(//a[normalize-space()='" + module +"'])[2]"));

    }
    public static WebElement dynamicModule2(String module){
        return WebDriverUtils.driver.findElement(By.xpath("(//a[normalize-space()='" + module + "'])[1]"));
    
}
}