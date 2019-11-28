package encapsulation;

public class TestEncasulation {
	public static void main(String[] args) {
		EncasulationDemo obj = new EncasulationDemo(101, "iphonex", "this is an iphone x", "apple", "smart phone", 75000, 0.0);
		obj.setPrice(10000);
		System.out.println(obj.getPrice());
	}

}
