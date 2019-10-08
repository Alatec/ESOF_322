class Company {
    public VehicleRentalService service;
    public String name;
    public Address headquarters;
    public Truck[] truck;
    public Car[] car;
    public Motorbike[] motorbike;
    public Employee[] employee;
    public Customer[] customer;
    public Company(){

        service = new VehicleRentalService();
    }
}

class Person{
    public String name;
    public String email;
    public Address address;
    public Person() {
    }
}

class Employee extends Person{
    public Employee() {
    }
}

class Customer extends Person{
    public BankAccount bankAccount;
    public Customer() {
        bankAccount = new BankAccount();
    }
}

class Subcontractor extends Employee, Customer{
    //This produces an error in Java, but was left as this is just psuedocode
    public Subcontractor() {
    }
}

class Address{
    public String street, postalCode, city;
    public Address() {
    }
}

class BankAccount{
    public UnlimitedNatural number;
    public String depositor, bank;
    public BankAccount() {
    }
}

class Service{
    public Customer customer;
    public Service() {
    }
}

class VehicleRentalService extends Service{
    public Vehicle vehicle;
    public VehicleRentalService() {}
    public void offerCar(){}
    public void offerMotorbike(){}
    public void offerTruck(){}
}

interface Rentable{
     public abstract void rent();
}

class Vehicle implements Rentable{
    public Vehicle() {
    }
    public void rent(){}
}

class Truck extends Vehicle{
    public UnlimitedNatural weight, power;
    public String manufacturer, regNo;

    public Truck() {
    }
}

class Car extends Vehicle{
    public CarKind kind;
    public UnlimitedNatural noSeats, power;
    public String manufacturer, regNo;
    public Car() {
    }
}

class Motorbike extends Vehicle{
    public MbKind kind;
    public UnlimitedNatural cylinderCap, power;
    public String manufacturer, regNo;
    public Motorbike() {
    }
}
