package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdvancedPage {
    public void clickSettingSpan(){
        $(By.xpath("//span[text()='Настроить']")).click();
    }
}
