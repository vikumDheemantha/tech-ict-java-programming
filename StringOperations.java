class StringOperations {
    public static void main(String[] args) {
        String helloWorld = "Hello Program Class";
        String greeting = "good morning";

        // Number of characters
        int length = helloWorld.length();
        System.out.println("length: "+ length);

        // convert to upper case
        String helloUpperCase = helloWorld.toUpperCase();
        String helloLawerCase = helloWorld.toLowerCase();
        System.out.println(helloUpperCase);
        System.out.println(helloLawerCase);

        // finding string start position (index of)
        int indexOfHello = helloWorld.indexOf("good");
        System.out.println("index of good: " + indexOfHello);
        int indexOfG = helloWorld.indexOf('g');
        System.out.println("index of g: " + indexOfG);
        /**
         *  Hello Program Class, good morning
         *  0123456789...
         */

        // extract character at index
        char charAt10 = helloWorld.charAt(10);
        System.out.println("10th character: "+charAt10);

        // String concatenation
        String helloWithGreet = helloWorld + ", " + greeting;
        System.out.println(helloWithGreet);

        // special:
        String m = "10";
        String n = "12";
        System.out.println("String concat: " + m+n);


        String helloWithGreet2 = helloWorld.concat(greeting);
        System.out.println(helloWithGreet2);

        // String with specific characters, escalpe character
        String strWithSpecialCharacters = "\\Hello \"Vinanga\"";
        System.out.println(strWithSpecialCharacters);

        // substring (string started at index 9, 3)
        String substr = helloWorld.substring(9, 13);
        System.out.println(substr);

    }
}