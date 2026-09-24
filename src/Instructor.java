public class Instructor extends BSU_Member {

    String department;


    Instructor(){
        this.department = "CS";
        this.status = "Faculty";


    }


    public void main(){

        IO.println("BSU Member Department: " + this.department + " BSU Member Status: " + this.status );

    }
}
