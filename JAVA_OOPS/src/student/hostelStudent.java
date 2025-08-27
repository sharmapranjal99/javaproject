package student;

public class hostelStudent extends regularStudent{
	String hostel_name;
	public hostelStudent(int RollNo,String Name,String Department,char Section,int attend_per,String class_room,String hostel_name) {
		super(RollNo, hostel_name, Department, Section, attend_per, class_room);
		this.hostel_name=hostel_name;
	}
	public void payFee() {
		System.out.println("The student of hostel "+hostel_name+" has submitter the fees.");
	}
}
