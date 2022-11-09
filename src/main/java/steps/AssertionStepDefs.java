package steps;

import io.cucumber.java.ru.И;
import org.junit.jupiter.api.Assertions;
import storage.Storage;

@SuppressWarnings("NonAsciiCharacters")
public class AssertionStepDefs {
    @И("сравниваем значения {string} и {string}")
    public void сравниваемЗначенияИ(String arg0, String arg1) {
        boolean result = Storage.getStorageValue(arg0).equals(Storage.getStorageValue(arg1));
        System.out.println("Результат сравнения количества отзывов с общей страницы\n" +
                " с количеством отзывов с конкретной страницы букмуекра: " + result);
        Assertions.assertTrue(result,
                "Количество обзоров с общей страницы не совпадает с результатами со страницы Букмекера");
    }
}
