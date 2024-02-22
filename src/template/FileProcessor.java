package template;

public abstract class FileProcessor {

    public void processFile(){
        openFile();
        writeFile();
        readFile();
        saveFile();
        closeFile();
    }

    protected  void closeFile(){
        System.out.println("closing a file..");
    }

    protected  void saveFile(){
        System.out.println("saving a file..");
    }

    protected abstract void readFile();

    protected abstract void writeFile();

    protected  void openFile(){
        System.out.println("opening a file..");
    }
}
