//import java.util.Scanner;
//
//public class PackedLife {
//
//    private Pattern pattern;
//    private int width;
//    private int height;
//    private long world;
//
//    public PackedLife(String format) {
//        pattern = new Pattern(format);
//        width = pattern.getWidth();
//        height = pattern.getHeight();
//        world = 0L;
//        world = pattern.initialise(world);
//    }
//
//    public boolean getCell(int row, int col) {
//        if(row < 0 || row >= height) {
//            return false;
//        }
//        if(col < 0 || col >= width) {
//            return false;
//        }
//        if(((world >>> (row * width + col)) & 1L) == 1L)
//            return true;
//        else
//            return false;
//    }
//
//    public void setCell(int row, int col, boolean value) {
//        if(row < 0 || row >= height) {
//            return;
//        }
//        if(col < 0 || col >= width) {
//            return;
//        }
//        if(value)
//            world |= (1L << (row * width + col));
//        else
//            world &= (1L << (row * width + col));
//    }
//
//    public void print() {
//        for(int row = 0; row < height; row++) {
//            for(int col = 0; col < width; col++) {
//                if(getCell(row, col))
//                    System.out.print("1 ");
//                else
//                    System.out.print("0 ");
//            }
//            System.out.println();
//        }
//    }
//
//    public int countNeighbours(int row, int col) {
//        int neighbours = 0;
//        for(int i = row - 1; i <= row + 1; i++) {
//            for(int j = col - 1; j <= col + 1; j++) {
//                if(i == row && j == col) {
//                    continue;
//                }
//                if(getCell(i, j))
//                    neighbours++;
//            }
//        }
//        return neighbours;
//    }
//
//    public boolean computeCell(int row, int col) {
//        if(row < 0 || row >= height) {
//            return false;
//        }
//        if(col < 0 || col >= width) {
//            return false;
//        }
//        int neighbours = countNeighbours(row, col);
//        return ((getCell(row, col) && neighbours == 2) || neighbours == 3);
//    }
//
//    public void nextGeneration() {
//        long newWorld = 0L;
//        for(int row = 0; row < height; row++) {
//            for(int col = 0; col < width; col++) {
//                if(computeCell(row, col)){
//                    newWorld |= (1L << (row * width + col));
//                }
//            }
//        }
//        world = newWorld;
//    }
//
//    public void play() {
//        Scanner sc = new Scanner(System.in);
//        String input;
//        while(true){
//            input = sc.next();
//            if(input.equals("s")){
//                print();
//                nextGeneration();
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
//
//    public static void main(String[] args) {
//        PackedLife pl = new PackedLife(args[0]);
//
//        System.out.println("Name: " + pl.pattern.getName());
//        System.out.println("Author: " + pl.pattern.getAuthor());
//        System.out.println("Width: " + pl.pattern.getWidth());
//        System.out.println("Height: " + pl.pattern.getHeight());
//        System.out.println("StartCol: " + pl.pattern.getStartCol());
//        System.out.println("StartRow: " + pl.pattern.getStartRow());
//        System.out.println("Pattern: " + pl.pattern.getCells());
//
//        pl.play();
//    }
//
//}
