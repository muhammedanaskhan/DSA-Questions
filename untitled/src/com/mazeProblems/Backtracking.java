package com.mazeProblems;

import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
        Boolean maze[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(allpaths("",maze,0,0));
    }
    static ArrayList<String> allpaths(String p, Boolean maze[][], int r, int c){
        if( r==maze.length-1 && c==maze[0].length-1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(maze[r][c] == false){
            return list;
        }

        // considering this block in the path
        maze[r][c] = false;

        if(r<maze.length-1){
            list.addAll(allpaths(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(allpaths(p+'R',maze,r,c+1));
        }
        if(r<maze.length-1 && c<maze[0].length-1){
            list.addAll(allpaths(p+'I',maze,r+1,c+1));
        }
        // left direction
        if(c>0){
            list.addAll(allpaths(p+'L',maze,r,c-1));
        }
        //  UP direction

        if(r>0){
            list.addAll(allpaths(p+'U',maze,r-1,c));
        }

        maze[r][c]= true;
        return list;
    }
}
