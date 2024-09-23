package problems;

import java.util.List;

public class Nr_824_GoatLatin {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String goatSentence = "";

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (int index = 0; index < words.length; index++) {
            String word = words[index];

            if (!vowels.contains(word.charAt(0))) {
                String firstLetter = word.substring(0, 1);
                word = word.substring(1) + firstLetter;
            }

            word = word + "ma";

            for (int indexPlusOne = index + 1; 0 < indexPlusOne; indexPlusOne--) {
                word = word + "a";
            }

            goatSentence += word + " ";
        }

        return goatSentence.trim();
    }
}
