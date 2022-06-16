package bt.countchar;
import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        String chuoi;
        char ktu = 'b';
        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        for (int i=0;i<chuoi.length();i++){
            if (chuoi.charAt(i)==ktu){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + ktu + " trong chuỗi " + chuoi+" là: " +count);
    }
}
