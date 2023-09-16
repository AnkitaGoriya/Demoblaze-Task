package com.demoblaze.browserfactory;

import com.demoblaze.propertyreader.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class DriverManager {
    public static WebDriver driver;    // WebDriver instance to manage the browser session
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");   // Base URL from the property file


    // Initialize page elements using PageFactory
    public DriverManager() {
        PageFactory.initElements(driver, this);
    }

    // Method to select and initialize a browser based on input
    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();  // Initialize ChromeDriver
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver(); // Initialize FirefoxDriver
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();    // Initialize EdgeDriver
        } else {
            System.out.println("Wrong browser name");  // Handle incorrect browser name
        }
        driver.manage().window().maximize();  // Maximize the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(
                Long.parseLong(PropertyReader.getInstance().getProperty("implicitlyWait"))));  // Set implicit wait timeout
        driver.get(baseUrl);  // Open the specified base URL
    }

    // Method to close the browser session
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();  // Quit the WebDriver instance
        }
    }
}
