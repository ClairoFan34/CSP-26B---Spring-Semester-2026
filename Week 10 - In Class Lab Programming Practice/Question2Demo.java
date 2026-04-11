import java.util.Scanner;

public class Question2Demo {
    public static void main(String[] args) {
        InstructorMap mapHelper = new InstructorMap();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("Instructor Management Demo with Map");

        while (running == true) {
            System.out.println("1. Add instructor ID and office number");
            System.out.println("2. Search office by instructor ID");
            System.out.println("3. End ");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    mapHelper.addMapEntry(); 
                    break;
                case 2:
                    System.out.print("Enter ID to find office in Map: ");
                    int mapId = input.nextInt();
                    mapHelper.searchMap(mapId);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }
}