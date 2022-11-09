package pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.function.Consumer;

import static com.codeborne.selenide.Selenide.$$x;
@SuppressWarnings("UnusedReturnValue")
public class LegalBookmakersCommonPage {
    public LegalBookmakersCommonPage getLastBookmakerWithBonus(String bonus, Consumer<String> saveReviews,
                                                               Consumer<SelenideElement> saveElement) {
        List<SelenideElement> elements = $$x("//a[contains(@class,'icon-bonus') " +
                "and contains(text(),'" + bonus + "')]" +
                "/ancestor::tr/descendant::a[contains(@class,'icon-review')]");
        SelenideElement lastElement = elements.get(elements.size() - 1);
        String reviews = lastElement.getText();
        saveReviews.accept(reviews);
        saveElement.accept(lastElement);
        return this;
    }

}
