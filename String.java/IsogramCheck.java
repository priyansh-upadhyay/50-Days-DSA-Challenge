import java.util.Scanner;
import java.util.HashSet;

public class IsogramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();  // Convert to lowercase

        HashSet<Character> seen = new HashSet<>();
        boolean isIsogram = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // consider only alphabets
            if (ch >= 'a' && ch <= 'z') {
                if (seen.contains(ch)) {
                    isIsogram = false;
                    break;
                }
                seen.add(ch);
            }
        }

        if (isIsogram)
            System.out.println("The string is an Isogram.");
        else
            System.out.println("The string is NOT an Isogram.");
    }
}