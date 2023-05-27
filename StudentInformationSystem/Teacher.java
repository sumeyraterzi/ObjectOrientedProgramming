package StudentInformationSystem;

public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch, String mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }

   void print(){
       System.out.println("=========================");
        System.out.println("Öğretmenin Adı : "+ this.name);
        System.out.println("Dersin Kodu : "+ this.branch);
        System.out.println("Telefon Numarası : "+ this.mpno);
    }




}
