package bai9;

public class Main {
    public static void main(String[] args) {
        Customer aObject = new Customer("hiep","1","thanh hoa");
        Customer bObject = new Customer("hiep","2","thanh hoa");
        Customer cObject = new Customer("hiep","3","thanh hoa");
        Customer dObject = new Customer("hiep","4","thanh hoa");
    
        Invoice invoicaObject = new Invoice(aObject,23.5,55.4);
        Invoice invoicbObject = new Invoice(bObject,33.5,65.4);
        Invoice invoiccObject = new Invoice(cObject,43.5,75.4);
        Invoice invoicdObject = new Invoice(dObject,53.5,95.4);
        ManagerCustomer managercustomer = new ManagerCustomer();
        managercustomer.add(aObject);
        managercustomer.add(bObject);
        managercustomer.add(cObject);
        managercustomer.add(dObject);
        ManagerInvoice  managerinvoicObject = new ManagerInvoice();
        managerinvoicObject.Add(invoicaObject);
        managerinvoicObject.Add(invoicbObject);
        managerinvoicObject.Add(invoiccObject);
        managerinvoicObject.Add(invoicdObject);
        managerinvoicObject.showAll();
        System.out.println( managerinvoicObject.caculation(cObject));

    }
   
}
