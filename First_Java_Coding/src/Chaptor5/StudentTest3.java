package Chaptor5;

public class StudentTest3 {
	public static void main(String[] args) {
		Student5 studentLee = new Student5(1001, "Lee");
		
		studentLee.setKorean("����", 100);
		studentLee.setMath("����", 50);
		
		Student5 studentKim = new Student5(1002, "Kim");
		
		studentKim.setKorean("����", 70);
		studentKim.setMath("����", 85);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
