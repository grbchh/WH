package Credentials;

import Tools.RandomNumberGenerator;

public class RegistrationCredentials {
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    private String username = "Jennifer";
    private String surname = "Spotts";
    private String email = "qa_sasha" + randomNumberGenerator.Email() + "@neogames.com";

    private int birthdayMonth = 6;
    private int birthdayDay = 17;
    private String birthdayYear = "1951";

    private String answerSecurityQs0 = "Volvo 262 Coupe";
    private String answerSecurityQs1 = "Institut Le Rosey";
    private String address = "820 FORTY NINER AVE APT E";
    private String city = "CHARLOTTE";
    private String zipCode = "28262";
    private String ssn = "9118";

    public RandomNumberGenerator getRandomNumberGenerator() {
        return randomNumberGenerator;
    }

    public String getUsername() {
        return username;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public String getBirthdayYear() {
        return birthdayYear;
    }

    public String getAnswerSecurityQs0() {
        return answerSecurityQs0;
    }

    public String getAnswerSecurityQs1() {
        return answerSecurityQs1;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getSsn() {
        return ssn;
    }
}
