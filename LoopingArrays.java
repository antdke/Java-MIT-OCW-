// Looping thru arrays

class LoopingArrays{
	public static void main(String[] arguments){

		// for loop
		int[] values = new int[5];

		for (int i = 0; i < values.length; i++){
			values[i] = i;
			int y = values[i] * values[i];
			System.out.println(y);
		}

		// while loop
		int[] values2 = new int[5];
		int j = 0;
		while (j < values2.length){
			values2[j] = j;
			int z = values2[j] * values2[j];
			System.out.println(z);
			j++;
		}

	}

}