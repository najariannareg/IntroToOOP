
public class Pattern implements Comparable<Pattern>{
    private String name;
    private String author;
    private int width;
    private int height;
    private int startCol;
    private int startRow;
    private String cells;

    @Override
    public String toString(){
        return name + " " + author;
    }

    //part1_1
    @Override
    public int compareTo(Pattern other){
        return name.compareTo(other.name);
    }



    public Pattern(String format) throws PatternFormatException{
        String[] info = format.split(":");

        if(format.equals(""))
            throw new PatternFormatException("Please specify a pattern.");
        if(info.length != 7)
            throw new PatternFormatException("Invalid pattern format: Incorrect number of fields in pattern (found " + info.length + "1).");
        name = info[0];
        author = info[1];
        try {
            width = Integer.parseInt(info[2]);
        }
        catch(Exception e){
            throw new PatternFormatException("Invalid pattern format: Could not interpret the width field as a number ('" + info[2] + "' given).");
        }
        try {
            height = Integer.parseInt(info[3]);
        }
        catch(Exception e){
            throw new PatternFormatException("Invalid pattern format: Could not interpret the height field as a number ('" + info[3] + "' given).");
        }
        try {
            startCol = Integer.parseInt(info[4]);
        }
        catch(Exception e){
            throw new PatternFormatException("Invalid pattern format: Could not interpret the startX field as a number ('" + info[4] +"' given)");
        }
        try {
            startRow = Integer.parseInt(info[5]);
        }
        catch(Exception e){
            throw new PatternFormatException("Invalid pattern format: Could not interpret the startY field as a number ('" + info[5] +"' given)");
        }
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



    public void initialise(World world) throws PatternFormatException{
        String[] cellsArr = cells.split(" ");
        for(int row = 0; row < cellsArr.length; row++) {
            for(int col = 0; col < cellsArr[row].length(); col++){
                if((cellsArr[row].charAt(col) != '0') && (cellsArr[row].charAt(col) != '1')){
                    throw new PatternFormatException("Invalid pattern format: Malformed pattern '" + cells + "'.");
                }
                if(cellsArr[row].charAt(col) == '1'){
                    world.setCell(startRow + row,startCol + col, true);
                }
            }
        }
    }


}
