public class ForLoop {
    public static void main(String[] args) {
        /* Use for loop when condition is fixed */
        for(int index = 0; index < 5; index ++){
            System.out.println("Loop running" +index);
        }

        /*Decrement loop */
        for(int index = 10; index >=0 ; index --){
            System.out.println("Loop running" +index);
        }

        /*Task
         * make a multiplication table of 2
         * print like the following
         * 2 x 1 = 2
         * 2 x 2 = 4
         * .
         * .
         * 2 x 10 = 20
         * Note: initialize 1
         * condition <=10 or <= 11
         * increment ++
         */
         for(int index = 2; index <=10; index ++){
            System.out.println("2 x 1 = " +index);
         }

         /*Nested loop */
         for(int outer = 0; outer < 3; outer ++){
            for(int inner = 2; inner >=0; inner --){
                System.out.println("Inner" + inner);
            }
            System.out.println("Outer" + outer);
         }

         /* Take use nested loop to do the following 
          * Make multiplication table from 1-10
          * 1 x 1 = 1
          * 1 x 2 = 2
          .
          .
          1 x 10 = 10
          .
          .
          Multiplication od 10
          10 x 1 = 10
          10 x 2 = 20
          .
          .
          10 x 10 = 100
        */
        for(int outer = 1; outer <= 10; outer ++){
            for(int inner = 1; inner <= 10; inner ++){
                int product = outer * inner;
                System.out.println(outer + " x " + inner + " = " + product);
            }
        }
    }
    
}
