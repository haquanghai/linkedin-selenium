import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;
import static junit.framework.TestCase.assertEquals;

public class TestSample  {
    public static void main(String[] args) throws InterruptedException {

        // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/hai.ha/Downloads/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmPage = new ConfirmationPage();
        confirmPage.waitforalertBanner(driver);


        assertEquals("The form was successfully submitted!", confirmPage.getalertBannerText(driver));

        //Close the browser
        driver.quit();
    }








}


