// border class
public class Border {
	private int width;//width of border
	//constructor
	public Border(int w){
		this.width = w;
	}
	/*check if border is crossed or not
	for_step is number of forward steps taken
	it should be width +1 in order to cross the border
	*/
	public boolean check_success(int for_steps) {
		if(for_steps<=this.width) {
			return false;
		}
		return true;
	}
}
