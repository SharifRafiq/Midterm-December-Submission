package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */
    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int j = 1; j < list.length; j++) {
            int key = list[j];
            int i = j - 1;
            while ((i > -1) && (list[i] > key)) {
                list[i + 1] = list[i];
                i--;
            }
            list[i + 1] = key;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i =0; i<array.length; i++){
            for(int j =1; j<array.length-i; j++){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1]= array[j];
                    array[j]= temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //Merge Sort
    public int [] mergeSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        startSplit(list);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public void startSplit(int [] array){
        if(array.length>1){
            //split array into two halves
            int[]left = Arrays.copyOfRange(array, 0, array.length/2);
            int[]right = Arrays.copyOfRange(array, array.length/2, array.length);

            //recursively sort the two halves
            startSplit(left);
            startSplit(right);

            // merge the sorted halves into a sorted whole.
            merge(array, left, right);
        }
    }
    //Merges the given left and right arrays into the given result array.

    public static void merge(int[] result, int[] left, int [] right){
        int i1 = 0; //index into teh left array.
        int i2 = 0; //index into the right array.
        for(int i=0;i<result.length; i++){
            if(i2>right.length||(i1<left.length&&left[i1]<=right[i2])){
                result[i] = left[i1]; //take from left
                i1++;
            }else{
                result[i] = right[i2];
                i2++;
            }
        }
    }
    //Quick Sort
    public int [] quickSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        quickSort(list,0,list.length);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }
    public static void quickSort(int[] list, int p, int q){
        if(q-p<2){
            return;
        }
        int m = partition(list,p,q);
        quickSort(list,p,m);
        quickSort(list,m+1,q);

    }
    public static int partition(int [] list, int p, int q){
        int pivot =list[p], i=p,j=q;
        while(i<j){
            while(i<j&& list[--j]>=pivot);
            if(i<j){
                list[i]=list[j];
            }while(i<j&& list[++i]<=pivot);
            if(i<j){
                list[j]=list[i];
            }
        }
        list[j]= pivot;
        return j;
    }
    //Heap Sort
    public int [] heapSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        hSort(list);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public static void hSort(int[] list) {
        int n = list.length;
        for (int i = n / 2 - 1; i > 0; i--) {
            heapify(list, i, n);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(list, 0, i);
            heapify(list, 0, i);
        }
    }
    public static void swap(int[]list, int i, int j){
        if(i==j){
            return;
        }
        int temp = list[j];
        list[j]= list[i];
        list[i]= temp;
    }
    public static void heapify(int[] list, int i, int j){
        int ai = list[i];
        while(2*i+1<j){
            int k = 2*i +1;
            if(k+1<j&&list[k+1]>list[k]){
                k++;
            }
            if(ai>=list[k]){
                break;
            }
            list[i]=list[k];
            i=k;
        }
        list[i]=ai;
    }
    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        

        return list;
    }
    //Shell Sort
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        sSort(list);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public static void sSort(int [] list){
        int d = 1,j, n = list.length;
        while(9*d<n){
            d = 3*d + 1;
        }
        while(d>0){
            for(int i = d; i<n; i++){
                int ai = list[i];
                j = i;
                while(j >+ d && list[j-d]> ai){
                    list[j] = list[j-d];
                    j-=d;
                }
                list[j]=ai;
            }
            d/=3;
        }
    }
    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
