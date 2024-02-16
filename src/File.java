public class File {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void printInfo() {
        System.out.println("File Name: " + name + "\nContent: " + content);
    }
}
