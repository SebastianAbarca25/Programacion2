package segundaevaluacion;

/*
 * @author Sebastián
 */

public class SegundaEvaluacion {

    public static void main(String[] args) {
        
        System.out.println("Student´s. \n");
        Student student1 = new Student("Sebastián Abarca", "Algebra", "Programación II", "Calculo IV", 503, 4, 10, 4, 9, 7, 6, 4, 6, 10);
        System.out.println("Student: " + student1.getName());
        System.out.println("Subject: " + student1.getSubject1());
        System.out.println("Section: " + student1.getSection());
        System.out.println("Exam´s 1 Calification: " + student1.getSub1CalificationExam1());
        System.out.println("Exam´s 2 Calification: " + student1.getSub1CalificationExam2());
        System.out.println("Exam´s 3 Calification: " + student1.getSub1CalificationExam3());
        System.out.println("Final Average: " + student1.getAverage1());
        System.out.println(student1.getApprove1());
        
        System.out.println("");
        
        System.out.println("Subject: " + student1.getSubject2());
        System.out.println("Section: " + student1.getSection());
        System.out.println("Exam´s 1 Calification: " + student1.getSub2CalificationExam1());
        System.out.println("Exam´s 2 Calification: " + student1.getSub2CalificationExam2());
        System.out.println("Exam´s 3 Calification: " + student1.getSub2CalificationExam3());
        System.out.println("Final Average: " + student1.getAverage2());
        System.out.println(student1.getApprove2());
        
        System.out.println("");
        
        System.out.println("Subject: " + student1.getSubject3());
        System.out.println("Section: " + student1.getSection());
        System.out.println("Exam´s 1 Calification: " + student1.getSub3CalificationExam1());
        System.out.println("Exam´s 2 Calification: " + student1.getSub3CalificationExam2());
        System.out.println("Exam´s 3 Calification: " + student1.getSub3CalificationExam3());
        System.out.println("Final Average: " + student1.getAverage3());
        System.out.println(student1.getApprove3());
        
        System.out.println("");
        System.out.println("");
        
        Student student2 = new Student("Juan Trenado", "Bases de Datos", "Ingles", "Probabilidad", 503, 5, 5, 8, 10, 8, 9, 7, 5, 6);
        System.out.println("Student: " + student2.getName());
        System.out.println("Subject: " + student2.getSubject1());
        System.out.println("Section: " + student2.getSection());
        System.out.println("Exam´s 1 Calification: " + student2.getSub1CalificationExam1());
        System.out.println("Exam´s 2 Calification: " + student2.getSub1CalificationExam2());
        System.out.println("Exam´s 3 Calification: " + student2.getSub1CalificationExam3());
        System.out.println("Final Average: " + student2.getAverage1());
        System.out.println(student2.getApprove1());
        
        System.out.println("");
        
        System.out.println("Subject: " + student2.getSubject2());
        System.out.println("Section: " + student2.getSection());
        System.out.println("Exam´s 1 Calification: " + student2.getSub2CalificationExam1());
        System.out.println("Exam´s 2 Calification: " + student2.getSub2CalificationExam2());
        System.out.println("Exam´s 3 Calification: " + student2.getSub2CalificationExam3());
        System.out.println("Final Average: " + student2.getAverage2());
        System.out.println(student2.getApprove2());
        
        System.out.println("");
        
        System.out.println("Subject: " + student2.getSubject3());
        System.out.println("Section: " + student2.getSection());
        System.out.println("Exam´s 1 Calification: " + student2.getSub3CalificationExam1());
        System.out.println("Exam´s 2 Calification: " + student2.getSub3CalificationExam2());
        System.out.println("Exam´s 3 Calification: " + student2.getSub3CalificationExam3());
        System.out.println("Final Average: " + student2.getAverage3());
        System.out.println(student2.getApprove3());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Professor´s. \n");
        Professor professor1 = new Professor("Jose Camarena", "Algebra", 503, "Control Analógico", 502, "Ingles", 201);
        System.out.println("Professor´s name: " + professor1.getName());
        System.out.println("Subject 1: " + professor1.getSubject1());
        System.out.println("Section: " + professor1.getSection1());
        System.out.println("Subject 2: " + professor1.getSubject2());
        System.out.println("Section: " + professor1.getSection2());
        System.out.println("Subject 3: " + professor1.getSubject3());
        System.out.println("Section: " + professor1.getSection3());
        
        System.out.println("");
        
        Professor professor2 = new Professor("Felix Jimenez", "Programacion II", 503, "Redes", 601, "Bases de Datos", 503);
        System.out.println("Professor´s name: " + professor2.getName());
        System.out.println("Subject 1: " + professor2.getSubject1());
        System.out.println("Section: " + professor2.getSection1());
        System.out.println("Subject 2: " + professor2.getSubject2());
        System.out.println("Section: " + professor2.getSection2());
        System.out.println("Subject 3: " + professor2.getSubject3());
        System.out.println("Section: " + professor2.getSection3());
        
        System.out.println("");
        
        Professor professor3 = new Professor("José Bejar", "Analisis de Algoritmos", 503, "Métodos Numericos", 302, "Estructuras de Datos", 401);
        System.out.println("Professor´s name: " + professor3.getName());
        System.out.println("Subject 1: " + professor3.getSubject1());
        System.out.println("Section: " + professor3.getSection1());
        System.out.println("Subject 2: " + professor3.getSubject2());
        System.out.println("Section: " + professor3.getSection2());
        System.out.println("Subject 3: " + professor3.getSubject3());
        System.out.println("Section: " + professor3.getSection3());
    }
    
}
