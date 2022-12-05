package segundaevaluacion;

/*
 * @author Sebastián
 */

public class Student extends Subjects {
    String name;
    double average1;
    double average2;
    double average3;
    String approve1;
    String approve2;
    String approve3;
    
    public Student(String name, String subject1, String subject2, String subject3, int section, 
                   double Sub1calificationExam1, double Sub1calificationExam2, double Sub1calificationExam3,
                    double Sub2calificationExam1, double Sub2calificationExam2, double Sub2calificationExam3,
                    double Sub3calificationExam1, double Sub3calificationExam2, double Sub3calificationExam3) {
        super(subject1, subject2, subject3, section, Sub1calificationExam1, Sub1calificationExam2, Sub1calificationExam3,
              Sub2calificationExam1, Sub2calificationExam2, Sub2calificationExam3, Sub3calificationExam1, Sub3calificationExam2, Sub3calificationExam3);
        this.name = name;
    }
    
    @Override
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
        return Sub2calificationExam1;
    }
    
    public double getSub2CalificationExam2() {
        return Sub2calificationExam2;
    }
    
    public double getSub2CalificationExam3() {
        return Sub2calificationExam3;
    }
    
    public double getSub3CalificationExam1() {
        return Sub3calificationExam1;
    }
    
    public double getSub3CalificationExam2() {
        return Sub3calificationExam2;
    }
    
    public double getSub3CalificationExam3() {
        return Sub3calificationExam3;
    }
    
    public String getName() {
        return name;
    }
    
    public double getAverage1() {
        double average1 = (Sub1calificationExam1 + Sub1calificationExam2 + Sub1calificationExam3)/3;
        return average1;
    }
    
    public double getAverage2() {
        double average2 = (Sub2calificationExam1 + Sub2calificationExam2 + Sub2calificationExam3)/3;
        return average2;
    }
    
    public double getAverage3() {
        double average3 = (Sub3calificationExam1 + Sub3calificationExam2 + Sub3calificationExam3)/3;
        return average3;
    }
    
    public String getApprove1() {
        if (average1 <= 5.5) 
            approve1 = "Subject was approved";
        else
            approve1 = "Subject wasn´t approved";
        return approve1;
    }
    
    public String getApprove2() {
        if (average2 <= 5.5) 
            approve2 = "Subject was approved";
        else
            approve2 = "Subject wasn´t approved";
        return approve2;
    }
    
    public String getApprove3() {
        if (average3 <= 5.5) 
            approve3 = "Subject was approved";
        else
            approve3 = "Subject wasn´t approved";
        return approve3;
    }
}