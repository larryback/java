package alone;

public abstract class Calculator implements Calc{
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	public int square(int num) {
		// TODO Auto-generated method stub
		return num*num;
	}

}