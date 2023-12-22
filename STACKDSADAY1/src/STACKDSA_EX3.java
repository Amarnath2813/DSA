import java.util.Scanner;

public class STACKDSA_EX3 {
	int stack[],tos,MaxSize;
	void createstack(int size) {
		stack =new int[size];
		MaxSize=size;
		tos=-1;
		
	}
	void push(int e) {
		tos++;
		stack [tos]=e;
	}
	boolean is_full() {
		if(tos==MaxSize-1)
			return true;
		else
			return false;
	}
	int pop() {
		int temp =stack [tos];
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
			System.out.println(stack[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num");
		int num=sc.nextInt();
		STACKDSA_EX3 obj=new STACKDSA_EX3();
		int cnt=0;
		int s=num;
		while(s!=0) {
			
			s=s/2;
			cnt++;
			
		}
		obj.createstack(cnt);
		
		while(num>0) {
			obj.push(num%2);
			num=num/2;
			
		}
		
		System.out.println("Binary value");
		while(!obj.is_empty()) {
			System.out.println(obj.pop());
		}
		
	}

}
