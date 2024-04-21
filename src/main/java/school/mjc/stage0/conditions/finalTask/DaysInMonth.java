package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int isLeap;
        isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0;
        switch (isLeap){
            case 1:
                switch (month){
                    case 12:
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        System.out.println(31);
                        break;
                    case 2:
                        System.out.println(29);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(30);
                        break;
                    default:
                        System.out.println("invalid date");
                        break;
                }
                break;
            default:
                switch (month){
                    case 12:
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        System.out.println(31);
                        break;
                    case 2:
                        System.out.println(28);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(30);
                        break;
                    default:
                        System.out.println("invalid date");
                        break;
                }
                break;
        }
    }
}
