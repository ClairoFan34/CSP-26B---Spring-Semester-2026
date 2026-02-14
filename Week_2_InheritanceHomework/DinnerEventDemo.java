import java.util.Scanner;

public class DinnerEventDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompted for Event Details
        System.out.print("Enter event number: 1. Wedding 2. Birthdat 3. Corporate");
        int eventNum = input.nextInt() - 1;
        input.nextLine();
        System.out.print("Enter event name: ");
        String name = input.nextLine();
        System.out.print("Enter number of guests: ");
        int guests = input.nextInt();

        // All menu options are displayed, 1 through 3
        System.out.println("Select an entree 1. Chicken 2. Steak 3. Veggies");
        int entree = input.nextInt() - 1;
        System.out.println("Select side dish one 1. Fries 2. Mashed Potatoes 3. Onion Rings");
        int side1 = input.nextInt() - 1;
        System.out.println("Select side dish one 1. Fries 2. Mashed Potatoes 3. Onion Rings");
        int side2 = input.nextInt() - 1;
        System.out.println("Select dessert 1. Chocolate Cake 2. Ice Cream 3. Cheesecake");
        int dessert = input.nextInt() - 1;

        // Created the DinnerEvent Object
        DinnerEvent event = new DinnerEvent(eventNum, name, guests, entree, side1, side2, dessert);

        // Calculating and assigning employees
        // Waitstaff: 1 per 10 guests (minimum 1)
        int numWaitstaff = (guests / 10) + 1;
        // Bartenders: 1 per 25 guests
        int numBartenders = guests / 25;
        // Coordinator: Always 1
        int numCoordinators = 1;

        int totalEmployees = numWaitstaff + numBartenders + numCoordinators;
        int employeeIndex = 0;

        System.out.println("\nEntering Employee Data for " + totalEmployees + " Staff Members");

        // Loop so the array is filled with specific employee types
        for (int i = 0; i < totalEmployees; i++) {
            Employee emp;

            // Determine type of employee to create based on counts
            if (i < numWaitstaff) {
                emp = new Waitstaff();
            } 
            else if (i < (numWaitstaff + numBartenders)) {
                emp = new Bartender();
            } 
            else {
                emp = new Coordinator();
            }

            // Prompt for common Employee data
            System.out.print("Enter ID for " + emp.getClass().getSimpleName() + ": ");
            emp.setEmployeeID(input.nextInt());
            input.nextLine(); // Consume newline
            System.out.print("Enter first name: ");
            emp.setFirstName(input.nextLine());
            System.out.print("Enter pay rate: ");
            emp.setPayRate(input.nextDouble());
            emp.setJobTitle();

            // Assign to the DinnerEvent array
            event.Employees[employeeIndex++] = emp;
        }

        // Final Output Summary
        System.out.println("\nEvent Summary: ");
        System.out.println("Event Name: " + event.getEventName() + " (Type: " + event.getEventType() + ")");
        System.out.println("Staff assigned: " + numWaitstaff + " Waitstaff, " + numBartenders + " Bartenders, and " + numCoordinators + " Coordinator.");
    }
}
