package sorting.algorithm;

/*
 * ���򷽷�	ƽ�����	            ����	������	           �ռ临�Ӷ�	           �ȶ���	                ������    
 * ��������	O(nlogn)	O(n2)	O(nlogn)	O(log2n)	���ȶ�	�ϸ���
 * ʹ�õݹ鷽��
 */
// ���� ------------ �ڲ��Ƚ�����
// ���ݽṹ --------- ����
// ���ʱ�临�Ӷ� ---- ÿ��ѡȡ�Ļ�׼������󣨻���С����Ԫ�أ�����ÿ��ֻ���ֳ���һ����������Ҫ����n-1�λ��ֲ��ܽ����ݹ飬ʱ�临�Ӷ�ΪO(n^2)
// ����ʱ�临�Ӷ� ---- ÿ��ѡȡ�Ļ�׼������λ��������ÿ�ζ����ȵĻ��ֳ�����������ֻ��Ҫlogn�λ��־��ܽ����ݹ飬ʱ�临�Ӷ�ΪO(nlogn)
// ƽ��ʱ�临�Ӷ� ---- O(nlogn)
// ���踨���ռ� ------ ��Ҫ�ǵݹ���ɵ�ջ�ռ��ʹ��(��������left��right�Ⱦֲ�����)��ȡ���ڵݹ�������ȣ�һ��ΪO(logn)�����ΪO(n)       
// �ȶ��� ---------- ���ȶ�
public class QuickSort {
	void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}

	public int Partition(int A[], int left, int right)  // ���ֺ���
	{
	    int pivot = A[right];               // ����ÿ�ζ�ѡ�����һ��Ԫ����Ϊ��׼
	    int tail = left - 1;                // tailΪС�ڻ�׼�����������һ��Ԫ�ص�����
	    for (int i = left; i < right; i++)  // ������׼���������Ԫ��
	    {
	        if (A[i] <= pivot)              // ��С�ڵ��ڻ�׼��Ԫ�طŵ�ǰһ��������ĩβ
	        {
	            Swap(A, ++tail, i);
	        }
	    }
	    Swap(A, ++tail, right);           // ���ѻ�׼�ŵ�ǰһ��������ĺ�ߣ�ʣ�µ���������Ǵ��ڻ�׼��������
	    System.out.println("�����鿴"+tail);                                    // �ò������п��ܰѺ���Ԫ�ص��ȶ��Դ��ң����Կ��������ǲ��ȶ��������㷨
	    return tail;                    // ���ػ�׼������
	}

	void Quicksort(int A[], int left, int right)
	{
	    if (left >= right)
	        return;
	    int pivot_index = Partition(A, left, right); // ��׼������
	    Quicksort(A, left, pivot_index - 1);
	    Quicksort(A, pivot_index + 1, right);
	}
    
    public static void main(String[] args){
		int[] array = {10,6,1,2,7,9,3,4,5,10,8};
		QuickSort quick = new QuickSort();
		quick.Quicksort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int[] array2 = { 5, 2, 9, 4, 7, 6, 1, 3, 8 };
		quick.Quicksort(array2, 0, array2.length-1);
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
	}
}
