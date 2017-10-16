
public class SwapThreeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z, temp;
		x=10;
		y=5;
		z=12;
		System.out.println("X = "+x+"; Y = "+y+"; Z = "+z+"." );
		
		temp=x;
		x=z;
		z=temp;
		z=y;
		y=temp;
		
		System.out.println("X = "+x+"; Y = "+y+"; Z = "+z+"." );
		
		
		
	

	}

	
}
