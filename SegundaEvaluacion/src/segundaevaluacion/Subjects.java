package segundaevaluacion;

/*
 * @author Sebastián
 */

public class Subjects {
    String subject1;
    String subject2;
    String subject3;
    int section;
    double Sub1calificationExam1;
    double Sub1calificationExam2;
    double Sub1calificationExam3;
    double Sub2calificationExam1;
    double Sub2calificationExam2;
    double Sub2calificationExam3;
    double Sub3calificationExam1;
    double Sub3calificationExam2;
    double Sub3calificationExam3;
    
    public Subjects(String subject1, String subject2, String subject3, int section, 
                    double Sub1calificationExam1, double Sub1calificationExam2, double Sub1calificationExam3,
                    double Sub2calificationExam1, double Sub2calificationExam2, double Sub2calificationExam3,
                    double Sub3calificationExam1, double Sub3calificationExam2, double Sub3calificationExam3) {
        this.subject1 = subject1; this.subject2 = subject2; this.subject3 = subject3; this.section = section; 
        this.Sub1calificationExam1 = Sub1calificationExam1; this.Sub1calificationExam2 = Sub1calificationExam2; this.Sub1calificationExam3 = Sub1calificationExam3;
        this.Sub2calificationExam1 = Sub2calificationExam1; this.Sub2calificationExam2 = Sub2calificationExam2; this.Sub2calificationExam3 = Sub2calificationExam3;
        this.Sub3calificationExam1 = Sub3calificationExam1; this.Sub3calificationExam2 = Sub3calificationExam2; this.Sub3calificationExam3 = Sub3calificationExam3;
    }
    
    public String getSubject1() {
        return subject1;
    }
    
    public String getSubject2() {
        return subject2;
    }
    
    public String getSubject3() {
        return subject3;
    }
    
    public int getSection() {
        return section;
    }
    
    public double getSub1CalificationExam1() {
        return Sub1calificationExam1;
    }
    
    public double getSub1CalificationExam2() {
        return Sub1calificationExam2;
    }
    
    public double getSub1CalificationExam3() {
        return Sub1calificationExam3;
    }
    
    public double getSub2CalificationExam1() {
        return Sub1calificationExam1;
    }
    
    public double getSub2CalificationExam2() {
        return Sub1calificationExam2;
    }
    
    public double getSub2CalificationExam3() {
        return Sub1calificationExam3;
    }
    
    public double getSub3CalificationExam1() {
        return Sub1calificationExam1;
    }
    
    public double getSub3CalificationExam2() {
        return Sub1calificationExam2;
    }
    
    public double getSub3CalificationExam3() {
        return Sub1calificationExam3;
    }
}
