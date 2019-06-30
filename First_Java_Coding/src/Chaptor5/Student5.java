package Chaptor5;

public class Student5 {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student5(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		 korean = new Subject();
		 math = new Subject();
	}
	
	public void setKorean(String name, int score)
	{
		korean.setSubjectName(name);
		korean.setScore(score);
	}
	
	public void setMath(String name, int score)
	{
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo()
	{
		int total = korean.getScore() + math.getScore();
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}

}
