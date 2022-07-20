package BT.Optinal;

public class BinarSearching {
    static int[] list = {1,4,5,2,3,6,9,8,7,4,55,45,78};
    public static void sortASC(int[] arr){
        int temp = arr[0];
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");;
        }
    }
    public static int binarysearch(int[] arr, int value,int left, int right){
        int mid = (left + right)/2;
        if (right<= left){
            return -1;
        }else {
            if (arr[mid]<value){
                return binarysearch(arr, value, left+1, right);
            }
            if (arr[mid]>value){
                return binarysearch(arr, value, left, right-1);
            }
            if (arr[mid]==value){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarysearch(list,9,1,15));

    }
}
