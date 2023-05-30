package BoxingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge= dodge;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name +" gelen hasarı blokladı .");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        } else {
            return foe.health - this.damage;
        }
    }

    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }

    boolean isWin(){
        if (this.f1.health==0){
            System.out.println("Kazanan yarışmacı =======>"+ this.f2.name);
            return  true;
        }
        if (this.f2.health==0){
            System.out.println("Kazanan yarışmacı =======>"+ this.f1.name);
            return true;
        }
        return false;
    }


}
