package com.example.servlet.session.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servlet.utils.HttpSessionInfo;

/**
 * @author Maulik
 * 
 */
@WebServlet("/viewHttpSession")
public class ViewHttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewHttpSession() {
		System.out
				.println("\n ------- ViewHttpSession Constructor Initialize ------- ");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("\n ------- Init Method Called For : "
				+ config.getServletName());
	}

	/**
	 * @throws IOException
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<title>View Http Session</title>");
		printWriter.print("<html><body>");
		printWriter
				.print("<div><a href="
						+ request.getContextPath()
						+ "/httpSessionDemo target=_black> <<< Back to Http Session home</a></div>");
		HttpSession httpSession = HttpSessionInfo.getHttpSession(request);
		printWriter
				.print("<div align='center'><h2>View Http Session Demo</h2></div>");
		printWriter.print(HttpSessionInfo
				.displayInfoAboutHttpSession(httpSession));
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
