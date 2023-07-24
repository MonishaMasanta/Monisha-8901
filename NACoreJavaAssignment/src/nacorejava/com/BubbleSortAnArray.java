package nacorejava.com;

public class BubbleSortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35,37,7, 52, 86,47};
		
		int size = arr.length;
		 
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < size; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < size; i++){  
                System.out.print(arr[i] + " ");  
        }  
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;  
	    int temp = 0;  
	    for(int i=0; i < n; i++){  
	       for(int j=1; j < (n-i); j++){  
	          if(arr[j-1] > arr[j]){  
	             //swap elements  
	             temp = arr[j-1];
	             arr[j-1] = arr[j];
	             arr[j] = temp;  
	          }                
	       }
	    }
	}

}
