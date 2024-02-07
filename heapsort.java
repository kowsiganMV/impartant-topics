import java.util.*;

class heap{

	public static int[] maxheap(int[] arr,int i,int N){
		int root=i;
		int l=i*2+1;
		int r=i*2+2;
		if(l<N && arr[root]<arr[l]){
			root=l;
		}
		if(r<N && arr[root]<arr[r]){
			root=r;
		}
		if(root!=i){
			int temp=arr[root];
			arr[root]=arr[i];
			arr[i]=temp;
			arr=maxheap(arr,root,N);
		}
		return arr;
	}

	public static int[] heapsort(int arr[],int N){
		for(int i=N/2-1;i>=0;i--){
			arr=maxheap(arr,i,N);
		}
		for(int i=N-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;

			arr=maxheap(arr,0,i);
		}
		return arr;
	}
	public static void main(String args[]){
		int arr[]={100,2,5,7,23,4,6,34,7};
		int N=arr.length;
		arr=heapsort(arr,N);
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+"->");
		}
	}
}