import java.util.Scanner;

public class POSTFIX {
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
		String s= sc.nextLine();
		POSTFIX obj=new POSTFIX();
		obj.createstack(s.length());
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				obj.push(Character.getNumericValue(ch));		
			}
			else {
				int num1=obj.pop();
				int num2=obj.pop();
				switch(ch) {
				
				
				case '+':
					obj.push(num2+num1);
					break;
					
				case '-':
					obj.push(num2-num1);
					break;
					
				case '/':
					obj.push(num2/num1);
					break;
					
					
				case '*':
					obj.push(num2*num1);
					break;
					
				default:
					System.out.println("Wrong choice");
				}
				
				
			
			}
			
		
	}
		System.out.println(obj.peek());
		
		}
		
}

			

