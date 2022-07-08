package BT.treemap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordOnTreeMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi để bắt đầu đếm ký tự: ");
        String str = scanner.nextLine();
        for (int i=0;i<str.length();i++){
            char charAt = str.toLowerCase().charAt(i);
            if (map.get(charAt) != null){
                int count = map.get(charAt);
                map.put(charAt,++count);
            }else{
                map.put(charAt,1);
            }
        }
        System.out.println("Số lượng ký tự có trong chuỗi: ");
        System.out.println(map);
    }
}
