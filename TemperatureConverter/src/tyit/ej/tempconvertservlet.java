package tyit.ej;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class tempconvertservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Temperature=request.getParameter("celcius");
		int celcius=Integer.parseInt(Temperature);
		PrintWriter out=response.getWriter();
		float Farenhite=(float) ((celcius*1.8)+32);
		float Kelvin=(float) (celcius+273.15);
		out.write("<h1>Temperature in Celcius:"+celcius+"° C</h1>");
		out.write("<h1>Temperature in Farenhite:"+Farenhite+"F</h1>");
		out.write("<h1>Temperature in Kelvin:"+Kelvin+"K</h1>");
		out.close();
	}
}
