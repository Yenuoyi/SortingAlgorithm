package sorting.algorithm;

//���� -------------- �ڲ��Ƚ�����
//���ݽṹ ---------- ����
//���ʱ�临�Ӷ� ---- O(nlogn)
//����ʱ�临�Ӷ� ---- O(nlogn)
//ƽ��ʱ�临�Ӷ� ---- O(nlogn)
//���踨���ռ� ------ O(1)
//�ȶ��� ------------ ���ȶ�
public class HeapSort {
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	public void BuildHeap(int A[], int heapSize)           // ���ѣ�ʱ�临�Ӷ�O(n)
	{
	    for (int i = heapSize / 2 - 1; i >= 0; i--) // ��ÿһ����Ҷ��㿪ʼ���½��жѵ���
	        Heapify(A, i, heapSize);
	}
	public void Heapify(int A[], int i, int size)  // ��A[i]���½��жѵ���
	{
	    int left_child = 2 * i + 1;         // ��������
	    int right_child = 2 * i + 2;        // �Һ�������
	    int max = i;                        // ѡ����ǰ����������Һ�������֮�е����ֵ
	    if (left_child < size && A[left_child] > A[max])
	        max = left_child;
	    if (right_child < size && A[right_child] > A[max])
	        max = right_child;
	    if (max != i)
	    {
	        Swap(A, i, max);                // �ѵ�ǰ�����������(ֱ��)�ӽڵ���н���
	        Heapify(A, max, size);          // �ݹ���ã������ӵ�ǰ������½��жѵ���
	    }
	}
	public void Heapsort(int A[], int n)
	{
	    BuildHeap(A, n);    // ����һ������
	    System.out.println("����������");
	    for (int i = 0; i < A.length; i++)
	    {
	        System.out.print( A[i]+" ");
	    }
	    while (n > 1)               // �ѣ���������Ԫ�ظ�������1��δ�������
	    {
	        // ���Ѷ�Ԫ����ѵ����һ��Ԫ�ػ��������Ӷ���ȥ�����һ��Ԫ��
	        // �˴������������п��ܰѺ���Ԫ�ص��ȶ��Դ��ң����Զ������ǲ��ȶ��������㷨
	    	System.out.println(n);
	        Swap(A, 0, --n);
	        Heapify(A, 0, n);     // ���µĶѶ�Ԫ�ؿ�ʼ���½��жѵ�����ʱ�临�Ӷ�O(logn)
	    }
	}
	public static void main(String[] args){
	    int array[] = { 5, 2, 9, 4, 7, 6, 1, 3, 8 };// ��С���������
	    HeapSort heap = new HeapSort();
	    heap.Heapsort(array, array.length);
	    System.out.println("����������");
	    for (int i = 0; i < array.length; i++)
	    {
	        System.out.print( array[i]+" ");
	    }
	}
}
