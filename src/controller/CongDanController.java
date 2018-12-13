package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.CongDanBo;

/**
 * Servlet implementation class CongDanController
 */
@WebServlet("/CongDanController")
public class CongDanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CongDanBo cdBo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CongDanController() {
        super();
        // TODO Auto-generated constructor stub
        cdBo = new CongDanBo();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		if(request.getParameter("add") != null) {
			String ten = request.getParameter("ten");
			String ho = request.getParameter("ho");
			String ngaysinh = request.getParameter("ngaysinh");
			String gioitinh = request.getParameter("gioitinh");
			String noisinh = request.getParameter("noisinh");
			String tthonnhan = request.getParameter("tthonnhan");
			String nghenghiep = request.getParameter("nghenghiep");
			
			SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
			
			try {
				Date ngaySinhDate = dd.parse(ngaysinh);
				Date currentDate = new Date();
				if(ngaySinhDate.getTime() < currentDate.getTime()) {
					java.sql.Date dateNgaySinh = new java.sql.Date(ngaySinhDate.getTime());
					try {
						cdBo.themCongDan(ten, ho, dateNgaySinh, gioitinh, noisinh, tthonnhan, nghenghiep);
						String stt = "Da them thanh cong";
						request.setAttribute("stt", stt);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					request.getRequestDispatcher("ThemCongDan.jsp").forward(request, response);
				}else {
					String stt = "Ngay sinh khong hop le";
					request.setAttribute("stt", stt);
					request.getRequestDispatcher("ThemCongDan.jsp").forward(request, response);
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				String stt = "Ngay sinh khong hop le";
				request.setAttribute("stt", stt);
				request.getRequestDispatcher("ThemCongDan.jsp").forward(request, response);
			}
			
			
			//response.getWriter().append(ten +"; " + ho +"; " + ngaysinh +"; " + gioitinh +"; " + noisinh + "; " + tthonnhan + "; " + nghenghiep);
		}
	}

}
