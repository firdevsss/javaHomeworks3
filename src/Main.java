import java.time.LocalDate;
import Abstract.basecustomerManager;
import Concrete.starbucksCustomerManager;
import mernisAdapter.MernisServiceAdapter;
import Entities.Concrete.Customer;
import Concrete.customerCheckManager;

public class Main {


    public static void main(String[] args) {
        basecustomerManager customerManager=new starbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(0,"FİRDEVS","İNAL",LocalDate.of(2004,11,9),"12345678910"));
    }
}
