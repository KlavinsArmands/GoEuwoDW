package utils;

import org.apache.commons.lang.RandomStringUtils;
import java.util.Random;

public class RandomGenerator {

    public static String generateRandomString() {
        return RandomStringUtils.random(10, true, false);
    }

    public static String generateRandomEmail() {
        return RandomStringUtils.random(7, true, false) + "." +
                RandomStringUtils.random(7, true, false) + "@" +
                RandomStringUtils.random(7, true, false) + ".com";
    }

    public static String generateRandomPassport() {
        return "PA" + RandomStringUtils.random(6,false,true);
    }

    public static String generateRandomPhoneNumber() {
        return RandomStringUtils.random(8, false, true);
    }

    public static int generateRandomBDay() {
        int min = 1;
        int max = 31;
        Random rn = new Random();
        int range = max - min + 1;
        int randomNum =  rn.nextInt(range) + min;
        return randomNum;
    }

    public static int generateRandomBMonth() {
        int min = 1;
        int max = 12;
        Random rn = new Random();
        int range = max - min + 1;
        int randomNum =  rn.nextInt(range) + min;
        return randomNum;
    }

    public static int generateRandomBYear() {
        int min = 1919;
        int max = 2000;
        Random rn = new Random();
        int range = max - min + 1;
        int randomNum =  rn.nextInt(range) + min;
        return randomNum;
    }

}
