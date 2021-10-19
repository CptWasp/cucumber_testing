package steps;

import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pages.AdvancedPage;
import pages.ModalPage;

public class AdvancedPageDef {
    final static Logger logger = Logger.getLogger(AdvancedPageDef.class);
    AdvancedPage advancedPage = new AdvancedPage();



    @Then("Click settings span")
    public void clickSettingSpan(){
        try {
            advancedPage.clickSettingSpan();
            logger.info("Нажимаем на 'Настроить'");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }
    }








}
