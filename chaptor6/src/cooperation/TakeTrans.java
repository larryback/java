package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// 두 명의 학생을 생성
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		   
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // James 가 100번 버스를 탐
		  studentJames.showInfo();           // James 정보 출력
		  bus100.showInfo();                // 버스 정보 출력
		  
		  Subway subwayGreen = new Subway("2호선");  
		  studentTomas.takeSubway(subwayGreen);  // Tomas 가 2호선을 탐
		  studentTomas.showInfo();                 // Tomas 정보 출력
		  subwayGreen.showInfo();   
		  
		  Student studentEdward = new Student("Edward", 30000);
		  Taxi taxi = new Taxi("잘간다 운수");
		  studentEdward.takeTaxi(taxi);  //Edward 가 택시를 탐
		  studentEdward.showInfo(); 
		  taxi.showInfo();
	}

}
