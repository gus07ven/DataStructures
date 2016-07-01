package Ch16;

public class MyStackImpl {
	
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	/**
	 * Constructor to create stack with size.
	 * @param size
	 */
	public MyStackImpl(int size){
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}
	
	/**
	 * This method adds new entry to the top of the stack. 
	 * @param entry
	 * @throws Exception
	 */
	public void push(int entry) throws Exception{
		if(this.isStackFull()){
			throw new Exception("Stack is already full. Can not add element.");
		}
		System.out.println("Adding: " + entry);
		this.stackArr[++top] = entry;
	}

	/**
	 * This method removes an entry from the
	 * top of the stack.
	 * @return 
	 * @throws Exception
	 */
	public int pop() throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: " + entry);
		return entry;
	}
	
	/**
	 * This method returns top of the stack 
	 * without removing it. 
	 * @return
	 */
	public int peek(){
		return stackArr[top];	
	}
	
	/**
	 * This method returns if the stack is empty
	 * @return
	 */
	public boolean isStackEmpty(){
		return (top == -1);
	}
	
	/**
	 * This method returns true if the stack is full
	 * @return
	 */
	public boolean isStackFull(){
		return (top == stackSize - 1);
	}
	
	public static void main(String[] args) {
		
		MyStackImpl stack = new MyStackImpl(4);
		try{
			int[] fill = {5,6,7,8,9,10};
			
			for (int i : fill) {
				stack.push(i);
			}
			//stack.push(11);
			//stack.push(22);
			//stack.push(33);
			//stack.pop();
			//stack.push(44);
			//stack.push(55);
			//stack.push(66);
			//stack.push(77);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			for(int i = 0; i < stack.stackSize + 1; i++ ){
				stack.pop();
			}
			//stack.pop();
			//stack.pop();
			//stack.pop();
			//stack.pop();
			//stack.pop();
			//stack.pop();
			//stack.pop();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
