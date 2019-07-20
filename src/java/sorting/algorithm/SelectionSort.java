package sorting.algorithm;

/*
 * ���� -------------- �ڲ��Ƚ�����
 * ����-------ѡ������
 * ���ݽṹ ---------- ����
 * ���ʱ�临�Ӷ� ---- O(n^2)
 * ����ʱ�临�Ӷ� ---- O(n^2)
 * ƽ��ʱ�临�Ӷ� ---- O(n^2)
 * ���踨���ռ� ------ O(1)
 * �ȶ��� ------------ ���ȶ�
 */
public class SelectionSort {
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	//��δ����Ԫ�����ҳ���С��Ԫ�أ��ݴ�������Ȼ�������������Ԫ��ĩ�ˡ�
	//��iΪ�Ƿ�����߽�
	public void Selection(int[] array){
		for(int i=0;i<array.length;i++){   //  ����������λ��,iǰ��ľ���������
			int min = i;
			for(int j=i+1;j<array.length;j++){   // �ҳ�δ�������Сֵλ��
				if(array[j]<array[min]){
					min = j;
				}
			}
			if(min!=i){                   //����Сֵ������������λ��
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
