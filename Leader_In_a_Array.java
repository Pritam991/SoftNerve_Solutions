class Leader_In_a_Array
{
    // function for finding leaders
    public static void leaderprint(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                if (arr[i] < arr[j])
                {
                    break;
                }
	
                if (j == n - 1)
                    System.out.println(arr[i]+" is a leader");
            }
        }
    }
    
    public static void main (String[] args)
    {
        int arr[] = { 7, 10, 4, 10, 6, 5,2 };
        int n = arr.length;
		
        // calling function
        leaderprint(arr, n);
    }
}