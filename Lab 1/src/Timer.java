
public class Timer {

	long startTime;
	long endTime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private void start() {
		startTime = System.currentTimeMillis();
	}
	
	private void stop() {
		endTime = System.currentTimeMillis();
	}
	
	private long getTime() {
		if ( startTime != 0 & endTime != 0 ) {
			return 0;
		}
		return endTime - startTime; 
	}
}
