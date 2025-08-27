//QUES1. Progarm to find the total number of pairs in the array whose sum is equal to target.
//package JAVA;
//public class practice_arrays{
//	public static void main(String[]args) {
//		int []arr= {1,2,3,2,1,4,5};
//		int pairs=0;
//		int target=5;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println(arr[i]+" and "+arr[j]);
//					pairs++;
//				}
//			}
//		}
//		System.out.println("Total no. of pairs : "+pairs);
//	}
//}

//QUES 2. Program to find the total number of triplets in the array whose sum is equal to target.
//package JAVA;
//public class practice_arrays{
//	public static void main(String[]args) {
//		int []arr= {1,2,3,2,1,4,5};
//		int triplets=0;
//		int target=5;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				for(int k=j+1;k<arr.length;k++) {
//				if(arr[i]+arr[j]+arr[k]==target) {
//					System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
//					triplets++;
//				    }
//				}
//			}
//		}
//		System.out.println("Total no. of pairs : "+triplets);
//	}
//}

//QUES 3. Return first value that is repeating in the array.
//package JAVA;
//public class practice_arrays{
//	public static int first_element_which_is_repeated(int[]arr) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					return arr[i];
//				}
//			}
//		}
//		return -1;
//	}
//	public static void main(String[]args) {
//		int []arr= {0,1,2,2,4,4,1};
//		int unq=first_element_which_is_repeated(arr);
//		System.out.println("The first element which is repeated  is : "+unq);
//	}
//}

//QUES 4. Return the unique element in the array and id there is no unique element return -1.
//Note that if there is more than one unique element return the first one. 
//package JAVA;
//public class practice_arrays{
//	public static int unique(int[]arr) {
//		int ele=-1;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr[i]=-1;
//					arr[j]=-1;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=-1) {
//				ele=arr[i];
//				break;
//			}
//		}
//		return ele;
//	}
//	public static void main(String[]args) {
//		int []arr= {1,2,3,2,3,1};
//		int unq=unique(arr);
//		System.out.println("The unique element is : "+unq);
//	}
//}

//QUES 5. How to sort elements of an ArrayList if they are of string type(in descending).
//package JAVA;
//import java.util.*;
//public class practice_arrays{
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        ArrayList<String> arr=new ArrayList<String>(n);
//        for(int i=0;i<n+1;i++){
//            String ele=sc.nextLine();
//            arr.add(ele);
//        }
//        for(String e:arr){
//            System.out.print(e+ " ");
//        }System.out.print("\n");
//        Collections.sort(arr,Collections.reverseOrder());
//        for(String e:arr){
//            System.out.print(e+ " ");
//        }
//    }
//}

//QUES 6. How to sort elements of an ArrayList if they are of string type(in ascending).
//package JAVA;
//import java.util.*;
//public class practice_arrays{
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        ArrayList<String> arr=new ArrayList<String>(n);
//        for(int i=0;i<n+1;i++){
//            String ele=sc.nextLine();
//            arr.add(ele);
//        }
//        for(String e:arr){
//            System.out.print(e+ " ");
//        }System.out.print("\n");
//        Collections.sort(arr);
//        for(String e:arr){
//            System.out.print(e+ " ");
//        }
//    }
//}

//QUES 7. How to sort the elements of string type of a normal array.
//package JAVA;
//import java.util.*;
//public class practice_arrays{
//	public static void main(String[]args) {
//		  String[] arr = {"Banana", "Apple", "Mango", "Orange"};
//
//	        // Sort in ascending order
//	        Arrays.sort(arr);
//	        System.out.println("Ascending: " + Arrays.toString(arr));
//
//	        // Sort in descending order
//	        Arrays.sort(arr, Collections.reverseOrder());
//	        System.out.println("Descending: " + Arrays.toString(arr));
//
//	}
//}

//QUES 8. Rotating the elements of array by k integer (k can be greater than n also);
//package JAVA;
//import java.util.Scanner;
//public class practice_arrays{
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//        int []arr={1,2,3,4,5};
//        int k=sc.nextInt();
//        int n=arr.length;
//        int[]ans=new int[n];
//        k=k%n;
//        int j=0;
//        for(int i=n-k;i<n;i++){
//            ans[j++]=arr[i];
//        }
//        for(int i=0;i<n-k;i++){
//            ans[j++]=arr[i];
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(ans[i]+" ");
//        }
//	}
//}

