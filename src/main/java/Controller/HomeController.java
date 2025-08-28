package Controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/home")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy thông báo từ request (nếu có)
        String alert = (String) req.getAttribute("alert");
        if (alert != null) {
            req.setAttribute("alert", alert); // Giữ thông báo
        }
        req.getRequestDispatcher("/home.jsp").forward(req, resp); // Chuyển tới home.jsp
    }
}