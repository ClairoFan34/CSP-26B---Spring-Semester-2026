public class InheritanceInClassLabDemo {
    public static void main(String[] args) {
        CourseGrades course = new CourseGrades();

        GradedActivity lab = new GradedActivity();
        lab.setScore(55);
        course.setLab(lab);

        PassFailExam PFExam = new PassFailExam(10, 2 , 70);
        course.SetPassFailExam(PFExam);

        Essay essay = new Essay();
        course.setEssay(essay);
        essay.setScore(25, 18, 20, 28);

        FinalExam finalExam = new FinalExam(50, 5);
        course.setFinalExam(finalExam);

        System.out.print(course.toString());

    }
}
