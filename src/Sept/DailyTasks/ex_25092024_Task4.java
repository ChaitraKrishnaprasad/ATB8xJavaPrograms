package Sept.DailyTasks;

public class ex_25092024_Task4 {
    public static void main(String[] args) {

        // Count vowels and consonants in a String. (pramod) - v = 2 , c = 4
        String str = "pramod";  // Input string
        int vowel = 0;
        int consonant = 0;

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // Get each character

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            // Check if the character is a consonant (alphabet but not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }

        // Output the results
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
