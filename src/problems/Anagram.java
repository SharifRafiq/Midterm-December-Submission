package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String word = "sharif";
        String anagram = "rifash";
        System.out.println("sharif and rifash are anagram: " + isAnagram(word, anagram));
    }

    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length())
            return false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else
                return false;
        }
        return anagram.isEmpty();
    }
}
