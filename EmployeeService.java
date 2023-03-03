package practiceexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    List<Employee> list = EmployeeRepository.getEmployees();

    public Employee getEmployee(int id, String name) {
        //display the Employee details based on id or name   iterate the list check id and name when matching return obj
        for(Employee e:list){
            if(e.getId()==id && e.getName()==name){
                return e;
            }
        }
        return null;
    }

    public List<Employee1> getEmployees(Double salary) {
        // display the names of employees who are getting the salary greater than the 60000
        // salary given
        List<Employee1> result=new ArrayList<>();
        for(Employee e:list){
            if(e.getSalary()>salary){
                result.add(e);
            }
        }
        return result;
    }

    public Double getMaxSalary() {
        // display the max salary
        Double max=0.00;
        for(Employee e:list){
            if(e.getSalary()>max){
                max=e.getSalary();
            }
        }

        return max;
    }

    public Double getSumOfSalary() {
        // display the sum of salaries of all the employees
        Double sum=0.00;
        for(Employee e:list){
            sum+=e.getSalary();
        }
        return sum;
    }

    public List<String> getNames(String city) {
        // display the names of all employees who are working in 'Pune'
        List<String> result=new ArrayList<>();
        for(Employee e:list){
            if(e.getLocation().equals(city)){
                result.add(e.getName());
            }
        }
        return result;
    }

    public List<Employee1> getDetails() {
        // display all employees based on salary ascending

        List <Employee1> employeesSortedList = list.stream()
                .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());

        return employeesSortedList;
    }

    public List<Employee1> getManagers() {
        // display all employees who are working as managers
        List<Employee1> result=new ArrayList<>();
        for(Employee e:list){
            if(e.getDesignation().equals("Manager")){
                result.add(e);
            }
        }
        return result;
    }

    public Double getSumOfManagerSalaries() {
        // display the sum of salaries of employees who are working as managers
        Double sum=0.00;
        for(Employee1 e:list){
            if(e.getDesignation().equals("Manager")){
                sum+=e.getSalary();
            }
        }
        return sum;
    }

    public List<String> getIds() {
        // display the ids of all employees
        List<String> res=new ArrayList<>();
        for(Employee1 e:list){
            String id= String.valueOf(e.getId());
            res.add(id);
        }
        return res;
    }
}
Footer
        © 2023 GitHub, Inc.
        Footer navigation

