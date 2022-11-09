package steps;

import com.codeborne.selenide.SelenideElement;
import interfaces.CustomActions;
import io.cucumber.java.ru.�;
import io.cucumber.java.ru.�����;
import pages.LegalBookmakersCommonPage;
import storage.Storage;

import java.util.Objects;
@SuppressWarnings("NonAsciiCharacters")
public class CommonLegalBookmakersDefs implements CustomActions<CommonLegalBookmakersDefs> {
    LegalBookmakersCommonPage legalBookmakersCommonPage = new LegalBookmakersCommonPage();
    public static String reviewsFromCommonPage;
    public static SelenideElement lastElement;

    @�����("�������� ����������� ������� � ���������� ��������� � ������� {string} � ��������� � ���������� {string}")
    public void ���������������������������������������������������������������������������(String arg0, String arg1) {
        legalBookmakersCommonPage
                .getLastBookmakerWithBonus(arg0,
                        (reviewCount) -> reviewsFromCommonPage = reviewCount,
                        (element) -> lastElement = element);
        String bookmakerName = Objects.requireNonNull(
                        lastElement
                                .$x("./ancestor::td/preceding-sibling::td[2]/a/img")
                                .getAttribute("alt"))
                .replace("������� ������������ ������� ", "")
                .replace(" - legalbet.ru", "");
        Storage.setStorageValue(arg1, reviewsFromCommonPage);
        System.out.println(bookmakerName + ": " + reviewsFromCommonPage + " ���.");
    }

    @�("��������� �� �������� ���������� ���������")
    public void ��������������������������������������() {
        lastElement.$x("./ancestor::td/preceding-sibling::td[2]/a/img").click();
        waitTextAppear("���. �������");
    }
}
