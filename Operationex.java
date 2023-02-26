public class Operationex {
	int v = 500;
	void change(int v) {
	v = v + 100;
	}
	public static void main(String args[]){
	Operationex o = new Operationex ();
	System.out.println("Before making change "+o.v);
	o.change(500);
	System.out.println("After change made "+o.v);
}

}