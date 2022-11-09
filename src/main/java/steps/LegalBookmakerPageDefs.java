package steps;

import io.cucumber.java.ru.“огда;
import pages.LegalBookmakerPage;
import storage.Storage;

@SuppressWarnings("NonAsciiCharacters")
public class LegalBookmakerPageDefs {
    public static String reviewsFromBookmakerPage;
    LegalBookmakerPage legalBookmakerPage = new LegalBookmakerPage();

    @“огда("получаем количество обзоров со страницы букмекера и сохран€ем в переменную {string}")
    public void получаем оличесствоќбзоров—о—траницыЅукмекера»—охран€ем¬ѕеременную(String arg0) {
        legalBookmakerPage.getAmountOfReview((value) -> reviewsFromBookmakerPage = value);
        Storage.setStorageValue(arg0, reviewsFromBookmakerPage);
    }
}
