package steps;

import io.cucumber.java.ru.»;
import io.cucumber.java.ru.ѕусть;
import io.cucumber.java.ru.“огда;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

@SuppressWarnings("NonAsciiCharacters")
public class MainPageDef {
    MainPage mainPage = new MainPage();

    @ѕусть("открыта страница {string}")
    public void открыта—траница(String arg0) {
        open(arg0);
    }

    @“огда("наводим мышку на вкладку {string}")
    public void наводимћышкуЌа¬кладку(String arg0) {
        mainPage.moveToBookmakerElement(arg0);
    }

    @»("выбираем из открывшегос€ меню пункт {string}")
    public void выбираем»зќткрывшегос€ћенюѕункт(String arg0) {
        mainPage.selectTab(arg0);
    }
}
