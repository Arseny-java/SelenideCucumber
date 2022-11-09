package steps;

import com.codeborne.selenide.SelenideElement;
import interfaces.CustomActions;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import pages.LegalBookmakersCommonPage;
import storage.Storage;

import java.util.Objects;
@SuppressWarnings("NonAsciiCharacters")
public class CommonLegalBookmakersDefs implements CustomActions<CommonLegalBookmakersDefs> {
    LegalBookmakersCommonPage legalBookmakersCommonPage = new LegalBookmakersCommonPage();
    public static String reviewsFromCommonPage;
    public static SelenideElement lastElement;

    @Тогда("получаем количесство обзоров у последнего букмекера с бонусом {string} и сохраняем в переменную {string}")
    public void получаемКоличесствоОбзоровУПоследнегоБукмекераСБонусомИСохраняемВПеременную(String arg0, String arg1) {
        legalBookmakersCommonPage
                .getLastBookmakerWithBonus(arg0,
                        (reviewCount) -> reviewsFromCommonPage = reviewCount,
                        (element) -> lastElement = element);
        String bookmakerName = Objects.requireNonNull(
                        lastElement
                                .$x("./ancestor::td/preceding-sibling::td[2]/a/img")
                                .getAttribute("alt"))
                .replace("Логотип букмекерской конторы ", "")
                .replace(" - legalbet.ru", "");
        Storage.setStorageValue(arg1, reviewsFromCommonPage);
        System.out.println(bookmakerName + ": " + reviewsFromCommonPage + " отз.");
    }

    @И("переходим на страницу последнего букмекера")
    public void переходимНаСтраницуПоследнегоБукмекера() {
        lastElement.$x("./ancestor::td/preceding-sibling::td[2]/a/img").click();
        waitTextAppear("Мин. депозит");
    }
}
