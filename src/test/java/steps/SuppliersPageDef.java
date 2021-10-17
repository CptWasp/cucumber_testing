package steps;

import io.cucumber.java.en.Then;
import pages.SuppliersPage;

public class SuppliersPageDef {
    SuppliersPage suppliersPage = new SuppliersPage();

    @Then("Click search link")
    public void clickSearchLink(){
        suppliersPage.clickSearchLink();
    }

}
