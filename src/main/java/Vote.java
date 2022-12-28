

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;

public class Vote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DbManager db = new DbManager();
		java.sql.Connection  con = db.getConnection();
		
		String vNumber=request.getParameter("votedId");
		String party=request.getParameter("party");
		
		try {
		PreparedStatement st1 = con.prepareStatement("insert into temp_vc_number(vNumber)values('"+vNumber+"')");
    	PreparedStatement st2 = con.prepareStatement("insert into vote(vNumber,party)values ('"+vNumber+"','"+party+"')");
		
    	
    	st1.executeUpdate();
    	st2.executeUpdate();
    	
    	
    	
		response.sendRedirect("index.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
    	
	}

}
