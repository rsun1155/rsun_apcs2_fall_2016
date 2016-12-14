
public class Player {
	private int position;
	public void setPsn(int psn) {
		if (psn >= 0 && psn <= 41) {
			this.position = psn;
		}
		else if (psn < 0){ 
			this.position = 0;
			
		}
		else {
			this.position = 40;
		}
	}
	public int getPsn() {
		return this.position;
	}
}
