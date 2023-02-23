package practiceexamples;

import java.util.Scanner;

public class Login {
    private static final String USERNAME = "ericsson_tanyaarora";
    private static final String PASSWORD = "Welcome@1";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = input.next();
        System.out.println("Enter password:");
        String password = input.next();
        try {
            if (!username.equals(USERNAME) || !password.equals(PASSWORD)) {
                throw new InvalidCredentialsException("Invalid username or password.");
            }
            System.out.println("Login successful.");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String errorMessage) {
            super(errorMessage);
        }
    }
}
