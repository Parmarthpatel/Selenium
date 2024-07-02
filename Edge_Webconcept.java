package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Webconcept {
    public static void main(String[] args) {
    //1.set up the edgedriver
    //System.("webdriver.msedge.driver","/Users/parmarthpatel/Edgedriver");

    System.setProperty("webdriver.msedge.driver","/Users/parmarthpatel/Edgedriver");

    //  2.create an Instance of Edgedriver
    EdgeDriver driver= new EdgeDriver();
//   3.Navigate to the webpage

        driver.get("https://www.rebuy.de/");
    //  4.Get Page Title
        String title= driver.getTitle();
        System.out.println("Page Title is:"+ title);
        // 5.Navigation
        driver.navigate().back();
        //6.Navigation
        driver.navigate().forward();
        //7.Navigation
        driver.navigate().refresh();
        //8.Maximize the window
        driver.manage().window().setSize(new Dimension(180,200));
        driver.manage().window().maximize();
        //9.Get current URL
        System.out.println("Current URL is: "+ driver.getCurrentUrl());
        //10.Close the browser
        driver.close();
        driver.quit();
        driver.manage().window().setSize(new Dimension(200, 200));
        driver.manage().window().maximize();
        //9.Get current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());
        //10.Close the browser.
        driver.close();
        driver.quit();

}
}