package TH.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStu {
    public static void main(String[] args) {
     Student student1 = new Student("Đoàn Trần",25,"Đà Nẵng");
     Student student2 = new Student("Đoàn Tống",29,"Hà Nội");
     Student student3 = new Student("Đoàn Trân",27,"Huế");
     Map<Integer,Student> studenMap = new HashMap<>();
     studenMap.put(1,student1);
     studenMap.put(2,student2);
     studenMap.put(3,student3);
     for (Map.Entry<Integer,Student> students : studenMap.entrySet()){
         System.out.println(students.toString());
     }
        System.out.println("---------");
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        for (Student student : studentSet){
            System.out.println(student.toString());
        }
    }
}
