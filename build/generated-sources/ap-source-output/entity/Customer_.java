package entity;

import entity.OwnCustomer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-07T01:31:42")
@StaticMetamodel(Customer.class)
public class Customer_ extends Person_ {

    public static volatile ListAttribute<Customer, OwnCustomer> ownCustomers;
    public static volatile SingularAttribute<Customer, Integer> cash;

}