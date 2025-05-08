package com.cydeo.tests.week17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

//```
//
//   TC001 As a user I should be able to log in with valid credentials
//
//     1- Open a Chrome browser
//     2- Go to "https://vytrack.com/"
//     3- Click LOGIN button
//     4- Login to application with username as "User1" and password as "UserUser123"
//     5- Verify the title contains "Dashboard"
//```
public class Task1 {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://vytrack.com/");

        WebElement loginBtn = driver.findElement(By.id("menu-item-849"));
        loginBtn.click();

        WebElement usernameInput = driver.findElement(By.name("_username"));
        usernameInput.sendKeys("User1");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='_password']"));
        passwordInput.sendKeys("UserUser123" + Keys.RETURN);

        Thread.sleep(3000);
        if (Objects.equals(driver.getTitle(),"Dashboard")) {
            System.out.println("Task case1 PASSED!");
        }else {
            System.out.println("Task case1 FAILED!");
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        driver.quit();
    }
}
