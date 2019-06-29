package com.wangxingxing.designmode.visitor;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
