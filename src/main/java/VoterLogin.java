

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class VoterLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		DbManager db = new DbManager();
		   java.sql.Connection  con = db.getConnection();
		   
		   String vNumber=request.getParameter("voterNumber");
		   try {
			   PreparedStatement st=con.prepareStatement("select vNumber from temp_vc_number where vNumber = '"+vNumber+"'");
			   ResultSet rs=st.executeQuery("select vNumber from temp_vc_number where vNumber = '"+vNumber+"'");
			   //already voted condition
			   if(rs.next()) {
				   //already have login 
				   response.sendRedirect("voterWelcome.jsp");
			   }else {
				   //if person has not any prev login so redirect it to registration page 
				   PreparedStatement  st1 = con.prepareStatement("select * from voters where voterNo = '"+vNumber+"'");
					ResultSet rs1 = ((java.sql.Statement) st).executeQuery("select * from voters where voterNo = '"+vNumber+"'");
					if(rs1.next()) {
						
						response.sendRedirect("voterWelcome.jsp");
					}else {
						response.sendRedirect("invalid.jsp");
					}
			   }
			   
			   
		   }catch(Exception e) {
			   e.printStackTrace();
			   
		   }
	}

}
