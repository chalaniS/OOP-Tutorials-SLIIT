interface IDisplay {
    void print(); // Print in one line

    void printDetails(); // Print in multiple Lines
}

interface IInput {
    void input();
}

class Book implements IDisplay, IInput {
    private String bookID;
    private String title;
    private String publisher;

    public void print() {

    } // Print in one line

    public void printDetails() {

    }

    public void input() {

    }
}

class Student implements IDisplay, IInput {
    private String studentID;
    private String name;

    public void print() {

    }; // Print in one line

    public void printDetails() {

    };

    public void input() {

    };

}

public class Ex1 {

    static public void main(String args[]) {

        Book b = new Book();
        Student s = new Student();

        b.printDetails();
        s.printDetails();

    }

}
