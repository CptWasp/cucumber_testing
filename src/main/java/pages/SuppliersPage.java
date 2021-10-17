package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SuppliersPage {
    public void clickSearchLink(){
        $(By.xpath("//h2[text()='Расширенный поиск']/parent::*")).click();
    }
}
