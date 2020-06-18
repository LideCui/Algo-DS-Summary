package com.company;

import java.util.*;

public class UnidentifiedProblem {
    /**
     * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
     * <p>
     * If the town judge exists, then:
     * <p>
     * The town judge trusts nobody.
     * Everybody (except for the town judge) trusts the town judge.
     * There is exactly one person that satisfies properties 1 and 2.
     * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
     * <p>
     * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
     *
     * @param N
     * @param trust
     * @return
     */
    public int findJudge(int N, int[][] trust) {

    }

    /**
     * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
     * <p>
     * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor,
     * "flood fill" the image.
     * <p>
     * To perform a "flood fill", consider the starting pixel,
     * plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
     * plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on.
     * Replace the color of all of the aforementioned pixels with the newColor.
     * <p>
     * At the end, return the modified image.
     *
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

    }

    /**
     * Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.
     * <p>
     * Here, a circular array means the end of the array connects to the beginning of the array.
     * (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)
     * <p>
     * Also, a subarray may only include each element of the fixed buffer A at most once.
     * (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)
     *
     * @param A
     * @return
     */
    public int maxSubarraySumCircular(int[] A) {

    }

    /**
     * Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day.
     * <p>
     * The span of the stock's price today is defined as the maximum number of consecutive days
     * (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.
     */
    class StockSpanner {

        public StockSpanner() {
        }

        public int next(int price) {

        }
    }

    /**
     * Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
     *
     * @param matrix
     * @return
     */
    public int countSquares(int[][] matrix) {

    }

    class RandomizedSet {
        Map<Integer, Integer> map;
        List<Integer> list;
        Random random;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(!map.containsKey(val)) {
                map.put(val, list.size());
                list.add(val);
                return true;
            }
            return false;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if(map.containsKey(val)) {
                int index = map.remove(val);
                int lastElement = list.get(list.size() - 1);
                if(lastElement != val) {
                    list.set(index, lastElement);
                    map.put(lastElement, index);
                }
                list.remove(list.size() - 1);
                return true;
            }
            return false;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }

    /**
     * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
     * A region is captured by flipping all 'O's into 'X's in that surrounded region.
     *
     * Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'.
     * Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'.
     * Two cells are connected if they are adjacent cells connected horizontally or vertically.
     * @param board
     */
    public void solve(char[][] board){
        if(board.length==0) return;
        int init_row = 0;
        for(int j=0;j<board[0].length;j++){
            processBorder(board, init_row,j);
        }

        int last_row  = board.length-1;
        for(int j=0;j<board[last_row].length;j++){
            processBorder(board,last_row,j);
        }

        int init_col = 0;
        for(int i=0;i<board.length;i++){
            processBorder(board,i,init_col);
        }

        int last_col = board[0].length-1;
        for(int i=0;i<board.length;i++){
            processBorder(board,i,last_col);
        }

        refreshBoard(board);
    }

    private void refreshBoard(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Z') board[i][j]='O';
                else board[i][j]='X';
            }
        }
    }

    private void processBorder(char[][] board, int i, int j) {
        if(i<0 || j<0 || i>board.length-1 || j>board[i].length-1) return;
        if(board[i][j]=='X') return;

        if(board[i][j]=='O'){
            board[i][j]='Z';
            processBorder(board,i-1,j);
            processBorder(board,i,j-1);
            processBorder(board,i+1,j);
            processBorder(board,i,j+1);
        }
    }

}}
