import java.util.Scanner;

public class ArrayLife {

    private Pattern pattern;
    private int width;
    private int height;
    private boolean[][] world;

    public ArrayLife(String format) {
        pattern = new Pattern(format);
        width = pattern.getWidth();
        height = pattern.getHeight();
        world = new boolean[height][width];
        pattern.initialise(world);
    }



    public boolean getCell(int row, int col) {
        if(row < 0 || row >= height) {
            return false;
        }
        if(col < 0 || col >= width) {
            return false;
        }
        return world[row][col];
    }

    public void setCell(int row, int col, boolean value) {
        if(row < 0 || row >= height) {
            return;
        }
        if(col < 0 || col >= width) {
            return;
        }
        world[row][col] = value;
    }

    public void print() {
        for(int row = 0; row < height; row++) {
            for(int col = 0; col < width; col++) {
                if(getCell(row, col))
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public int countNeighbours(int row, int col) {
        int neighbours = 0;
        for(int i = row - 1; i <= row + 1; i++) {
            for(int j = col - 1; j <= col + 1; j++) {
                if(i == row && j == col) {
                    continue;
                }
                if(getCell(i, j))
                    neighbours++;
            }
        }
        return neighbours;
    }

    public boolean computeCell(int row, int col) {
        if(row < 0 || row >= height) {
            return false;
        }
        if(col < 0 || col >= width) {
            return false;
        }
        int neighbours = countNeighbours(row, col);
        return ((getCell(row, col) && neighbours == 2) || neighbours == 3);
    }

    public void nextGeneration() {
        boolean[][] newWorld = new boolean[height][width];
        for(int row = 0; row < height; row++) {
            for(int col = 0; col < width; col++) {
                if(computeCell(row, col)){
                    newWorld[row][col] = true;
                }
            }
        }
        world = newWorld;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        String input;
        while(true){
            input = sc.next();
            if(input.equals("s")){
                print();
                nextGeneration();
            } else if(input.equals("q")){
                System.out.println("The End");
                break;
            } else {
                System.out.println("Unknown character");
                System.out.println("s: to play");
                System.out.println("q: to quit");
            }
        }
        System.exit(0);
    }


    public static void main(String[] args) {
        ArrayLife al = new ArrayLife(args[0]);

        System.out.println("Name: " + al.pattern.getName());
        System.out.println("Author: " + al.pattern.getAuthor());
        System.out.println("Width: " + al.pattern.getWidth());
        System.out.println("Height: " + al.pattern.getHeight());
        System.out.println("StartCol: " + al.pattern.getStartCol());
        System.out.println("StartRow: " + al.pattern.getStartRow());
        System.out.println("Pattern: " + al.pattern.getCells());

        al.play();
    }


}
