package sortingtest;

public class BubbleSort {

	public Integer[] sort(Integer[] a) {
		for(int i=0;i<a.length-1;i++) {
			boolean swap = false;
			for(int j=0;j<a.length-i-1;i++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
		return a;
	}
}
