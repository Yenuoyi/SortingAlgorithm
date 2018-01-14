package SortingAlgorithm;

/*
 * 分类 -------------- 内部比较排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- O(n^2)
 * 最优时间复杂度 ---- O(nlogn)
 * 平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 稳定
 */
public class InsertionSortDichotomy {
	public void InsertionDichotomy(int array[])
	{
	    for (int i = 1; i < array.length; i++)
	    {
	        int get = array[i];                    // 右手抓到一张扑克牌
	        int left = 0;                    // 拿在左手上的牌总是排序好的，所以可以用二分法
	        int right = i - 1;                // 手牌左右边界进行初始化
	        while (left <= right)            // 采用二分法定位新牌的位置
	        {
	            int mid = (left + right) / 2;
	            if (array[mid] > get)
	                right = mid - 1;
	            else
	                left = mid + 1;
	        }
	        for (int j = i - 1; j >= left; j--)    // 将欲插入新牌位置右边的牌整体向右移动一个单位
	        {
	        	array[j + 1] = array[j];
	        }
	        array[left] = get;                    // 将抓到的牌插入手牌
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
