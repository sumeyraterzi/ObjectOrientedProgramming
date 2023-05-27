package StudentInformationSystem;

import java.nio.charset.CoderResult;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Sümeyra TERZİ","YZLM","905360000000");
        Teacher t2 = new Teacher("MİNA TANRIVERDİ","YZEKA","999");
        Teacher t3 = new Teacher("FATİH ATALAR","MAT","483094");

        Course yaz = new Course("YAZILIM","Y101","YZLM");
        Course zka = new Course("YAPAY ZEKA","102","YZEKA");
        Course mat = new Course("MATEMATİK","103","MAT");

        yaz.addTeacher(t1);
        zka.addTeacher(t2);
        mat.addTeacher(t3);

        Student s1 = new Student("Will SMİTH","123","4",yaz,zka,mat);
        s1.addBulkExamNote(100,50,60);
        //s1.printNote();
        s1.isPass();

        Student s2 = new Student("Ayşe","1234","4",yaz,zka,mat);
        s2.addBulkExamNote(100,100,100);

        s2.addBulkSNote(100,100,100);
        s2.isPass();



    }
}
