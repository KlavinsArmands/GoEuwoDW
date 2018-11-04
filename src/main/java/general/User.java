package general;

import lombok.Data;

import static utils.RandomGenerator.*;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String passport;
    private String phonenumber;
    private String address;
    private String city;
    private String postalCode;
    private int bday;
    private int bmonth;
    private int byear;

    public User() {
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.emailAddress = generateRandomEmail();
        this.passport = generateRandomPassport();
        this.phonenumber = generateRandomPhoneNumber();
        this.address = generateRandomText();
        this.city = generateRandomText();
        this.postalCode = generateRandomText();
        this.bday = generateRandomBDay();
        this.bmonth = generateRandomBMonth();
        this.byear = generateRandomBYear();
    }

}
