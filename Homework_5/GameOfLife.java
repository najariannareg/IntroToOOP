
import java.io.*;
import java.net.*;
import java.util.*;

public class GameOfLife {

    private World world;
    private PatternStore store;

    public GameOfLife(World w){
        world = w;
    }
    public GameOfLife(PatternStore store){
        this.store = store;
    }


    public void print() {
        System.out.println("- " + world.getGenerationCount());
        for(int row = 0; row < world.getHeight(); row++) {
            for(int col = 0; col < world.getWidth(); col++) {
                if(world.getCell(row, col))
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }


    public void play() throws IOException {
        String response = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please select a pattern to play (l to list):");
        while (!response.equals("q")) {
            response = in.readLine();
            System.out.println(response);
            if (response.equals("f")) {
                if (world == null) {
                    System.out.println("Please select a pattern to play (l to list):");
                }
                else {
                    world.nextGeneration();
                    print();
                }
            }
            else if (response.equals("l")) {
                Pattern[] names = store.getPatterns();
                int i = 0;
                for (Pattern p : names) {
                    System.out.println(i + " " + p.getName() + " (" + p.getAuthor() + ")");
                    i++;
                }
            }
            else if (response.startsWith("p")) {
                Pattern[] names = store.getPatterns();
                String[] args = response.split(" ");
                int patternNumber = Integer.parseInt(args[1]);
                Pattern pattern = names[patternNumber];
                if(pattern.getWidth() * pattern.getHeight() < 64){
                    world = new PackedWorld(pattern);
                }
                else{
                    world = new ArrayWorld(pattern);
                }
                print();
            }
        }
    }



    public static void main(String args[]) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java GameOfLife <path/url to store>");
            return;
        }
        try {
            PatternStore ps = new PatternStore(args[0]);
            GameOfLife gol = new GameOfLife(ps);
            gol.play();
        }
        catch (IOException ioe) {
            System.out.println("Failed to load pattern store");
        }
    }





//    public void play() {
//        Scanner sc = new Scanner(System.in);
//        String input;
//        while(true){
//            input = sc.next();
//            if(input.equals("s")){
//                print();
//                world.nextGeneration();
//            } else if(input.equals("q")){
//                System.out.println("The End");
//                break;
//            } else {
//                System.out.println("Unknown character");
//                System.out.println("s: to play");
//                System.out.println("q: to quit");
//            }
//        }
//        System.exit(0);
//    }

//    public void play() throws IOException{
//        Scanner sc = new Scanner(System.in);
//        String input;
//        while(true) {
//            input = sc.next();
//            if (input.equals("s")) {
//                print();
//                world.nextGeneration();
//            }
//            else if (input.equals("q")) {
//                System.out.println("The End");
//                System.exit(0);
//            }
//            else
//                throw new IOException("wrong key");
//        }
//    }
//
//    public static void main(String[] args) throws IOException{
//
//        World w = null;
//
//        String pattern = args.length == 1 ? args[0] : args[1];
//
//        if (args.length == 1 || args[0].equals("--array")) {
//            w = new ArrayWorld(pattern);
//        }
//        else if(args[0].equals("--packed")){
//            w = new PackedWorld(pattern);
//        }
//
//
//        GameOfLife gol = new GameOfLife(w);
//        gol.play();
//
//    }




}
