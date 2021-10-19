package steps;

//import io.cucumber.java8.En.*;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pages.BasicPage;

public class BasicPageDef {
    final static Logger logger = Logger.getLogger(BasicPageDef.class);

    BasicPage basicPage = new BasicPage();

    @Then("Click link")
    public void clickLink(){
        try {
            basicPage.clickLink();
            logger.info("Спустились во футер и нажали на '223-ФЗ->Поставщикам'");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }
    }
}
