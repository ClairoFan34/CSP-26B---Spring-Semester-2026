public class DinnerEvent {
    private int eventType;
    private String eventName;
    private int numOfGuest;
    private int entree;
    private int sideDishOne;
    private int sideDishTwo;
    private int dessert;

    //All event types
    public final String[] eventTypes = {"Wedding", "Birthday", "Corporate"};

    //All setters and getters
    public String getEventType() { 
        return eventTypes[eventType]; 
    }
    public void setEventType(int eventType) { 
        this.eventType = eventType; 
    }

    public String getEventName() { 
        return eventName; 
    }
    public void setEventName(String eventName) { 
        this.eventName = eventName; 
    }

    public int getNumOfGuest() { 
        return numOfGuest; 
    }
    public void setNumOfGuest(int numOfGuest) { 
        this.numOfGuest = numOfGuest; 
    }

    public int getEntree() { 
        return entree; 
    }
    public void setEntree(int entree) { 
        this.entree = entree; 
    }

    public int getSideDishOne() { 
        return sideDishOne; 
    }
    public void setSideDishOne(int sideDishOne) { 
        this.sideDishOne = sideDishOne; 
    }

    public int getSideDishTwo() { 
        return sideDishTwo; 
    }
    public void setSideDishTwo(int sideDishTwo) { 
        this.sideDishTwo = sideDishTwo; 
    }

    public int getDessert() { 
        return dessert; 
    }
    public void setDessert(int dessert) { 
        this.dessert = dessert; 
    }

    // All options for food
    public final String[] entrees = {"Chicken", "Steak", "Veggies"};
    public final String[] sideDishes = {"Fries", "Mashed Potatoes", "Onion Rings"};
    public final String[] desserts = {"Chocalate Cake", "Ice Cream", "Cheescake"};

    // Assigned employess array
    public Employee[] Employees = new Employee[15];

    public DinnerEvent(int eventNumber, String nameOfEvent, int GuestAmount, int entreeChoice, int sideDishOneChoice, int sideDishTwoChoice, int dessertChoice) {
        eventType = eventNumber;
        eventName = nameOfEvent;
        numOfGuest = GuestAmount;
        entree = entreeChoice;
        sideDishOne = sideDishOneChoice;
        sideDishTwo = sideDishTwoChoice;
        dessert = dessertChoice;
    }


}
