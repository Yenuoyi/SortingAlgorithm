package sorting.algorithm;

/*
 * ϣ������
 * ��������ı���
 * ƽ�������O(nlogn)~O(n2)
 * ��������O(n1.3)
 * ������O(n2)
 * �����ռ䣺O(1)
 * �ȶ��ԣ����ȶ�
 */
public class ShellSort {
	public void Shell(int[] array){  
	    int i,j,gap;
	    for(gap = array.length/2;gap>0;gap/=2){   //�������ڿ����
	    	for(i = gap;i<array.length;i++){      //ʹ��ֱ�Ӳ�������
	    		for(j = i-gap;j>=0&&array[j]>array[j+gap];j-=gap){   //jΪi-���
	    			int temp = array[j];
	    			array[j] = array[j+gap];
	    			array[j+gap] = temp;
	    		}
	    	}
	    }
	}  
	public static void main(String[] args){
		int[] array = {2,1,7,3,4,6,5};
		ShellSort insert = new ShellSort();
		insert.Shell(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
