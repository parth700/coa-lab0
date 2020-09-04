import java.lang.Math;
public class Sensor {
	private double p;//probability of head
	private int state;//state on/off
	public Sensor(double prob) {
		this.p = prob;
	}//constructor 
	public Sensor(int s) {
		this.state = s;
	}//constructor

	public void set_state() {
		/*come with any perfectly random number between 0 to 1
		if the number is less than or equal to p assign on state
		otherwise off state
		*/
		double rand = Math.random();
		if(rand-this.p<=0){ 
			this.state=1;
		}
		else {
			this.state=0;
		}
	}
	//find the current state of sensor
	public int get_state() {
		return this.state;
	}
}
