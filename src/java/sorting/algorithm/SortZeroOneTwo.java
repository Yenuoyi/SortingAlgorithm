package sorting.algorithm;

/**
 * @author yebing
 * ����һ�����к�ɫ����ɫ����ɫ��n����������飬�����ǽ�������ʹ��ͬ��ɫ�Ķ������ڣ���ɫ˳��Ϊ��ɫ����ɫ����ɫ��
 * ��������ǽ�ʹ������0,1��2�ֱ��ʾ��ɫ����ɫ����ɫ��
 * ע�⣺����������⣬�㲻Ӧ��ʹ�ÿ�������ܡ�
 * ������
 * һ���൱ֱ�ӵĽ��������ʹ�ü��������˫ͨ���㷨��
 * ���ȵ���0��1����2����������Ȼ�󸲸�����Ϊ0�����飬Ȼ����1��Ȼ����2��
 * �������һ��ֻʹ�ú㶨�ռ�ĵ����㷨��
 * ������ʵ����ʱ��ΪO��n��,�ռ�O��1��
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
		//��ʼ��һ��Ϊ0������һ��Ϊ2
		int start = 0;
		int end = A.length-1;
		for(int i=0;i<=end;i++){
			if(A[i]==0){
				Swap(A,i,start++);
			}
			if(A[i]==2){
				Swap(A,end--,i);
				//end��i��������Ҫ���±Ƚ�һ��i
				--i;
			}
			++count;
		}
		System.out.println(count);
	}
}
