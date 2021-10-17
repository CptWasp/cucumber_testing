package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ModalPage {



    public void selectTrueCheckBoxes(){
//        $(By.xpath("//label[text()='Искать в файлах']/parent::*/input")).setSelected(false);
//        $(By.xpath("//label[text()='Точное соответствие']/parent::*/input")).setSelected(false);
//        $(By.xpath("//label[text()='Исключить совместные закупки']/parent::*/input")).setSelected(true);
//        $(By.xpath("//label[text()='Только МСП / СМП']/parent::*/input")).setSelected(false);


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
