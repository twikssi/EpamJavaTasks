import Planes.experimentalPlane;
import models.ClassificationLevelSecurityPlanes;
import models.ClassificationLevelSecurityPlanes;
import models.ExperimentalTypesPlanes;
import models.MilitaryTypePlanes;
import org.testng.Assert;
import org.testng.annotations.Test;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.Arrays;
import java.util.List;

public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryTypePlanes.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryTypePlanes.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryTypePlanes.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryTypePlanes.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryTypePlanes.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryTypePlanes.TRANSPORT),
            new experimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypesPlanes.HIGH_ALTITUDE, ClassificationLevelSecurityPlanes.SECRET),
            new experimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypesPlanes.VTOL, ClassificationLevelSecurityPlanes.TOP_SECRET)
    );

    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(planes);
        for (MilitaryPlane militaryPlane : airport.getTransportMilitaryPlanes()) {
            Assert.assertEquals(militaryPlane.getTypePlane() == MilitaryTypePlanes.TRANSPORT, true);
        }
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        System.out.println("TEST testGetPassengerPlaneWithMaxCapacity started!");
        Airport airport = new Airport(planes);
        Assert.assertTrue(airport.getPassengerPlaneWithMaxPassengersCapacity().equals(planeWithMaxPassengerCapacity));
    }

    @Test
    public void testNextPlaneMaxLoadCapacityIsHigherThanCurrent() {
        Airport airport = new Airport(planes);
        airport.sortByMaxLoadCapacity();
        for (int i = 0; i < airport.getPlanes().size() - 1; i++) {
            Assert.assertTrue(airport.getPlanes().get(i).getMaxLoadCapacityPlane() <= airport.getPlanes().get(i + 1).getMaxLoadCapacityPlane());
        }
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Airport airport = new Airport(planes);
        for (MilitaryPlane militaryPlane : airport.getBomberMilitaryPlanes()) {
            if ((militaryPlane.getTypePlane() != MilitaryTypePlanes.BOMBER)) {
                Assert.fail("Test failed!");
            }
        }

    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        for(experimentalPlane experimentalPlane : airport.getExperimentalPlanes()){
            Assert.assertFalse(experimentalPlane.getClassificationLevelSecurityPlane() == ClassificationLevelSecurityPlanes.UNCLASSIFIED);
        }
    }
}
