//String with Maximum Vowels

public class MaxVowelStringFinder {

    public static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String getStringWithMaxVowels(String[] words) {
        String result = "";
        int maxVowels = -1;
        for (String word : words) {
            int vowelCount = countVowels(word);
            if (vowelCount > maxVowels) {
                maxVowels = vowelCount;
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        System.out.println(getStringWithMaxVowels(input));  // Resourceful
    }

}
