package employeee;

public class Commission {
	private String name;
	private String address;
	private String phone;
	private double salesAmount;
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    // Method to calculate and display commission
    public void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        System.out.println("Commission for " + name + " is: ₹" + commission);
    }

	@Override
	public String toString() {
		return "Commission [name=" + name + ", address=" + address + ", phone=" + phone + ", salesAmount=" + salesAmount
				+ "]";
	}
    
}
	


