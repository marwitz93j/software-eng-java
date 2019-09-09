
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DemoServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    	Random rand = new Random();
    	int number = rand.nextInt(1000000);
    resp.setContentType("text/plain");
    resp.getWriter().println("{ number }");
  }
}
