public static void insertSort(int[] array){
	for(int i = 1; i < array.length; i++){
		int temp = array[i];
		for(int j = i - 1; j >= 0 && array[j] > temp; j--){
			array[j + 1] = array[j];
		}
		array[j + 1] = temp;	
	}
	System.out.println(Arrays.toString(array) + " insertSort");
}