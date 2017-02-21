/*
 * Author: Mohamed Badawi
 * Delivery
 * */
import java.util.*;
public class Main {
	public static void main(String [] args){
//			System.out.print("Mooga");
	String  alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	int n = alpha.length();
	
	String result = new String();
	Random r = new Random();
	String [] gen = new String[100];
	for(int j =0;j< gen.length;j++){
		result= "";
		for(int i=0; i< 10;i++){
			result += alpha.charAt(r.nextInt(n));
		}
		gen[j] = result;
	}
	
	for(int k=0;k<10;k++){
		System.out.print(gen[k]+", ");
	}
	}
}
