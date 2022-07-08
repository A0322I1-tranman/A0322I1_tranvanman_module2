package Task2.repository;
import Task2.models.Employee;
import Task2.models.Level;

import java.util.List;
public interface EmployeeRepository {
    List<Employee> findAll();
    Employee getEmployee(int index);
    void showEmployee();
    void addEmployee(Employee employee);
    void updatEmployee(Employee employee);
    void remove(int maNhanVien);
    int sizeEmployee();
    Employee findById(int maNhanVien);
   void editEmployee(int index, String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, int maNhanVien, Level trinhDo, String viTri, double luong);
   void editEmployee(int index, Employee e);
}
