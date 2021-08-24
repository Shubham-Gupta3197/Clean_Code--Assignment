public class CleanCode {
    static class find_Min_Max
    {

        int SmallestNumber;
        int LargestNumber;
    }

    static find_Min_Max MAX_MIN_number(int Array[], int Array_Size)
    {
        find_Min_Max object = new find_Min_Max();

        int i;

        if (Array_Size == 1)
        {
            object.LargestNumber = Array[0];
            object.SmallestNumber = Array[0];
            return object;
        }

        if (Array[0] > Array[1])
        {
            object.LargestNumber = Array[0];
            object.SmallestNumber = Array[1];
        }
        else
        {
            object.LargestNumber = Array[1];
            object.SmallestNumber = Array[0];
        }

        for (i = 2; i < Array_Size; i++)
        {
            if (Array[i] > object.LargestNumber)
            {
                object.LargestNumber = Array[i];
            }
            else if (Array[i] < object.SmallestNumber)
            {
                object.SmallestNumber = Array[i];
            }
        }

        return object;
    }

    public static void main(String []args)
    {
        int Array[] = {1000, 11, 445, 1, 330, 3000};
        int LengthOfArray = 6;
        find_Min_Max objectOfCheck = MAX_MIN_number(Array, LengthOfArray);
        System.out.printf("\n Smallest Number : %d", objectOfCheck.SmallestNumber);
        System.out.printf("\n Largest Number : %d", objectOfCheck.LargestNumber);
    }
}
