package BackTracking;


import java.util.ArrayList;
import  java .util.Arrays;
public class Maze {
    public static  void main (String[] args) {

        //System.out.println(maze(2,2));
        //  maze2("",3,3);
       // System.out.println(maze4("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        int[][] path = new int[board.length][board[0].length];

        //maze5("", board, 0, 0);
        //allPaths("", board, 0, 0);
        allPrintPaths("",board,0,0,path,0);
    }
 /*   public static int maze(int r, int  c){

if(r == 1 || c == 1){

   return 1;
}

int right = maze(r-1,c);
int left = maze(r,c - 1);
return right + left;
    }
}*/

//function individual string
    public static void maze2(String p,int r, int c){

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            maze2(p+"d",r -1,c);
        }
        if(c > 1){
            maze2(p+"r",r,c - 1);
        }
    }

    //return list
    public static ArrayList<String> maze3(String p, int r, int c){

        if(r == 1 && c == 1){
            ArrayList <String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList <String> list  = new ArrayList<>();

        if(r > 1){
            list.addAll(maze3(p+"d",r -1,c));
        }
        if(c > 1){
            list.addAll(maze3(p+"r",r,c - 1));
        }
        return list;
    }



    //also diagonal path

    public static ArrayList<String> maze4(String p, int r, int c){

        if(r == 1 && c == 1){
            ArrayList <String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList <String> list  = new ArrayList<>();


        if(r>1 && c>1){
            list.addAll(maze4(p+"D",r -1,c - 1));
        }
        if(r > 1){
            list.addAll(maze4(p+"V",r -1,c));
        }
        if(c > 1){
            list.addAll(maze4(p+"H",r,c - 1));
        }
        return list;
    }


    //path with obstacles
     public static void maze5(String p,boolean [][] maze, int r,int c) {

         if (r == maze.length - 1 && c == maze[0].length - 1) {
             System.out.println(p);
             return;
         }
         if (!maze[r][c]) {
             return;
         }
         if (r < maze.length - 1) {

             maze5(p + "D", maze, r + 1, c);
         }
         if (c < maze[0].length - 1) {
             maze5(p + "R", maze, r, c + 1);
         }
     }


        //all paths (Left,Right,Top,Down)
         public  static  void allPaths(String p, boolean[][] maze, int r, int c){
             if (r == maze.length - 1 && c == maze[0].length - 1) {
                 System.out.println(p);
                 return;
             }
             if (!maze[r][c]) {
                 return;
             }
             //considering matrix cell in my path
             maze[r][c] = false;
             if (r < maze.length - 1) {

                 allPaths(p + "D", maze, r + 1, c);
             }
             if (c < maze[0].length - 1) {
                 allPaths(p + "R", maze, r, c + 1);
             }
             if(r > 0){
                 allPaths(p + "U", maze, r - 1, c);
             }
             if(c > 0){
                 allPaths(p + "L", maze, r, c - 1);
             }

             maze[r][c] = true;
         }



         //to print all paths


    public  static  void allPrintPaths(String p, boolean[][] maze, int r, int c,int[][] path,int step){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        //considering matrix cell in my path
        path[r][c] = step;
        maze[r][c] = false;
        if (r < maze.length - 1) {

            allPrintPaths(p + "D", maze, r + 1, c,path,step + 1);
        }
        if (c < maze[0].length - 1) {
            allPrintPaths(p + "R", maze, r, c + 1,path,step + 1);
        }
        if(r > 0){
            allPrintPaths(p + "U", maze, r - 1, c,path,step + 1);
        }
        if(c > 0){
            allPrintPaths(p + "L", maze, r, c - 1,path,step + 1);
        }

        maze[r][c] = true;
        path[r][c] =0;
    }
}







