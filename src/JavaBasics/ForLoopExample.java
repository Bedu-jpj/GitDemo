package JavaBasics;

public class ForLoopExample {
	public static void main(String[] arg){
	
		String playList="My fav list 10 songs";
		
		for(int i=1;i<=10;i=i+1){
			if(i==5)
				break;
			System.out.println(playList+" - Song "+i);
			
			
		}
		
		
		
//		int j=1;
//		while(j<=10){
//			
//			System.out.println(playList+" - Song "+j);
//			
//			j=j+1;
//			
//		}
		
	}
}
