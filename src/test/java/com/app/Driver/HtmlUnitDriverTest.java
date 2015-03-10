package com.app.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by jtao on 3/10/15.
 */
//优点：HtmlUnitDriver不会实际打开浏览器，运行速度很快。
//缺点：HtmlUnitDriver对JavaScript的支持不够好，当页面上有复杂JavaScript时，经常会捕获不到页面元素。

public class HtmlUnitDriverTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        this.driver = new HtmlUnitDriver();
    }

    @Test
    public void webDriver() throws Exception {
        driver.get("https://www.baidu.com/?tn=63090008_1_hao_pg");
        WebElement search = driver.findElement(By.id("kw"));
        search.sendKeys("selenium");
        WebElement submit = driver.findElement(By.id("su"));
        submit.click();
        System.out.println("页面标题：" + driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
