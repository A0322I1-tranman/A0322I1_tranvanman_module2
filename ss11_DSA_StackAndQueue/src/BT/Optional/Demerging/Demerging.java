package BT.Optional.Demerging;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Person[] people= new Person[4];
        people[0] = new Person("Doan Nha", true,"17/7/1993");
        people[1] = new Person("Dinh Long",false,"14/05/1997");
        people[2] = new Person("Hoang Dung",false,"25/05/1991");
        people[3] = new Person("Vy Oanh", true,"14/02/1996");
        Queue<Person> Men = new LinkedList<>();
        Queue<Person> Women = new LinkedList<>();
        System.out.println("Before sort: ");
        for (Person value: people){
            System.out.println(value.toString());
            System.out.println("-----------");
            if (value.isGioiTinh()){
                Men.add(value);
            }else {
                Women.add(value);
            }
        }
        String out = "";
        while (!Women.isEmpty()){
            out +=Women.poll().toString()+"\n";
        }
        while (!Men.isEmpty()){
            out +=Men.poll().toString() +"\n";
        }
        System.out.println("After sort: ");
        System.out.println(out);
    }
}
