
public class ArrayWorld extends World {

    private boolean[][] world;
    private boolean[] deadRow;

    public ArrayWorld(String format) {
        super(format);
        world = new boolean[this.getHeight()][this.getWidth()];
        try {
            getPattern().initialise(this);
        } catch (PatternFormatException e) {
            e.printStackTrace();
        }
        deadRow = new boolean[getWidth()];
    }

    public ArrayWorld(Pattern pattern){
        super(pattern);
        world = new boolean[this.getHeight()][this.getWidth()];
        try {
            getPattern().initialise(this);
        } catch (PatternFormatException e) {
            e.printStackTrace();
        }
        deadRow = new boolean[getWidth()];
        for(int i = 0; i < world.length; i++){
            boolean test = true;
            for(int j = 0; j < world[i].length; j++){
                if(world[i][j]){
                    test = false;
                    break;
                }
            }
            if(test){
                world[i] = deadRow;
            }
        }
    }





    //part1_3 copy constructor
    public ArrayWorld(ArrayWorld other){
        super(other);
        world = new boolean[other.getHeight()][other.getWidth()];
        deadRow = new boolean[other.getWidth()];
        for(int i = 0; i < world.length; i++){
            if(other.world[i] == other.deadRow){
                world[i] = deadRow;
                continue;
            }
            for(int j = 0; j < world[i].length; j++){
                world[i][j] = other.world[i][j];
            }
        }
    }

    //part1_4
    public Object clone(){
        ArrayWorld cloned = (ArrayWorld)super.clone();
        cloned.world = new boolean[getPattern().getHeight()][getPattern().getWidth()];
        cloned.deadRow = new boolean[cloned.getWidth()];
        for(int i = 0; i < world.length; i++){
            if(world[i] == deadRow){
                cloned.world[i] = cloned.deadRow;
                continue;
            }
            for(int j = 0; j < world[i].length; j++){
                cloned.world[i][j] = this.world[i][j];
            }
        }
        return cloned;
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

