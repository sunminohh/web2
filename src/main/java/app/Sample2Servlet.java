package app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sample2Servlet extends HttpServlet{

	private long maxUploadSize;
	private String saveDirectory;
	

	// 생성자에서 초기화하면 안됨. 이 객체가 생성되야 servletConfig객체가 만들어진다.
	@Override
	public void init() throws ServletException {
		// 서블릿의 초기화 파라미터값을 조회해서 멤버변수의 값을 초기화한다.
		ServletConfig config = getServletConfig();
		String value1 = config.getInitParameter("maxUploadSize");
		String value2 = config.getInitParameter("saveDirectory");
		
		maxUploadSize = Long.parseLong(value1);
		saveDirectory = value2;
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>서블릿 초기화 파라미터값 연습</h1>");
		out.println("<dl>");
		out.println("<dt>최대 업로드 사이즈</dt><dd>"+maxUploadSize+"</dd>");
		out.println("<dt>저장 경로</dt><dd>"+saveDirectory+"</dd>");
		out.println("</dl>");
		out.println("</body>");
		out.println("</html>");
		
	}
}















