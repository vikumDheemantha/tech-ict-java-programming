public class Arrays {
    public static void main(String[] args) {
        int[] intArray = {1, 5, 6, 7, 3, 8};
        int[] intArray2 = new int[10];
        String[] fruits = {"Apple", "Banana", "graph", "guava"};

        // read item by index
        /*
        * 1, 5, 6, 7, 3, 8 - value
        * 0, 1, 2, 3, 4, 5 - Index
        *
        * */
        System.out.println("value in index 4: " + intArray[4]);
        // write on index
        System.out.println("value in fruit index 3: " + fruits[3]);
        fruits[3] = "tomato";
        System.out.println("value in fruit index 3: " + fruits[3]);

        // index out of bound example
//        System.out.println(fruits[4]);

        // legth
        System.out.println("length of intArr = " + intArray.length);
        System.out.println("length of intArr2 = " + intArray2.length);

        // lengh, get value by index
        for (int i=0;i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for(int value: intArray) {
            System.out.println(value);
        }
    }
}