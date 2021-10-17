package steps;

import io.cucumber.java.en.Then;
import pages.ModalPage;

public class ModalPageDef {
    ModalPage modalPage = new ModalPage();



    @Then("Set date time {string}")
    public void setDateTime(String dateTime){
        modalPage.selectDate(dateTime);
    }

    @Then("Select region")
    public void selectRegion(){
        modalPage.selectRegion();
    }

    @Then("Select true checkboxes")
    public void selectTrueCheckbox(){
        modalPage.selectTrueCheckBoxes();
    }

    @Then("Clear checkboxes")
    public void clearCheckboxes(){
        modalPage.clearRulesCheckboxes();
    }

}
