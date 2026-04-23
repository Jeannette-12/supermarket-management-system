package supermarket.models;

public class Customer {
    private String customerId;
    private String customerName;
    private String phoneNumber;

    public Customer(String customerId, String customerName, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public String toString() {
        return "Customer{" + "Name='" + customerName + '\'' + ", Phone='" + phoneNumber + '\'' + '}';
    }


}