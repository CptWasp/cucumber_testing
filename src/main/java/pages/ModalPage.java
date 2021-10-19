package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

public class ModalPage {
    final static Logger logger = Logger.getLogger(ModalPage.class);

    private String todayIs = "";

    private SelenideElement submissionDate1Input = $(By.xpath("(//div[text()='ПОДАЧА ЗАЯВОК']/parent::*//input[@class='datepicker'])[1]"));
    private SelenideElement submissionDate2Input = $(By.xpath("(//div[text()='ПОДАЧА ЗАЯВОК']/parent::*//input[@class='datepicker'])[2]"));

    public void selectDate(String date1){
        try {
            $(By.xpath("//div[text()='Фильтры по датам']")).click();
            logger.info("открываем коллапс секцию 'ФИЛЬТРЫ ПО ДАТАМ'");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }
        try {
            submissionDate1Input.val(date1);
            logger.info("Устанавливаем дату начала, которая прописана в footerGoing.feature");
            submissionDate1Input.sendKeys(Keys.ENTER);
            logger.info("Нажимаем энтер");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }

        try {
            Date date = new Date(System.currentTimeMillis());
//        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            DateFormat dateFormat = new SimpleDateFormat("d");
            String dateFormated = dateFormat.format(date);
            logger.info("формат dd-MM-yyyy нам ни к чему, нужен только день 'd'");
            $(By.xpath("//div[text()='"+dateFormated+"']")).click();
            logger.info("нажимаем на цифрус нашим днем в календаре");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }




    }


    public void search(){
        try {
            $(By.xpath("//*[@class='search__btn bottomFilterSearch']")).click();
            logger.info("Нажимаем большую кнопку НАЙТИ");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }
    }



    public void selectRegion(){
        try {
            $(By.xpath("(//div[@class='modal-settings-section'])[3]//a[text()='Снять всё']")).click();
            logger.info("Снимаем все галочки с 'СТАТУС'");
            $(By.xpath("//div[text()='Регион поставки']")).click();
            logger.info("Открываем секцию 'Регион поставки'");
            $(By.xpath("(//div[@class='modal-settings-section'])[7]//a[text()='Снять всё']")).click();
            logger.info("Сняли с поставки все регионы");
            $(By.xpath("//label[text()='Алтайский край']")).click();
            logger.info("Поставили галочку на Алтайский край");

        }catch (Exception e){
            logger.error(e.getStackTrace());
        }

    }


    public void clearRulesCheckboxes(){
        try {
            if ($(By.xpath("//label[text()='44-ФЗ']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='44-ФЗ']")).click();
            }
            if ($(By.xpath("//label[text()='223-ФЗ']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='223-ФЗ']")).click();
            }
            if (!$(By.xpath("//label[text()='615-ПП РФ']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='615-ПП РФ']")).click();
            }
            if ($(By.xpath("//label[text()='Закупки малого объёма / РТС - МАРКЕТ']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='Закупки малого объёма / РТС - МАРКЕТ']")).click();
            }
            if ($(By.xpath("//label[text()='Коммерческие закупки (РТС-тендер)']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='Коммерческие закупки (РТС-тендер)']")).click();
            }
            logger.info("44-ФЗ - "+$(By.xpath("//label[text()='44-ФЗ']/parent::*/input")).isSelected()+
                    ", 223-ФЗ - "+$(By.xpath("//label[text()='223-ФЗ']/parent::*/input")).isSelected()+
                    ", 615-ПП РФ - "+$(By.xpath("//label[text()='615-ПП РФ']/parent::*/input")).isSelected()+
                    ", Закупки малого объёма / РТС - МАРКЕТ - "+ $(By.xpath("//label[text()='Закупки малого объёма / РТС - МАРКЕТ']/parent::*/input")).isSelected()+
                    ", Коммерческие закупки (РТС-тендер) - "+$(By.xpath("//label[text()='Коммерческие закупки (РТС-тендер)']/parent::*/input")).isSelected());
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }

    }



    public void selectTrueCheckBoxes(){

        try {
            if ($(By.xpath("//label[text()='Искать в файлах']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='Искать в файлах']")).click();
            }
            if ($(By.xpath("//label[text()='Точное соответствие']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='Точное соответствие']")).click();
            }
            if (!$(By.xpath("//label[text()='Исключить совместные закупки']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='Исключить совместные закупки']")).click();
            }
            if ($(By.xpath("//label[text()='Только МСП / СМП']/parent::*/input")).isSelected()) {
                $(By.xpath("//label[text()='Только МСП / СМП']")).click();
            }
            logger.info("Искать в файлах - "+$(By.xpath("//label[text()='Искать в файлах']/parent::*/input")).isSelected()+
                    ", Точное соответствие - "+$(By.xpath("//label[text()='Точное соответствие']/parent::*/input")).isSelected()+
                    ", Исключить совместные закупки - "+$(By.xpath("//label[text()='Исключить совместные закупки']/parent::*/input")).isSelected()+
                    ", Только МСП / СМП - "+ $(By.xpath("//label[text()='Только МСП / СМП']/parent::*/input")).isSelected());
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }

    }
}
