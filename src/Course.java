public class Course {

    String name;

    int course_number;

    int credits;

    private String classroom;

    //Students
    //Instructor

    Course(){

        name = "";
        course_number = 0;
        credits = 0;

    }

    Course(int course_number, int credit, String name){

        this.course_number = course_number;
        this.credits = credit;
        this.name = name;

    }

    //Setters & Getters
    public void Set_Classroom(String classroom){
        this.classroom = classroom;

    }

    public String Get_Classroom(){
        return this.classroom;
    }

    //Method for displaying attribute values
    public void display_course_information(){
        IO.println("Course Name: " + this.name + " Course Number: " + this.course_number);
    }
}
