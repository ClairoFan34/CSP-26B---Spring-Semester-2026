public abstract class Employee {
    protected int employeeID;
    protected String firstName;
    protected double payRate;
    protected String jobTitle;

    //All setters
    public void setEmployeeID(int ID){
        employeeID = ID;
    }
    public void setFirstName(String name) {
        firstName = name;
    }
    public abstract void setPayRate(double rate);
    public abstract void setJobTitle();

    //All getters
    public int getEmployeeID () {
        return employeeID;
    }
    public String getfirstName() {
        return firstName;
    }
    public double getPayRate() {
        return payRate;
    }
    public String getJobTitle(){
        return jobTitle;
    }
}