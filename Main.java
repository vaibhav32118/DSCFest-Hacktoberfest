/* Name:vaibhav kapse | S.E EXTC-A | Roll.No:31
WAP that will take string as input using Switch case
1)Display the reverse of the string array
2)Check for string is palindrome or not
3)Display the first, last character and length of string */

import java.util.*;
public class Main
{
    static void rev(String str1){
        StringBuffer rev = new StringBuffer(str1);
        rev.reverse();
        System.out.println("reverse of String is:"+rev);
    }
    static void palindrome(String str2){
        String rev="";
        for(int i=str2.length()-1 ; i>=0 ; i--){
            rev+=str2.charAt(i);
        }
        if(rev.equals(str2)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
    static void display(String str3){
        System.out.println("first character:"+str3.charAt(0));
        System.out.println("last character:"+str3.charAt(str3.length()-1));
        System.out.println("length of string:"+str3.length());
    }
	public static void main(String[] args) {
		System.out.println("1)Display the reverse of the string array");
		System.out.println("2)Check for string is palindrome or not");
		System.out.println("3)Display the first,last character and length of string");
		System.out.print("select a choice:");
		Scanner x = new Scanner(System.in);
		int choice = x.nextInt();
		System.out.println("Enter string:");
		Scanner y = new Scanner(System.in);
	    String str = y.nextLine();
		switch (choice){
		    case 1:rev(str);
		           break;
		    case 2:palindrome(str);
		           break;
		    case 3:display(str);
		           break;
		    default :System.out.println("Invalid choice"); 
		}
	}
}


