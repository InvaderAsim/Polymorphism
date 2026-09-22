public class Main{


    public static void main() {

        Course C1 = new Course();
        C1.display_course_information();

        COSC113 c2 = new COSC113();

        c2.display_course_information();

        //Polymorphism
        Course cosc214 = new Course();
        Course section2 = new COSC113();
        // The relationship is: IS-A relationship between Course and COSC113

        cosc214.display_course_information();
        section2.display_course_information();
    }

}



