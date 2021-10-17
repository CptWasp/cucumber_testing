package steps;

import io.cucumber.java.en.Then;
import pages.AdvancedPage;
import pages.ModalPage;

public class AdvancedPageDef {
    AdvancedPage advancedPage = new AdvancedPage();


    @Then("Click settings span")
    public void clickSettingSpan(){
        advancedPage.clickSettingSpan();
    }








}
