package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n; // number of processes
        int i;
        int quant; //quantum
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
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of process= ");
        n = input.nextInt(); // input for processes, maxes out at 10
        System.out.print("Enter burst time of process\n");
        for (i=0;i<n;i++) //enter burst time

        {
            System.out.print("P"+i+" = ");
            burstTime[i] = input.nextInt();
            rem_bt[i] = burstTime[i]; // sets array equal to input, then moves to other array to store value
        }

        System.out.print("Enter quantum time = ");
        quant = input.nextInt();
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
            System.out.print("\n  "+(i+1)+"\t  "+burstTime[i]+"\t\t   "+turnAroundTime[i]+"\t\t   "+waitTime[i]+"\t\t   "+turnAroundTime[i]);
        }

        awt=awt/n;
        atat=atat/n;
        System.out.println("\nAverage waiting Time = "+awt);
        System.out.println("Average turnaround time = "+atat);

    }
}
