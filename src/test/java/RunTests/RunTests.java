package RunTests;

import Registration.Links;
import Registration.Registration_GPT;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;


public class RunTests {
    private Links linkTo = new Links();
    private String link = linkTo.getNjGPT();

    @Test
    public void Flow() {
        Registration_GPT gpt = new Registration_GPT();
        Configuration.timeout = 15000;
        /////// START HERE///////
        Selenide.open(link);
        gpt.Registration();

    }

    public String getLink() {
        return link;
    }
}







