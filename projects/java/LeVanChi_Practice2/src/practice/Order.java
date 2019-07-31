package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order  {
	private int id;
	private String description;
	private Date dateOrder;
	
	public Order(int id,String description,Date dateOrder) {
		this.id = id;
		this.description = description;
		this.dateOrder = dateOrder;
	}
	
	

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Order {");
		sb.append(" id =" +this.id);
		sb.append(" dateOrder =" +(new SimpleDateFormat("YYYY/MM/dd")).format(this.dateOrder));
		sb.append(" descripton =" +this.description);
		sb.append("}");
		return sb.toString();
				
	} 
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	
	
}
