import java.util.Scanner;

public class Question1Demo {
    public static void main(String[] args) {
        InstructorHelper helper = new InstructorHelper();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("Instructor Management Demo");

        while (running == true) {
            System.out.println("1. Add Instructor");
            System.out.println("2. Display All Instructors");
            System.out.println("3. Search for Instructor");
            System.out.println("4. End");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    helper.addInstructor();
                    break;
                case 2:
                    helper.printInstructors();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = input.nextInt();
                    helper.searchInstructor(searchId);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
