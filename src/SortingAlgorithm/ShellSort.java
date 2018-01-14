package SortingAlgorithm;

/*
 * 希尔排序
 * 插入排序的变种
 * 平均情况：O(nlogn)~O(n2)
 * 最好情况：O(n1.3)
 * 最坏情况：O(n2)
 * 辅助空间：O(1)
 * 稳定性：不稳定
 */
public class ShellSort {
	public void Shell(int[] array){  
	    int i,j,gap;
	    for(gap = array.length/2;gap>0;gap/=2){   //定义组内跨幅度
	    	for(i = gap;i<array.length;i++){      //使用直接插入排序
	    		for(j = i-gap;j>=0&&array[j]>array[j+gap];j-=gap){   //j为i-跨幅
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
