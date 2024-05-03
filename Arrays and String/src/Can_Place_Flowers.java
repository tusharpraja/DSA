public class Can_Place_Flowers {

    public static void main(String[] args) {
        int[] flow = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flow,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0)
            return true;
        for(int i=0; i<flowerbed.length; i=i+2){
            if(i+1<flowerbed.length && flowerbed[i+1] == 1)
                i++;
            else if(flowerbed[i] == 0){
                n--;
                if(n<=0)
                    return true;
            }
        }
        return false;
    }
}

//Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
