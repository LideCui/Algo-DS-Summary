package com.company;

public class UnidentifiedProblem {
    /**
     * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
     *
     * If the town judge exists, then:
     *
     * The town judge trusts nobody.
     * Everybody (except for the town judge) trusts the town judge.
     * There is exactly one person that satisfies properties 1 and 2.
     * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
     *
     * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
     * @param N
     * @param trust
     * @return
     */
    public int findJudge(int N, int[][] trust) {

    }

    /**
     * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
     *
     * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor,
     * "flood fill" the image.
     *
     * To perform a "flood fill", consider the starting pixel,
     * plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
     * plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on.
     * Replace the color of all of the aforementioned pixels with the newColor.
     *
     * At the end, return the modified image.
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
     *
     * Here, a circular array means the end of the array connects to the beginning of the array.
     * (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)
     *
     * Also, a subarray may only include each element of the fixed buffer A at most once.
     * (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)
     * @param A
     * @return
     */
    public int maxSubarraySumCircular(int[] A) {

    }

    /**
     * Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day.
     *
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
     * @param matrix
     * @return
     */
    public int countSquares(int[][] matrix) {

    }



}
