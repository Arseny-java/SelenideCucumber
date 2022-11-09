package pages;

import java.util.function.Consumer;

import static com.codeborne.selenide.Selenide.$x;

@SuppressWarnings("UnusedReturnValue")
public class LegalBookmakerPage {
    public LegalBookmakerPage getAmountOfReview(Consumer<String> saveReviews) {
        saveReviews.accept($x("//h2[contains(text(), 'Отзывы')]/span").getText());
        return this;
    }
}
