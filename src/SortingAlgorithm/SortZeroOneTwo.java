package SortingAlgorithm;

/**
 * @author yebing
 * 给定一个带有红色，白色或蓝色的n个对象的数组，对它们进行排序，使相同颜色的对象相邻，颜色顺序为红色，白色和蓝色。
 * 在这里，我们将使用整数0,1和2分别表示红色，白色和蓝色。
 * 注意：对于这个问题，你不应该使用库的排序功能。
 * 跟进：
 * 一个相当直接的解决方案是使用计数排序的双通道算法。
 * 首先迭代0，1，和2的数组数，然后覆盖总数为0的数组，然后是1，然后是2。
 * 你能想出一个只使用恒定空间的单程算法吗？
 * 理论上实现了时间为O（n）,空间O（1）
 */
public class SortZeroOneTwo {
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	public void sortColors(int[] A) {
		int count =0;
		//开始的一定为0；最后的一定为2
		int start = 0;
		int end = A.length-1;
		for(int i=0;i<=end;i++){
			if(A[i]==0){
				Swap(A,i,start++);
			}
			if(A[i]==2){
				Swap(A,end--,i);
				//end与i交换后需要重新比较一次i
				--i;
			}
			++count;
		}
		System.out.println(count);
	}
}
