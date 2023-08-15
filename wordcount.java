import java.util.*;
public class wordcount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter a text ");
String str=sc.nextLine();

String arr[]=str.split(" ");
int c=0;
for(int i=0;i<arr.length;i++){
if(arr[i]!=" ")
c++;
else
continue;
}
System.out.println("total number of words present are "+c);
    }
}
