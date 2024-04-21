package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        int right;
        if (firstSide + secondSide >= thirdSide && secondSide + thirdSide >= firstSide && thirdSide + firstSide >= secondSide){
            right = 1;
        } else {
            right = 0;
        }
        switch (right){
            case 1:
                System.out.println("this is a valid triangle");
                break;
            default:
                System.out.println("it's not a triangle");
                break;
        }
    }
}
