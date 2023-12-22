import java.util.Scanner;

public class SORTEDQUESTION {
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
		String s=sc.nextLine();
		SORTEDQUESTION so =new SORTEDQUESTION();
		so.createstack(s.length());
		SORTEDQUESTION sor =new SORTEDQUESTION();
		sor.createstack(s.length());
		System.out.println("Enter the elements:");
        for (int i = 0; i <s.length(); i++) {
            int element = sc.nextInt();
            so.push(element);
        }
		while(!so.is_empty()) {
			int temp=so.pop();
			while(!sor.is_empty() && sor.peek()>temp) {
				so.push(sor.pop());
			}
			sor.push(temp);
		}
		sor.print_stack();
		
	}
}
