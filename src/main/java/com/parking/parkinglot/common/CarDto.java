package com.parking.parkinglot.common;

public class CarDto {
    Long id;
    String licensePlate;
    String parkingSpot;
    String ownerName;



    public CarDto(Long id, String licensePlate, String parkingSpot, String username) {
        this.licensePlate = licensePlate;
        this.parkingSpot = parkingSpot;
        this.id = id;
        this.ownerName = ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }




}
