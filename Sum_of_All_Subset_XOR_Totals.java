public class Sum_of_All_Subset_XOR_Totals {
    static int rec(int i, int x, int arr[], int size)
    {
       
        // return the current xor sum if we reach the end of
        // array
        if (i == size)
            return x;
        // first choice can be to include the i-th element
        // in the subset and thus we take its xor
        int choice1 = rec(i + 1, x ^ arr[i], arr, size);
 
        // second choice can be to include the i-th element
        // in the subset and thus we take its xor
        int choice2 = rec(i + 1, x, arr, size);
 
        // return sum of both the choices as we need to find
        // the sum of xor of all subsets
        return choice1 + choice2;
    }
 
    // Returns sum of XORs of all subsets
    static int xorSum(int arr[], int size)
    {
        return rec(0, 0, arr, size);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 5, 6 };
        int size = arr.length;
       
          //Function call
        System.out.println(xorSum(arr, size));
    }
    
}
