import java.util.*;
public class Folder {
    private String name;
    private List<File> file;
    private List<Folder> subFolder;

    public Folder(String name) {
        this.name = name;
        this.file = new ArrayList<>();
        this.subFolder = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFile() {
        return file;
    }
    public void addSubFolder(Folder folder){
        subFolder.add(folder);
    }
    public List<Folder> getSubFolder(){
        return subFolder;
    }

    public void addFile(File file) {
        this.file.add(file);
    }


    public boolean removeFile(String fileName) {
        return file.removeIf(file -> file.getName().equals(fileName));
    }

    public boolean removeFolder(String folderName){
        return subFolder.removeIf(folder -> folder.getName().equals(folderName));
    }

    public void printContents() {
        System.out.println("Folder: " + name);
        for (File file : file) {
            file.printInfo();
        }
        for(Folder folder: subFolder){
            folder.printContents();
        }
    }

}
