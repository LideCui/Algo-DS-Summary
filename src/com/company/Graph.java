package com.company;

import java.util.*;

public class Graph {

    /**
     * Given a set of N people (numbered 1, 2, ..., N), we would like to split everyone into two groups of any size.
     *
     * Each person may dislike some other people, and they should not go into the same group.
     *
     * Formally, if dislikes[i] = [a, b], it means it is not allowed to put the people numbered a and b into the same group.
     *
     * Return true if and only if it is possible to split everyone into two groups in this way.
     * @param N
     * @param dislikes
     * @return
     */
    public boolean possibleBipartition(int N, int[][] dislikes) {

    }


    /**
     * There are n cities connected by m flights. Each flight starts from city u and arrives at v with a price w.
     *
     * Now given all the cities and flights, together with starting city src and the destination dst,
     * your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.
     * @param n
     * @param flights
     * @param src
     * @param dst
     * @param K
     * @return
     */
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int minPathcost = Integer.MAX_VALUE;
        Map<Integer, List<int[]>> graph = createGraph(flights);

        int step =0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src,0});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] currentStop = q.poll();
                if(currentStop[0] ==dst)
                    minPathcost = Math.min(minPathcost,currentStop[1]);
                if(!graph.containsKey(currentStop[0]))
                    continue;
                for(int[] flight : graph.get(currentStop[0])){
                    if (currentStop[1] + flight[1] > minPathcost)
                        continue;
                    q.add(new int[]{flight[0], currentStop[1] + flight[1]});
                }
            }
            if (step++ > K)
                break;
        }

        return minPathcost == Integer.MAX_VALUE ? -1: minPathcost;
    }

    /**
     * DFS solution
     */
    int minPathCost;

    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int K) {
        minPathCost = Integer.MAX_VALUE; // initialize the minPathCost with Integer.MAX_VALUE
        Map<Integer, List<int[]>> graph = createGraph(flights); // create graph

        dfs(graph, src, dst, K + 1, 0); // K stop => K + 1 edges
        return minPathCost == Integer.MAX_VALUE ? -1 : minPathCost;
    }

    private void dfs(Map<Integer, List<int[]>> graph, int src, int dst, int k, int currentCost) {
        if (k < 0) return; // if covered k stops and not reached destination
        if (src == dst) { // if reached destination currentCost is minPathCost
            minPathCost = currentCost;
            return;
        }
        if (!graph.containsKey(src))
            return;
        for (int[] flight : graph.get(src)) {
            if (currentCost + flight[1] > minPathCost) // cost + current flight cost > minPathCost discard that path ~ pruning
                continue;
            dfs(graph, flight[0], dst, k - 1, currentCost + flight[1]);
        }
    }

    private Map<Integer, List<int[]>> createGraph(int[][] flights) {
        Map<Integer, List<int[]>> graph = new HashMap<>(); // direct stops + cost to reach that stop
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList<>());
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }
        return graph;
    }

}
