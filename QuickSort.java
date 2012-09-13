
public class QuickSort {
	
	
static int count = 0;
	
	static void quickSort(int[] a, int first, int last){
		int fp = first;
		int lp = last;
		
		if(first >= last){
		System.out.println(count);
			return;
		}
		int value = a[first];
		
		while(fp < lp){
			while(fp <= lp && a[fp] <= value){
				fp++;
			}
			while(fp <= lp && a[lp] > value){
				lp--;
			}
			if(fp < lp){
				int tmp = a[fp];
				a[fp] = a[lp];
				a[lp] = tmp;
			}
		}
		int tmp = a[first];
		a[first] = a[lp];
		a[lp] = tmp;
		
		count++;
		quickSort(a, first, lp - 1);
		quickSort(a, lp + 1, last);
		
	}
	
	public static void main (String args[]){
		int[] a = {10,3,6,4,5,7,8,9,2,1};
		
		quickSort(a, 0, 9);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
