package com.Graph;

import java.util.ArrayList;

public class demo {
    static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
           this.src=src;
           this.nbr = nbr;
           this.wt=wt;
        }
    }

    public static void main(String[] args) {
        int vertices=7;

        ArrayList<Edge>[] graph = new ArrayList[7];
        for(int i = 0 ; i < vertices ; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        //graph[0].add(new Edge(0,3,40));

       // graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,0,10));

        //graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,10));

       // graph[3].add(new Edge(3,0,40));
        graph[3].add(new Edge(3,2,10));
       // graph[3].add(new Edge(3,4,2));

        //graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,3));
        graph[4].add(new Edge(4,6,8));

        graph[5].add(new Edge(5,4,3));
        graph[5].add(new Edge(5,6,3));

        graph[6].add(new Edge(6,5,3));
        graph[6].add(new Edge(6,4,8));


        boolean visited[] = new boolean[7];

        //System.out.println(hasPath(graph,0,6,visited));
        //printAllPaths(graph,0,6,visited,"0");

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        for(int v = 0 ; v < vertices ; v++){
            if(visited[v]==false){
                ArrayList<Integer> comp = new ArrayList<>();
                connectedcomps(graph,comp, v,visited);
                comps.add(comp);
            }

        }

        System.out.println(comps.toString());
    }

    private static boolean hasPath(ArrayList<Edge>[] graph, int src, int dst, boolean[] visited) {
        if(src==dst){
            return true;
        }
        visited[src]=true;
        for(Edge edge : graph[src]){
            if(visited[edge.nbr]==false){
                boolean hasNbrPath = hasPath(graph, edge.nbr,dst,visited);
                if(hasNbrPath==true){
                    return true;
                }
            }

        }
        return false;
    }

    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dst, boolean visited[], String psf){
        if(src==dst){
            System.out.println(psf);
            return;
        }
        visited[src]= true;
        for(Edge edge: graph[src]){
            if (visited[edge.nbr] == false) {

                printAllPaths(graph, edge.nbr, dst, visited,psf+edge.nbr);
            }
        }
        visited[src]= false;
    }


    //This function 'll add integers to the comp ArrayList passed in the argument!!
    static void connectedcomps( ArrayList<Edge>[] graph, ArrayList<Integer> comp, int src, boolean visited[]){
        visited[src]=true;
        comp.add(src);

        for(Edge e: graph[src]){
            if(!visited[e.nbr]){
                connectedcomps(graph,comp, e.nbr,visited);
            }
        }
    }

}
