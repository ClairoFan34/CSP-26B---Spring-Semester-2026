package Week1_2InheritanceLab;

public class Essay extends GradedActivity{
    int Grammar = 30;
    int Spelling = 20;
    int Length = 20;
    int Content = 30;
    
    public void setScore (int g, int s, int l, int c) {
        Grammar = g;
        Spelling = s;
        Length = l;
        Content = c;

        super.setScore(Grammar + Spelling + Length + Content);
    }
}
