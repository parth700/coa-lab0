
public class Border {
	private int width;
	public Border(int w){
		this.width = w;
	}
	public boolean check_success(int for_steps) {
		if(for_steps<=this.width) {
			return false;
		}
		return true;
	}
}
