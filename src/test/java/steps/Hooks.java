package steps;

import io.cucumber.java.Before;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    final static Logger logger = Logger.getLogger(Hooks.class);


    @Before
    public void openUrl(){
        try {
            open("https://www.rts-tender.ru/");
            logger.info("Открываем сайт");
        }catch (Exception e){
            logger.error(e.getStackTrace());
        }
    }

}
