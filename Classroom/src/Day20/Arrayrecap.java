package Day20;

        import java.util.Arrays;
        import java.util.Random;

        class Arrayrecap {
         public static void main(String[] args) {

             int[] array1 = {1, 2, 3};
             int[] array2 = {5, 4, 3};
             array2[2] = array1[2];


             int[] array = new int[20];
             int counterLess50 = 0, counterGreater50 = 0;
             Random random = new Random();
             // Generates random number numbers and assigns them to array
             // Tracks numbers less than 50 and numbers greater than or equal to 50
             for (int i = 0; i < array.length; i++) {
                 int randomNumber = random.nextInt(100);
                 if (randomNumber < 50) {
                     counterLess50++;
                 } else {
                     counterGreater50++;
                 }
                 array[i] = randomNumber;
             }
             System.out.println(Arrays.toString(array));
             // Declaring arrays for numbers less than 50 and greater than or equal to 50
             int[] numbersLess50 = new int[counterLess50];
             int[] numbersGreater50 = new int[counterGreater50];

             int j = 0;
             int k = 0;
             // Fill array numbersLess50 with values less than 50
             for (int i = 0; i < array.length; i++) {
                 if (array[i] < 50) {
                     numbersLess50[j] = array[i];
                     j++;
                 } else {
                     numbersGreater50[k] = array[i];
                     k++;
                 }
             }

             // print arrays
             System.out.println(Arrays.toString(numbersLess50));
             System.out.println(Arrays.toString(numbersGreater50));


//             int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//             // remove -> change the value to 0
//             // remove from this array even numbers
//             // print the array
//             // [1,0,3,0,5,0,7,0,9,0]
//             for (int i = 0; i < array.length; i++) {
//                 if (array[i] % 2 == 0) {
//                     array[i] = 0;
//                 }
//             }
//             System.out.println(Arrays.toString(array));

         }     }