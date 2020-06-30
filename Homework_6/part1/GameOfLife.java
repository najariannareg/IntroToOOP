
import java.io.*;
import java.net.*;
import java.util.*;

public class GameOfLife {

    private World world;
    private PatternStore store;
    ArrayList<World> cachedWorld = new ArrayList<>();


    public GameOfLife(World w) {
        world = w;
    }
    public GameOfLife(PatternStore store) {
        this.store = store;
    }



    //part1_3
    public World copyWorld(boolean useCloning,World other) {
        if (useCloning) {
            return (World)other.clone();
        }

        if(other instanceof ArrayWorld){
            return new ArrayWorld ((ArrayWorld) other);
        }
        else{
            return new PackedWorld ((PackedWorld) other);
        }
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
                    if(world.getGenerationCount() < cachedWorld.size() - 1 ){
                        world = cachedWorld.get(world.getGenerationCount() + 1 );
                    }
                    else{
                        if(world.getGenerationCount() == cachedWorld.size() - 1){
                            world = copyWorld(true, world);
                        }
                        world.nextGeneration();
                        cachedWorld.add(copyWorld(true, world));
                    }
                    print();
                }
            }
            else if (response.equals("l")) {
                ArrayList<Pattern> names = store.getPatternNameSorted();
                int i = 0;
                for (Pattern p : names) {
                    System.out.println(i + " " + p.getName() + " (" + p.getAuthor() + ")");
                    i++;
                }
            }
            else if (response.startsWith("p")) {
                ArrayList<Pattern> names = store.getPatternNameSorted();
                String[] args = response.split(" ");
                int patternNumber = Integer.parseInt(args[1]);
                Pattern pattern = names.get(patternNumber);
                if(pattern.getWidth() * pattern.getHeight() < 64){
                    world = new PackedWorld(pattern);
                }
                else{
                    world = new ArrayWorld(pattern);
                }
                cachedWorld.add(copyWorld(true, world));
                print();
            }
            else if(response.startsWith("b")){
                if(world.getGenerationCount() == 0){
                    print();
                }
                else{
                    world =  cachedWorld.get(world.getGenerationCount() - 1);
                    print();
                }
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

}
