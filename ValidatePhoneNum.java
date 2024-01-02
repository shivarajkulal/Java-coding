import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String phoneNumber = "+919123664884";
        if (isValid(phoneNumber)) {
            System.out.println("Valid Phone Number.");
        } else {
            System.out.println("Not Valid Phone Number.");
        }
    }

    public static boolean isValid(String phoneNumber) {
        String regex = "^(0|\\+91)[6-9][0-9]{9}$";
        return phoneNumber.matches(regex);
    }
}
