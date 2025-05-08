package com.cydeo.tests.week17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

public class Task2 {
//    ** TC002 As a user I should be able to see the password hidden as default
//
//     1- Open a Chrome browser
//     2- Go to "https://vytrack.com"
//     3- Click LOGIN button
//     4- Verify the password is hidden

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://vytrack.com/");

        WebElement loginBtn = driver.findElement(By.id("menu-item-849"));
        loginBtn.click();

        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='_password']"));
        String passwordTypeAttribute = passwordInput.getDomAttribute("type");

        if (Objects.equals(passwordTypeAttribute, "password")) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
        driver.quit();
    }
}
