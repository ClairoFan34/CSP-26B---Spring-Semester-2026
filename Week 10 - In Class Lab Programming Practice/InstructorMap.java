import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InstructorMap {
    private Map<Integer, Integer> instructorMap = new HashMap<>();
    private Scanner input = new Scanner(System.in);

    public void addMapEntry() {
        System.out.print("Enter an instructor ID for map: ");
        int id = input.nextInt();
        System.out.print("Enter office number: ");
        int office = input.nextInt();
        input.nextLine();

        instructorMap.put(id, office);
        System.out.println("Entry added to map successfully");
    }

    public void searchMap(int id) {
        if (instructorMap.containsKey(id)) {
            int office = instructorMap.get(id);
            System.out.println("Instructor ID " + id + " is located in Office: " + office);
        } 
        else
            System.out.println("ID " + id + " not found in the Map");
    }
}
