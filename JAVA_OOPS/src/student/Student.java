package student;

public class Student {
	
		
		    int RollNo;
		    private String Name;
		    protected String Department;
		    char Section;
		    static String collegeName="KIET"; //class variable

		    public Student(int RollNo,String Name,String Department,char Section)
		    {
		        this.RollNo=RollNo;
		        this.Name=Name;
		        this.Department=Department;
		        this.Section=Section;
		    }

		    public Student()
		    {
		        this.RollNo=1;
		        this.Name="Pranjal";
		        this.Department="CSEAI";
		        this.Section='C';
		    }

		    public Student(Student obj)
		    {
		        this.RollNo=obj.RollNo;
		        this.Name=obj.Name;
		        this.Department=obj.Department;
		        this.Section=obj.Section;
		    }

		    public void studying(int no_of_hours){
		        System.out.println("The student is studying for "+no_of_hours+" hours");
		    }
		    public void displayInfo(){
		        System.out.println("The name of the student is "+Name+ " The college name is "+collegeName);
		        System.out.println("The department is "+Department+" and section is "+Section);
		    }
		    public void payFee() {
		    	System.out.println("The student "+Name+" has paid the tuition fee.");
		    }
		    public void playing(){
		        System.out.println("Student is playing");
		    }
		    public static void main(String[] args){
		        Student student1=new Student(1,"Addy","CSEAI",'C');//parameterized constructor
		        Student student2=new Student();//default constructor
		        Student student3=new Student(student1); //copy constructor
		        Student.collegeName="IIT GUWAHATI";
		        student1.Department="AI";
		        student1.Name="Rohan";
		        student1.RollNo=1;
		        student1.Section='C';
		        student1.displayInfo();
		        student1.playing();
		        student1.studying(6);
		        student2.displayInfo();
		        student2.studying(9);
		        student3.displayInfo();
		        }
		    
}
