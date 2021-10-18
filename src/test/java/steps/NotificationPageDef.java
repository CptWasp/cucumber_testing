package steps;

import io.cucumber.java.en.Then;
import pages.NotificationPage;

public class NotificationPageDef {

    NotificationPage notificationPage = new NotificationPage();


    @Then("Show prices")
    public void showPrices(){
        notificationPage.savePrices();
    }


}
