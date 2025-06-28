import java.util.*;

public class main {
    public static String generatePassword(int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";

        String combined = upper + lower + numbers + symbols;

        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(combined.length());
            sb.append(combined.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired password length: ");
        int length = sc.nextInt();

        String password = generatePassword(length);
        System.out.println("Your Generated Password: " + password);
    }
}
