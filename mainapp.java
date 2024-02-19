
public class mainapp {

	public static void main(String[] args) {
		
		
		pair <String, Integer> pair1 = new pair<>("test1",23);
		pair <Double, String> pair2 = new pair<>(2.43, "test2");
		
		System.out.println("First value:" +pair1.getFirst());
		System.out.println("Second value:" +pair1.getSecond());
		
		System.out.println("First value:" +pair2.getFirst());
		System.out.println("Second value:" +pair2.getSecond());
		
	}
	
}
