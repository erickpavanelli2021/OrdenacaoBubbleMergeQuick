  
package view;
//agora foi
import java.util.Arrays;

import controller.MergeSort;
import controller.QuickSort; 
import controller.BubbleSort;

public class Principal {

	

	public static void main(String[] args) {
		
		QuickSort qSort = new QuickSort();
		MergeSort Msort = new MergeSort();
		BubbleSort bSort = new BubbleSort();
		int[]v = {15,18,29,1,0,4,13,18,25,15,43,0};
		int[]w = new int[v.length];
		v = qSort.quicksort (v, 0, v.length -1);
		w = Msort.mergeSort(v, w, v.length-1, 0);
		bSort.bolha(v);
		System.out.println("Ordenação em QuickSort: "+Arrays.toString( v ));
//		System.out.println("");
		System.out.println("====================================================================");
		System.out.println("Ordenação em MergeSort: "+Arrays.toString( w ));
//		System.out.println("");
		System.out.println("====================================================================");
		System.out.println("Ordenação em BubbleSort: "+Arrays.toString( v ));
//		System.out.println("");
		System.out.println("====================================================================");
	}
	

}