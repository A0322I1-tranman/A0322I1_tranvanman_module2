package Task2.services;

import Task2.models.Employee;
import Task2.models.Level;

public interface IEmployeeService extends IService {
    Employee getEmployee(int index);
    void showEmployee();
    void addEmployee(Employee employee);
    int sizeEmployee();
    void editEmployee(int index, String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, int maNhanVien, Level trinhDo, String viTri, double luong);
    void editEmployee(int index, Employee e);
}
