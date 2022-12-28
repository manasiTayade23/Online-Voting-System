

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;


public class RegisterVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		DbManager db = new DbManager();
		   java.sql.Connection  con = db.getConnection();
		
		   String name = request.getParameter("name");
		   String contact = request.getParameter("number");
		   String email = request.getParameter("email");  
           String voterNo = request.getParameter("voternumber");
           String address = request.getParameter("address");
           String dob = request.getParameter("dob");
           
           
           try {
        	   PreparedStatement st=con.prepareStatement("insert into voters (uName,pNumber,email,voterNo,address,dob) "
        	   		+ "values('"+name+"','"+contact+"','"+email+"','"+voterNo+"','"+address+"','"+dob+"')");
        	   st.executeUpdate();
        	   response.sendRedirect("adminwelcome.jsp");
        	   
        	   
           }catch(Exception e) {
        	   e.printStackTrace();
        	   
           }
            
	}

}
