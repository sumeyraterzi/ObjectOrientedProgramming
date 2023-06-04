package EmployeePackage;

public class Employee {
    String name;
    double maas;
    int workHours;
    int hireYear;



    Employee(String name, double maas, int workHours, int hireYear){
        this.name=name;
        this.maas=maas;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){
        if (this.maas<1000 ){
            return 0;
        }else {
            return this.maas*0.3;
        }
    }
    double bonus(){
        if (this.workHours<41){
            return 0;
        }else {
            return this.maas+(this.workHours-40)*30;
        }
    }

    double raiseSalary(){
        int fark=2021-this.hireYear;
        if (fark<10 ){
            return this.maas*0.5;
        }else if(fark<20 ){
            return this.maas*0.10;
        }else
            return this.maas*0.15;
    }
    void toString(Employee employee){
        System.out.println("Adı : "+ this.name +"\n"+
                "Çalışma Saati : "+ this.workHours+"\n"+
                "Başlangıç Yılı : "+ this.hireYear+"\n"+
                "Vergi : "+employee.tax()+ "\n"+
                "Bonus : "+ employee.bonus()+"\n"+
                "Maaş Artışı : "+ employee.raiseSalary()+"\n"+
                "Vergi ve Bonuslarla Maaş : "+ (this.maas+employee.tax()+employee.bonus())+"\n"+
                "Toplam Maaş : "+ (this.maas+employee.tax()+employee.bonus()+employee.raiseSalary())+"\n");
    }

    /*
    Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0

tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus
ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.*/
}
