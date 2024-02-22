package template;

public class TemplateDemo {
    public static void main(String[] args) {

        FileProcessor fileProcessorPDF=new PDFfileProcessor();
        fileProcessorPDF.processFile();

        System.out.println("-------------------------------");
        FileProcessor fileProcessorWord=new WordFileProcessor();
        fileProcessorWord.processFile();

    }
}
