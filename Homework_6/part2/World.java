
public abstract class World implements Cloneable{

    private int generation;
    private Pattern pattern;

    public World(String pattern){
        generation = 0;
        try {
            this.pattern = new Pattern(pattern);
        } catch (PatternFormatException e) {
            e.printStackTrace();
        }
    }

    public World(Pattern pattern){
        generation = 0;
        this.pattern = pattern;
    }



    //part1_3
    public World(World other){
        this.generation = other.getGenerationCount();
        this.pattern = other.getPattern();
    }

    //part1_4
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }




    public int getWidth(){
        return pattern.getWidth();
    }

    public int getHeight(){
        return pattern.getHeight();
    }

    public int getGenerationCount(){
        return generation;
    }

    protected void incrementGenerationCount(){
        generation++;
    }

    protected Pattern getPattern(){
        return pattern;
    }

    public abstract boolean getCell(int row, int col);

    public abstract void setCell(int row, int col, boolean value);

    protected int countNeighbours(int row, int col) {
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

    protected boolean computeCell(int row, int col) {
        if(row < 0 || row >= pattern.getHeight()) {
            return false;
        }
        if(col < 0 || col >= pattern.getWidth()) {
            return false;
        }
        int neighbours = countNeighbours(row, col);
        return ((getCell(row, col) && neighbours == 2) || neighbours == 3);
    }

    public void nextGeneration(){
        nextGenerationImpl();
        incrementGenerationCount();
    }

    protected abstract void nextGenerationImpl();

}
