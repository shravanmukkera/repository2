import Models.Benifits;
import Models.Department;
import Models.Employee;
import Models.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Location> locationOfEmployee1=new ArrayList<>();
        Location locationList1=new Location("hyderabad","india");
        locationOfEmployee1.add(locationList1);

        List<Location> locationOfEmployee2=new ArrayList<>();
        Location locationList2=new Location("goa","india");
        locationOfEmployee2.add(locationList2);


        List<Location> locationOfEmployee3=new ArrayList<>();
        Location locationList3=new Location("odisha","india");
        locationOfEmployee3.add(locationList3);


        //............................................

        List<Department> departmentOfEmployee1=new ArrayList<>();
        Department departmentList1=new Department(10,"development");
        departmentOfEmployee1.add(departmentList1);

        List<Department> departmentOfEmployee2=new ArrayList<>();
        Department departmentList2=new Department(10,"development");
        departmentOfEmployee2.add(departmentList2);

        List<Department> departmentOfEmployee3=new ArrayList<>();
        Department departmentList3=new Department(20,"testing");
        departmentOfEmployee3.add(departmentList3);

        //...................................................

        List<Benifits> benifitsOfEmployee1=new ArrayList<>();
        Benifits empBenifits1=new Benifits(1,"Travel Allowance","you will get monthly travel allowance: 3000 ");
         benifitsOfEmployee1.add(empBenifits1);

        List<Benifits> benifitsOfEmployee2=new ArrayList<>();
        Benifits benifitsList2=new Benifits(1,"Travel Allowance","you will get monthly travel allowance: 3000 ");
        Benifits benifits=new Benifits(2,"Food Allowance","you will get food allowance: 4000");
        benifitsOfEmployee2.add(benifits);
        benifitsOfEmployee2.add(benifitsList2);

        List<Benifits> benifitsOfEmployee3=new ArrayList<>();
        Benifits benifit1=new Benifits(1,"Travel Allowance","you will get monthly travel allowance: 3000 ");
        Benifits benifit2=new Benifits(2,"Food Allowance","you will get food allowance: 4000");
        Benifits benifits3=new Benifits(3,"Bonus","you will get monthly bonus: 5000");
        benifitsOfEmployee3.add(benifit1);
        benifitsOfEmployee3.add(benifit2);
        benifitsOfEmployee3.add(benifits3);
        //..................................................

        Employee emp1=new Employee("shravan@gmail.com","shravan",20000,locationOfEmployee1,departmentOfEmployee1,benifitsOfEmployee1);
        Employee emp2=new Employee("keerthana@gmail.com","keerthana",25000,locationOfEmployee2,departmentOfEmployee1,benifitsOfEmployee2);
        Employee emp3=new Employee("biswa@gmail.com","biswa",20000,locationOfEmployee3,departmentOfEmployee3,benifitsOfEmployee3);

       List<Employee> employee=new ArrayList<>();
        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        System.out.println(".........................................................................................");

        StringBuffer s=new StringBuffer();
        System.out.println("                     1-> Employees who are staying in india :");
        employee.stream().forEach(emp->{
         emp.getLocationList().stream().filter(loc->loc.getCountry().equalsIgnoreCase("India")).forEach(loc->{
          s.append(emp.getEmployeeName()+"  ").append(loc.getCountry()+"\n");
         });
        });
     System.out.println(s);
     System.out.println(".................................................");

        System.out.println("                      2->  employees staying in chennai or hyderabad");

        StringBuffer s2=new StringBuffer();
        employee.stream().forEach(e->{
            e.getLocationList().stream().filter(l->l.getLocation().equalsIgnoreCase("chennai") || l.getLocation().equalsIgnoreCase("hyderabad"))
                    .forEach(l1->s2.append(e.getEmployeeName()+"\n"));
        });
            System.out.println(s2);
            System.out.println("...................................................");
                System.out.println("            3->  employees who are having benifits with description");
            StringBuffer s3=new StringBuffer();

            employee.stream().forEach(e->{
                e.getBenifitsList().stream().forEach(bl->{
                    s3.append("employeeName : "+e.getEmployeeName()+"\n").append("benifitId: "+bl.getBenifitId()+"\n").append("benifitDesc: "+bl.getBenifitDesc()+"\n-----\n");
                });
            });

            System.out.println(s3);
            System.out.println("................................................................");

            System.out.println("                            4-> employees ->emailId,name,salary, dname,location,country");
            StringBuffer s4=new StringBuffer();

           employee.stream().forEach(e->{
               e.getDepartmentList().forEach(d->{
                   e.getLocationList().stream().forEach(l->{
                       s4.append("employeeName: "+e.getEmployeeName()+"\n ").append("emailId: "+e.getEmailId()+"\n").append("employeeSalary: "+e.getSalary()+"\n")
                               .append("location: "+l.getLocation()+"\n").append("country: "+l.getCountry()+"\n").append("departmentId: "+d.getDepartmentId()+"\n").append("departmentName: "+d.getDepartmentName()+"\n-------\n");
                   });
               });
           });

            System.out.println(s4);
            System.out.println("...............................................................");

            System.out.println("                   5-> employees who are staying in chennai and india");
            StringBuffer s5=new StringBuffer();

        employee.stream().forEach(e->{
            e.getLocationList().stream().filter(l->l.getLocation().equalsIgnoreCase("chennai") && l.getCountry().equalsIgnoreCase("india"))
                    .forEach(l1->s2.append(e.getEmployeeName()+"\n"));
        });
        System.out.println(s5);
    }

}