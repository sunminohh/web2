package app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/sample3")
public class Sample3Servlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 요청객체, 세션객체, 애플리케이션객체에 속성 저장하기
		// 위의 객체에는 속성을 저장할 수 있다.
		// 속성은 name, value 쌍으로 저장된다. name은 String 타입, value는 Object타입이다.
		// value 타입이 Object이기 때문에 속성으로 저장할 수 있는 값의 종류에는 제약이 없다.
		
		
		// 편의를 위해서 value도 문자열값을 저장한다.
		
		// 요청객체에 속성 저장하기
		req.setAttribute("n1", "v1");
		
		// 세션객체에 속성 저장하기
		HttpSession session = req.getSession();
		session.setAttribute("n2", "v2");
		
		// 애플리케이션객체에 속성 저장하기
		ServletContext application = getServletContext();
		application.setAttribute("n3", "v3");
		
		PrintWriter out = resp.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>속성의 스코프 연습</h1>");
		out.println("<p>속성값 저장이 완료되었습니다.</p>");
		out.println("</body>");
		out.println("</html>");
		
	}
}








