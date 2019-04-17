package Java.Basics.Nested03.Lab;

import java.util.Scanner;

public class Boat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishers = Integer.parseInt(sc.nextLine());

        double result = 0;
        double cost;

        switch (season) {
            case "Summer": {
                cost = 4200;
                if (fishers <= 6) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.85;
                    } else {
                        result = cost * 0.90;
                    }
                } else if (fishers > 7 && fishers <= 11) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.80;
                    } else {
                        result = cost * 0.85;
                    }
                } else if (fishers > 12) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.70;
                    } else {
                        result = cost * 0.75;
                    }
                }
                double sum = budget - result;
                sum = Math.abs(sum);
                if (sum >= 0) {
                    System.out.printf("Yes! You have %.2f leva left.", sum);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", sum);
                }
                break;
            }
            case "Autumn": {
                cost = 4200;
                if (fishers <= 6) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.85;
                    } else {
                        result = cost * 0.90;
                    }
                } else if (fishers > 7 && fishers <= 11) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.80;
                    } else {
                        result = cost * 0.85;
                    }
                } else if (fishers > 12) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.70;
                    } else {
                        result = cost * 0.75;
                    }
                }
                double sum = budget - result;
                sum = Math.abs(sum);
                if (sum >= 0) {
                    System.out.printf("Yes! You have %.2f leva left.", sum);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", sum);
                }
                break;
            }
            case "Winter": {
                cost = 2600;
                if (fishers <= 6) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.85;
                    } else {
                        result = cost * 0.90;
                    }
                } else if (fishers > 7 && fishers <= 11) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.80;
                    } else {
                        result = cost * 0.85;
                    }
                } else if (fishers > 12) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.70;
                    } else {
                        result = cost * 0.75;
                    }
                }
                double sum = budget - result;
                sum = Math.abs(sum);
                if (sum >= 0) {
                    System.out.printf("Yes! You have %.2f leva left.", sum);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", sum);
                }
                break;
            }
            case "Spring": {
                cost = 4200;
                if (fishers <= 6) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.85;
                    } else {
                        result = cost * 0.90;
                    }
                } else if (fishers > 7 && fishers <= 11) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.80;
                    } else {
                        result = cost * 0.85;
                    }
                } else if (fishers > 12) {
                    if (fishers % 2 == 0) {
                        result = cost * 0.70;
                    } else {
                        result = cost * 0.75;
                    }
                }
                double sum = budget - result;
                sum = Math.abs(sum);
                if (sum >= 0) {
                    System.out.printf("Yes! You have %.2f leva left.", sum);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", sum);
                }
                break;
            }
        }
    }
}
