package constructor;

public class parametrized_cons {
	String gname;
	int noofbullet;
	
	public parametrized_cons(String gname,int noofbullet) {
		this.gname=gname;
		this.noofbullet=noofbullet;
		
	}// non static method
	public void shoot() {
		for(int i=1;i<=noofbullet;i++) {
			System.out.println("hiiiiii....");
		}
	}

}
