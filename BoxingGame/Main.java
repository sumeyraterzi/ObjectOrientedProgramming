package BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Boxcu A",10,120,100,100);
        Fighter f2=new Fighter("Boxcu B",20,85,85,50);

        Match match =new Match(f1,f2,85,100);
        match.run();
    }
}
