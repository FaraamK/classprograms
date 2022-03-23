package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n; // number of processes
        int i;
        int quant;//quantum
        int count=0;
        int temp; //temporary variable
        int temp2=0; //temporary
        int burstTime[]; //burst time array to hold values
        int waitTime[]; //wait time array to hold values
        int turnAroundTime[]; // turn around time array to hold values
        int rem_bt[]; //remaining burst time array
        float awt=0,atat=0;
        burstTime = new int[10]; //set array length
        waitTime = new int[10]; //set array length
        turnAroundTime = new int[10]; //set array length
        rem_bt = new int[10];
//Newly inserted code for num generator
        int min1 = 4; //min and max are the range for interarrival time
        int max1 = 9;
        int clock1 = 1; //amount of nums generated.
        int range1 = max1 - min1 + 1;
        int[] iat = new int [99];
        int[] arrTime = new int [100];
        System.out.print("Arrival times:"); //outputs and sets arrival times
        for ( i = 0; iat.length > i;i++) {
            iat[i] = (int)(Math.random()*range1)+min1; //sets iat array value to a rand number times range1 and adds the minimum to it
            System.out.print(iat[i]+" ");
        }
        System.out.print("\nService times:");       //outputs and sets service times
        for ( i = 0; iat.length > i;i++) { //increments length after loop
            arrTime[i] = clock1;
            clock1+= iat[i];
            System.out.print(arrTime[i]+" ");
        }
        int min2 = 2;
        int max2 = 5; //sets the min and max for interarrival times
        int clock2 = 3; //stores clock time (quantum)
        int range2 = max2 - min2 + 1;
        int[] iat2 = new int [99]; //sets iat index size
        int[] arrTime2 = new int [100]; //sets iat index size 
        System.out.print("\nArrival times are :");
        for ( i = 0; i < iat2.length;i++) {
            iat2[i] = (int)(Math.random()*range2)+min2;
            System.out.print(iat2[i]+" ");
        }
//prints arrival times
        System.out.print("\nService times are :");
        for ( i = 0; i < iat2.length;i++) {
            arrTime2[i] = clock2;
            clock2+= iat2[i];

            System.out.print(arrTime2[i]+" "); // prints service times
        }
//end of new code for num generator
     //  Scanner input=new Scanner(System.in);
       // System.out.print("Enter number of process= ");
        n = clock1; // input for processes, set equal to rand num gen array
      //  System.out.print("Enter burst time of process\n");
        for (i=0;i<n;i++) //enter burst time
        {
            System.out.print("P"+i+" = ");  //Line is creating an error in the code, unsure of solution but is in work
            burstTime[i] = clock1; //SETS QUANTUM AND BURST TIME EQUAL NOT WHAT NEEDS TO BE DONE
            rem_bt[i] = burstTime[i]; // sets array equal to input, then moves to other array to store value
        }

      //  System.out.print("Enter quantum time = ");
        quant = clock1;
        while(true)
//sets quantum to user input
        {
            for (i=0,count=0;i<n;i++)
            {
                temp = quant;
                if(rem_bt[i] == 0)
                {
                    count++;
                    continue;
                }
                if(rem_bt[i]>quant) //changes remanining busrt tine values
                    rem_bt[i]= rem_bt[i] - quant;
                else

                if(rem_bt[i]>=0) //if processes is over, set time to 0
                {

                    temp = rem_bt[i];
                    rem_bt[i] = 0;
                }

                temp2 = temp2 + temp; // calculates busrt time
                turnAroundTime[i] = temp2;
            }

            if(n == count) //after all processes are done, break loop
                break;
        }

        System.out.print("\nProcess\tBurst Time\tTurnaround Time\tWaiting Time\t\n");

        for(i=0;i<n;i++)

        {

            waitTime[i]=turnAroundTime[i]-burstTime[i]; //sets arrays to final values
            awt=awt+waitTime[i];
            atat=atat+turnAroundTime[i];
            System.out.print("\n  "+(i+1)+"\t  "+burstTime[i]+"\t\t   "+turnAroundTime[i]+"\t\t   "+waitTime[i]+"\t\t " +
                    " " + " "+turnAroundTime[i]);
        }

        awt=awt/n;
        atat=atat/n;
        System.out.println("\nAverage waiting Time = "+awt);
        System.out.println("Average turnaround time = "+atat);



    }
}
