package steps;

import io.cucumber.java.ru.�;
import org.junit.jupiter.api.Assertions;
import storage.Storage;

@SuppressWarnings("NonAsciiCharacters")
public class AssertionStepDefs {
    @�("���������� �������� {string} � {string}")
    public void �������������������(String arg0, String arg1) {
        boolean result = Storage.getStorageValue(arg0).equals(Storage.getStorageValue(arg1));
        System.out.println("��������� ��������� ���������� ������� � ����� ��������\n" +
                " � ����������� ������� � ���������� �������� ���������: " + result);
        Assertions.assertTrue(result,
                "���������� ������� � ����� �������� �� ��������� � ������������ �� �������� ���������");
    }
}
