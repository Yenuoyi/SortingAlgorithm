package sorting.algorithm;

/*
 * ���� -------------- �ڲ��Ƚ�����
 * ���ݽṹ ---------- ����
 * ���ʱ�临�Ӷ� ---- O(n^2)
 * ����ʱ�临�Ӷ� ---- O(nlogn)
 * ƽ��ʱ�临�Ӷ� ---- O(n^2)
 * ���踨���ռ� ------ O(1)
 * �ȶ��� ------------ �ȶ�
 */
public class InsertionSortDichotomy {
	public void InsertionDichotomy(int array[])
	{
	    for (int i = 1; i < array.length; i++)
	    {
	        int get = array[i];                    // ����ץ��һ���˿���
	        int left = 0;                    // ���������ϵ�����������õģ����Կ����ö��ַ�
	        int right = i - 1;                // �������ұ߽���г�ʼ��
	        while (left <= right)            // ���ö��ַ���λ���Ƶ�λ��
	        {
	            int mid = (left + right) / 2;
	            if (array[mid] > get)
	                right = mid - 1;
	            else
	                left = mid + 1;
	        }
	        for (int j = i - 1; j >= left; j--)    // ������������λ���ұߵ������������ƶ�һ����λ
	        {
	        	array[j + 1] = array[j];
	        }
	        array[left] = get;                    // ��ץ�����Ʋ�������
	    }
	}
	public static void main(String[] args){
		int[] array = {2,1,7,3,4,6,5};
		InsertionSortDichotomy insert = new InsertionSortDichotomy();
		insert.InsertionDichotomy(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
