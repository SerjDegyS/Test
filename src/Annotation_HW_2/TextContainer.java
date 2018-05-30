package Annotation_HW_2;

import java.io.*;

@SaveTo(path = "src/Annotation_HW_2/file")
public class TextContainer {

    private final String text = "Text for saved!!!";

    @Save
    public void save(String file) throws IOException {
        Writer out = new FileWriter(file);
        try {
            out.write(text);
            System.out.println("File was saved successful!");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error! File don't saved!");
        } finally {
            out.close();
        }
    }
}
