package encapsulation;

/*
 * encapsulation means hiding data or properties or 
 * binding data and the operations on data together is known as encapsulation
 * hide data or properties by declaring them using private access modifier
 * create setter and getter methods of private variables
 */
public class EncasulationDemo {

	private int id;
	private String name;
	private String description;
	private String brand;
	private String category;
	private double price;
	private double discount;
	private Admin admin;
	

	public EncasulationDemo(int id, String name, String description, String brand, String category, double price,
			double discount) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.discount = discount;
		admin = new Admin(1100);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(admin.authenticate()) {
			this.price = price;
		}else {
			System.out.println("access restricted");
		}
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getCategory() {
		return category;
	}
	

}
