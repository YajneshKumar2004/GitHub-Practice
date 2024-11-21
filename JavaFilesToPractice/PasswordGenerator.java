import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 10; // Length of the password
        System.out.println("Generated Password: " + generatePassword(length));
    }

    public static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random rnd = new Random();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(rnd.nextInt(chars.length())));
        }

        return password.toString();
    }
}
