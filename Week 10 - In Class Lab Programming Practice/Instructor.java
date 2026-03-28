public class Instructor {
        private int ID;
        private String firstName;
        private String lastName;
        private int officeNumber;
        private String department;

        Instructor() {
            this.ID = 0;
            this.firstName = "None";
            this.lastName = "None";
            this.officeNumber = 0;
            this.department = "None";
        }

        Instructor(int ID, String firstName, String lastName, int officeNumber, String department) {
            this.ID = ID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.officeNumber = officeNumber;
            this.department = department;
        }

        @Override
        public int hashCode() {
            return this.ID; 
        }
        @Override
        public boolean equals(Object other) {
            if (this.hashCode() == other.hashCode())
                return true;
            else
                return false;
        }
        @Override
        public String toString() {
            return "ID: " + ID + " ; Name: " + firstName + " " + lastName + " ; Office: " + officeNumber + " ; Dept: " + department;
}
}
