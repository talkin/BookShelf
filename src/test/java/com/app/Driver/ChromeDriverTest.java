package com.app.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jtao on 3/10/15.
 */
public class ChromeDriverTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        this.driver = new ChromeDriver();
    }

    @Test
    public void ChromeDriverTest() throws Exception {
        driver.get("http://localhost:8080/BookShelf");
        WebElement search = driver.findElement(By.id("kw"));
        search.sendKeys("selenium");
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.id("su"));
        submit.click();
        Thread.sleep(1000);
        System.out.println("页面标题：" + driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
