package SortingAlgorithm;

//分类 ------------- 内部比较排序
//数据结构 ---------- 数组
//最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
//最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
//平均时间复杂度 ---- O(n^2)
//所需辅助空间 ------ O(1)
//稳定性 ------------ 稳定
public class InsertionSort {
	public void Insertion(int array[])
	{
	    for(int i=1;i<array.length;i++){  //定义新加入排序的元素
	    	int get = array[i];           //将新加入排序的元素赋值给get
	    	int j = i-1;                  //j为新加入排序的元素前一位，即将要参与排序的元素之前的元素都已经排序好了的
	    	while(j>=0 && array[j]>get){  //新加入排序的元素与前以为元素相比较，
	    		array[j+1] = array[j];    //前一位元素大于新加入的元素，则将前一位元素后移动
	    		j--;                      //进行下一轮，即再前一个元素的比较
	    	}
	    	array[j+1] = get;             //直到新加入的元素不再比其前一位元素小时，停止排序
	    }
	}
	public static void main(String[] args){
		int[] array = {2,1,7,3,4,6,5};
		InsertionSort insert = new InsertionSort();
		insert.Insertion(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
