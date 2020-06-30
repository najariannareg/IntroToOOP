
import java.io.*;
import java.net.*;
import java.util.*;

public class PatternStore {

    private ArrayList<Pattern> patterns = new ArrayList<>();


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
                patterns.add(new Pattern(line));
            } catch (PatternFormatException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(line);
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


//    public Pattern[] getPatterns() {
//        Pattern[] p = new Pattern[patterns.size()];
//        for(int i = 0; i < patterns.size(); i++){
//            p[i] = patterns.get(i);
//        }
//        return p;
//    }




    //part1_1
    public ArrayList<Pattern> getPatternNameSorted(){
        ArrayList<Pattern> copy = new ArrayList<>(patterns);
        Collections.sort(copy);
        return copy;
    }



    public String[] getPatternAuthors() {
        String[] authors = new String[patterns.size()];
        for(int i = 0; i < patterns.size(); i++){
            authors[i] = patterns.get(i).getAuthor();
        }
        Arrays.sort(authors);
        return authors;
    }

    public String[] getPatternNames() {
        String[] names = new String[patterns.size()];
        for(int i = 0; i < patterns.size(); i++){
            names[i] = patterns.get(i).getName();
        }
        Arrays.sort(names);
        return names;
    }


    public static void main(String args[]) throws IOException {
        PatternStore p = new PatternStore(args[0]);
    }
}