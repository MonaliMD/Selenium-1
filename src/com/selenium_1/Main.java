package com.selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/s?k=headset&ref=nb_sb_noss_2");

        //How to use Find Element command
        driver.findElement(By.id("a-autoid-0")).click();

        driver.findElement(By.id("s-result-sort-select_1")).click();

        Thread.sleep(3000);


        //Find elements in a web page
        List<WebElement> elements = driver.findElements(By.className("a-icon-checkbox"));
        System.out.println("Number of check box elements:" + elements.size());

        for (int i=1; i<elements.size(); i++){
            System.out.println("Check box text:" +elements.get(i).getAttribute("value"));
        }

        driver.close();
    }

}
