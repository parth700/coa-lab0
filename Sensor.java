import java.lang.Math;
public class Sensor {
	private double p;
	private int state;
	public Sensor(double prob) {
		this.p = prob;
	}
	public Sensor(int s) {
		this.state = s;
	}
	public void set_state() {
		double rand = Math.random();
		if(rand-this.p<=0){ 
			this.state=1;
		}
		else {
			this.state=0;
		}
	}
	public int get_state() {
		return this.state;
	}
}
