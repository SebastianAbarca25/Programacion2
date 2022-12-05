package segundaevaluacion;

/*
 * @author Sebastián
 */

public class Professor {
    String name;
    String subject1;
    String subject2;
    String subject3;
    int section1;
    int section2;
    int section3;
    
    public Professor(String name, String subject1, int section1, String subject2, int section2, String subject3, int section3) {
        this.name = name; this.subject1 = subject1; this.section1 = section1; this.subject2 = subject2; this.section2 = section2;
        this.subject3 = subject3; this.section3 = section3;
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
    
    public int getSection1() {
        return section1;
    }
    
    public int getSection2() {
        return section2;
    }
    
    public int getSection3() {
        return section3;
    }
    
    public String getName() {
        return name;
    }
    
}