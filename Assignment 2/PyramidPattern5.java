class PyramidPattern5
{
public static void main(String arg[])
	{ 
	
        for (int i = 9; i >= 1; i--)
        {

            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            for (int k = i; k <= 9; k++)          
            {
                System.out.print(k+" ");
            }
 
            for (int m = 9-1; m >= i; m--)
            {               
                System.out.print(m+" ");            
            }
             
            System.out.println();
 

 		}
	
	}
}

