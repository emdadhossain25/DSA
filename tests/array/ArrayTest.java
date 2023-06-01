package array;

import com.google.common.truth.Truth;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class ArrayTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    Array<Integer> sut;
    int index = 0;
    int element = 1;

    @Before
    public void setUp() {
        sut = new Array<>();
    }

    @Test
    public void testLengthIsZero() {
        Truth.assertThat(sut.length).isEqualTo(0);
    }

    @Test
    public void testConstructorsAndCapacityIs16() {
        // as constructor initialized the capacity to 16
        // this test also tests the both variants of constructors
        Truth.assertThat(sut.capacity).isEqualTo(16);
    }

    @Test
    public void testSize() {
        Truth.assertThat(sut.size()).isEqualTo(0);
    }

    @Test
    public void testIsEmpty() {
        Truth.assertThat(sut.isEmpty()).isTrue();
    }

    @Test
    public void test_get_IllegalArgumentEx_ForNullArray() {
        exceptionRule.expect(ArrayIndexOutOfBoundsException.class);
        exceptionRule.expectMessage("index is out of bound");
        sut.get(-1);
    }


    @Test
    public void test_setElement() {
        exceptionRule.expect(ArrayIndexOutOfBoundsException.class);
        exceptionRule.expectMessage("index is out of bound");
        sut.set(index, element);
//        Truth.assertThat(sut.set(index, element)).isEqualTo(1);
    }



    @Test
    public void test_Clear() {
        sut.clear();
        Truth.assertThat(sut.length).isEqualTo(0);

    }


    @After
    public void tearDown() {

    }
}