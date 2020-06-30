
import java.io.IOException;

public class PackedWorld extends World{

    private long world;

    public PackedWorld(String format) throws IOException{
        super(format);
        world = 0L;
        if(getPattern().getHeight() * getPattern().getWidth() > 64){
            throw new IOException("wrong dimensions");
        }
        try {
            getPattern().initialise(this);
        } catch (PatternFormatException e) {
            e.printStackTrace();
        }
    }

    public PackedWorld(Pattern pattern) throws IOException{
        super(pattern);
        world = 0L;
        if(getPattern().getHeight() * getPattern().getWidth() > 64){
            throw new IOException("wrong dimensions");
        }
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
        if(((world >>> (row * getPattern().getWidth() + col)) & 1L) == 1L)
            return true;
        else
            return false;
    }

    public void setCell(int row, int col, boolean value) {
        if(row < 0 || row >= getPattern().getHeight()) {
            return;
        }
        if(col < 0 || col >= getPattern().getWidth()) {
            return;
        }
        if(value)
            world |= (1L << (row * getPattern().getWidth() + col));
        else
            world &= (1L << (row * getPattern().getWidth() + col));
    }

    protected void nextGenerationImpl() {
        long newWorld = 0L;
        for(int row = 0; row < getPattern().getHeight(); row++) {
            for(int col = 0; col < getPattern().getWidth(); col++) {
                if(computeCell(row, col)){
                    newWorld |= (1L << (row * getPattern().getWidth() + col));
                }
            }
        }
        world = newWorld;
    }

}
