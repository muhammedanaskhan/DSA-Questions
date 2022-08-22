package com.mazeProblems;

import java.util.ArrayList;

public class RorDdirection {
    public static void main(String[] args){
//        System.out.println(maze(3,3));
//        mazepath("",3,3);
        Boolean maze[][] = {
                {true, true, true},
                {false, true, true},
                {true, true, true}
        };
        System.out.println(mazepathObstacle("",maze,0,0));
    }

    public static int maze( int r, int c){
        if( r==1 || c==1 ){
            return 1;
        }
        int left = maze(r-1, c);
        int right = maze(r,c-1);
        int path= left +right;
        return path;
    }

    static void mazepath(String p, int r, int c){
        if( r==1 && c==1 ){
            System.out.println(p);
            return;
        }
        if(r>1){
            mazepath(p+'D',r-1,c);
        }
        if(c>1){
            mazepath(p+'R',r,c-1);
        }
    }

    static ArrayList<String> mazepathArray(String p, int r, int c){
        if( r==1 && c==1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(mazepathArray(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(mazepathArray(p+'R',r,c-1));
        }return list;
    }

    static ArrayList<String> mazepathArrayDiagonally(String p, int r, int c){
        if( r==1 && c==1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(mazepathArrayDiagonally(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(mazepathArrayDiagonally(p+'H',r,c-1));
        }
        if(r>1 && c>1){
            list.addAll(mazepathArrayDiagonally(p+'D',r-1,c-1));
        }
        return list;
    }

    static ArrayList<String> mazepathObstacle (String p, Boolean maze[][],int r, int c){
        if( r==maze.length-1 && c==maze[0].length-1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(maze[r][c] == false){
            return list;
        }

        if(r<maze.length-1){
            list.addAll(mazepathObstacle(p+'V',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(mazepathObstacle(p+'H',maze,r,c+1));
        }
        if(r<maze.length-1 && c<maze[0].length-1){
            list.addAll(mazepathObstacle(p+'D',maze,r+1,c+1));
        }
        return list;
    }
}