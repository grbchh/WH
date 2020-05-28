package Chat;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class Chat_Test {

    @Test
    public void chatTest() {
        Links LinkTo = new Links();
        open(LinkTo.InCERT);
        sleep(3000);
        $("div.dropdown:nth-child(2) > div:nth-child(2) > nav:nth-child(1) > a:nth-child(4) > span:nth-child(2)").click();

    }
}
