package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        int quadrant;
        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0; // Origin
        }
        switch (quadrant) {
            case 1:
                System.out.println("first");
                break;
            case 2:
                System.out.println("second");
                break;
            case 3:
                System.out.println("third");
                break;
            case 4:
                System.out.println("fourth");
                break;
            default:
                System.out.println("zero");
                break;
        }
    }
}
