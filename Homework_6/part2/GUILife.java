import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

import javax.swing.border.*;


public class GUILife extends JFrame {

    private World world;
    private PatternStore store;
    ArrayList<World> cachedWorld = new ArrayList<>();
    JButton Back = new JButton("Back");
    JButton Play = new JButton("Play");
    JButton Forward = new JButton("Forward");

    public GUILife(PatternStore ps) {
        super("Game of Life");
        store = ps;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024,768);
        add(createPatternsPanel(),BorderLayout.WEST);
        add(createControlPanel(),BorderLayout.SOUTH);
        add(createGamePanel(),BorderLayout.CENTER);

        ArrayList<Pattern> al = store.getPatternNameSorted();
        Pattern[] ptrn = new Pattern[al.size()];
        al.toArray(ptrn);
        world = new ArrayWorld(ptrn[396]);

    }



    private void addBorder(JComponent component, String title) {
        Border etch = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        Border tb = BorderFactory.createTitledBorder(etch,title);
        component.setBorder(tb);
    }

    private JPanel createGamePanel() {
        GamePanel gamePanel = new GamePanel();
        addBorder(gamePanel,"Game Panel");

        gamePanel.display(world);

        return gamePanel;
    }

    private JPanel createPatternsPanel() {
        JPanel patt = new JPanel();
        patt.setLayout(new BorderLayout());
        addBorder(patt,"Patterns");

        ArrayList<Pattern> al = store.getPatternNameSorted();
        Pattern[] ptrn = new Pattern[al.size()];
        al.toArray(ptrn);

        JList<Pattern> list = new JList(ptrn);
        JScrollPane scrollPane = new JScrollPane(list);
        patt.add(scrollPane);
        return patt;
    }

    private JPanel createControlPanel() {
        JPanel ctrl = new JPanel();
        ctrl.setLayout(new GridLayout(1, 3));
        addBorder(ctrl,"Controls");

        ctrl.add(Back, BorderLayout.WEST);
        ctrl.add(Play, BorderLayout.CENTER);
        ctrl.add(Forward, BorderLayout.EAST);
        return ctrl;
    }

    private void moveBack(){
        if(world.getGenerationCount() == 0){
            print();
        }
        else{
            world =  cachedWorld.get(world.getGenerationCount() - 1);
            print();
        }
    }

    private void moveForward(){
        if (world == null) {
            System.out.println("Please select a pattern to play (l to list):");
        }
        else {
            if(world.getGenerationCount() < cachedWorld.size() - 1){
                world = cachedWorld.get(world.getGenerationCount() + 1);
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


    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java GameOfLife <path/url to store>");
            return;
        }
        try {
            PatternStore ps = new PatternStore(args[0]);
            GUILife gui = new GUILife(ps);

            gui.setVisible(true);
        }
        catch (IOException ioe) {
            System.out.println("Failed to load pattern store");
        }

    }


}
