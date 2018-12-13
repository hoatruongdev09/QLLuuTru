package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.HoKhauBean;
import bo.HoKhauBo;

/**
 * Servlet implementation class HoKhauController
 */
@WebServlet("/HoKhauController")
public class HoKhauController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HoKhauBo hkBo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoKhauController() {
        super();
        // TODO Auto-generated constructor stub
        hkBo = new HoKhauBo();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			ArrayList<HoKhauBean> listHoKhau = hkBo.danhSachHoKhau();
			request.setAttribute("listHoKhau", listHoKhau);
			request.getRequestDispatcher("DanhSachHoKhau.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		if(request.getParameter("edit") != null) {
			int hokhauid = Integer.parseInt(request.getParameter("hokhauid"));
			try {
				HoKhauBean hokhau = hkBo.layThongTin(hokhauid);
				request.setAttribute("hokhau", hokhau);
				request.getRequestDispatcher("ChinhSuaHoKhau.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(request.getParameter("apply-change")!=null) {
			int hokhauid = Integer.parseInt(request.getParameter("hokhauid"));
			String tinhtp = request.getParameter("tinhtp");
			String quanhuyen = request.getParameter("quanhuyen");
			String phuongxa = request.getParameter("phuongxa");
			String tothong = request.getParameter("tothon");
			int chuhoid = Integer.parseInt(request.getParameter("chuhoid"));
			try {
				hkBo.suaHoKhau(hokhauid, tinhtp, quanhuyen, phuongxa, tothong, chuhoid);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			doGet(request, response);
		}
	}

}
