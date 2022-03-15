package ch06;

public class ArrayAsParameter {

	public static void main(String[] args) {

		int[] array1 = new int[3];
		array1[0] = 17;
		array1[1] = 22;
		array1[2] = -8;

		calculateAverage(array1);

		int[] array2 = { 81, 19, -14 };
		calculateAverage(array2);

		calculateAverage(new int[] { 43, 25, 99 });

		calculateAverage(new int[3]);
		
//		calculateAverage({43, 25, 99}); // Problem!

	}

	public static void calculateAverage(int[] array) {
		double total = 0;
		for (int i : array)
			total += i;
		System.out.println("Average is " + total / array.length);
	}
}
