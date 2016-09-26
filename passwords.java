import java.util.Random;
import java.util.Scanner;

public class passwords {
    Random r = new Random();
    final static String alphabet = "012345689!@#$%^&*abcdefghijklmnopqrstuvwxyzACDEFGHIJKLMNOPQRSTUVWXYZ";
    final static int length = alphabet.length();
    String password = "";

    public String createPassword(int num) {
        for (int i = 0; i < num; i++) {
            char c = alphabet.charAt(r.nextInt(length));
            password = password + c;
        }
        return password;
    }
    public static void main(String args[]) {
        passwords p = new passwords();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the length you want your password to be: ");
        int len = s.nextInt();
        System.out.println("Your password is: " + p.createPassword(len));
    }

}