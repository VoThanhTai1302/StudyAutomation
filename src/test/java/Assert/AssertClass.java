package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass {
    WebDriver driver;
    String pathDriver = "c:\\sourcedriver\\chromedriver.exe";

    @Test
    public void AssertClass() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/sign-in/");
        WebElement title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]"));
        String actualy = title.getText();
        String expected = "SignIn";
        Assert.assertEquals(actualy, expected);
    }



}
