package com.inter.basic;

public class Main {
    public static void main(String[] args) {
        IInsurance iInsurance= new Car("Honda", "City", 100000,"ab") ;
        iInsurance.insuranceDetails();

        Car v1=(Car) iInsurance;
        v1.getMileage();
        v1.getDetails();

        Vehicle vehicle=new Car("Audi","Q8",5000000,"abc");
        vehicle.getMileage();

        Car car=(Car) vehicle;
        car.showAcc();
        car.exterior();
        car.interior();
        car.showC();

        Vehicle vehicleB=new Bike("Royal Enfield","Himalayan",100000,"ab");
        vehicleB.getMileage();

        Bike bike=(Bike) vehicleB;
        bike.showAcc();
        bike.exterior();
        bike.showB();


    }

}
