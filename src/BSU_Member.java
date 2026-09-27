public class BSU_Member {

    int id;

    String name;

    char gender;

    int age;

    String status;

    BSU_Member(){
        this.status = "Unspecified member of BSU";
    }

    //Lab Work: Create default a constructor, overloaded constructor, setter and getter

    public void display_information() {

        IO.println("Status: " + status);
    }

}
