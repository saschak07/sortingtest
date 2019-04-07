package sortingtest;

public class SelectionSort {

	public Integer[] sort(Integer[] a) {
		for(int i=0;i<a.length;i++) {
			int min_Index = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min_Index]) {
					min_Index=j;
				}
			}
			if(min_Index!=i) {
				int temp = a[i];
				a[i] = a[min_Index];
				a[min_Index] = temp;
				System.out.println("swaping "+a[i]+" with "+a[min_Index]);
			}
		}
		return a;
	}

	
}
