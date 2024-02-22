package template;

public class PDFfileProcessor extends FileProcessor{
    @Override
    protected void readFile() {
        System.out.println("reading pdf a file..");
    }

    @Override
    protected void writeFile() {
        System.out.println("writing pdf a file..");
    }
}
