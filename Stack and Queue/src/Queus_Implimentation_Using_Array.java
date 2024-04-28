import java.util.Arrays;

public class Queus_Implimentation_Using_Array {
    public static class queusA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
            if (r == arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if (f == -1){
                f = r = 0;
            }
            else {
                arr[++r] = val;
            }
            size++;
        }

        public int remove(){
            if (size ==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        public int peek(){
            if (size ==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            if (size == 0){
                return true;
            }
            return false;
        }

        public void display(){
            if (size == 0){
                System.out.println("Queue is empty!");
            }
            else {
                for (int i = f; i < r; i++) {
                    System.out.println(arr[i] + "");
                }
            }
        }
    }

    public static void main(String[] args) {
        queusA q = new queusA();
        q.add(3);
        q.add(45);
        q.add(8);
        q.display();
    }
}
