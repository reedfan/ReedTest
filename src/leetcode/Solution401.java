package leetcode;

/*created by fanqunsong
    Date : 2017/12/21
    Time : 16:59
    */
/*
 Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space to hold additional elements from B.
The number of elements initialized in A and B are m and n respectively.
 */

/*
tips:从后往前记录
 */
public class Solution401 {
    public void merge(int A[], int m, int B[], int n) {
        int j = m+n-1;
        m--;
        n--;
        while(m>=0 && n>=0){
            A[j--] = A[m] > B[n]? A[m--] : B[n--];
        }
        if(n>=0){
            while (n>=0){
                A[j--] = B[n--];
            }
        }
    }
}
