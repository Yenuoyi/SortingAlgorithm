package sorting.algorithm;

//����Ƕ��ֲ��ҷ�
public class BinarySearch {
	public int Binary(int[] array,int n){
		int mid = 0;
		int left = 0;
		int right = array.length-1;
		while(left<=right){
			mid = (left+right)/2;
			if(array[mid]==n){
				return mid;
			}else{
				if(array[mid]>n){
					right = mid-1;
				}else{
					left = mid+1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7};
		BinarySearch search = new BinarySearch();
		System.out.println(search.Binary(array, 7));
	}
}