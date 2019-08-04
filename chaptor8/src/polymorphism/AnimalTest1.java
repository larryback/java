package polymorphism;

public class AnimalTest1 {
			 public static void main(String[] args) {
			  AnimalTest1 aTest = new AnimalTest1();
			  aTest.moveAnimal(new Human());
			  aTest.moveAnimal(new Tiger());
			  aTest.moveAnimal(new Eagle());
		 }

		 public void moveAnimal(Animal animal) { //매개 변수의 자료형이 상위 클래스
			  animal.move();                     //재정의 된 메서드 호출
		 }   

}
