package oop;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public abstract class Employee {
private static final String DEFAULT_NAME = "UNKNOWN";
private static int nextid;

private Integer id;
private String name;
private LocalDate hireDate;




public Employee(){
	this(DEFAULT_NAME);
}
public Employee(String name){
	this.id=nextid++;
	this.name=name;
	this.hireDate=LocalDate.now();
}


public abstract double getpay();
}
