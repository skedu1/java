 import java.util.Scanner;

public class parta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String modifiedString = modifyString(inputString);
        System.out.println("Modified string:");
        System.out.println(modifiedString);

        String originalWithToggledCase = toggleCase(inputString);
        System.out.println(originalWithToggledCase);
    }

    private static String modifyString(String input) {
        StringBuilder modifiedString = new StringBuilder();

        for (String word : input.split("\\s+")) {
            if (word.length() % 2 == 0) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length - 1; i += 2) {
                    char temp = chars[i];
                    chars[i] = chars[i + 1];
                    chars[i + 1] = temp;
                }
                modifiedString.append(new String(chars)).append(" ");
            }
        }

        return toggleCase(modifiedString.toString());
    }

    private static String toggleCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}