package Chaptor5;

public class Student3 {

	
		int studentID;
		String studentName;
		int grade;
		String address;
		
						
		public String getStudentName() {
			return studentName;
		}
		
		public static void main(String[]args) {
			Student3 studentAhn = new Student3();
			studentAhn.studentName = "¾È¿¬¼ö";
			
			System.out.println(studentAhn.studentName);
			System.out.println(studentAhn.getStudentName());
			
		}
}
