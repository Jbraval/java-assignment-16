import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner;
import java.util.Scanner; 
public class Test4 { 
 public static void main(String[] args) { 
 Scanner scn = new Scanner(System.in); 
 ArrayList<Integer> al = new ArrayList<>(); 
 System.out.println("Enter the elements: "); 
 while(scn.hasNextInt()){ 
 al.add(scn.nextInt()); 
 } 
 Collections.sort(al); 
 for(int i = 0; i < al.size(); i++){ 
 System.out.print(al.get(i) + " "); 
 } 
 } 
} 
