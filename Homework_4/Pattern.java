
public class Pattern {
    private String name;
    private String author;
    private int width;
    private int height;
    private int startCol;
    private int startRow;
    private String cells;


    public Pattern(String format) {
        String[] info = format.split(":");
        name = info[0];
        author = info[1];
        width = Integer.parseInt(info[2]);
        height = Integer.parseInt(info[3]);
        startCol = Integer.parseInt(info[4]);
        startRow = Integer.parseInt(info[5]);
        cells = info[6];
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getStartCol(){
        return startCol;
    }

    public int getStartRow(){
        return startRow;
    }

    public String getCells(){
        return cells;
    }



    public void initialise(boolean[][] world) {
        String[] cellsArr = cells.split(" ");
        for(int row = 0; row < cellsArr.length; row++) {
            for(int col = 0; col < cellsArr[row].length(); col++){
                if(cellsArr[row].charAt(col) == '1'){
                    world[startRow + row][startCol + col] = true;
                }
            }
        }
    }

    public long initialise(long world){
        if(width * height > 64){
            System.out.print("dimensions increase the limit");
            System.exit(0);
        }
        String[] cellsArr = cells.split(" ");
        for(int row = 0; row < cellsArr.length; row++) {
            for(int col = 0; col < cellsArr[row].length(); col++){
                if(cellsArr[row].charAt(col) == '1'){
                    world |= (1L << ((startRow + row) * width + (startCol + col)));
                }
            }
        }
        return world;
    }

}
