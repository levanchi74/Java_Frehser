package practice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass {
	
	public static void main(String[] args) throws IOException {
		

		
		Employee emp1 = new Employee("chilevan", 1997, 133, "Tan Binh");
		Employee emp2 = new Employee("tutai", 1997, 12, "Tan Binh");
		Employee emp3 = new Employee("huynh", 1997, 643, "Thu Duc");
		
		Order order1 = new Order(1, "description",new Date(2019/12/30) );
		Order order2 = new Order(2, "description",new Date(2019/8/25) );
		Order order3 = new Order(3, "description",new Date(2018/10/25) );
		
		// Bai 1
		Map<Integer, Order> orders = new HashMap<Integer,Order>();
		orders.put(order1.getId(), order1);	
		orders.put(order3.getId(), order3);
		orders.put(order2.getId(), order2);
		
		for(Entry<Integer, Order> order: orders.entrySet()) {
			System.out.println(order.toString());
		}
		
		
		// Bai 2
	    // Order comparator with id
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		
		OrderComparatorWithId comparator = new OrderComparatorWithId();
		Collections.sort(orderList, comparator);
		System.out.println(orderList);
		
		// Employee comparable with name
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp3);
		employeeList.add(emp2);
		
		Collections.sort(employeeList);
		System.out.println(employeeList);
		
		
		
		
		
		
		//coppy file
		FileInputStream fileInputStream = null;
		FileOutputStream OutputStream =   null;
		try {
			fileInputStream =new FileInputStream("D:\\FresherDXC\\dxcw.docx");
			OutputStream =new FileOutputStream("D:\\ABC\\dxcw.docx");
			int length;
			byte[] buffer= new byte[1024];
			while((length = fileInputStream.read(buffer)) > 0)
			{
				 OutputStream.write(buffer, 0, length);
				 System.out.println("thanh cong");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// doc file
		File f = new File("D:\\ABC\\a.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		fileInputStream = new FileInputStream(f);
		int c = fileInputStream.read();
		while(c != -1)
		{
			c=fileInputStream.read();
			System.out.print((char)c);
		}
		fileInputStream.close();
		OutputStream = new FileOutputStream(f);
		String s ="qwertyuiop";
		OutputStream.write(s.getBytes());
		OutputStream.close();
	
		
	}
}
