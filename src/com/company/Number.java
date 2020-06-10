package com.company;

public class Number {
    /**
     * The complement strategy is to flip the bits of its binary representation
     * @param num a positive integer
     * @return num's complement
     */
    public int findComplement(int num) {

    }

    /**
     * Given an array of size n, find the majority element.
     * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

    }

    /**
     * given an array of coordinates, check if they construct a straight line
     * @param coordinates
     * @return
     * hint: use cross product
     */
    public boolean checkStraightLine(int[][] coordinates) {

    }

    /**
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {

    }

    /**
     * You are given a sorted array consisting of only integers where every element appears exactly twice,
     * except for one element which appears exactly once.
     * Find this single element that appears only once.
     * Given a positive integer num, write a function which returns True if num is a perfect square else False.
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {

    }

    /**
     * Given a non-negative integer num represented as a string,
     * remove k digits from the number so that the new number is the smallest possible.
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits(String num, int k) {

    }

    /**
     * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {

    }

    /**
     * Given a non negative integer number num.
     * For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array
     * @param num
     * @return
     */
    public int[] countBits(int num) {

    }

    /**
     * Given an array w of positive integers, where w[i] describes the weight of index i,
     * write a function pickIndex which randomly picks an index in proportion to its weight.
     */
    public class Solution {
        int[] v;
        public Solution(int[] w){
            for(int i=1;i<w.length;i++){
                w[i]=w[i-1];
            }
            v=w;
        }

        public int pickIndex() {
            int rand = (int) Math.random()* v[v.length-1]+1; //random a index
            int left=0,right=v.length-1;
            while(left<right){
                int mid = left + (right-left)/2;
                if(v[mid]<=rand) left = mid+1;
                else right = mid;
            }
            return right;
        }
    }

    /**
     * Given an integer, write a function to determine if it is a power of two.
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
//        if(n<=0){
//            return false;
//        }
//        if( n==1){
//            return true;
//        }
//        while(n>1){
//            int m = (n>>1)<<1;
//            if(m!=n) return false;
//            n = n>>1;
//        }
//        return true;

        if(n<=0)
            return false;
        return (n&(-n)) == n;
    }
}
