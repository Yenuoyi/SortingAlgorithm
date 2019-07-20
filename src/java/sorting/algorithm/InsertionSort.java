package sorting.algorithm;

//���� ------------- �ڲ��Ƚ�����
//���ݽṹ ---------- ����
//���ʱ�临�Ӷ� ---- ����Ϊ���������ǽ������е�,��ʱʱ�临�Ӷ�O(n^2)
//����ʱ�临�Ӷ� ---- ������Ϊ�����������������е�,��ʱʱ�临�Ӷ�O(n)
//ƽ��ʱ�临�Ӷ� ---- O(n^2)
//���踨���ռ� ------ O(1)
//�ȶ��� ------------ �ȶ�
public class InsertionSort {
	public void Insertion(int array[])
	{
	    for(int i=1;i<array.length;i++){  //�����¼��������Ԫ��
	    	int get = array[i];           //���¼��������Ԫ�ظ�ֵ��get
	    	int j = i-1;                  //jΪ�¼��������Ԫ��ǰһλ������Ҫ���������Ԫ��֮ǰ��Ԫ�ض��Ѿ�������˵�
	    	while(j>=0 && array[j]>get){  //�¼��������Ԫ����ǰ��ΪԪ����Ƚϣ�
	    		array[j+1] = array[j];    //ǰһλԪ�ش����¼����Ԫ�أ���ǰһλԪ�غ��ƶ�
	    		j--;                      //������һ�֣�����ǰһ��Ԫ�صıȽ�
	    	}
	    	array[j+1] = get;             //ֱ���¼����Ԫ�ز��ٱ���ǰһλԪ��Сʱ��ֹͣ����
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
