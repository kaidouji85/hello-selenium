package hello.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * エントリポイント
 */
public class App {
    public static void main(String[] args) {
        // WebDriverManagerを使って、WebDriverを自動的にダウンロードしている
        WebDriverManager.chromedriver().setup();

        // ここから先は通常のSeleniumWebDriverのコード

        final WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");

        WebElement element = webDriver.findElement(By.name("q"));
        element.sendKeys("こんにちは、世界");
        element.sendKeys("\n");
    }
}
