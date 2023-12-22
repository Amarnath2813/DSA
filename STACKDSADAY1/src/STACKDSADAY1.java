import java.util.Scanner;

public class STACKDSADAY1 {

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
		int size=sc.nextInt();
		STACKDSADAY1 obj=new STACKDSADAY1();
		obj.createstack(size);
		int ch;
		do {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				if(!obj.is_full()) {
					System.out.println("\nEnter a Number:");
					int no=sc.nextInt();
					obj.push(no);
					System.out.println("pushed"+no);
					break;
				}
				else {
					System.out.println("Stack is Full");
					break;
				}
			case 2:
				if(!obj.is_empty()) {
					int r= obj.pop();
					System.out.println("poped "+r);
					break;
				}
				else {
					System.out.println("stack is empty");
					break;
				}
			case 3:
				
				if(!obj.is_empty()) {
					int r= obj.peek();
					System.out.println("peeked "+r);
					break;
				}
				else {
					System.out.println("stack is empty");
					break;
				}
			case 4:
				if(!obj.is_empty()) {
					
					obj.print_stack();
					break;
				}
				else {
					System.out.println("stack is empty");
					break;
				}
			case 0:
				System.out.println("Exiting");
			default:
				System.out.println("Wrong choice");
			}
		}while(ch!=0);
		
	}
}
