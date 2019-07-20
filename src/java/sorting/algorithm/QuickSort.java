package sorting.algorithm;
/**
 * 快速排序
 * @author yebing
 */
public class QuickSort {
	public void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public int sort(int[] array, int left, int right){
		int centerValue = array[right];
		int tail = left - 1;
		for(int i=left;i<right;i++){
			if(array[i] <centerValue){
				swap(array,++tail,i);
			}
		}
		swap(array,++tail,right);
		return tail;
	}

	public void quickSort(int[] array, int left, int right){
		if(left >= right){
			return;
		}
		int centerValue = sort(array, left, right);
		quickSort(array,left,centerValue-1);
		quickSort(array,centerValue+1,right);
	}

	public static void main(String[] args){
		int[] array = {10,6,1,2,7,9,3,4,5,10,8};
		QuickSort quick = new QuickSort();
		quick.quickSort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int[] array2 = { 5, 2, 9, 4, 7, 6, 1, 3, 8 };
		quick.quickSort(array2, 0, array2.length-1);
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
	}
}
