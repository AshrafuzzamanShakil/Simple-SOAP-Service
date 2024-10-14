package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Clint_TC.TextCasting;

/**
 * Servlet implementation class TC_servlet
 */
@WebServlet("/TC_servlet")
public class TC_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TC_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		TextCasting client = new TextCasting();

        // Get parameters from the request
        String value = request.getParameter("value");
        String type = request.getParameter("type");

        // Create a PrintWriter to write the response
        PrintWriter out = response.getWriter();

        // Check if the input value is empty
        if (value == null || value.trim().isEmpty()) {
            out.write("error: Please, provide a value!");
        } else {
            String result = "";

            // Determine the type of conversion based on the "type" parameter
            if ("uppercase".equals(type)) {
                result = client.uppercase(value); // Convert to uppercase using TextCasting
            } else if ("lowercase".equals(type)) {
                result = client.lowwercase(value); // Convert to lowercase using TextCasting
            } else {
                out.write("error: Unknown conversion type!");
                out.flush();
                out.close();
                return; // Exit if the type is unknown
            }

            // Write the result to the response
            out.write(result);
        }

        // Flush and close the output stream
        out.flush();
        out.close();
    }

}
