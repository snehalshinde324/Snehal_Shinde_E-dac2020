//6. Print the third-largest number in an array without sorting it.
//   Input: [ 24,54,31,16,82,45,67]
//   Output: 54 (82 and 67 are the largest and second-largest)

class Question6
{
    public static void main(String [] args)
    {
        int i,y=0,x=0,z=0;
        int arr[]=new int[]{24,54,31,16,82,45,67};
        
        for(i=0;i<7;i++)
        {
            if(arr[i]>y)
                y=arr[i];
        }
        
        for(i=0;i<7;i++)
        {
            if(arr[i]>x && arr[i]<y)
                x=arr[i];
        }
        
        for(i=0;i<7;i++)
        {
            if(arr[i]>z && arr[i]<x)
                z=arr[i];
        }
        System.out.println(z);
    }
}
