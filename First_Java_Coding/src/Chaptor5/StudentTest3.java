package Chaptor5;

public class StudentTest3 {
	public static void main(String[] args) {
		Student5 studentLee = new Student5(1001, "Lee");
		
		studentLee.setKorean("국어", 100);
		studentLee.setMath("수학", 50);
		
		Student5 studentKim = new Student5(1002, "Kim");
		
		studentKim.setKorean("국어", 70);
		studentKim.setMath("수학", 85);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
