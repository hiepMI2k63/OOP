package bai9;



public class Invoice {
    private Customer customer;
    private double newElectricNumber;
    private double oldElectricNumber;
   // private double money;
    public Invoice(Customer customer, double newElectricNumber, double oldElectricNumber) {
        this.customer = customer;
        this.newElectricNumber = newElectricNumber;
        this.oldElectricNumber = oldElectricNumber;
        //this.money = money;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getNewElectricNumber() {
        return newElectricNumber;
    }
    public void setNewElectricNumber(double newElectricNumber) {
        this.newElectricNumber = newElectricNumber;
    }
    public double getOldElectricNumber() {
        return oldElectricNumber;
    }
    public void setOldElectricNumber(double oldElectricNumber) {
        this.oldElectricNumber = oldElectricNumber;
    }
    // public double getMoney() {
    //     return money;
    // }
    // public void setMoney(double money) {
    //     this.money = money;
    // }
    @Override
    public String toString() {
        return "Invoice [customer=" + customer + ", newElectricNumber=" + newElectricNumber + ", oldElectricNumber="
                + oldElectricNumber + "]";
    }
    
}
