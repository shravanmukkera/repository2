package Models;

import java.util.List;

public class Employee
{
    private String emailId;
    private String employeeName;
    private int salary;
    List<Location> locationList;
    List<Department> departmentList;
    List<Benifits> benifitsList;

    public Employee(String emailId, String employeeName, int salary, List<Location> locationList, List<Department> departmentList, List<Benifits> benifitsList) {
        this.emailId = emailId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.locationList = locationList;
        this.departmentList = departmentList;
        this.benifitsList = benifitsList;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Benifits> getBenifitsList() {
        return benifitsList;
    }

    public void setBenifitsList(List<Benifits> benifitsList) {
        this.benifitsList = benifitsList;
    }

}
