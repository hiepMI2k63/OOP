package bai9;

import java.util.ArrayList;
import java.util.List;

public class ManagerInvoice {
  
private List<Invoice> invoices;
   public  ManagerInvoice()
   {
       this.invoices = new ArrayList<>();
   }
   public void Add( Invoice e)
   {
       this.invoices.add(e);
   }
    public double caculation( Customer cus)
    {  //Card cardtemp =  this.cards.stream().filter(card -> card.getId().equals(id)).findFirst().orElse(null);
        Invoice invoice = this.invoices.stream().filter(cus1 -> cus1.getCustomer().equals(cus)).findFirst().orElse(null);
        
        return (invoice.getNewElectricNumber() - invoice.getOldElectricNumber())*5;
    }
    public void showAll()
    {
        for (Invoice card : this.invoices) {
            System.out.println(card);
        }
    }
    @Override
    public String toString() {
        return "ManagerInvoice [invoices=" + invoices + "]";
    }
}
