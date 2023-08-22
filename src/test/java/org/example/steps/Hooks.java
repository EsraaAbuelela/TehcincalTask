package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void openBrowser() {


        System.setProperty("webdriver.chrome.driver","//Users/esraahassan/Downloads/chromedriver-116/chromedriver");
        ChromeOptions opt= new ChromeOptions();
        opt.setBinary("/Users/esraahassan/Downloads/chrome-forTesting/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
        opt.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(opt);


        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 4- navigate to url
        driver.navigate().to("https://subscribe.jawwy.tv/ae-ar?");

    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
