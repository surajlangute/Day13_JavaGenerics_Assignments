package day13_Generics_Test;

public class GenericTestCase2 {
	public static <T> void toPrint(T[] inputArray) {
		for (T element : inputArray) {
			System.out.print(element);
		}
		System.out.println();

	}

	private Object getMaximum;

	public void getMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		System.out.println("maximum integer value is: " + maxNumber);
	}

	public void getMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		System.out.println("Maximum float value is :" + maxNumber);
	}

	public static void main(String[] args) {
		GenericTestCase2 genericTest = new GenericTestCase2();
		genericTest.getMaximum(23.5f, 235.5f, 234.333f);
		genericTest.getMaximum(100, 200, 3000);

	}
}
