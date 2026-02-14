public class Waitstaff extends Employee {
    public void setJobTitle() {
        jobTitle = "Waitstaff";
    }
    public void setPayRate(double rate) {
        if (rate >= 15.0){
            System.out.println("Waitstaff cannot have a higher pay rate than $15.00");
            payRate = 15.0;
        }
        else {
            payRate = rate;
        }
    }
}
