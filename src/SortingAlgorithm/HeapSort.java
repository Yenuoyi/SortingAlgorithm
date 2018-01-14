package SortingAlgorithm;

//分类 -------------- 内部比较排序
//数据结构 ---------- 数组
//最差时间复杂度 ---- O(nlogn)
//最优时间复杂度 ---- O(nlogn)
//平均时间复杂度 ---- O(nlogn)
//所需辅助空间 ------ O(1)
//稳定性 ------------ 不稳定
public class HeapSort {
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	public void BuildHeap(int A[], int heapSize)           // 建堆，时间复杂度O(n)
	{
	    for (int i = heapSize / 2 - 1; i >= 0; i--) // 从每一个非叶结点开始向下进行堆调整
	        Heapify(A, i, heapSize);
	}
	public void Heapify(int A[], int i, int size)  // 从A[i]向下进行堆调整
	{
	    int left_child = 2 * i + 1;         // 左孩子索引
	    int right_child = 2 * i + 2;        // 右孩子索引
	    int max = i;                        // 选出当前结点与其左右孩子三者之中的最大值
	    if (left_child < size && A[left_child] > A[max])
	        max = left_child;
	    if (right_child < size && A[right_child] > A[max])
	        max = right_child;
	    if (max != i)
	    {
	        Swap(A, i, max);                // 把当前结点和它的最大(直接)子节点进行交换
	        Heapify(A, max, size);          // 递归调用，继续从当前结点向下进行堆调整
	    }
	}
	public void Heapsort(int A[], int n)
	{
	    BuildHeap(A, n);    // 建立一个最大堆
	    System.out.println("堆排序结果：");
	    for (int i = 0; i < A.length; i++)
	    {
	        System.out.print( A[i]+" ");
	    }
	    while (n > 1)               // 堆（无序区）元素个数大于1，未完成排序
	    {
	        // 将堆顶元素与堆的最后一个元素互换，并从堆中去掉最后一个元素
	        // 此处交换操作很有可能把后面元素的稳定性打乱，所以堆排序是不稳定的排序算法
	    	System.out.println(n);
	        Swap(A, 0, --n);
	        Heapify(A, 0, n);     // 从新的堆顶元素开始向下进行堆调整，时间复杂度O(logn)
	    }
	}
	public static void main(String[] args){
	    int array[] = { 5, 2, 9, 4, 7, 6, 1, 3, 8 };// 从小到大堆排序
	    HeapSort heap = new HeapSort();
	    heap.Heapsort(array, array.length);
	    System.out.println("堆排序结果：");
	    for (int i = 0; i < array.length; i++)
	    {
	        System.out.print( array[i]+" ");
	    }
	}
}
