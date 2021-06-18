package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DriverFactory {
    static WebDriver createInstance(){
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        return new ChromeDriver();
    }
}
