package MergeSortCallable;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,3,9,2,1,6};
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		MergeSort mergeSorter = new MergeSort(list);
		
		List<Integer> sortedArr = mergeSorter.call();
		
		System.out.println(sortedArr);
	}

}
