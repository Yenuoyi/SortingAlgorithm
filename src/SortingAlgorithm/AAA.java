package SortingAlgorithm;

public class AAA {
	public void Swap(int[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public void builHeap(int[] array,int headSize){
		for(int i = headSize/2-1;i>=0;i--){
			modifyHeap(array,i,headSize);
		}
	}
	public void modifyHeap(int[] array,int i,int headSize){
			int left = 2*i+1;
			int right = 2*i+2;
			int max = i;
			if(left<headSize&&array[max] < array[left]){
				max = left;
			}
			if(right<headSize&&array[max] < array[right]){
				max = right;
			}
			if(max!=i){
				Swap(array,max,i);
				modifyHeap(array,max,headSize);
			}
	}
	public void headSort(int[] array,int headSize){
		builHeap(array,headSize);
		while(headSize>1){
			Swap(array,0,--headSize);
			modifyHeap(array,0,headSize);
		}
	}
	public static void main(String[] args){
		int array[] = { 1,2,3,4,5,6,7,8,9,9};// 从小到大堆排序
	    AAA heap = new AAA();;
	    heap.headSort(array,array.length);
	    System.out.println("堆排序结果：");
	    for (int i = 0; i < array.length; i++)
	    {
	        System.out.print( array[i]+" ");
	    }
	}
}
