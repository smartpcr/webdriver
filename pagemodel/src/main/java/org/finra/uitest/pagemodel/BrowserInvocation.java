package org.finra.uitest.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by Administrator on 7/1/2015.
 */
public class BrowserInvocation {
    public enum BrowserType {
        Chrome,
        InternetExplorer,
        Firefox,
        Safari
    }

    public static void browserTest(BrowserType browserType) throws UnsupportedOperationException{
        WebDriver driver;
        Instant startTime = Instant.now();
        switch (browserType){
            case Chrome:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\IdeaProjects\\SeleniumTutorial\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case InternetExplorer:
                System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\IdeaProjects\\SeleniumTutorial\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case Firefox:
                driver = new FirefoxDriver();
                break;
            case Safari:
                driver = new SafariDriver();
                break;
            default:
                throw new UnsupportedOperationException();
        }

        System.out.printf("\n\n--- Testing %s ---\n", browserType);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.close();
        Duration duration = Duration.between(startTime, Instant.now());
        System.out.printf("Elapsed time for %s: %s\n", browserType, duration);
    }

    public static void main(String[] args) {
        browserTest(BrowserType.Chrome);
        browserTest(BrowserType.InternetExplorer);
        browserTest(BrowserType.Firefox);
        browserTest(BrowserType.Safari);

        System.exit(0);
    }
}
