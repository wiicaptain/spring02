

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.UserMessage;

/**
 * Servlet implementation class UserMessageController
 */
@WebServlet("/msgcontroller")
public class UserMessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserMessageController() {
        super();
        // TODO Auto-generated constructor stub
    }

    List<UserMessage> generate(){
    	List<UserMessage> data=new ArrayList<>();
    	data.add(new UserMessage("john","hello"));
    	data.add(new UserMessage("George","hi"));
    	data.add(new UserMessage("Mary","Greetings"));
    	return data;
    }
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		//List<UserMessage> data=generate();
		//也可以這樣寫
		List<UserMessage> data=new ArrayList<>();
		data.add(new UserMessage("john","hello"));
    	data.add(new UserMessage("George","hi"));
    	data.add(new UserMessage("Mary","Greetings"));
		
		
		request.setAttribute("message", data);
		request.getRequestDispatcher("msgView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
