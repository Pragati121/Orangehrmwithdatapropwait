package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private HomePage Home;
    private DirectoryPage Directory;
    private Adddetails details;
    private SerachAndResetPage Reset;
    WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (Home == null) {
            Home = new HomePage(driver);
        }
        return Home;
    }
    public DirectoryPage getDirectory() {
        if (Directory == null) {
            Directory= new DirectoryPage(driver);
        }
        return Directory;
    }
    public Adddetails getDetails() {
        if (details == null) {
            details= new Adddetails(driver);
        }
        return details;
    }
    public SerachAndResetPage getReset() {
        if (Reset == null) {
            Reset= new SerachAndResetPage(driver);
        }
        return Reset;
    }
    }

