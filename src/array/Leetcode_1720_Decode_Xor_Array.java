package array;

public class Leetcode_1720_Decode_Xor_Array {

    public int[] decode(int[] encoded, int first) {
        int[] result = null;
        result = new int[encoded.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i == 0) result[i] = first;
            else result[i] = encoded[i-1] ^ result[i-1];
        }
        return result;
    }
}
