package algorithm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import databases.ConnectDB;

/*
*Created by PIIT_NYA on 04/22/2017.
*/
public class Numbers {

/*
 * Show all the different kind of sorting algorithm by applying into (num array).
 * Display the execution time for each sorting.Example in below.
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 */

public static void main(String[] args) throws Exception {

	int [] num = new int[100];
	Random rand = new Random();
	for(int i=0; i<num.length; i++){
		num[i] = rand.nextInt(1000);
	}
	ConnectDB connectDB = new ConnectDB();
	//Selection Sort
	Sort algo = new Sort();
	algo.selectionSort(num);
	long selectionSortExecutionTime = algo.executionTime;
	System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
	connectDB.InsertDataFromArryToMySql(num, "selection_sort", "SortingNumbers");
	List<String> selection = connectDB.readDataBase("selection_sort", "SortingNumbers");
	for(String st:selection){
		System.out.println(st);
	}
	int n = num.length;
	randomize (num, n);

	//Insertion Sort
	algo.insertionSort(num);
	long insertionSortExecutionTime = algo.executionTime;
	System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
	connectDB.InsertDataFromArryToMySql(num, "insertion_sort", "SortingNumbers");
	List<String> insertion = connectDB.readDataBase("selection_sort", "SortingNumbers");
	for(String st:insertion) {
		System.out.println(st);
	}
	randomize(num,n);

	//Continue for rest of the Sorting Algorithm....
	//Bubble Sort
	algo.bubbleSort(num);
	long bubbleSortExecutionTime = algo.executionTime;
	System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
	connectDB.InsertDataFromArryToMySql(num, "bubble_sort", "SortingNumbers");
	List<String> bubble = connectDB.readDataBase("selection_sort", "SortingNumbers");
	for (String st:bubble) {
		System.out.println(st);
	}
	randomize(num,n);
	//Merge Sort
	algo.mergeSort(num);
	long mergeSortExecutionTime = algo.executionTime;
	System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
	connectDB.InsertDataFromArryToMySql(num, "merge_sort", "SortingNumbers");
	List<String> merge = connectDB.readDataBase("merge_sort", "SortingNumbers");
	for (String st:merge) {
		System.out.println(st);
	}
	randomize(num,n);

	// Quick Sort
	algo.quickSort(num);
	long quickSortExecutionTime = algo.executionTime;
	System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
	connectDB.InsertDataFromArryToMySql(num, "quick_sort", "SortingNumbers");
	List<String> quick = connectDB.readDataBase("quick_sort", "SortingNumbers");
	for (String st:quick) {
		System.out.println(st);
	}
	randomize(num,n);

	algo.heapSort(num);
	long heapSortExecutionTime = algo.executionTime;
	System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
	connectDB.InsertDataFromArryToMySql(num, "heap_sort", "SortingNumbers");
	List<String> heap = connectDB.readDataBase("heap_sort", "SortingNumbers");
	for (String st:heap) {
		System.out.println(st);
	}
	randomize(num,n);

	algo.shellSort(num);
	long shellSortExecutionTime = algo.executionTime;
	System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
	connectDB.InsertDataFromArryToMySql(num, "Shell_sort", "SortingNumbers");
	List<String> shell = connectDB.readDataBase("Heap_sort", "SortingNumbers");
	for (String st:shell) {
		System.out.println(st);
	}
	randomize(num,n);
	}


public static void randomize( int arr[], int n)
{
	Random r = new Random();
	// Start from the last element and swap one by one. We don't
	// need to run for the first element that's why i > 0
	for (int i = n-1; i > 0; i--) {
		int j = r.nextInt(i);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}


}
