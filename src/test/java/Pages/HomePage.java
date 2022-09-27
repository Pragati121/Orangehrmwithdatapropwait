package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class HomePage {
    WebDriver driver;

    By Username=By.xpath("//input[@name='username']");
    By Password=By.xpath("//input[@name='password']");
    By Login   =By.xpath("//button[contains(@class,'oxd-button')]");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void HomeUser() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//OrangehrmDataDriven.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String email = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(Username).sendKeys(email);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(Login).click();
    }
}

