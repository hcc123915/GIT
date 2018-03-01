public static void heapSort(int[] arr){
	int len = arr.length - 1;
	int node = (len - 1)/2;
	for(int i = node; i >= 0; i--){
		maxHeap(arr, i, len);
	}
	for(int j = len; j > 0; j--){
		maxSwap(arr, 0, j);
		maxHeap(arr, 0, j - 1);
	}
	System.out.println(Arrays.toString(arr) + " heapSort");
}

private static void maxSwap(int[] arr, int i, int j){
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

private static void maxHeap(int[] arr, int index, int length){
	int leftC = 2 * index + 1;
	int rightC = leftC + 1;
	int maxIndex = leftC;
	if(leftC > length){
		return;
	}
	if(rightC <= length && arr[leftC] < arr[rightC]){
		maxIndex = rightC;
	}
	if(arr[index] < arr[maxIndex]){
		maxSwap(arr, index, maxIndex);
		maxHeap(arr, maxIndex, length);
	}
}