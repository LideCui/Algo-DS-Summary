package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        new DynamicProgramming().twoCitySchedCost(costs);
    }

    private static void print2DArray(int[][] res) {
        System.out.println();
        for(int[] gap: res){
            System.out.print("["+gap[0]+","+gap[1]+"]");
        }
        System.out.println();
    }
}
