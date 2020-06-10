package com.company;

import java.util.List;

// String and arrays can be put together
public class PlayWithStrings {
    /**
     *
     * @param J
     * @param S
     * @return how many stones are also jewels
     */
    public int numJewelsInStones(String J, String S) {

    }

    /**
     * if a ransom note can be construct from a magazine
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {

    }

    /**
     * Given a string, find the first non-repeating character in it and return it's index.
     * If it doesn't exist, return -1.
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {

    }

    /**
     * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
     *
     * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
     *
     * The order of output does not matter.
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {

    }

    /**
     * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
     * In other words, one of the first string's permutations is the substring of the second string.
     * @param s1
     * @param s2
     * @return
     */
    public boolean checkInclusion(String s1, String s2) {

    }

    /**
     * Given a string, sort it in decreasing order based on the frequency of characters.
     * @param s
     * @return
     */
    public String frequencySort(String s) {
        int[] tb = new int[256];
        for(int i=0; i<s.length();i++){
            tb[s.charAt(i)]++;
        }



    }


    /**
     * Write a function that reverses a string. The input string is given as an array of characters char[].
     *
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * You may assume all the characters consist of printable ascii characters.
     * @param s
     */
    public void reverseString(char[] s) {
        int start = 0;
        int last = s.length-1;
        for(;start<s.length/2;start++){
            char temp = s[start];
            s[start] = s[last];
            s[last] = temp;
            last--;
        }
    }

    /**
     * Given a string s and a string t, check if s is subsequence of t.
     *
     * A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
     * (ie, "ace" is a subsequence of "abcde" while "aec" is not).
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()){
            // indexOf: search a char from index n
            index = t.indexOf(c, index + 1);
            if (index == -1)
                return false;
        }
        return true;
    }

    /**
     * Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * You may assume no duplicates in the array.
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid= left + (right-left)/2;
            System.out.println("nums[mid]: "+nums[mid]);
            if(target<nums[mid]){
                right = mid;
            }else if(target>nums[mid]){
                left = mid+1;
            }else{
                return mid;
            }
        }
        int index = left+(right-left)/2;
        return target>nums[nums.length-1]?index+1:index;
    }


}
