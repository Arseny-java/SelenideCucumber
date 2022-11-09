package interfaces;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import static com.codeborne.selenide.Selenide.$x;

@SuppressWarnings({"UnusedReturnValue", "unchecked"})
public interface CustomActions <T> {
    @Step("�������� ��������� ������ '{text}'")
    default T waitTextAppear(String text) {
        try {
            $x("//*[contains(text(), '" + text + "')]")
                    .shouldBe(Condition.visible);
        } catch (Error e) {
            Assertions.fail("�� ������� ��������� ��������� ������ " + text);
        }
        return (T) this;
    }
}
