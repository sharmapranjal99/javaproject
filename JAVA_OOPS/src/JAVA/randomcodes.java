package JAVA;
public class randomcodes{
    public static void display(int[]arr){
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }System.out.println();
    }
    public static void merge(int[]arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        int i;
        int j;
        int k;
        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        i=0;j=0;k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else if(left[i]>right[j]){
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    public static void mergesort(int[]arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[]args){
        int[]arr={1,2,1,3,2,5,7,6};
        int n=arr.length;
        System.out.println("Array before sorting : ");
        display(arr);
        mergesort(arr,0,n-1);
        System.out.println("Array after sorting : ");
        display(arr);
    }
}
