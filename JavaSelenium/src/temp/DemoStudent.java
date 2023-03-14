package temp;

public class DemoStudent {
	
	int stu_roll_no;
	int stu_age;
	
	public void display1()
	{
		System.out.println("welcome to all of you");
		
 	}
	
	public void display2()
	{
		System.out.println("automation is very easy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		DemoStudent demoStu = new DemoStudent();
		demoStu.stu_roll_no = 1234;
		demoStu.stu_age = 23;
		
		System.out.println(demoStu.stu_roll_no);
		System.out.println(demoStu.stu_age);
		
		demoStu.display1();
		demoStu.display2();
		

	}

}
