package base;

import org.openqa.selenium.*;
import util.ResultsPublish;



public class BaseClass {

    ResultsPublish rp =  new ResultsPublish();

    public void invokeBrowser(String url) {
        //System.out.println("Thread id = " + Thread.currentThread().getId());
        //System.out.println("Hashcode of webDriver instance = " + DriverManager.getDriver().hashCode());
        DriverManager.getDriver().get(url);

    }

    public void clickHyper(String text){
        DriverManager.getDriver().findElement(By.linkText(text)).click();
    }

    public void link(String text)
    {
        DriverManager.getDriver().findElement(By.linkText(text)).click();
    }

    public void Streaming(){

        rp.TestMessage();
    }

   /* private WebDriver _webDriver;
    public static HashMap<String,Object> parameters = new HashMap<String,Object>();



    public void setUp(){
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        _webDriver = new ChromeDriver();
        _webDriver.get("https://the-internet.herokuapp.com/");
    }

    public void clickLink(String linkText){
        List<WebElement> list = _webDriver.findElements(By.tagName("a"));
        for (WebElement webElement : list) {
            if(webElement.getText().toLowerCase().contains(linkText.toLowerCase())){
                webElement.click();
                return;
            }
        }
    }

    public WebElement[] hyperLink(String text){
        List<WebElement> lsit = _webDriver.findElements(By.cssSelector("[href*='"+text+"']"));
        WebElement[] myArray = new WebElement[lsit.size()];
        return lsit.toArray(myArray);
    }

    public WebElement[] element(String testid){
        WebElement[] myArray = new WebElement[20];
         _webDriver.findElements(By.cssSelector("[id*='"+testid+"']")).toArray(myArray);
         return myArray;
    }

    public void waitFor(){
        _webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }


    public void goHome(){
        _webDriver.get("https://the-internet.herokuapp.com/");
    }


    public void tearDown(){
        System.out.println("TestName is :" + parameters.get("TestName"));
        _webDriver.quit();
    }*/
}
