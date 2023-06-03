package array;

import com.google.common.truth.Truth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_2114_Maximum_number_of_words_found_in_sentencesTest {

    Leetcode_2114_Maximum_number_of_words_found_in_sentences sut;

    @Before
    public void setUp() throws Exception {
        sut = new Leetcode_2114_Maximum_number_of_words_found_in_sentences();
    }

    @Test
    public void mostWordsFound() {
        int result = 6;
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        Truth.assertThat(sut.mostWordsFound(sentences))
                .isEqualTo(result);
    }

    @Test
    public void mostWordsFound2() {
        int result = 3;
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        Truth.assertThat(sut.mostWordsFound(sentences))
                .isEqualTo(result);
    }
}