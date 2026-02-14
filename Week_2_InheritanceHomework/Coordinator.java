public class Coordinator extends Employee {
    public void setJobTitle() {
        jobTitle = "Coordinator";
    }
    public void setPayRate(double rate) {
        if (rate >= 20.0){
            System.out.println("Bartender cannot have a higher pay rate than $20.00");
            payRate = 20.0;
        }
        else {
            payRate = rate;
        }
    }
}
