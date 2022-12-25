package younes;
//this is the GERMANY subclass that forms the menu for all franchises in the GERMANY
import java.text.DecimalFormat;
//this is where create the class and inherit everything from burger211
public class GERMANY extends burger211 {
	  //I intialize a few variables such as exchange rate and discount rate and info 1 - 3
	  static double exchangeRate=0.85; 
	  static double discountRate =0.5;
	  String info1="", info2="", info3=""; 
	  GERMANY(){
		  
	  };
	  // I override the original getPrice 1 - 3 because I need to multiply it by the exchange rate in order to get the 
	  // pricing in that region
	  @Override
	  public double getPrice1() { 
	   return (super.getPrice1()*exchangeRate);
	  }
	  
	  @Override
	  public double getPrice2() { 
	   return (super.getPrice2()*exchangeRate);
	  }
	  @Override
	  public double getPrice3() { 
	   return (super.getPrice3()*exchangeRate);
	  }
	  @Override
	  public String getTopping3() {
		  return "vegetarian patty";
	  }
	  // I override the getAdvertising because I am advertising this offer in this region only
	  @Override
	  public String getAdvertising() { 
	  return "^ Buy One Get One ZERO % off - CS211 Student Only ^";
	  }
	  // this is the format of the menu for this region
	@Override
	void Menu(String franchise) {

		  DecimalFormat df = new DecimalFormat("#,###,##0.0");
		  
		   if (discountRate>0.0) {
		   
		      String p1=df.format(getPrice1()*(1.0-discountRate));
		      info1= getName1() + " / " + "€" +p1 +" (was: €" + getPrice1()+")";

		      String p2=df.format(getPrice2()*(1.0-discountRate));
		      info2= getName2() + " / " + "€" +p2 +" (was: €" + getPrice2()+")";

		      String p3=df.format(getPrice3()*(1.0-discountRate));
		      info3=getName3() + " / " + "€" +p3 +" (was: €" + getPrice3()+")";   

		   } else {

		      info1= getName1() + " / " + "€" +getPrice1() ;
		      info2= getName2() + " / " + "€" +getPrice2() ;
		      info3= getName3() + " / " + "€" +getPrice3() ;
		   }		
		   new MenuGUI(franchise,info1,getTopping1(),info2,getTopping2(),info3,getTopping3(),getAdvertising());
	}

}