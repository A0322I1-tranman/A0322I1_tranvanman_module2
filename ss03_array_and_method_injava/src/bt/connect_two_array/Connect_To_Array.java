package bt.connect_two_array;
public class Connect_To_Array {
    public static void main(String[] args) {
       int[] arr1={4,2,6};
       int[] arr2={3,7,8};
       int length = arr1.length+arr2.length;
       int[] arr3 = new int[length];
       int index = 0;
       for (int element : arr1){
           arr3[index] = element;
           index++;
       }
       for (int element : arr2){
           arr3[index] = element;
           index++;
       }
       for (int element1 : arr3){
           System.out.print(element1 + "\t");
       }
    }
}
