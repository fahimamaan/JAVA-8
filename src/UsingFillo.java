
import java.util.ArrayList;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class UsingFillo {

	public static void main(String[] args) throws FilloException {
		
		
	System.out.println("filloResult: " + ReadExcelUsingFillo());
}
	public static List<String> ReadExcelUsingFillo() throws FilloException{
		
		
		Fillo fillo = new Fillo();
		
		Connection connection= fillo.getConnection("C:\\Users\\mohfahim\\Documents\\My Received Files\\tryFillo.xlsx");
		
		String query = "Select * from Sheet1 where Runmode='Y'";
		
		Recordset rs = connection.executeQuery(query);
		

		List<String> list = new ArrayList<String>();
		
		while(rs.next()) {
			//System.out.println("FirstName: " + rs.getField("FirstName"));
			list.add(rs.getField("LastName"));
			
		}
		//System.out.println("list is: " + list);
		
		
		
		
		return list;
		
		
	}
	
}