public class SortestPath {
    public static void main(String[] args) {
       String path = "WNEENESENNN";
       float ans = Sortest(path);
        System.out.println(ans);
    }

    public static float Sortest(String path){
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            //South
            if (dir == 'S'){
                y--;
            }else if(dir == 'N'){  //North
                y++;
            }else if (dir == 'W'){
                x--;
            }else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2 + y2);
    }
}
