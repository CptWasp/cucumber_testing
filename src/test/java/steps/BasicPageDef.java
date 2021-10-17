package steps;

//import io.cucumber.java8.En.*;
import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click link")
    public void clickLink(){
        basicPage.clickLink();
    }
}
