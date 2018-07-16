import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class YourName extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException ,IOException{
			
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			String yourname = request.getParameter("yourname");
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title>君の名は</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>");
			out.println("<h2>君の名は"+yourname+"さんですね。</h2>");
			out.println("<p>");
			out.println("<h3>さぁ来い！</h3>");
			out.println("<p>");
			out.println("</body>");
			out.println("</html>");
		
		}
}
