package Registration;

import Buttons.RegistrationsButtons;
import Tools.RandomNumberGenerator;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Registration_GPT {

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    RegiCreds creds = new RegiCreds();
    Buttons button = new Buttons();
    Main main = new Main();
    private RegistrationsButtons registrationsButtons = new RegistrationsButtons();

    @Test
    public void Registration() {
        Configuration.timeout = 15000;
        Selenide.open(main.portal);
        $(registrationsButtons.getRegiButton()).shouldBe(enabled).click();
        $(registrationsButtons.getFirstNameField()).setValue(creds.getUsername());
        $(registrationsButtons.getLastNameField()).setValue(creds.getSurname());
        $(registrationsButtons.getEmailField()).setValue(creds.getUsername());

        $(registrationsButtons.getBirthdayMonthDropdown()).selectOption(creds.getBirthdayMonth());
        $(registrationsButtons.getBirthdayDayDropdown()).selectOption(creds.birthdayDay);
        $(registrationsButtons.getBirthdayYearDropdown()).selectOption(creds.birthdayYear);

        $(registrationsButtons.getCellPhoneField()).setValue(randomNumberGenerator.phoneNumber());
        $(registrationsButtons.getNextRegiStepButton()).click();
        System.out.println(creds.getEmail());

        $(registrationsButtons.getPasswordField()).setValue("test1234");

        //dropdown 1st question
        $(registrationsButtons.getSecurityQuestionDropdown1()).click();
        $(registrationsButtons.getSecurityQuestionField1()).setValue(creds.answerSecurityQs0);

        //dropdown 2nd question
        $(registrationsButtons.getSecurityQuestionDropdown2()).click();
        $(registrationsButtons.getSecurityQuestionField2()).setValue(creds.answerSecurityQs1);

        $(registrationsButtons.getSsnField()).setValue(creds.ssn);
        $(registrationsButtons.getAdressField()).setValue(creds.address);
        $(registrationsButtons.getCityField()).setValue(creds.city);
        $(registrationsButtons.getZipCodeField()).setValue(creds.zipCode);
        $(registrationsButtons.getAgreementCheckbox1()).click();
        $(registrationsButtons.getAgreementCheckbox2()).click();
        $(registrationsButtons.getAgreementCheckbox3()).click();
        $(registrationsButtons.getAgreementCheckbox4()).click();

        $(registrationsButtons.getFinishRegiButton()).shouldBe(enabled).click();
        $(registrationsButtons.getRegiFinishHeader()).shouldBe(enabled).shouldHave(text("Account Created"));
    }

}

