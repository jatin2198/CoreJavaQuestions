package newHacker;

final class  VolumeLoose{
	
	private  int vole;
	
	
    VolumeLoose(int length, int width, int height){
		
		this.vole= length * width * height;
	}


	public int getVole() {
		return vole;
	}


	public void setVole(int vole) {
		this.vole = vole;
	}
    
    
}

public class LosselyCoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 VolumeLoose btx=new  VolumeLoose(10,20,30);
		 
		// btx.setVole(100);
		System.out.print(btx.getVole());
	}

}
