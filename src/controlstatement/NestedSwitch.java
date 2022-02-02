package controlstatement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        //Student - In college - first and second year
        //Mumbai university - first year student has common subject
        //second year - CS,IT,ECE
        //enter dep,year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college year - ");
        int year = sc.nextInt();
        System.out.println("Enter dep name - ");
        String dep = sc. next();
        switch(year){
            case  1:
                System.out.println("All departments has a common subject M-1");
                break;
            case 2:
                switch (dep){
                    case "CSE":
                        System.out.println("CSE has core JAVA course");
                        break;
                    case "IT":
                        System.out.println("IT has core Networking course");
                        break;
                    case "ECE":
                        System.out.println("ECE has core Electronics course");
                        break;
                    default:
                        System.out.println(dep + " is not specified.");
                }
                break;
            default:
                System.out.println("Invalid year");

        }
    }
}
