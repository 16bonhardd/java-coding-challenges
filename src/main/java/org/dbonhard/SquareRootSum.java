package org.dbonhard;


public class SquareRootSum {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long) Math.sqrt(c);
        while (start <= end) {
            if (((start * start) + (end * end)) > c) {
                end--;
            }
            if (((start * start) + (end * end)) < c) {
                start++;
            }
            if ((start * start + end * end) == c) {
                return true;
            }
        }
        return false;

    }
}
