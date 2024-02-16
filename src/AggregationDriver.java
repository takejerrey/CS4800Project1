import org.w3c.dom.Text;

public class AggregationDriver {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Hello","World","1-2345");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Book stuff", "Book person", "Book company");

        Course course = new Course("Software Engineering", instructor, textbook);
        course.print();
        course = new Course("Stuff",instructor2,textbook2);
        course.print();
    }
}
