package SortingAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 分类 -------------- 内部比较排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- O(n^2)
 * 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
 * 平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 稳定
 * 
 */
public class BubbleSort {
	//交换
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
