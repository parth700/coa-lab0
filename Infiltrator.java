import java.io.*;
public class Infiltrator {
	
	static boolean next_move(int cur, double p, int w){
		Sensor s0,s1,s2,s3;
		if(cur==0) {
			s0 = new Sensor(0);
			s1 = new Sensor(p);s1.set_state();
			s2 = new Sensor(p);s2.set_state();
			s3 = new Sensor(p);s3.set_state();
		}
		else if(cur==w) {
			s0 = new Sensor(p);s0.set_state();
			s1 = new Sensor(0);
			s2 = new Sensor(0);
			s3= new Sensor(0);
		}
		else {
			s0 = new Sensor(p);s0.set_state();
			s1 = new Sensor(p);s1.set_state();
			s2 = new Sensor(p);s2.set_state();
			s3 = new Sensor(p);s3.set_state();
		}
		if(s0.get_state()+s1.get_state() == 0) {
			return true;
		}
		if(s0.get_state()+s2.get_state() == 0) {
			return true;
		}
		if(s0.get_state()+s3.get_state() == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] agrs) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//double prob = Double.parseDouble(args[0]);
		//int width = Integer.parseInt(args[1]);
		//System.out.println("prob= "+prob+" width= "+width);
		PrintStream o = new PrintStream(new File("sample.txt"));
		System.setOut(o);
		for(int i=1;i<=17;i++){
			double prob = (10.0 +(i-1)*5.0)/100.0;
			System.out.print(prob);
			for(int j=50;j<501;j+=50){
				int width = j;
				int total = 0;
				for(int k=0;k<50;k++){
					int time=0;
					int current = 0;
					Border b = new Border(width);
					while(!b.check_success(current)) {
						if(next_move(current,prob,width)) {
							current++;
						}
						time+=10;
					}
					//System.out.print('h');
					//System.out.print(time);
					total+=time;
				}
				System.out.print(' ');
				System.out.print((int)(total/50));
			}
			System.out.print('\n');
		}
	}
}
