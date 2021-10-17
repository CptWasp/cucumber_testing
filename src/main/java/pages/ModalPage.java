package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;

public class ModalPage {

    private SelenideElement submissionDate1Input = $(By.xpath("(//div[text()='ПОДАЧА ЗАЯВОК']/parent::*//input[@class='datepicker'])[1]"));
    private SelenideElement submissionDate2Input = $(By.xpath("(//div[text()='ПОДАЧА ЗАЯВОК']/parent::*//input[@class='datepicker'])[2]"));


    public void selectDate(String date1){
        $(By.xpath("//div[text()='Фильтры по датам']")).click();
        submissionDate1Input.val(date1);

        Date date = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.format(date);
        submissionDate2Input.val(dateFormat.format(date));

    }


    public void selectRegion(){
        $(By.xpath("//div[text()='Регион поставки']")).click();
        $(By.xpath("//div[text()='Алтайский край']")).click();
    }


    public void clearRulesCheckboxes(){

        if($(By.xpath("//label[text()='44-ФЗ']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='44-ФЗ']")).click();
        }
        if($(By.xpath("//label[text()='223-ФЗ']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='223-ФЗ']")).click();
        }
        if(!$(By.xpath("//label[text()='615-ПП РФ']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='615-ПП РФ']")).click();
        }
        if($(By.xpath("//label[text()='Закупки малого объёма / РТС - МАРКЕТ']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='Закупки малого объёма / РТС - МАРКЕТ']")).click();
        }
        if($(By.xpath("//label[text()='Коммерческие закупки (РТС-тендер)']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='Коммерческие закупки (РТС-тендер)']")).click();
        }

    }



    public void selectTrueCheckBoxes(){
//        version 1
//        $(By.xpath("//label[text()='Искать в файлах']/parent::*/input")).setSelected(false);
//        $(By.xpath("//label[text()='Точное соответствие']/parent::*/input")).setSelected(false);
//        $(By.xpath("//label[text()='Исключить совместные закупки']/parent::*/input")).setSelected(true);
//        $(By.xpath("//label[text()='Только МСП / СМП']/parent::*/input")).setSelected(false);



//        version 2
        if($(By.xpath("//label[text()='Искать в файлах']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='Искать в файлах']")).click();
        }
        if ($(By.xpath("//label[text()='Точное соответствие']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='Точное соответствие']")).click();
        }
        if(!$(By.xpath("//label[text()='Исключить совместные закупки']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='Исключить совместные закупки']")).click();
        }
        if($(By.xpath("//label[text()='Только МСП / СМП']/parent::*/input")).isSelected()){
            $(By.xpath("//label[text()='Только МСП / СМП']")).click();
        }

    }
}
