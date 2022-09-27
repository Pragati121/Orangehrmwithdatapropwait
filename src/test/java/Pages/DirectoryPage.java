package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class DirectoryPage {
    WebDriver driver;
    WebDriverWait wait;

    String directory = "(//span[contains(@class,'oxd-main-menu-item--name')])[%s]";

    public DirectoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void DirectoryUser() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(directory,9))));
        driver.findElement(By.xpath(String.format(directory,9))).click();
    }
}
