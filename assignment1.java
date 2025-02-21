package assignment;
class assign
{
	public boolean cigarParty(int cigars,boolean isweekend){
		
		
		if(isweekend==true && cigars>=40)
		{
	
		return true;
	     }
		{
			if(cigars >=40 && cigars<=60)
			{
				return true;
				
			}
			else
			{
				return false;
			}
		}
		
	}
}
public class assignment4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign obj=new assign();
		System.out.println(obj.cigarParty(30,true));
		

	}

}
