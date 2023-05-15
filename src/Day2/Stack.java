package Day2;

public class Stack {
	int size;
	int[] stack;
	int top;
	Stack(){
		top=-1;
		size=5;
		stack=new int[size];
		
	}
	public boolean isEmpty() {
		return top==-1;
		
	}
	public boolean isFull() {
		return top==size-1;
	}
	public int push(int a) {
		if(isFull()) {
			System.out.print("The stack is full");
		}
		return stack[++top]=a;
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.print("The stack is empty");
		}
		return stack[top--];
		
	}
	public int peek() {
		return stack[top];
		
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.display();
		System.out.println(s.isFull());
		s.pop();
		s.push(3);
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		
		

	}

}
