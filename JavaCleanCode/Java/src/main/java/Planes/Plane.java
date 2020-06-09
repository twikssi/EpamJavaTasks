package Planes;

import java.util.Objects;

abstract public class Plane {
    String modelPlane;
    private int maxSpeedPlane;
    private int maxFlightDistancePlane;
    private int maxLoadCapacityPlane;

    public Plane(String modelPlane, int maxSpeedPlane, int maxFlightDistancePlane, int maxLoadCapacityPlane) {
        this.modelPlane = modelPlane;
        this.maxSpeedPlane = maxSpeedPlane;
        this.maxFlightDistancePlane = maxFlightDistancePlane;
        this.maxLoadCapacityPlane = maxLoadCapacityPlane;
    }

    public String getModelPlane() {
        return modelPlane;
    }

    public int getMaxSpeedPlane() {
        return maxSpeedPlane;
    }

    public int GetMaxFlightDistancePlane() {
        return maxFlightDistancePlane;
    }

    public int getMaxLoadCapacityPlane() {
        return maxLoadCapacityPlane;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + modelPlane + '\'' +
                ", maxSpeed=" + maxSpeedPlane +
                ", maxFlightDistance=" + maxFlightDistancePlane +
                ", maxLoadCapacity=" + maxLoadCapacityPlane +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maxSpeedPlane == plane.maxSpeedPlane &&
                maxFlightDistancePlane == plane.maxFlightDistancePlane &&
                maxLoadCapacityPlane == plane.maxLoadCapacityPlane &&
                Objects.equals(modelPlane, plane.modelPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelPlane, maxSpeedPlane, maxFlightDistancePlane, maxLoadCapacityPlane);
    }
}
