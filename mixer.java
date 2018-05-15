import java.utils.*;
import java.utils.Scanner;
public class Mixer{
	int arr[];
	int n;
	void accept()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter number of elements");

			    n=s.nextInt();

			    arr[]=new int[n];

			    System.out.println("enter elements");

			    for(int i=0;i<n;i++){//for reading array
			        arr[i]=s.nextInt();

			    }		
		}
	Mixer mix(Mixer A)
		{
			if(A.n<n)
			{
				A.n=A.n+n;
				n=A.n-n;
				A.n=A.n-n;
			}
			for(int i=0;i<A.n;i++){
				for(int j=0;j<n;j++){
					if(A.arr[i]==arr[j])
					{
						
					}

				}
				
			        

			}		
		}
			
		}


	}
