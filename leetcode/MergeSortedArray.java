/*
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.

 * Note:
 * You may assume that A has enough space to hold additional elements from B. 
 * The number of elements initialized in A and B are m and n respectively.
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int end = m + n - 1;
        m--;
        n--;
        while(m >= 0 && n >= 0) {
            if(A[m] >= B[n]) 
                A[end--] = A[m--];
            else 
                A[end--] = B[n--];
        }
        while(n >= 0) {
            A[end--] = B[n--];
        }
    }
}