//QUES 9. Replace all odd elements of an array at the beginning and all even elements at ending.
//package JAVA;
//import java.util.Scanner;
//public class practice_arrays{
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//        int []arr={1,2,0,0,4,5};
//        int n=arr.length;
//        int even=0,odd=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]%2==0){
//                even++;
//            }
//            else{
//                odd++;
//            }
//        }
//        int[]e=new int[even];
//        int[]o=new int[odd];
//        int c=0,d=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]%2==0){
//            e[c++]=arr[i];
//            }
//            else if(arr[i]%2!=0){
//                o[d++]=arr[i];
//            }
//        }
//        int p=e.length;
//        int q=o.length;
//        int[]r=new int[p+q];
//        int temp=0;
//        for(int i=0;i<p;i++){
//            r[temp++]=e[i];
//        }
//        for(int i=0;i<q;i++){
//            r[temp++]=o[i];
//        }
//        for(int k=0;k<r.length;k++) {
//        	System.out.print(r[k]+" ");
//        }
//	}
//}

//QUES 10. WAP to find the suffix sum of an array.
//package JAVA;
//import java.util.*;
//public class practice_arrays{
//    public static void main(String[]args){
//        int[]arr={15,10,25,5,10,20};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }System.out.print("\n");
//        int n=arr.length;
//        int[]temp=new int[n];
//        int sum=0;
//        for(int i=n-1;i>=0;i--){
//            sum+=arr[i];
//            temp[i]=sum;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(temp[i]+" ");
//        }
//        
//    }
//}

//QUES 11. WAP to find prefix sum of an array.
//package JAVA;
//import java.util.*;
//public class practice_arrays{
//    public static void main(String[]args){
//        int[]arr={15,10,25,5,10,20};
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }System.out.print("\n");
//        int[]temp=new int[n];
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum+=arr[i];
//            temp[i]=sum;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(temp[i]+" ");
//        }
//        
//    }
//}

//QUES 12. WAP to check if we can partition the array into two subarrays with equal sum.More formally,check that
//prefix sum of a part of array is equal to the suffix sum of rest of the array. 
//package JAVA;
//import java.util.*;
//public class practice_arrays{
//    public static void main(String[]args){
//        int[]arr={5,3,2,6,3,1};
//        int n=arr.length;
//        int total=0;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//            total+=arr[i];
//        }System.out.print("\n");
//        boolean ans=false;
//        int prefix_sum=0,suffix_sum=0;
//        for(int i=0;i<n;i++){
//            prefix_sum+=arr[i];
//            suffix_sum=total-prefix_sum;
//            if(prefix_sum==suffix_sum) {
//            	ans=true;
//            }
//        }
//        if(ans) {
//        	System.out.print(ans);
//        }
//        else {
//        	System.out.print(ans);
//        }
//        
//    }
//}.

//	QUES 13. WAP to find the max twin sum of a list of even length.(twin sum is the sum of value and its twin).
//for ex:- arr= {1,2,3,8,5,6}
//twin sum1=1+6=7,twin sum2=2+5=7,twin sum3=3+8=11.So output will be 11 because 11 is greater amongst all.
//package JAVA;
//import java.util.*;
//public class practice_arrays {
//    public static void main(String[] args) {
//        int []arr={10,13,4,50,12,100};
//        int n=arr.length;
//        int sum=0;
//        for(int i=0,j=n-1;i<=j;i++,j--){
//            int s=arr[i]+arr[j];
//            if(s>sum){
//                sum=s;
//            }
//        }
//        System.out.print(sum);
//    }
//}

//QUES 14. WAP to deleted nth element from the last in an array.
//package JAVA;
//public class practice_arrays{
//	public static void main(String[]args) {
//		int []arr= {1,2,3,4,5};
//		int n=arr.length;
//		int nth=2;
//		int k=n-nth;
//		for(int i=0;i<k;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		for(int i=k+1;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}

//QUES 15. WAP to find whether a given array is palindrome or not.
package JAVA;
import java.util.*;
public class practice_arrays{
    public static void main(String[] args) {
        int []arr={1,2,3,2,1};
        int n=arr.length;
        int []temp=new int[n];
        int c=0,count=0;
        for(int i=n-1;i>=0;i--){
            temp[c++]=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]==temp[i]){
                count++;
            }
        }
        if(count==n){
            System.out.print("palindrome array.");
        }
        else{
            System.out.print("Not a palindrome array.");
        }
    }
}