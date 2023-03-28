public class TestDiscountSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", true, "Premium");
        Customer c2 = new Customer("Bob", true, "Silver");
        Customer c3 = new Customer("Charlie", false, "");

        Visit v1 = new Visit(c1, "2023-03-28");
        v1.setServiceExpense(50);
        v1.setProductExpense(100);
        System.out.println(v1);

        Visit v2 = new Visit(c2, "2023-03-29");
        v2.setServiceExpense(60);
        v2.setProductExpense(80);
        System.out.println(v2);
