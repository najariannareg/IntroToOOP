
public class ArrayWorld extends World {

    private boolean[][] world;

    public ArrayWorld(String format) {
        super(format);
        world = new boolean[this.getHeight()][this.getWidth()];
        try {
            getPattern().initialise(this);
        } catch (PatternFormatException e) {
            e.printStackTrace();
        }
    }

    public ArrayWorld(Pattern pattern){
        super(pattern);
        world = new boolean[this.getHeight()][this.getWidth()];
        try {
            getPattern().initialise(this);
        } catch (PatternFormatException e) {
            e.printStackTrace();
        }
    }


    public boolean getCell(int row, int col) {
        if(row < 0 || row >= getPattern().getHeight()) {
            return false;
        }
        if(col < 0 || col >= getPattern().getWidth()) {
            return false;
        }
        return world[row][col];
    }

    public void setCell(int row, int col, boolean value) {
        if(row < 0 || row >= getPattern().getHeight()) {
            return;
        }
        if(col < 0 || col >= getPattern().getWidth()) {
            return;
        }
        world[row][col] = value;
    }

    protected void nextGenerationImpl() {
        boolean[][] newWorld = new boolean[getPattern().getHeight()][getPattern().getWidth()];
        for(int row = 0; row < getPattern().getHeight(); row++) {
            for(int col = 0; col < getPattern().getWidth(); col++) {
                if(computeCell(row, col)){
                    newWorld[row][col] = true;
                }
            }
        }
        world = newWorld;
    }

}

