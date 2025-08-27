package student;

public class onlineStudent extends Student{
	String platform;
	String internetSpeed;
	public onlineStudent(int RollNo,String Name,String Department,char Section,String platform,String internetSpeed){
		super(RollNo,Name,Department,Section);
		this.platform=platform;
		this.internetSpeed=internetSpeed;
	}
	public void payFee() {
		super.payFee();
		System.out.println("Student paid successfully.");
	}
	public void displayinfo() {
		super.displayInfo();
		System.out.println("The platform is: "+platform);
		System.out.println("The internet speed is: "+internetSpeed);
	}
	
}
