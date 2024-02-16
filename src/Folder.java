import java.util.*;
public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolder;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolder = new ArrayList<>();
    }


    public void addFile(File file) {
        files.add(file);
    }


    public boolean removeFile(String fileName) {
        return files.removeIf(file -> file.getName().equals(fileName));
    }

    public boolean removeFolder(String folderName){
        return subFolder.removeIf(folder -> folder.getName().equals(folderName));
    }

    public void printContents() {
        System.out.println("Folder: " + name);
        for (File file : files) {
            file.printInfo();
        }
        for(Folder folder: subFolder){
            folder.printContents();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }
    public void addSubFolder(Folder folder){
        subFolder.add(folder);
    }
    public List<Folder> getSubFolder(){
        return subFolder;
    }
}
