package steps;

import io.cucumber.java.en.Then;
import pages.ModalPage;

public class ModalPageDef {
    ModalPage modalPage = new ModalPage();

    @Then("Select true checkboxes")
    public void selectTrueCheckbox(){
        modalPage.selectTrueCheckBoxes();
    }
}
