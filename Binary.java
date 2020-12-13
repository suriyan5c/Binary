package project_binary;
import java.util.Scanner;
class Binary
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter Number");
int no = scan.nextInt();
while(no>0)
{
System.out.println(no%2);
no = no/2;
}
}
}
