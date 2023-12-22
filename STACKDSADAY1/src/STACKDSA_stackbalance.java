import java.util.Scanner;

public class STACKDSA_stackbalance {
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
	
	boolean is_empty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
	void print_stack() {
		for(int i=tos;i>-1;i--) {
			System.out.println(stack[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sequence to test");
		String data=sc.nextLine();
		STACKDSA_stackbalance s = new STACKDSA_stackbalance();
		s.createstack(data.length());
		boolean flag=true;
		for(int i=0;i<data.length();i++) {
			char c= data.charAt(i);
			if(c=='{') {
			s.push(c);
			}
			else if(c=='}'){
				if(!s.is_empty()) {
					s.pop();
				}
				else {
					System.out.println("} is unexpected");
					flag=false;
				}
				
			}
			if(!s.is_empty()) {
				System.out.println("} is expected");
			}
			else if(flag)
				System.out.println("Perfectly Balanced");
		}
		
		
	}
}
