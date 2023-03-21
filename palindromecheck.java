 import java.util.Scanner;
public class palindromecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the start index of the substring: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index of the substring: ");
        int end = scanner.nextInt();

        String substring = sentence.substring(start, end+1);

        boolean isPalindrome = true;
        int length = substring.length();
        for (int i = 0; i < length / 2; i++) {
            if (substring.charAt(i) != substring.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The substring is a palindrome.");
        } else {
            System.out.println("The substring is not a palindrome.");
        }
    }
}
