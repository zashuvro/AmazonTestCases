package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    static String url = "https://amazon.com";

    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "browser driver/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get(url);
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("phone");
//        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

       // driver.close();
    urlnavigator(url);
    Thread.sleep(1000);
    }
    public static void urlnavigator(String ur){

        System.setProperty("webdriver.gecko.driver","browser driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to(ur);

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("phone");

    }
}
