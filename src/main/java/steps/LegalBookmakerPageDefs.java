package steps;

import io.cucumber.java.ru.�����;
import pages.LegalBookmakerPage;
import storage.Storage;

@SuppressWarnings("NonAsciiCharacters")
public class LegalBookmakerPageDefs {
    public static String reviewsFromBookmakerPage;
    LegalBookmakerPage legalBookmakerPage = new LegalBookmakerPage();

    @�����("�������� ���������� ������� �� �������� ��������� � ��������� � ���������� {string}")
    public void ������������������������������������������������������������������(String arg0) {
        legalBookmakerPage.getAmountOfReview((value) -> reviewsFromBookmakerPage = value);
        Storage.setStorageValue(arg0, reviewsFromBookmakerPage);
    }
}
