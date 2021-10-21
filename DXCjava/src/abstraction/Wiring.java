package abstraction;

public class Wiring {
	
		public static void main(String[] args) {
			
			ISwitchBoardListener sListener = new SolarAppliances();
			
			
			sListener.switchOne();
			sListener.switchTwo();
			sListener.switchThree(27);
			sListener.switchFour();
			 
			
		}

}
