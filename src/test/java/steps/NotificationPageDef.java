package steps;

import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pages.NotificationPage;

public class NotificationPageDef {
    final static Logger logger = Logger.getLogger(NotificationPageDef.class);

    NotificationPage notificationPage = new NotificationPage();


    @Then("Show prices")
    public void showPrices(){
//        try {
            notificationPage.savePrices();
            logger.info("проходишь по всем закупкам и собираешь НАЧАЛЬНАЯ ЦЕНА и кол-во закупок");
//        }catch (Exception e){
//            logger.error(e.getStackTrace());
//        }
    }


}
