import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class a {


    WebDriver driver;

    @Before

    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zubair\\Desktop\\NewAutomation\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void launch() {

        driver.get("https://www.zoopla.co.uk");

        String catchtitle = driver.getTitle();
        System.out.println(catchtitle);

        if (catchtitle.contains("Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents"))

            System.out.println("title valid");

        else
            System.out.println("title not valid");




        driver.findElement(By.linkText("My enquiries")).click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        String act = driver.findElement(By.xpath("//*[@id=\"mbody\"]/section/div/article/header/h1")).getText();
        System.out.println(act);

        String exp = ("My enquiries (0)");


        assertEquals(act,"My enquiries (0)");


    }
}






