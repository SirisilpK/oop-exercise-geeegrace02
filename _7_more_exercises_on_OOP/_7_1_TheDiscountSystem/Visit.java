public class Visit {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscountRate = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscountRate = DiscountRate.getProductDiscountRate();
        double serviceDiscount = serviceExpense * serviceDiscountRate;
        double productDiscount = productExpense * productDiscountRate;
        return serviceExpense - serviceDiscount + productExpense - productDiscount;
    }

    public String toString() {
        return "Customer: " + customer.getName() + "\nDate: " + date + "\nService expense: " + serviceExpense +
                "\nProduct expense: " + productExpense + "\nTotal expense: " + getTotalExpense();
    }
}
