public class Trapped_Water {
    public static void main(String[] args) {
        int[] arr  = {4,2,0,6,3,2,5};
        int ans = trappedRain(arr);
        System.out.println(ans);
    }

    public static int trappedRain(int[] heigth){
        int n = heigth.length;

        // Calulate Left max boundary - Array
        int[] leftMax = new int[n];
        leftMax[0]  = heigth[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heigth[i], leftMax[i-1]);
        }

        // Calulate Right max boundary - Array
        int[] righthMax = new int[n];
        righthMax[n-1]  = heigth[n-1];
        for (int i = n-2; i >= 0; i--) {
            righthMax[i] = Math.max(heigth[i], righthMax[i+1]);
        }

        int trapped_water = 0;

        //Loop
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i],righthMax[i]);
            trapped_water = trapped_water + waterLevel - heigth[i];
        }

        return trapped_water;
    }
}
