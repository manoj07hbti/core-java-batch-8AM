package conditional_statements;

public class DemoSwitch {

    public static void main(String[] args) {

        int month = 4;

        switch (month) {

            case 1:
                System.out.println("Month is January");
                break;
            case 2:
                System.out.println("Month is Feb");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is Aug");
                break;
            case 9:
                System.out.println("Month is Sept");
                break;
            case 10:
                System.out.println("Month is Oct");
                break;
            case 11:
                System.out.println("Month is Nov");
                break;
            case 12:
                System.out.println("Month is December");
                break;
            default:
                System.out.println("You have entered invalid month......please enter correct month");


        }
    }
}
