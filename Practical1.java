//ID : 21CE142
//Name : Krishna M. Thakor
//Aim : Create a generic method for sorting an array of Comparable objects.

public class Practical1
{
    public static void main(String[] args) 
    {
        // making arrays
        Integer[] intArray = {5, 3, 4, 1, 2};
        Double[] doubleArray = {3.0, 5.0, 1.0, 4.0, 2.0};
        Character[] characterArray = {'B', 'D', 'E', 'C', 'A'};
 
        // calling method
        sort(intArray);
        sort(doubleArray);
        sort(characterArray);
 
        // printing sorted output
        System.out.print("Sorted integer: ");
        printList(intArray);
        System.out.print("Sorted double: ");
        printList(doubleArray);
        System.out.print("Sorted character: ");
        printList(characterArray);   
        
        System.out.println("\nID : 21CE142 \nName : Krishna M. Thakor");
    }   
    
    public static <M extends Comparable<M>> void sort(M[] list)
    {
        M currentMin;
        int currentMinIndex;
 
        // loop to sort the given array
        for(int i=0; i< list.length - 1; i++)
        {
            currentMin = list[i];
            currentMinIndex = i;
            for(int j = i+1; j<list.length; j++)
            {
                if(currentMin.compareTo(list[j]) > 0)
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
 
            if(currentMinIndex != i)
            {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
 
    public static void printList(Object[] list) 
    {
        // loop to print the sorted array elements
        for(int i=0; i<list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
 
        System.out.println();
    }
}
