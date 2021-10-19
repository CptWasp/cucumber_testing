package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import gherkin.lexer.Th;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class NotificationPage {

    final static Logger logger = Logger.getLogger(NotificationPage.class);



    public void savePrices(){
        Configuration.timeout = 60000;

        logger.info("Ждем ответа сервера, ищем наличие кнопки");
        while ($(By.xpath("//button[text()='ПОКАЗАТЬ ЕЩЕ']"))==null){
            try {
                Thread.sleep(2000);
                logger.info("Кнопка еще не появилась, ждем 2 секунды");
            } catch (InterruptedException e) {
                logger.error(e.getStackTrace());
            }
        }


        logger.info("Показываем больше результатов");
        int count;
        int i = 1;
        int notificationsCount = 0;
        try {
            Thread.sleep(15000);
            if($(By.xpath("//div[@class='modal-content consultation_modal ']")) != null){
                $(By.xpath("//button[@class='modal-close consultation_modal']")).click();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            String test5 = $(By.xpath("//span[@id='Notifications']//span")).getText();
//            System.out.println("S:"+test5);
            count = Integer.parseInt(test5);
//            System.out.println(count5);




        try {
            while (count >= i) {


                logger.info($(By.xpath("//div[@class='cards'][" + i + "]//div[@class='card-item__title']")).text() + " ----> "
                            + $(By.xpath("//div[@class='cards'][" + i + "]//div[@class='card-item__properties-desc']")).text());

                if (i == 10) {
                    $(By.xpath("//a[@class='page-link next']")).click();
                    count -= 10;
                    i = 0;
                }
                i++;
                notificationsCount++;
            }
        }catch (Exception e){
            logger.info("Извещения закончились, Потому что: ");
            logger.info(e.getStackTrace());
        }finally {
            logger.info("Количество закупок: "+ count +" шт.");
        }


    }


}
