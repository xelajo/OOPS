import java.util.Scanner;
class authException extends Exception
{
public authException(String s) {
super(s);
}
}
public class password
{
public static void main(String[] args) {
System.out.println(" \n Name:Alex John\n 23MCA011\n Date:15-April-2024\n");
System.out.println();
String username = "student";
String passcode = "student123";
String user_name,password;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter the username:");
user_name = sc.nextLine();
System.out.println("Enter the password:");
password = sc.nextLine();
if(username.equals(user_name) && passcode.equals(password))
{
System.out.println("Authentication successful...");
}
else
throw new authException("Invalid user credentials");

}
catch(authException e)
{
System.out.println("Exception caught "+e);
}
}
}

