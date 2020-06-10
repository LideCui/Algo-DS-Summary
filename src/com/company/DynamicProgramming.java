package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class DynamicProgramming {

    /**
     * We write the integers of A and B (in the order they are given) on two separate horizontal lines.
     *
     * Now, we may draw connecting lines: a straight line connecting two numbers A[i] and B[j] such that:
     *
     * A[i] == B[j];
     * The line we draw does not intersect any other connecting (non-horizontal) line.
     * Note that a connecting lines cannot intersect even at the endpoints: each number can only belong to one connecting line.
     *
     * Return the maximum number of connecting lines we can draw in this way.
     * @param A
     * @param B
     * @return
     */
    public int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[][] tb = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(j==0) tb[i][0]=0;
                else if(i==0) tb[0][j]=0;
                else if(A[i-1]==B[j-1]){
                    tb[i][j] = 1 + tb[i-1][j-1]; // the sequence is irreversible, the digit has been used once
                }
                else tb[i][j] = Math.max(tb[i-1][j],tb[i][j-1]); //you could add tb[i-1][j-1] , but it changes nothing

            }
        }

        return tb[m][n];
    }

    /**
     * Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.
     *
     * You have the following 3 operations permitted on a word:
     * Insert a character
     * Delete a character
     * Replace a character
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=0; i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0) dp[i][j] = j;
                else if(j==0) dp[i][j]=i;
                else if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = 1 + min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]);
            }
        }
        return dp[m][n];
    }

    private int min(int x, int y, int z) {
        int temp = x<y?x:y;
        temp = temp<z?temp:z;
        return temp;
    }

    /**
     * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0],
     * and the cost of flying the i-th person to city B is costs[i][1].
     *
     * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
     * Strictly speaking, This use greedy method.
     * @param costs
     * @return
     */
    public int twoCitySchedCost(int[][] costs) {
        Comparator<int[]> comp = (a,b) -> Math.abs(a[0]-a[1])-Math.abs(b[0]-b[1]);
        Arrays.sort(costs,comp);
/*
The order matters for int compare();
it returns negative integer, zero, or positive integer as the first argument is less than, equal, or greater then the second
 */
//        Arrays.sort(costs, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o1[1] - (o2[0] - o2[1]);
//            }
//        });

        int cityA = 0;
        int cityB = 0;
        int half = costs.length/2;
        int cost = 0;
        for(int i=costs.length-1;i>=0;i--){
            if((costs[i][0]<=costs[i][1] && cityA<half) || cityB == half){
                cost+=costs[i][0];
                cityA++;
            }else{
                cost+=costs[i][1];
                cityB++;
            }
        }
        return cost;
    }

    /**
     * You are given coins of different denominations and a total amount of money.
     * Write a function to compute the number of combinations that make up that amount.
     * You may assume that you have infinite number of each kind of coin.
     * @param amount target amount
     * @param coins values of each coin
     * @return
     */
    public int change(int amount, int[] coins) {
        int[] tb = new int[amount+1];
        tb[0] = 1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                tb[j] += tb[j-coins[i]];
            }
        }
        return tb[amount];
    }


}
