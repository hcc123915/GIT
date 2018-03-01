public static void quickSort(int[] array){
	_quickSort(array, 0, array.length-1);
	System.out.println(Arrays.toString(array) + " quickSort");
}
private static void _quickSort(int[] array, int low, int high){
	if(low >= high)
		return;
	int i = low; int j = high; 
	int temp = array[i];
	while(i < j){
		while(i < j && temp <= array[j])
			j--;
		if(i < j){
			array[i] = array[j];
			i++;
		}
		while(i<j && temp >= array[i])
			i++;
		if(i<j){
			array[j] = array[i];
			j--;
		}
	}
	array[i] = temp;
	_quickSort(array, low, i-1);
	_quickSort(array, i+1, high);
}