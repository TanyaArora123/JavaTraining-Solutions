package practiceexamples;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        //call the functions
        Employee e= service.getEmployee(156507,"pavan kumar");
        System.out.println(e);
        List<Employee1> ee=service.getEmployees(60000.00);
        System.out.println(ee);
        System.out.print(service.getMaxSalary());
        System.out.print(service.getSumOfSalary());
        List<String> r=service.getNames("Pune");
        System.out.println(r);
        List<String> res=service.getIds();
        System.out.println(res);
        List<Employee1> ans=service.getManagers();
        System.out.println(ans);
        System.out.println(service.getSumOfManagerSalaries());
        List<Employee1> ans1=service.getDetails();
        System.out.println(ans1);
    }

}