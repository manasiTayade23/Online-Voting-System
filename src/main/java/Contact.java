

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Contact
 */
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public Contact() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		DbManager db=new DbManager();
		java.sql.Connection con=db.getConnection();
		//out.print("working");
		 
		
		String name=request.getParameter("Name");
		String number=request.getParameter("phoneNo");
		String email=request.getParameter("email");
		String comment=request.getParameter("comments");
		
		try {
			//put sql query inside braces 
			PreparedStatement st=con.prepareStatement("insert into contact(uNmae,pnumber,email,comment)values('"+name+"','"+number+"','"+email+"','"+comment+"')");
			st.executeUpdate();
			response.sendRedirect("index.jsp");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	} 

}
