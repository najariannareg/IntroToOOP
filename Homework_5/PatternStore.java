
import java.io.*;
import java.net.*;
import java.util.*;

public class PatternStore {

    public static final int MAX_NUMBER_PATTERNS = 1000;
    private Pattern[] patterns = new Pattern[MAX_NUMBER_PATTERNS];
    private int numberUsed = 0;

    public PatternStore(String source) throws IOException {
        if (source.startsWith("http://") || source.startsWith("https://")) {
            loadFromURL(source);
        }
        else {
            loadFromDisk(source);
        }
    }

    public PatternStore(Reader source) throws IOException {
        load(source);
    }


    private void load(Reader r) throws IOException {
        BufferedReader b = new BufferedReader(r);
        String line;
        while((line = b.readLine()) != null){
            try {
                patterns[numberUsed] = new Pattern(line);
            } catch (PatternFormatException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(line);
            numberUsed++;
        }
        b.close();
    }

    private void loadFromURL(String url) throws IOException {
        URL destination = new URL(url);
        URLConnection conn = destination.openConnection();
        Reader r = new InputStreamReader(conn.getInputStream());
        load(r);
    }

    private void loadFromDisk(String filename) throws IOException {
        Reader r = new FileReader(filename);
        load(r);
    }


    public Pattern[] getPatterns() {
        Pattern[] p = new Pattern[patterns.length];
        for(int i = 0; i < patterns.length; i++){
            p[i] = patterns[i];
        }
        return p;
    }

    public String[] getPatternAuthors() {
        String[] authors = new String[patterns.length];
        for(int i = 0; i < patterns.length; i++){
            authors[i] = patterns[i].getAuthor();
        }
        Arrays.sort(authors);
        return authors;
    }

    public String[] getPatternNames() {
        String[] names = new String[patterns.length];
        for(int i = 0; i < patterns.length; i++){
            names[i] = patterns[i].getName();
        }
        Arrays.sort(names);
        return names;
    }


    public static void main(String args[]) throws IOException {
        PatternStore p = new PatternStore(args[0]);
    }
}