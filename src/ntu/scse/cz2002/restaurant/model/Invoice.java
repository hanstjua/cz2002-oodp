package ntu.scse.cz2002.restaurant.model;
package DateUtil.java;
import java.util.Calendar;

public class Invoice {

	Calendar timestamp;
	Table table1;
	Order order1;
	double amount;
	//public static DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
	
	
	public Invoice(Table t){
		timestamp = Calendar.getInstance();
		table1 = t;
		order1 = t.getorders();
		amount = calAmt(order1);
	}
	
	public Invoice(Order o){
		Date date = new Date();
		Calendar timestamp = Calendar.getInstance()();
		order1 = o;
		amount = calAmt(o);
		table1 = null;
	}
	
	private double calAmt(Order o) {
		Menuitem[] items = o.getItems();
		double totalAmt = 0;
		for (int i =0; i<items.length; i++) {
			totalAmt += items[i].getPrice(); //menuitem.getprice
		}
		
	return totalAmt;
	}
	
	public Calendar getTimestamp() {
		return timestamp;
	}
	
	private String CalendartoString(Calendar c) {
		int dd = c.get(Calendar.DAY_OF_MONTH);
		int MM = c.get(Calendar.MONTH);
		int YYYY = c.get(Calendar.YEAR);
		int HH = c.get(Calendar.HOUR_OF_DAY);
		int mm = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		return ""+dd+"."+MM+"."+YYYY+" "+HH+":"+mm+":"+sec;
	}
	
	public String toString(){
		return "Timestamp: " + DateFormat.getD 
				"Table " + table1.toString() + " " 
				+ "Amount: " + amount;
	}
	
	public double getAmt() {
		return amount;
	}
	
}
