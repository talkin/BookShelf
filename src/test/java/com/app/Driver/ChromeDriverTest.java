package com.app.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
        WebElement addBook = driver.findElement(By.id("addBook"));
        addBook.click();
        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("柏油娃娃");
        WebElement authors = driver.findElement(By.id("authors"));
        authors.sendKeys("[美]托妮·莫里森");
        WebElement imagePath = driver.findElement(By.id("imagePath"));
        imagePath.sendKeys("http://img3.douban.com/spic/s27301840.jpg");
        WebElement isbn = driver.findElement(By.id("isbn"));
        isbn.sendKeys("12345667");
        WebElement price = driver.findElement(By.id("price"));
        price.sendKeys("11.2");
        Select select = new Select(driver.findElement(By.id("type")));
        select.selectByVisibleText("PaperBook");
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        Thread.sleep(1000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
