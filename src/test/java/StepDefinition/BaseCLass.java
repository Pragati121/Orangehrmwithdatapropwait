package StepDefinition;

        import Pages.PageFactory;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
public class BaseCLass {
    static WebDriver driver;
    public PageFactory pageFactory;

    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        pageFactory = new PageFactory(driver);
    }

    public void close() {
        driver.close();
    }
}

