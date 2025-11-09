import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase to handle case-insensitive counting
        str = str.toLowerCase();

        // Create a HashMap to store character frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // Traverse the string
        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        // Print character frequencies
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
