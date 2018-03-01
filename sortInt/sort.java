import java.util.Arrays;
public class Sort{
	private static final int[] NUMBERS = {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
	
	public static void main(String[] args) {
		bubbleSort(NUMBERS);
		insertSort(NUMBERS);
		quickSort(NUMBERS);
	}
	
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
		System.out.println(Arrays.toString(array) + " bubbleSort");
	}

	public static void insertSort(int[] array){
		for(int i = 1; i < array.length; i++){
			int temp = array[i];
			int j = i - 1;
			for(; j >= 0 && array[j] > temp; j--){
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
		System.out.println(Arrays.toString(array) + " insertSort");
	}

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

}