package student;

public class regularStudent extends Student{
	int attend_per;
	String class_room;
	public regularStudent(int RollNo,String Name,String Department,char Section,int attend_per,String class_room) {
		super(RollNo,Name,Department,Section);
		this.attend_per=attend_per;
		this.class_room=class_room;
	}
	public void submitAssignment() {
		System.out.println("The student has submitted the assignment in hard copy");
	}
	public void payFee() {
		super.payFee();
		System.out.println("The student with in classroom "+class_room+" has submitted tuition fee,lab fee+library fee.");
	}
	 public void displayInfo(){
	        super.displayInfo();
	        System.out.println("The attendance percentage is "+attend_per);
	        System.out.println("The classroom is "+class_room);
	 }
	
}
