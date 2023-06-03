package array;

public class Leetcode_2114_Maximum_number_of_words_found_in_sentences {


    public int mostWordsFound(String[] sentences) {
        int result = 0;
        int counter = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            counter = words.length;
            if (result < counter) result = counter;
        }
        return result;
    }
}
