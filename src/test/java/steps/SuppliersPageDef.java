package steps;

import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pages.SuppliersPage;

public class SuppliersPageDef {
    SuppliersPage suppliersPage = new SuppliersPage();
    final static Logger logger = Logger.getLogger(SuppliersPageDef.class);


    @Then("Click search link")
    public void clickSearchLink(){
        try {
            suppliersPage.clickSearchLink();
            logger.info("нажимаем 'Расширенный пойск'");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }
    }

}
