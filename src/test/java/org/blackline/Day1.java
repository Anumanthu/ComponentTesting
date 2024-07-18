package org.blackline;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day1 {


    @AfterTest
    public void lastexecution() {
        System.out.println("Day1 It will execute last");

    }

    @Test(groups={"Regression"})
    public void Demo() throws InterruptedException {

        //WebDriverManager.chromedriver().clearDriverCache().setup();
        //WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=9222");
        //options.addArguments("--allowed-ips=192.168.1.10");

        //WebDriverManager.chromedriver().browserVersion("126.0.6478.183").setup();
      /*  System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\1018546\\Desktop\\Selenium Learning\\chromedriver.exe");*/
        //Thread.sleep(5000);
        // WebDriver driver=new FirefoxDriver();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("http://www.amazon.com");
        //Thread.sleep(5000);
        //Assert.assertTrue(false);
    }


    @AfterSuite
    public void aftersuite() {
        System.out.println("Day1 I'm the no 1 from LAST");
    }


    @Test
    public void SecondTest() {
        System.out.println("Day1 bye");//automation code
        //Assert.assertTrue(false);
    }

}
