package com.sckeedoo.certification;

public class Exercise1 {

    public static void main(String[] args) {
	      String alice = "Bob";
	      String bob = "Alice";

       /* Use JDK documentation for String and find a method that
        would help you determine which of the strings above lexicographically
        precede the second and print that string.
        */
        //int result = alice.compareTo(bob);
        if(alice.compareTo(bob)<0)System.out.println(alice+","+bob);
        else System.out.println(bob+","+alice);

    }
}
