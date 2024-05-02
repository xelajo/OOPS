import java.util.Arrays;
public class StringSorter {
public static void main(String[] args) {
System.out.println("Alex John \n 23MCA011 \n 14-03-23");
String[] strings = {"banana", "apple", "cherry", "date"};
System.out.println("Original array: " + Arrays.toString(strings));
Arrays.sort(strings);
System.out.println("Sorted array: " + Arrays.toString(strings));
}
}
