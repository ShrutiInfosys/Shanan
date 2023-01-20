package Aarray;

public class Highestnu {
	public static void main(String[] args) {
		int []i =new int[5];
		i[0]=30;
		i[1]=60;
		i[2]=20;
		i[3]=70;
		i[4]=10;
		int max=i[0];
		for(int a=0;a<i.length;a++)
			
		{
			System.out.println(i[a]);
			if(max<i[a])
			{
				max=i[a];
			}
		
		}
		
		System.out.println("highest nu"+ max);	
	}

}
