package Planes;

import models.ClassificationLevelSecurityPlanes;
import models.ExperimentalTypesPlanes;

public class experimentalPlane extends Plane{

    private ExperimentalTypesPlanes typesPlane;
    private ClassificationLevelSecurityPlanes classificationLevelSecurityPlane;

    public experimentalPlane(String modelPlane, int maxSpeedPlane, int maxFlightDistancePlane, int maxLoadCapacityPlane, ExperimentalTypesPlanes typePlane, ClassificationLevelSecurityPlanes classificationLevelSecurityPlanePlane) {
        super(modelPlane, maxSpeedPlane, maxFlightDistancePlane, maxLoadCapacityPlane);
        this.typesPlane = typePlane;
        this.classificationLevelSecurityPlane = classificationLevelSecurityPlane;
    }

    public ClassificationLevelSecurityPlanes getClassificationLevelSecurityPlane() {
        return classificationLevelSecurityPlane;
    }

    public void setClassificationLevelSecurityPlane(ClassificationLevelSecurityPlanes classificationLevelSecurityPlane){
        this.classificationLevelSecurityPlane = classificationLevelSecurityPlane;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + modelPlane + '\'' +
                '}';
    }
}
