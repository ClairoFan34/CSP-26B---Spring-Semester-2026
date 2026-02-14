public class Bartender extends Employee {
    public void setJobTitle() {
        jobTitle = "Bartender";
    }
    public void setPayRate(double rate) {
        if (rate >= 18.0){
            System.out.println("Bartender cannot have a higher pay rate than $18.00");
            payRate = 18.0;
        }
        else {
            payRate = rate;
        }
    }
}
