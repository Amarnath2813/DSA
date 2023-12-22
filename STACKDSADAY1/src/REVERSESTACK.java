import java.util.Scanner;

public class REVERSESTACK {
	char stack[];
	int tos,MaxSize;
	void createstack(int size) {
		stack =new char[size];
		MaxSize=size;
		tos=-1;
		
	}
	void push(char e) {
		tos++;
		stack [tos]=e;
	}
	boolean is_full() {
		if(tos==MaxSize-1)
			return true;
		else
			return false;
	}
	char pop() {
		char temp =stack [tos];
		tos--;
		return temp;

	}
	int peek() {
		int temp =stack [tos];
		return temp;

	}
	boolean is_empty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
	void print_stack() {
		for(int i=tos;i>-1;i--) {
			System.out.print(stack[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String s= sc.nextLine();
		
		REVERSESTACK R= new REVERSESTACK();
		R.createstack(s.length());
		REVERSESTACK R1= new REVERSESTACK();
		R1.createstack(s.length());
		for(int i=0;i<s.length();i++) {
			R.push(s.charAt(i));		
		}
		
		System.out.println("...........................................");
		  for(int i=0;i<s.length();i++) { 
			  R1.push(R.pop()); 
			  }
		 
		R1.print_stack();
		
		
		
		
	}
}
