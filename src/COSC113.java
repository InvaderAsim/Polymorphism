public class COSC113 extends Course{

    String syllabus;

    String coding_language;

    Instructor i1;

    Student[] students;

    COSC113(){
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
        this.course_number = 113;
        this.credits = 4;
        this.name = "COSC113";

    }
    // Parent class Constructors are not inherited, but can be invoked/called
    COSC113(int course_number, int credit, String name){
        // super () will invoke  the parent class's default constructor - course()
        // super();

        super(course_number, credit, name);
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
    }

    // Method overwriting: Defining a method with the same method signature from the parent class
    @Override
    public void display_course_information(){
        // Lab Work - Use super.ATTRIBUTE_NAME inside a print statement
        super.display_course_information();
        IO.println("Syllabus: " + this.syllabus + " Language: " + this.coding_language + " Instructor: " +
                this.i1 + " Students: " + this.students);

    }
}
