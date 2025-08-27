//QUES 1. WAP to reverse each word of a string.
//package JAVA;
//import java.util.Scanner;
//public class practice_strings{
//    public static String reverseeachword(String s,int k){
//        String f="";
//        for(int i=k-1;i>=0;i--){
//            char ch=s.charAt(i);
//            String t=String.valueOf(ch);
//            f+=t;
//        }
//        return f;
//    }
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        String[]arr=str.trim().split("\\s+");
//        int n=arr.length;
//        System.out.println(n);
//        for(int i=0;i<n;i++){
//        	String tt=arr[i];
//        	int k=tt.length();
//            String temp=reverseeachword(tt,k);
//            System.out.print(temp+" ");
//        }
//    }
//}

//QUES 2. toggle each character of a string array-->lower to upper and upper to lower.

//QUES 3. WAP to print all the substring.
//package JAVA;
//import java.util.Scanner;
//public class practice_strings{
//	public static void main(String[]args) {
//		 Scanner sc=new Scanner(System.in);
//		 String str=sc.nextLine();
//		 int n=str.length();
//		 for(int i=0;i<n;i++) {
//			 char ch=str.charAt(i);
//			 String temp=String.valueOf(ch);
//			 for(int j=i+1;j<n;j++) {
//				 char c=str.charAt(j);
//				 String t=String.valueOf(c);
//				 System.out.print(temp+" ");
//				 temp+=t;
//			 }
//			 System.out.print(temp+" ");
//		 }
//	}
//}

//OR (ANOTHER METHOD)

//package JAVA;
//import java.util.Scanner;
//public class practice_strings{
//	public static void main(String[]args) {
//		 Scanner sc=new Scanner(System.in);
//		 String str=sc.nextLine();
//		 int n=str.length();
//		 for(int i=0;i<n;i++) {
//			 for(int j=i+1;j<n+1;j++) {
//				 System.out.print(str.substring(i,j)+" ");
//			 }
//		 }
//	}
//}

//QUES 4. WAP to print all the substrings and there reverse also and then print the total no. of  palindromic substrings.
package JAVA;
public class practice_strings{
    public static String checkpalin(String e){
        int a=e.length();
        int count=0;
        String rev="";
        for(int i=a-1;i>=0;i--){
            char ch=e.charAt(i);
            String t=String.valueOf(ch);
            rev+=t;
        }
        return rev;
    }
    public static void main(String[]args){
        String str="abc";
        int n=str.length();
        String[]arr=new String[n*n];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                arr[c++]=str.substring(i,j);
            }
        }
        for(String ele:arr){
            if(ele==null){
                continue;
            }
            System.out.print(ele+" ");
        }System.out.print("\n");
        int m=arr.length;
        String k;
        int count=0;
        for(int i=0;i<m;i++){
            String e=arr[i];
            if(e==null){
                continue;
            }
            else{
            k=checkpalin(e);
            System.out.print(k+" ");
            if(e.equals(k)){
                count++;
            }
            }
        }
        System.out.print("\n"+count);
    }
}