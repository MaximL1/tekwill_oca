package com.sckeedoo.certification;

public class Exercise9 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
           /* Use JDK documentation for String class and find the methods that
            would help you determine if 'Steve' and 'Maria' are part of the names string.

            Output print:
            'Maria is not part of the names variable'
            'Steve is part of the names variable'
            */
        String [] arrName = new String[]{"Maria","Steve"};
        for(Object str: arrName) {
            if (!names.contains( (String) str )) System.out.println( str + " is not part of the names variable" );
            else System.out.println( str + " is part of the names variable" );
        }
    }
}
