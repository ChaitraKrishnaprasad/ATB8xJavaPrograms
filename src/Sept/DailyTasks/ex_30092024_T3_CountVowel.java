package Sept.DailyTasks;

public class ex_30092024_T3_CountVowel {
    public static void main(String[] args) {
        String str = "pramod";
        int vowel = 0;
        int consonants = 0;
        str=str.toLowerCase();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' ||ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            else if (ch>='a' && ch <='z'){
                consonants++;
            }
        }
        System.out.println("Vowels: "+ vowel);
        System.out.println("Consonants: "+ consonants);
    }
}
