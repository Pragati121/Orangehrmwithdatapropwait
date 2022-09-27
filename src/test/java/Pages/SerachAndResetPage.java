package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SerachAndResetPage {
    WebDriver driver;
    By Search=By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary')]");
    By Reset =By.xpath("//button[contains(@class,'oxd-button')][1]");
    public SerachAndResetPage(WebDriver driver) {
        this.driver = driver;
    }
    public void SearchMethod() {
        driver.findElement(Search).click();
        driver.findElement(Reset).click();
    }
}

