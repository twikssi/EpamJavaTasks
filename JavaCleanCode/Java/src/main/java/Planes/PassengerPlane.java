package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    private int passengersCapacityPlane;

    public PassengerPlane(String modelPlane, int maxSpeedPlane, int maxFlightDistancePlane, int maxLoadCapacityPlane, int passengersCapacityPlane) {
        super(modelPlane, maxSpeedPlane, maxFlightDistancePlane, maxLoadCapacityPlane);
        this.passengersCapacityPlane = passengersCapacityPlane;
    }


    public int getPassengersCapacityPlane() {
        return passengersCapacityPlane;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacityPlane +
                '}');
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return passengersCapacityPlane == plane.passengersCapacityPlane;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacityPlane);
    }
}
