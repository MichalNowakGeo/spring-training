package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private BigDecimal salary;
    private Address address;

    public Person(Address address) {
        this.address = address;
    }
}

