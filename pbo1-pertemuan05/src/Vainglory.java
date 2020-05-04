public class Vainglory {
//atribut
    String nickname;
    int assist;
    int kill;
    int dead;
    double gold;

//behavior
    void Move(){
        System.out.println("Move and Kill");
    }
    void killmonster(Vainglory Vainglory) {
        gold += 80;
    }
    void mati(Vainglory Vainglory){
        dead -= 30;
    }
    void kill(Vainglory Vainglory) {
        kill += 100;
    }
}
