
public class FirstClass {
	
	public FirstClass(){
		System.out.println("Class being instantiated: "+this.getClass());
		if(this.getClass()!=FirstClass.class){
			throw new RuntimeException("Subclassing not allowed");
		}
	}
	
	public static void test(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args){
		FirstClass first = new FirstClass();
	}

}
