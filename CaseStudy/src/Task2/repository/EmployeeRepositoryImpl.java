package Task2.repository;
import Task2.models.Employee;
import Task2.models.Level;
import Task2.models.Official;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final List<Employee> employeeList;
    static{
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Tran Van Nam",12011995,true,141205122,554123567,"trannam@gmail.com",43001,Level.Trungcap,"Phuc vu", Official.Service,4.050));
        employeeList.add(new Employee("Tran Van Nam 1",12011996,true,141205122,554123567,"trannam123@gmail.com",43002,Level.Caodang,"Phuc vu", Official.Service,4.100));
        employeeList.add(new Employee("Tran Van Nam 2",12011994,true,141205122,554123567,"trannam1234@gmail.com",43003,Level.Daihoc,"Phuc vu", Official.Service,4.150));
        employeeList.add(new Employee("Tran Van Nam 3",12011995,true,141205122,554123567,"trannam1@gmail.com",43004,Level.Trungcap,"Phuc vu", Official.Service,4.050));
    }
    public EmployeeRepositoryImpl(Employee e){
        employeeList.add(e);
    }
    public EmployeeRepositoryImpl(){}
    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee getEmployee(int index) {
        return employeeList.get(index);
    }

    @Override
    public void showEmployee() {
        Iterator<Employee> iterator = employeeList.iterator();
        int index = 0;
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println("ID: "+ employee.toString());
        }
    }

    @Override
    public void addEmployee(Employee employee) {employeeList.add(employee);

    }

    @Override
    public void updatEmployee(Employee employee) {

    }

    @Override
    public void remove(int maNhanVien) {

    }

    @Override
    public int sizeEmployee() {
        return employeeList.size();
    }

    @Override
    public Employee findById(int maNhanVien) {
        return null;
    }

    @Override
    public void editEmployee(int index, String hoTen, int ngaySinh, boolean gioiTinh, int soCMND, int soDienThoai, String eMail, int maNhanVien, Level trinhDo, String viTri, double luong) {
       Employee editemployee = employeeList.get(index);
       editemployee.setTrinhDo(trinhDo);
       editemployee.setViTri(viTri);
       editemployee.setLuong(luong);
       editemployee.seteMail(eMail);
       editemployee.setSoDienThoai(soDienThoai);
       editemployee.setSoCMND(soCMND);
       editemployee.setMaNhanVien(maNhanVien);
       editemployee.setHoTen(hoTen);
       editemployee.setNgaySinh(ngaySinh);
       editemployee.setGioiTinh(gioiTinh);


    }

    @Override
    public void editEmployee(int index, Employee e) {
       employeeList.set(index, e);
    }


}
