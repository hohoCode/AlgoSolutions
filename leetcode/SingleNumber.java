/*
 * Given an array of integers, every element appears twice except for one. Find that single one.

 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 */
public class SingleNumber {
/*  public int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) {
            map.put(A[i], map.containsKey(A[i]) ? map.get(A[i]) + 1 : 1);
        }
        int i = 0;
        while(map.get(A[i]) == 2) {
            i++;
        }
        return A[i];
    }
*/

    public int singleNumber(int[] A) {
        int result = 0;
        for(int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}
