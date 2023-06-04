package MaterialTransportApplication;

public class Main {
    public static void main(String[] args) {
        Transport t1= new Transport("kimyasal",25.0,56.0,"gemi");
        System.out.println(t1.hesaplaMaliyet());

    }
}
