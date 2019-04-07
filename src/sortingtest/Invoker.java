package sortingtest;

public class Invoker {
	
	public static void main(String[] args) {
		Integer[] a = {56,5,28,19,10,20};
		System.out.println("Result of selection sort");
		Integer[] sorted = new SelectionSort().sort(a); 
		printArray(sorted);
		sorted = new BubbleSort().sort(a);
		System.out.println("Result of bubble sort");
		printArray(sorted);
		sorted = new InsertionSort().sort(a);
		System.out.println("Result of Insertion sort");
		printArray(sorted);

	}

	private static void printArray(Integer[] sorted) {
		for(int i=0; i<sorted.length;i++) {
			System.out.println(sorted[i]);
		}
		
	}

}
