package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickLink(){
        $(By.xpath("//h4[text()='223-ФЗ']/parent::*//ul//li//a[text()='Поставщикам']")).click();
    }


}

