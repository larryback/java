package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// �� ���� �л��� ����
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		   
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // James �� 100�� ������ Ž
		  studentJames.showInfo();           // James ���� ���
		  bus100.showInfo();                // ���� ���� ���
		  
		  Subway subwayGreen = new Subway("2ȣ��");  
		  studentTomas.takeSubway(subwayGreen);  // Tomas �� 2ȣ���� Ž
		  studentTomas.showInfo();                 // Tomas ���� ���
		  subwayGreen.showInfo();   
		  
		  Student studentEdward = new Student("Edward", 30000);
		  Taxi taxi = new Taxi("�߰��� ���");
		  studentEdward.takeTaxi(taxi);  //Edward �� �ýø� Ž
		  studentEdward.showInfo(); 
		  taxi.showInfo();
	}

}