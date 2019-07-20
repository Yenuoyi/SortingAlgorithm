package sorting.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * ���� -------------- �ڲ��Ƚ�����
 * ���ݽṹ ---------- ����
 * ���ʱ�临�Ӷ� ---- O(n^2)
 * ����ʱ�临�Ӷ� ---- ��������ڲ�ѭ����һ������ʱ,ʹ��һ���������ʾ������Ҫ�����Ŀ���,���԰�����ʱ�临�ӶȽ��͵�O(n)
 * ƽ��ʱ�临�Ӷ� ---- O(n^2)
 * ���踨���ռ� ------ O(1)
 * �ȶ��� ------------ �ȶ�
 * 
 */
public class BubbleSort {
	//����
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	public void Bubble(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				if(array[i]<array[j]){
				Swap(array,i,j);
				}
			}
		}
	}
	public static void main(String[] args){
		int[] array = {2,1,7,3,4,6,5};
		BubbleSort bubble = new BubbleSort();
		bubble.Bubble(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		String a = "abc";
		String b = "abc";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a==b);
		List<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		System.out.println(list);
		Map<String,String> map = new HashMap<String,String>();
		String c = new String("abc1");
		String d = new String("abc1");
		System.out.println(c==d);
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		map.put(c, a);
		map.put(d, b);
		System.out.println(map);
	}
}
