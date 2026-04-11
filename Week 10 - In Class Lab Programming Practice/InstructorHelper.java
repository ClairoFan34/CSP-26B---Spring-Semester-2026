import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InstructorHelper {
    private Set<Instructor> Instructors = new HashSet<>();
    private Scanner input = new Scanner(System.in);

    void addInstructor () {
        System.out.println("Enter Instructor ID: ");
        int id = input.nextInt();
        input.nextLine(); 
        System.out.println("Enter first name: ");
        String first = input.nextLine();
        System.out.println("Enter last name: ");
        String last = input.nextLine();
        System.out.println("enter office number: ");
        int office = input.nextInt();
        input.nextLine();
        System.out.println("Enter department: ");
        String dept = input.nextLine();

        Instructor newInstructor = new Instructor(id, first, last, office, dept);
        
        if (Instructors.add(newInstructor)) 
            System.out.println("Instructor added successfully");
        else 
            System.out.println("Error: An instructor with that ID already exists");
    }

    public void searchInstructor(int idToFind) {
    boolean found = false;

    for (Instructor employee : Instructors) {
        if (employee.hashCode() == idToFind) {
            System.out.println("Instructor Found: " + employee);
            found = true;
            break;
        }
    }
    if (found == false)
        System.out.println("No instructor found with ID: " + idToFind);
}

    void printInstructors() {
        for (Instructor Employee : Instructors) {
            System.out.println("Employee: " + Employee.toString());
        }
    }
}
