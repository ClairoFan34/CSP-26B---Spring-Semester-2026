package Week1_2InheritanceLab;

public class CourseGrades {
    GradedActivity[] grades = new GradedActivity[4];

    public void setLab (GradedActivity obj) {
        grades[0] = obj;
    }
    public void SetPassFailExam (PassFailExam obj) {
        grades[1] = obj;
    }
    public void setEssay (GradedActivity obj ) {
        grades[2] = obj;
    }
    public void setFinalExam (GradedActivity obj) {
        grades [3] = obj;
    }
    public String toString() {
        return ("Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getGrade() + "\n" +
                "Pass Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade() + "\n" +
                "Essay Score: " + grades[2].getScore() + " Grade: " + grades[2].getGrade() + "\n" +
                "Final Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade() + "\n" );
    }
}
