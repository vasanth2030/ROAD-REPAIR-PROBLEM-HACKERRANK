package workout;
import java.util.*;
public class RoadRepair {
    public static void main(String[] args) {
        //Let us consider the below arrays
        int workers[]={1,3,5};
        int repair[]={3,5,7};
        System.out.print("The total units travelled is: ");
        System.out.print(roadRepair(workers,repair));
    }
    static int roadRepair(int arr1[],int arr2[])
    {
        if(arr1.length !=arr2.length)
            return -1;
        int sum=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i< arr1.length;i++)
        {
            sum+=Math.abs(arr1[i]-arr2[i]);
        }
        return sum;
    }
}
