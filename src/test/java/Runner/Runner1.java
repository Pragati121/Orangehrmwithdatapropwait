package Runner;
import StepDefinition.BaseCLass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\PragatiSharma\\IdeaProjects\\untitled2\\src\\test\\java\\FeatureFile"},
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty","json:report/Cucumber.json"
        }
)
class Runner1 {

}

