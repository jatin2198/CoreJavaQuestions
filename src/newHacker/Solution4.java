package newHacker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator{

	//Player p=new Player(null, 0);
	
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		Player p1=(Player)arg0;
		Player p2=(Player)arg1;
		
		String name1=p1.name;
		
		String name2=p2.name;
		
		int sc1=p1.score;
		
		int sc2=p2.score;
		
		if(sc1==sc2) {
			
			return name2.compareTo(name1);
		}
		
		else if(sc1>sc2) {
			
			return -1;
			
		}
		return 1;
	
	}
	
	
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}