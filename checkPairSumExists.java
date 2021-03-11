/**
The following function returns a boolean value representing if there is a pair with given sum exists in the array.
The following code compiles successfully but fails to return the desired result. Your task is to fix the code so that it passes all test cases.
 */
import java.util.*;
import java.io.*;
import java.lang.*;

public class Solution {
    public boolean checkPairSumExists(int rows, int cols, int[][] arr, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols ; j++) {
                if(set.contains(sum - arr[i][j])) {
                    return true;
                } else {
                    set.add(arr[i][j]); //add no. being searched for to set so that we keep looking for it
                }
            }
        }
        return false;
    }
}
