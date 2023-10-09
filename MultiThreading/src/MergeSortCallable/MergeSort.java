package MergeSortCallable;
import java.util.*;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSort implements Callable<List<Integer>> {

    List<Integer> arr;

    public MergeSort(List<Integer> arr) {
        this.arr = arr;
    }

    @Override
    public List<Integer> call() {
        // Base condition
        if (arr.size() <= 1) {
            return arr;
        }

        // Main logic
        int mid = arr.size() / 2;

        List<Integer> leftArray = new ArrayList<Integer>();
        List<Integer> rightArray = new ArrayList<Integer>();

        for (int i = 0; i < mid; i++) {
            leftArray.add(arr.get(i));
        }
        for (int i = mid; i < arr.size(); i++) {
            rightArray.add(arr.get(i));
        }

        MergeSort leftmergeSorter = new MergeSort(leftArray);
        MergeSort rightmergeSorter = new MergeSort(rightArray);

        List<Integer> leftmergeSorterArr = leftmergeSorter.call();
        List<Integer> rightmergeSorterArr = rightmergeSorter.call();

        // Merge sorted array
        List<Integer> sortedArr = new ArrayList<>();

        int i = 0, j = 0;
        while (i < leftmergeSorterArr.size() && j < rightmergeSorterArr.size()) {
            if (leftmergeSorterArr.get(i) < rightmergeSorterArr.get(j)) {
                sortedArr.add(leftmergeSorterArr.get(i));
                i++;
            } else {
                sortedArr.add(rightmergeSorterArr.get(j));
                j++;
            }
        }

        // Add remaining elements from left and right arrays
        while (i < leftmergeSorterArr.size()) {
            sortedArr.add(leftmergeSorterArr.get(i));
            i++;
        }
        while (j < rightmergeSorterArr.size()) {
            sortedArr.add(rightmergeSorterArr.get(j));
            j++;
        }

        return sortedArr;
    }
}
