package Concrete;

import Abstract.basecustomerManager;
import Abstract.customerCheckService;
import Entities.Concrete.Customer;

public class starbucksCustomerManager extends basecustomerManager {
    customerCheckService customerCheckService;
    public starbucksCustomerManager(customerCheckService customerChecksService){

    }

    @Override
    public void save(Customer customer){
        if(customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);

        }else {
            System.out.println("Not a valid person");
        }
    }
}
