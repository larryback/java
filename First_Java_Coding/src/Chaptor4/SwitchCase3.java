package Chaptor4;

public class SwitchCase3 {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking){
		
			case 1: medalColor = 'G';
				
				
			case 2: medalColor = 'S';
				
			
			case 3: medalColor = 'B';
			
			default:
				medalColor = 'A';
		}
		
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + " �Դϴ�.");

	}

}