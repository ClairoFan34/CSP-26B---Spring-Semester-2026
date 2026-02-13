public class Employee {
    // All member variables
    protected String employeeName;
    protected int employeeNumber;
    protected char employeeLetter;
    protected int hireDate;

    // A default constructor and parametertized constructor
    public Employee() {
        employeeName = "John";
        employeeNumber = 123;
        employeeLetter = 'A';
        hireDate = 01012000;
    }

    public Employee(String employeeName, int employeeNumber, char employeeLetter, int hireDate){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this. employeeLetter = employeeLetter;
        this.hireDate = hireDate;
    }

    // All setters
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public void setEmployeeLetter(char employeeLetter) {
        this.employeeLetter = employeeLetter;
    }
    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    // All getters
    public String getEmployeeName(){
        return employeeName;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public char getEmployeeLetter() {
        return employeeLetter;
    }
    public int getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee Name: Employee Num";
    }
}
