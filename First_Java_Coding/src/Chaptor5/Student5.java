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
	
	public void setKorean(String name, int scorePoint)
	{
		korean.setSubjectName(name);
		korean.setScorePoint(scorePoint);
	}
	
	public void setMath(String name, int scorePoint)
	{
		math.setSubjectName(name);
		math.setScorePoint(scorePoint);
	}
	
	public void showStudentInfo()
	{
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}

}
