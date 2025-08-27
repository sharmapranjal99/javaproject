package student;

public class Teststudent {
	public static void main(String[] args){
        Student student1=new Student(1,"Addy","CSEAI",'C');//parameterized constructor
        Student student2=new Student();//default constructor
        Student student3=new Student(student1);
        regularStudent rs=new regularStudent(1,"Priya","Aiml",'G',80,"H506");
//        rs.payFee();
//        rs.displayInfo();
        
        onlineStudent os=new onlineStudent(2,"Pranjal","Ai",'H',"Java","12000");
//        os.payFee();
//        os.displayinfo();
        
        hostelStudent hs=new hostelStudent(3,"ABC","IT",'B',68,"E805","Gargi");
        hs.payFee();
        System.out.println(hs.hostel_name);
        
        
        
        
//        Student.collegeName="IIT GUWAHATI";
//        student1.Department="AI";
//        
//        student1.RollNo=1;
//        student1.Section='C';
//        student1.displayInfo();
//        student1.playing();
//        student1.studying(6);
//        student2.displayInfo();
//        student2.studying(9);
//        student3.displayInfo();
	}
}
