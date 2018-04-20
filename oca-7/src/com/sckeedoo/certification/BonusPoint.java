package com.sckeedoo.certification;

public class BonusPoint {

    /**
     *
     * You probably have used the trolleybus in Chisinau.
     * Every time you enter in trolleybus you have to get a ticked from the taxator otherwise you will be a iepurash
     * Every ticket has a number of it.
     * The ticket is considered to be lucky if the sum of it's first 3 digits are equal to the sum of it's 3 last digits
     * Ex. of lucky ticket : 125800 - 1 + 2 + 5 == 8 + 0 + 0
     * A super lucky ticket is considered if it's number is a palindrome (google what a palindrome means).
     *
     * Task - Given a ticket number, find out it it's lucky , super lucky or a simple ticket
     *
     * Input :         Output:
     *    012030        lucky
     *    123999        simple ticket
     *    123321        super lucky
     */
    public static void main(String[] args) {

        int numberTicket[] ={1,2,3,1,2,3};
        boolean lukyTicket=true;
        int sum1=0,sum2=0;

        for (int i=0,j=numberTicket.length-1;i<numberTicket.length/2;i++,j--) {

            lukyTicket = (numberTicket[i]==numberTicket[j] && lukyTicket);

            sum1+=numberTicket[i];
            sum2+=numberTicket[j];
        }

        if(lukyTicket)      System.out.println("This ticket is super lucky");
        else if(sum1==sum2) System.out.println("This ticket is lucky");
        else                System.out.println("This ticket is simple ticket");

    }
}
