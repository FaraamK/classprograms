package com.company;

public class Main {

    public static void main(String[] args) {
    int min1 = 4;
    int max1 = 9;
    int clock1 = 0;
    int range1 = max1 - min1 + 1;
    int[] iat = new int [99];
    int[] arrTime = new int [100];
        System.out.print("Arrival times:");
        for (int i = 0; iat.length > i;i++) {
            iat[i] = (int)(Math.random()*range1)+min1;
            System.out.print(iat[i]+" ");
        }
        System.out.print("\nService times:");
        for (int i = 0; iat.length > i;i++) {
            arrTime[i] = clock1;
            clock1+= iat[i];

            System.out.print(arrTime[i]+" ");
        }
        int min2 = 2;
        int max2 = 5;
        //sets the min and max
        int clock2 = 0;
        //stores clock time
        int range2 = max2 - min2 + 1;
        int[] iat2 = new int [99];
        int[] arrTime2 = new int [100];
        System.out.print("\nArrival times are :");
        for (int i = 0; i < iat2.length;i++) {
            iat2[i] = (int)(Math.random()*range2)+min2;
            System.out.print(iat2[i]+" ");
        }
        System.out.print("\nService times are :");
        for (int i = 0; i < iat2.length;i++) {
            arrTime2[i] = clock2;
            clock2+= iat2[i];

            System.out.print(arrTime2[i]+" ");

        }

    }

}
