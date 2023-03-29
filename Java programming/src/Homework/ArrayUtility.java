package Homework;

	public class ArrayUtility {

;		public static double[] intArrayToDoubleArray(int[] intArray) {
			int[] a = new int[3];
		    double[] doubleArray = new double[intArray.length];

		    for (int i = 0; i < intArray.length; i++) {
		        doubleArray[i] = (double) intArray[i];
		    }

		    return doubleArray;
		}
}

	
	
	
	