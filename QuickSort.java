
public class QuickSort {
	public void quickSort(int array[],int low,int high){
		int i,j;
		int index;
		if(low>high)
			return;
		i=low;
		j=high;
		index=array[i];
		while(i<j){
			while(i<j&&array[j]>=index)
				j--;
			if(i<j)
				array[i++]=array[j];
			while(i<j&&array[i]<index)
				i++;
			if(i<j)
				array[j--]=array[i];
		}
		array[i]=index;
		quickSort(array,low,i-1);
		quickSort(array,i+1,high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int a[]={5,4,8,9,2,4,1};
		QuickSort q=new QuickSort();
		q.quickSort(a, 0, a.length-1);
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
