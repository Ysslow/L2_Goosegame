package goosegame;

public class GoosegameMain {
    public static void usage() {
        System.out.println("Usage : java goosegame.GoosegameMain <Joueurs>");
        System.out.println("où <Joueurs> correspond aux différents joueurs souhaités dans la partie (2 à 6 joueurs)");
        System.exit(0);
    }
    public static void main(String[] args){
        Board b = new ClassicalBoard();
        Game g = new Game(b);
        // System.out.println(args.length);
        // System.out.println(args[0]);
        if (args.length == 2) {
            Player p1 = new Player(args[0]);
            Player p2 = new Player(args[1]);
            g.addPlayer(p1);
            g.addPlayer(p2);
        }
        else if (args.length == 3) {
            Player p1 = new Player(args[0]);
            Player p2 = new Player(args[1]);
            Player p3 = new Player(args[2]);
            g.addPlayer(p1);
            g.addPlayer(p2);
            g.addPlayer(p3);
        }
        else if (args.length == 4) {
            Player p1 = new Player(args[0]);
            Player p2 = new Player(args[1]);
            Player p3 = new Player(args[2]);
            Player p4 = new Player(args[3]);
            g.addPlayer(p1);
            g.addPlayer(p2);
            g.addPlayer(p3);
            g.addPlayer(p4);
        }
        else if (args.length == 5) {
            Player p1 = new Player(args[0]);
            Player p2 = new Player(args[1]);
            Player p3 = new Player(args[2]);
            Player p4 = new Player(args[3]);
            Player p5 = new Player(args[4]);
            g.addPlayer(p1);
            g.addPlayer(p2);
            g.addPlayer(p3);
            g.addPlayer(p4);
            g.addPlayer(p5);
        }
        else if (args.length == 6) {
            Player p1 = new Player(args[0]);
            Player p2 = new Player(args[1]);
            Player p3 = new Player(args[2]);       
            Player p4 = new Player(args[3]);
            Player p5 = new Player(args[4]);
            Player p6 = new Player(args[5]);
            g.addPlayer(p1);
            g.addPlayer(p2);
            g.addPlayer(p3);
            g.addPlayer(p4);
            g.addPlayer(p5);
            g.addPlayer(p6);
        }
        else{
            GoosegameMain.usage();
        }
        g.play();
    }
}