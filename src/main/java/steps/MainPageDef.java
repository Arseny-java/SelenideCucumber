package steps;

import io.cucumber.java.ru.�;
import io.cucumber.java.ru.�����;
import io.cucumber.java.ru.�����;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

@SuppressWarnings("NonAsciiCharacters")
public class MainPageDef {
    MainPage mainPage = new MainPage();

    @�����("������� �������� {string}")
    public void ���������������(String arg0) {
        open(arg0);
    }

    @�����("������� ����� �� ������� {string}")
    public void ���������������������(String arg0) {
        mainPage.moveToBookmakerElement(arg0);
    }

    @�("�������� �� ������������ ���� ����� {string}")
    public void �������������������������������(String arg0) {
        mainPage.selectTab(arg0);
    }
}
