public class Instructor {
        private int ID;
        private String firstName;
        private String lastName;
        private int officeNumber;
        private String department;

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
}
