

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.HelloModel;

/**
 * Servlet implementation class HelloController
 */
@WebServlet("/HelloController")
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private HelloModel model=new HelloModel();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloController() {
        super();//super//**//
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("user");
		if(name==null) {
			name="Mary";
		}
		String message=model.sayHello(name);
		request.setAttribute("GGmsg", message);
		
		request.getRequestDispatcher("helloView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
