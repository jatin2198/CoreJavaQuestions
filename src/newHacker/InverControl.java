package newHacker;


//TightCouple
class VolumeTest{
	
	int vol;
	
	VolumeTest(int l,int b,int h){
		this.vol=l*b*h;
		
	}
	
	
}

public class InverControl {

	
	
	public static void main(String[] args) {
	
		VolumeTest btx=new VolumeTest(10,20,30);
		System.out.print(btx.vol);
	}

}
