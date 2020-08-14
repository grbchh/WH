package Registration;

import Tools.RandomNumberGenerator;

public class RegiCreds {
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    private String username = "Jennifer";
    private String surname = "Spotts";
    private String email = "qa_sasha" + randomNumberGenerator.Email() + "@neogames.com";

    private int birthdayMonth = 6;
    int birthdayDay = 17;
    String birthdayYear = "1951";
//    int birthdayYear = 1980;

    String answerSecurityQs0 = "Volvo 262 Coupe";
    String answerSecurityQs1 = "Institut Le Rosey";
    String address = "820 FORTY NINER AVE APT E";
    String city = "CHARLOTTE";
    String zipCode = "28262";
    String ssn = "9118";

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

    public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }
}
