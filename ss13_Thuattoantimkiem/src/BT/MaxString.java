package BT;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String inpString = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i=0;i<inpString.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(inpString.charAt(i));
            for (int j=i+1;j<inpString.length();j++){
                if (inpString.charAt(j)>list.getLast()){
                    list.add(inpString.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
