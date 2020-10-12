package pl.tyczyno.Calculator;

public class RoomDimensions {
	
		
		

		double h;
		double a;
		double b;
		
		
		double ceilingArea;
		double[] alldimensions = new double[4];
		
		
		
		public RoomDimensions[] howManyRooms(int roomsNumber) {
			RoomDimensions[] rooms = new RoomDimensions[roomsNumber];
			return rooms;
		}
		
		
		public RoomDimensions( double a, double b,double h) {
			 
			 this.h=h;
			 this.a=a;
			 this.b=b;			
		}

		public RoomDimensions() {
			
		}
		
		public double areaWalls() {				
			return 2*a*h+2*b*h;
		}
		
		public double areaCeiling() {
			return a*b;
		}
		
		public double totalArea() {			
			return 2*a*h+2*b+a*b;
		}

		public double circumferenceOfRoom() {		
			return 2*a+2*b;
		}
	        
	        public void allDimensions(){
	            
	            alldimensions[0]= totalArea();
	            alldimensions[1]= areaCeiling();
	            alldimensions[2]= areaWalls();            		
	            alldimensions[3]= circumferenceOfRoom();
	           
	        }
}
