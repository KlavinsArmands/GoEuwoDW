package general;

import lombok.Data;

import static utils.RandomGenerator.*;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String emailAddress;

    public User() {
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.emailAddress = generateRandomEmail();
    }

}
