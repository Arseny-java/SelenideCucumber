package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;
@SuppressWarnings("UnusedReturnValue")
public class MainPage {

    public MainPage moveToBookmakerElement(String tabName) {
        actions()
                .moveToElement($x("//nav/ul/li/a[contains(text(), '" + tabName + "')]")
                        .shouldBe(Condition.visible))
                .perform();
        return this;
    }

    public MainPage selectTab(String tabName) {
        $x("//li[@class ='panel__item']/a[contains(text(), '" + tabName + "')]")
                .shouldBe(Condition.visible)
                .click();
        return this;
    }
}
