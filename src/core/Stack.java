package core;
import java.util.*;

public class Stack implements IStack {
	private ArrayList<Integer> s1 = new ArrayList<Integer>();
	private int top =-1 ;
	private int size = 0;
	
	public Stack() {
		s1 = new ArrayList<>();
	}
	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int getSize() {
		return 0;
	}
	public boolean isFull(){
		return top == size ;
	}

	public void push (int elm) {
		s1.add(elm);
		size++;
	}
	public int Top () {
		return s1.get(0);
	}
	
}
