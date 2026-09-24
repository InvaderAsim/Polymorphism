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

        //Student Object

        Student arturo = new Student();
        Course math141 = new Course();
        Course frsh = new Course();
        Course cosc107 = new Course();
        Course engl102 = new Course();
        Course soc101 = new Course();

        arturo.enrolled_courses[0] = math141;
        arturo.enrolled_courses[1] = frsh;
        arturo.enrolled_courses[2] = cosc107;
        arturo.enrolled_courses[3] = engl102;
        arturo.enrolled_courses[4] = soc101;

        BSU_Member[] members = new BSU_Member[10];

        BSU_Member b1, b2;
        b1 = new Student();
        b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;

        for (int j = 2; j < 10; j++) {
            members[j] = new BSU_Member();
        }

        for (int j = 0; j < 10; j++){
            members[j].display_information();
        }

    }


}



