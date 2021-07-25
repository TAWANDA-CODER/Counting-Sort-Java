public class Main {
    public static void main(String args[])
    {

        System.out.println("--------------------");
        System.out.println("Counting Sort");
        System.out.println("--------------------");
        CountingSort oe = new CountingSort();
        char arr_counting[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                    'r', 'g', 'e', 'e', 'k', 's' };
        System.out.print("Given character array is: "); 
        for (int i = 0; i < arr_counting.length; ++i){
            System.out.print(arr_counting[i]);
        }   
        System.out.println();        
        System.out.println();    
        oe.sort(arr_counting);
        System.out.print("Sorted character array is: ");
        for (int i = 0; i < arr_counting.length; ++i){
            System.out.print(arr_counting[i]);
        }
        System.out.println();
        System.out.println();
    }
}