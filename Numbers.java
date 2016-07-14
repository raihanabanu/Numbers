
public class Numbers {
	public static void main(String[] args) {
        
		if(args.length!=0)
		{
			  int num=Integer.parseInt(args[0]);
			 if(num>0)
		{
			System.out.println(num+"is positive");
			
		}
			 else if(num<0)
			 {
				 System.out.println(num+"is negative");
			 }
			 else
			 {
				 System.out.println("0 is neither positive or negative");
			 }
		}
		
			 else
			 {
				System.out.println("An integer number as argument is expected");
				
			
			 }

	}

}
