package Task2.services;
import Task2.repository.EmployeeRepository;
import Task2.repository.EmployeeRepositoryImpl;
import Task2.models.Employee;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeServiceImpl {
    private EmployeeRepository repository = new EmployeeRepositoryImpl();
    public EmployeeServiceImpl(Employee e){
        repository.addEmployee(e);
    }
    public EmployeeServiceImpl(){}
    public Employee getEmployee(int index){
        return repository.getEmployee(index);
    }
    public void showEmployee(){
        repository.showEmployee();
    }
    public void addEmployee(Employee employee){
        repository.addEmployee(employee);
    }
    public int sizeEmployee(){
        return repository.sizeEmployee();
    }
}
