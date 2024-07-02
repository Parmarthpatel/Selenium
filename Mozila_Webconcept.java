package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozila_Webconcept {
    public static void main(String[] args) {

    //1.set up the Firefoxwebdriver
       //System.setProperty("webdriver.Firefox.driver","/Users/parmarthpatel/Firefoxdriver");
        System.setProperty("webdriver.gecko.driver","/Users/parmarthpatel/Firefoxdriver/geckodriver");

//   2.create an Instance of WebDriver
        WebDriver driver= new FirefoxDriver();
//   3.Navigate to the webpage
        driver.get("https://www.google.de/");
        driver.get("https://www.rebuy.de/");
 //  4.Get Page Title
        String  title = driver.getTitle();
        System.out.println("Page Title is: " + title);

    //5.Navigation
        driver.navigate().back();
    // 6.Navigation
        driver.navigate().forward();
    //7.Refresh the Page
        driver.navigate().refresh();
    // Maximize the window
        driver.manage().window().setSize(new Dimension(200, 200));
        driver.manage().window().maximize();
    //9.Get current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());
    //10.Close the browser.
        driver.close();
        driver.quit();

}
}


