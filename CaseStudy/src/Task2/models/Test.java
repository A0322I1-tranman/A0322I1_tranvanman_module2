package Task2.models;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Tần Công Toàn",27071994,true,145236987,141554789,"toantran@gmail.com",1415,Level.Trungcap,"Bell",Official.Service,1100);
        System.out.println(employee.toString());
        Customer customer = new Customer("Doãn Nhạ",14041995,false,141255044,044563441,"nha123@gmai.com",1512,type.Member,"15 Bùi Viện");
        System.out.println(customer.toString());
    }
}
