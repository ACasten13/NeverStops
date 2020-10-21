
public class SuperStack<T> {
	private T[] items;
	private int top;
	
	public SuperStack (int size){
		items = (T[]) new Object();
	}
	
	public boolean isEmpty() {
		//TODO
		return top == 0;
	}

	public boolean isFull() {
		//TODO
		return top == items.length;
	}

	public boolean push(T item) {
		if(isFull()) {
			return false;
		}
		items[top] = item;
		return true;
	}

	public T pop() {
		if(isEmpty())
			return null;
		else {
			return items[top];
		}	
	}
}
