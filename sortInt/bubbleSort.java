public static void bubbleSort(int[] array){
	int temp = 0;
	int len = array.length;
	for(int i = 1; i < len; i++){
		for(int j = 0; j < len-i; j++){
			if(array[j] > array[j+1]){
				temp = array[j+1];
				array[j+1] = array[j];
				array[j] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(array) + "bubbleSort");
	/*System.out.print("[");
	for(int k = 0; k < len; k++){System.out.print(array[k] + ",");}
	System.out.println("] bubbleSort");*/
}

