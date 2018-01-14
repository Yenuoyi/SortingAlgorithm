package SortingAlgorithm;
/*
 *  分类 -------------- 内部比较排序
 *  数据结构 ---------- 数组
 *  最差时间复杂度 ---- O(n^2)
 *  最优时间复杂度 ---- 如果序列在一开始已经大部分排序过的话,会接近O(n)
 *  平均时间复杂度 ---- O(n^2)
 *  所需辅助空间 ------ O(1)
 *  稳定性 ------------ 稳定
 *  鸡尾酒排序，也叫定向冒泡排序，是冒泡排序的一种改进。
 */
public class CocktailSort {
	private static int count = 0;
	public void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	//左右排序，将最大的放置在右边，最小的放在左边，已中间left<right为界限
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
		System.out.println("  排序了"+count+"次");
	}
}
