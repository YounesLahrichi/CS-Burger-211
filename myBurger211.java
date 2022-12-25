package younes;
/* this is the class I use to call all of my sub classes to make the menus run with the GUI
 * 
 */
public class myBurger211 {

	public static void main(String[] args) {
	     burger211 Bellevue = new USA();
	     Bellevue.Menu("Bellevue");
	     
	     burger211 Seattle = new USA();
	     Seattle.Menu("Seattle");
	     
	     burger211 FrankFurt = new GERMANY();
	     FrankFurt.Menu("FrankFurt");
	     
	     burger211 StuttGart = new GERMANY();
	     StuttGart.Menu("StuttGart");


	}

}
