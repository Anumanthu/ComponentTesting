package org.blackline;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day1 {


    @AfterTest
    public void lastexecution() {
        System.out.println("Day1 It will execute last");

    }

    @Test(groups={"FlipKart","Regression"})
    public void ComponentTestingDemo1() throws InterruptedException {

        //WebDriverManager.chromedriver().clearDriverCache().setup();
        //WebDriverManager.chromedriver().clearResolutionCache().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--disable-site-isolation-trials");
        options.addArguments("--remote-allow-origins=*");
        

        //options.addArguments("--headless");
        //options.addArguments("--disable-gpu"); // Disable GPU acceleration
        //options.addArguments("--allowed-ips=192.168.1.10");

        //WebDriverManager.chromedriver().browserVersion("126.0.6478.183").setup();
       /* System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"\\src\\chromedriver.exe");*/
        //System.out.println("path is "+System.getProperty("user.dir")+"\\src\\chromedriver.exe");
        //Thread.sleep(5000);
        // WebDriver driver=new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://www.flipkart.com");

        //Search for the product
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Blackline Mobile"+ Keys.ENTER);
        String actualTitle=driver.getTitle();
        System.out.println("Title of the page "+actualTitle);
        driver.close();
        Assert.assertEquals(actualTitle,"Blackline Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com","Title of the flipkart page is not matching");
    }

    @Test(groups={"FlipKart","Regression"})
    public void ComponentTestingDemo2() throws InterruptedException {

        //WebDriverManager.chromedriver().clearDriverCache().setup();
        //WebDriverManager.chromedriver().clearResolutionCache().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--disable-site-isolation-trials");
        options.addArguments("--remote-allow-origins=*");
        
        //options.addArguments("--headless");
        //options.addArguments("--allowed-ips=192.168.1.10");

        //WebDriverManager.chromedriver().browserVersion("126.0.6478.183").setup();
       /* System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"\\src\\chromedriver.exe");
        System.out.println("path is "+System.getProperty("user.dir")+"\\src\\chromedriver.exe");*/
        //Thread.sleep(5000);
        // WebDriver driver=new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("http://www.flipkart.com");
        //Search for the product

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@aria-label='Grocery']")).click();
        String actualTitle=driver.getTitle();
        String expectedTitle="Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
        System.out.println("Title of the page "+actualTitle);
        driver.close();
        Assert.assertEquals(actualTitle,expectedTitle,"Title of the flipkart Grocery page page is not matching. Expecting--> "+expectedTitle);
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
