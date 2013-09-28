package com.bargebq.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**This class is to use the dao and print the objects being passed
 to the class
 @author Larry
 @version .1
 *
 */

@WebServlet(description = "BargeBQ!", urlPatterns = { "/BargeBQServlet" })
public class DisplayControl extends HttpServlet {
	/** The Servlet that displays the objects passed to 
	 * 	the class. 
	 */
	private static final long serialVersionUID = 1L;
	
	//private InventoryDao data = new InventoryDaoArrayListImpl();
	private InventoryDao data = new InventoryDaoDBImpl();
	
	public DisplayControl(){
		
	}//Constructor for the DisplayView class.
	           
	
	private void DisplayData(ServletOutputStream out)throws IOException{
		
		//for loop goes here to iterate and pass the elements out the passed
		//data.
		//if (out != null){
			out.println("<Html> <body>"); 
			for (String StrArray: data.getData() ){
					out.print("Array data is in StrArray: " +StrArray+ "<br>");
					out.println("<b>" +"This is from the DisplayData for loop" + "</b>" + "<br>");
					
			}
		//}
			//out.close();
		//else{
//			System.out.println("The result set was null");
//		} 
			
		//out.println("<Html><body>");
	}//Method to display objects passed from dao

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		DisplayData(response.getOutputStream());
		
		for (String dataO: data.getData() ){
			//System.out.println("dataO is: " + dataO);
			response.getOutputStream().println(data.getData().size());
			response.getOutputStream().println(dataO);
			response.getOutputStream().println("This is in the for loop");
		}

		response.getOutputStream().println(data.getData().size());
		response.getOutputStream().println("Hello World! this is new");
		response.getOutputStream().println("Remote Host: " + request.getRemoteHost());
		response.getOutputStream().println("</html></body>");
		response.getOutputStream().close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
		
	}

	
}
