package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class NotificationPage {



    public void savePrices(){
        $(By.xpath("//button[text()='ПОКАЗАТЬ ЕЩЕ']")).click();
        int count;
        int i = 1;

            System.out.println("count_S: "+ $(By.xpath("(//b[@class='main-tabs__count count'])[2]//span")).text());
            count = Integer.parseInt($(By.xpath("(//b[@class='main-tabs__count count'])[2]//span")).text());
            System.out.println("count: "+ count);

            while (count >= i) {
                System.out.println($(By.xpath("//div[@class='cards'][" + i + "]//div[@class='card-item__title']")).text() + " ----> "
                        + $(By.xpath("//div[@class='cards'][" + i + "]//div[@class='card-item__properties-desc']")).text());

//                if (i % 10 == 0) {
////                    $(By.xpath("//a[@class='page-link next']")).scrollTo();
////                    $(By.xpath("//a[@class='page-link next']")).click();
//                    $(By.xpath("//a[@class='page-link next']/parent::*")).click();
//                    count -= 10;
//                    i = 0;
//                }

                i++;
            }

    }


}
