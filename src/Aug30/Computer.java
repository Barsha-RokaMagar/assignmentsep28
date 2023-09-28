package Aug30;

public class Computer {
	private String brand;
	private String model;
	private long serialnum;
	private double price;
	private static int noOfObjectCreated = 0;

	public Computer(String brand, String model, long SN, double price) {
        this.brand = brand;
        this.model = model;
        this.serialnum = SN;
        this.price = price;
        noOfObjectCreated++;
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(long serialnum) {
		this.serialnum = serialnum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", serialnum=" + serialnum + ", price=" + price + "]";
	}
	 public static int findNumberOfCreatedComputers() {
	        return noOfObjectCreated;
	    }
	 public void showInfo(Computer c) {
	  System.out.println("Brand = " + c.getBrand() + "model = "+ c.getModel() + "sn = " + c.serialnum + "price " + c.getPrice() + "$");
  }
	    
	    public boolean equals(Computer obj) {
	        if (brand == obj.brand && price == obj.price && model == obj.model && serialnum == obj.serialnum)
	        {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
