package BT.StopWatch;
import java.util.Random;
public class main {
    void sort(int[] arr){
        int n = arr.length;
        for (int i = 0;i<n;i++){
            int min = i;
            for (int j=i+1;j<n;i++){
                if (arr[j]<arr[min]){
                    min = j;
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        main obj = new main();
        StopWatch stopWatch = new StopWatch();
        int arr[] =new int[100];
        for (int i =0;i<100;i++){
            Random random = new Random();
            int ranNum = random.nextInt(100)+1;
            arr[i] = ranNum;
        }
        stopWatch.start();
        obj.sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
