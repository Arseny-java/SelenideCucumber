package steps;


import com.codeborne.selenide.Configuration;
import io.cucumber.java.BeforeAll;

@SuppressWarnings("unused")
public class Hooks {
    @BeforeAll
    public static void setup() {
        Configuration.timeout = 20000;
        Configuration.startMaximized = true;
    }
}
