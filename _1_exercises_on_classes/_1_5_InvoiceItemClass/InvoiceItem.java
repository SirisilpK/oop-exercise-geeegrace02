public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * (double)this.qty;
    }

    public String toString() {
        return "OOP_Excersise.Exercise1.InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty=" + this.qty + ",unitPrice=" + this.unitPrice + "]";
    }
}