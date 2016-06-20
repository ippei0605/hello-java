package wasdev.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import wasdev.sample.model.HelloBean;
import javax.inject.Inject;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    /** シリアルバージョンID */
    private static final long serialVersionUID = 1808808594661653378L;
    @Inject
    private HelloBean helloBean;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");

        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println(
                "<head><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\" /></head>");

        out.println("<h1>" + helloBean.getMessage() + "</h1>");

        out.println("</body></html>");
        out.println("</body></html>");
    }
}