package StepDefinition;

import Pages.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class Stepdefinition1 extends BaseCLass {
    @Given("User is on Home Page")
        public void user_is_on_home_page() throws IOException, InterruptedException {
        setUpDriver();
        pageFactory.getHomePage().HomeUser();
    }
    @And("click on directory")
    public void click_on_directory() throws IOException {
        pageFactory.getDirectory().DirectoryUser();
    }
    @And("add details")
    public void add_details() {
    pageFactory.getDetails().AdddetailsMethod();
    }
   @And("click on search then reset")
   public void click_on_search_then_reset() {
        pageFactory.getReset().SearchMethod();
        close();
  }
}
