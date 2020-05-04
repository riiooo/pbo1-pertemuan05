public class Main {
    public static void main(String[] args) {
        Vainglory player = new Vainglory();
        Vainglory enemy = new Vainglory();

        player.nickname ="Rafel";
        player.kill = 65;
        player.assist = 5;
        player.dead = 45;
        player.gold = 20;

        player.Move();

        System.out.println(player.assist);
        player.killmonster(enemy);
        System.out.println(player.gold);
        player.mati(enemy);
        System.out.println(player.dead);
        player.kill(enemy);
        System.out.println(player.kill);
    }
}
