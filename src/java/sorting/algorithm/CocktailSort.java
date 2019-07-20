package sorting.algorithm;
/*
 *  ���� -------------- �ڲ��Ƚ�����
 *  ���ݽṹ ---------- ����
 *  ���ʱ�临�Ӷ� ---- O(n^2)
 *  ����ʱ�临�Ӷ� ---- ���������һ��ʼ�Ѿ��󲿷�������Ļ�,��ӽ�O(n)
 *  ƽ��ʱ�临�Ӷ� ---- O(n^2)
 *  ���踨���ռ� ------ O(1)
 *  �ȶ��� ------------ �ȶ�
 *  ��β������Ҳ�ж���ð��������ð�������һ�ָĽ���
 */
public class CocktailSort {
	private static int count = 0;
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	//�������򣬽����ķ������ұߣ���С�ķ�����ߣ����м�left<rightΪ����
	public void Cocktail(int[] array){
		int left = 0;
		int right = array.length-1;
		while(left<right){
			for(int i = left;i<right;i++){
				if(array[i]<array[i+1]){
					Swap(array,i,i+1);
				}
			}
			--right;
			for(int j = right;j>left;j--){
				if(array[j]>array[j-1]){
					Swap(array,j,j-1);
				}
			}
			++left;
			++count;
		}
	}
	public static void main(String[] args){
		int[] array = {2,1,7,3,4,6,5,8};
		CocktailSort cocktail = new CocktailSort();
		cocktail.Cocktail(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("  ������"+count+"��");
	}
}
