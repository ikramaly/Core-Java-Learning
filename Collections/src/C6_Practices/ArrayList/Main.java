package C6_Practices.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ids = {101,102,103,104,105,106};
        String[] name = {"Amar","Hareen","Sathya","Annie","Raji","Harsha"};
        double[] salary = {30000,35000,40000,45000,42000,50000};
        int[] dept = {20,10,20,20,30,10};
        String[] location = {"Hyderabad","Chennai","Bangalore","Hyderabad","Pune","Bangalore"};
        List<Employee> employeeList = new ArrayList<>();
        for (int i=0; i<ids.length; i++){
            Employee e = new Employee(); // ek empty constructor call ho jayega.
            e.setId(ids[i]);
            e.setName(name[i]);
            e.setSalary(salary[i]);
            e.setDeptId(dept[i]);
            e.setLocation(location[i]);

            employeeList.add(e);
        }
//        System.out.println(employeeList);
        System.out.println(employeeList.size());

//       ---------------- Que 1 : Display Details using For Loop.---------------------
//        System.out.println("----Display All Employee using for loop ------");
//        System.out.println();
//        for(Employee employee : employeeList){
//            System.out.println("-------------Emp "+employee.getId()+" Details ---------------");
//            System.out.println("id : "+employee.getId());
//            System.out.println("name : "+employee.getName());
//            System.out.println("Salary : "+employee.getSalary());
//            System.out.println("Dept : "+employee.getDeptId());
//            System.out.println("Location : "+employee.getLocation());
//            System.out.println();
//        }
// ------Que 2 Display Details in reverse Order.
//        System.out.println("----Display All Employee in reverse order using for loop ------");
//        for (int i=employeeList.size()-1; i>=0; i--){
//            System.out.println("-------------Emp "+ employeeList.get(i).getId() +" Details ---------------");
//            System.out.println("id : "+employeeList.get(i).getId());
//            System.out.println("name : "+employeeList.get(i).getName());
//            System.out.println("Salary : "+employeeList.get(i).getSalary());
//            System.out.println("Dept : "+employeeList.get(i).getDeptId());
//            System.out.println("Location : "+employeeList.get(i).getLocation());
//            System.out.println();
//        }


//        ---------------Que 3 -  Display All Employee Belongs to the Hyderabad-----------
//        System.out.println("------Belongs to the Hyderabad----------");
        boolean count = false;
        for (Employee employee: employeeList){
//            String loc = employee.getLocation();
            if (employee.getName().equals("Amar")) {
//                System.out.println("--Emp " + employee.getId() + " Details --");
//                System.out.println("id : " + employee.getId());
//                System.out.println("name : " + employee.getName());
//                System.out.println("Salary : " + employee.getSalary());
//                System.out.println("Dept : " + employee.getDeptId());
//                System.out.println("Location : " + employee.getLocation());
//                System.out.println();
                count = true;
            }
        }
        if (count){
            System.out.println("Yes Amar Name Exist.");
        }else {
            System.out.println("Amar Not Exist");
        }
// ------Que - Display Employee details whose ID is 103:------------------
//        System.out.println("-----Display Employee details whose ID is 103:----");
//        for (Employee employee: employeeList){
//            if (employee.getDeptId() == 20 || employee.getDeptId() == 30){
//                System.out.println("--Emp "+employee.getId()+" Details --");
//                System.out.println("id : "+employee.getId());
//                System.out.println("name : "+employee.getName());
//                System.out.println("Salary : "+employee.getSalary());
//                System.out.println("Dept : "+employee.getDeptId());
//                System.out.println("Location : "+employee.getLocation());
//                System.out.println();
//            }
//        }
    }
}
