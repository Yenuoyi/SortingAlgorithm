package SortingAlgorithm;

/*
 * 分类 -------------- 内部比较排序
 * 名称-------选择排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- O(n^2)
 * 最优时间复杂度 ---- O(n^2)
 * 平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 不稳定
 */
public class SelectionSort {
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	//从未排序元素中找出最小的元素，暂存起来，然后放置在已排序元素末端。
	//以i为是否排序边界
	public void Selection(int[] array){
		for(int i=0;i<array.length;i++){   //  定义已排序位置,i前面的就是已排序
			int min = i;
			for(int j=i+1;j<array.length;j++){   // 找出未排序的最小值位置
				if(array[j]<array[min]){
					min = j;
				}
			}
			if(min!=i){                   //将最小值放置在已排序位置
				Swap(array,min,i);
			}
		}
	}
	public static void main(String[] args){
		int[] array = {3,2,1,7,3,4,6,5,8};
		SelectionSort select = new SelectionSort();
		select.Selection(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
