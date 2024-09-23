package Problems;

import java.util.List;

public class Nr_824_GoatLatin {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String goatSentence = "";

        List<String> vowels = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");

        for (int index = 0; index < words.length; index++) {
            String word = words[index];

            if (!vowels.contains(word.charAt(0))) {
                word = word.substring(1);
            }

            word = word + "ma";

            for (int indexPlusOne = index + 1; indexPlusOne < words.length; indexPlusOne++) {
                word = word + "a";
            }

            goatSentence += word + " ";
        }

        return goatSentence.trim();
    }
}
