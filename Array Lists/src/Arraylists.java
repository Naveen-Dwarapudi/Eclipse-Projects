import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {
		// ArrayList =  a resizable array.
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		food.remove(2);
		food.clear();
		
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}

	}

}
