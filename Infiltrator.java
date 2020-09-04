import java.io.*;
public class Infiltrator {
	//cur = current position
	//function which decide whether to move or not
	static boolean next_move(int cur, double p, int w){
		/*
		s0,s1,s2,s3 represent prensent sensor and
		forward three adjacent sensors
		*/
		Sensor s0,s1,s2,s3;
		//if outside the border
		if(cur==0) {
			s0 = new Sensor(0);//no sensor
			s1 = new Sensor(p);s1.set_state();//find state on/off
			s2 = new Sensor(p);s2.set_state();
			s3 = new Sensor(p);s3.set_state();
		}
		//if in last row
		else if(cur==w) {
			s0 = new Sensor(p);s0.set_state();//find state on/off
			s1 = new Sensor(0);//no sensor
			s2 = new Sensor(0);
			s3= new Sensor(0);
		}
		//if somewhere in the middle
		else {
			s0 = new Sensor(p);s0.set_state();//find state on/off
			s1 = new Sensor(p);s1.set_state();
			s2 = new Sensor(p);s2.set_state();
			s3 = new Sensor(p);s3.set_state();
		}
		//if any one of s1,s2 or s3 is off and s0 is move forward
		if(s0.get_state()+s1.get_state() == 0) {
			return true;
		}
		if(s0.get_state()+s2.get_state() == 0) {
			return true;
		}
		if(s0.get_state()+s3.get_state() == 0) {
			return true;
		}
		//else stand still
		return false;
	}

	public static void main(String[] args) {
		// current is present position initially outside
		int current = 0;
		int time =0;
		double prob = Double.parseDouble(args[0]);//probability of head
		int width = Integer.parseInt(args[1]);//width of border
		Border b = new Border(width);//create border of given width

		//while not suceed to cross figure out next step
		while(!b.check_success(current)) {
			//if favourable to move
			if(next_move(current,prob,width)) {
				current++;//increse current position
			}
			time+=10;//increment time
		}
		System.out.println("time taken= "+ time);
	}

}
