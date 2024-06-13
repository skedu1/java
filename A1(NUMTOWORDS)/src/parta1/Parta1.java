import java.util.Scanner;

public class parta1 {
    private static final String[] units = {
        "", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
    };
    private static final String[] teens = {
        "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
        "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"
    };
    private static final String[] tens = {
        "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println(convertToWords(number));
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "ZERO";
        }
        if (number < 0 || number > 99999) {
            return "Number out of range";
        }

        String word = "";
        if (number >= 1000) {
            word += convertToWords(number / 1000) + " THOUSAND ";
            number %= 1000;
        }
        if (number >= 100) {
            word += units[number / 100] + " HUNDRED ";
            number %= 100;
        }
        if (number >= 20) {
            word += tens[number / 10] + " ";
            number %= 10;
        }
        if (number >= 10) {
            word += teens[number - 10] + " ";
        } else if (number > 0) {
            word += units[number] + " ";
        }

        return word.trim();
    }
}