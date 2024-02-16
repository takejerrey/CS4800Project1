public class CompositionDriver {
    public static void main(String[] args) {
        Folder root = new Folder("php_demo1");
        root.addFile(new File(".phalcon", ""));
        Folder app = new Folder("app");
        root.addSubFolder(app);
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        Folder publicFolder = new Folder("public");
        publicFolder.addFile(new File(".htaccess", ""));
        publicFolder.addFile(new File("index.html", ""));
        app.addSubFolder(publicFolder);
        Folder cache = new Folder("cache");
        app.addSubFolder(cache);

        System.out.println("Full Structure:");
        root.printContents();
        boolean isAppRemoved = root.removeFolder("app");
        System.out.println("\nAfter removing app folder:");
        root.printContents();
        boolean isPublicRemoved = app.removeFolder("public");
        System.out.println("\nAfter removing public folder:");
        root.printContents();
    }
}
