package BackTracking;

public class BT {

    public static int mazepath(int sr , int sc, int er , int ec){
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;

        int downways = mazepath(sr + 1, sc, er, ec);  
        int rightways = mazepath(sr, sc + 1, er, ec); 
        return downways + rightways;
    }

    public static void mazepathvalue(int sr,int sc,int er, int ec, String s){
       if(sr > er || sc > ec) return ;
        if(sr == er && sc == ec)  {
        System.out.println(s);
        return;
        }
        mazepathvalue(sr+1, sc, er, ec,s+"D");
        mazepathvalue(sr, sc+1, er, ec, s+"R");

    }
    public static int countPathsInMaze(int[][] maze, int sr, int sc, int er, int ec) {
    int n = maze.length;
    int m = maze[0].length;

    if (sr > er || sc > ec) return 0;
    if (maze[sr][sc] == 0) return 0; 
    if (sr == er && sc == ec) return 1;

    int down = 0, right = 0;
    if (sr + 1 <= er) down = countPathsInMaze(maze, sr + 1, sc, er, ec);
    if (sc + 1 <= ec) right = countPathsInMaze(maze, sr, sc + 1, er, ec);

    return down + right;
}


    public static void main(String[] args) {
        System.out.println(mazepath(1, 1, 2, 2)); 
        mazepathvalue(1, 1, 9, 9, "");
    }
}
