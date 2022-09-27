package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Adddetails {
    WebDriver driver;
    public static Properties prop;

    By Ename = By.xpath("//input[@placeholder='Type for hints...']");
    //Select se = new Select(driver.findElement(By.xpath("//i[contains(@class,'oxd-select-text--arrow')][1]")));
   By drop=By.xpath("//i[contains(@class,'oxd-select-text--arrow')][1]");
   By Dropvalue = By.xpath("//*[contains(text(),'Account Assistant')]");
   By Location = By.xpath("(//div[@class='oxd-select-text--after'])[2]");
   By Locvalue = By.xpath("//*[contains(text(),'Canadian Regional HQ')]");
   By Search=By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary')]");
    By Reset =By.xpath("//button[contains(@class,'oxd-button')][1]");
    public Adddetails(WebDriver driver) {
        this.driver = driver;
    }
    public void AdddetailsMethod() {
        try {
            prop = new Properties();
            FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//TestData//Resouce.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(Ename).sendKeys(prop.getProperty("Emname"));
        driver.findElement(drop).click();
        driver.findElement(Dropvalue).click();
        driver.findElement(Location).click();
        driver.findElement(Locvalue).click();
        driver.findElement(Search).click();
        driver.findElement(Reset).click();
    }
}