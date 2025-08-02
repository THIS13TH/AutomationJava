package base;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @Test
    public void test() {
        open("https://example.com");

       $("h1").getText().contains("Example Domain");
    }
}
