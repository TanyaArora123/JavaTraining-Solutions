package practiceexamples;

import java.util.Scanner;

class employeedetails {
    int emp_id, salary;
    String name, address, gender, email;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address
                + ", gender = " + gender + ", email = " + email + "]";
    }

}

public class Employee {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee_ID");
        String employee_id = input.next();
        System.out.println("Enter employee_name:");
        String name = input.next();
        System.out.println("Enter employee_salary:");
        String salary = input.next();
        System.out.println("Enter employeeAddress:");
        String address = input.next();
        System.out.println("Enter employee_gender:");
        String gender = input.next();
        System.out.println("Enter employee_email:");
        String email = input.next();
        employeedetails emp = new employeedetails();
        emp.setEmp_id(Integer.parseInt(employee_id));
        emp.setName(name);
        emp.setGender(gender);
        emp.setSalary(Integer.parseInt(salary));
        emp.setAddress(address);
        emp.setEmail(email);

        System.out.println(emp);

    }
}
