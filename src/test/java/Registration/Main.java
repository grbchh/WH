package Registration;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;

public class Main {
    Linkss linkTo = new Linkss();
    String portal = linkTo.NjCERT;
    @Test
    public void Flow(){

        Deposit deposit = new Deposit();
        Registration_GPT gpt = new Registration_GPT();

        Configuration.timeout = 15000;
        Selenide.open(portal);
        gpt.Registration();
        deposit.onlineBanking();
        deposit.ACH();
        deposit.CC();
    }
}
