package template;

import java.text.FieldPosition;

public class WordFileProcessor extends FileProcessor {
    @Override
    protected void readFile() {
        System.out.println("reading word  file..");
    }

    @Override
    protected void writeFile() {
        System.out.println("writing word a file..");
    }
}
