import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class A_WebConcept {

    public static void main(String[] args) {
        //1.set up the Chromedriver
        System.setProperty("webdriver.chrome.driver", " /Users/parmarthpatel/Downloads/chromedriver-mac-x64/chromedriver");

        //2.create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //3.Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
        // 4. Get Page Title
        String PageTitle = driver.getTitle();

        System.out.println("Page Title is: "+ PageTitle);
//        5.Navigation
        driver.navigate().back();
        // 6. Navigation
        driver.navigate().forward();
        // 7. Refresch the Page
        driver.navigate().refresh();
        //8.
        driver.navigate().back();
        // 6.Navigation
        driver.navigate().forward();
        //7.Refresh the Page
        driver.navigate().refresh();
        // Maximize the window
        driver.manage().window().maximize();
        //9.Get current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());
        //10.Close the browser.
        driver.close();
        driver.quit();

 }
}
