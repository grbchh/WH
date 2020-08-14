package Registration;

import Buttons.RegistrationsButtons;
import RunTests.RunTests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Registration_PROD {
    private RegistrationCredentials creds = new RegistrationCredentials();
    private RegistrationsButtons registrationsButtons = new RegistrationsButtons();
    private RunTests portal = new RunTests();

    @Test
    public void Registration() {
        Configuration.timeout = 15000;
        Selenide.open(portal.getLink());
        $(registrationsButtons.getRegiButton()).shouldBe(enabled).click();
        $(registrationsButtons.getFirstNameField()).setValue(creds.getUsername());
        $(registrationsButtons.getLastNameField()).setValue(creds.getSurname());
        $(registrationsButtons.getEmailField()).setValue(creds.getEmail());

        $(registrationsButtons.getBirthdayMonthDropdown()).selectOption(creds.getBirthdayMonth());
        $(registrationsButtons.getBirthdayDayDropdown()).selectOption(creds.getBirthdayDay());
        $(registrationsButtons.getBirthdayYearDropdown()).selectOption(creds.getBirthdayYear());

        $(registrationsButtons.getCellPhoneField()).setValue(creds.getPhoneNumber());
        $(registrationsButtons.getNextRegiStepButton()).click();
        System.out.println(creds.getEmail());

        $(registrationsButtons.getPasswordField()).setValue("test1234");

        //dropdown 1st question
        $(registrationsButtons.getSecurityQuestionDropdown1()).click();
        $(registrationsButtons.getSecurityQuestionField1()).setValue(creds.getAnswerSecurityQs0());

        //dropdown 2nd question
        $(registrationsButtons.getSecurityQuestionDropdown2()).click();
        $(registrationsButtons.getSecurityQuestionField2()).setValue(creds.getAnswerSecurityQs1());

        $(registrationsButtons.getSsnField()).setValue(creds.getSsn());
        $(registrationsButtons.getAdressField()).setValue(creds.getAddress());
        $(registrationsButtons.getCityField()).setValue(creds.getCity());
        $(registrationsButtons.getZipCodeField()).setValue(creds.getZipCode());
        $(registrationsButtons.getAgreementCheckbox1()).click();
        $(registrationsButtons.getAgreementCheckbox2()).click();
        $(registrationsButtons.getAgreementCheckbox3()).click();
        $(registrationsButtons.getAgreementCheckbox4()).click();

        $(registrationsButtons.getFinishRegiButton()).shouldBe(enabled).click();
        $(registrationsButtons.getRegiFinishHeader()).shouldBe(enabled).shouldHave(text("Account Created"));
    }

}

