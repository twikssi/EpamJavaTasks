package Planes;

import models.*;
import java.util.Objects;


public class MilitaryPlane extends Plane{

    private MilitaryTypePlanes typePlane;

    public MilitaryPlane(String modelPlane, int maxSpeedPlane, int maxFlightDistancePlane, int maxLoadCapacityPlane, MilitaryTypePlanes typePlane) {
        super(modelPlane, maxSpeedPlane, maxFlightDistancePlane, maxLoadCapacityPlane);
        this.typePlane = typePlane;
    }

    public MilitaryTypePlanes getTypePlane() {
        return typePlane;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + typePlane +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return typePlane == that.typePlane;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typePlane);
    }
}
