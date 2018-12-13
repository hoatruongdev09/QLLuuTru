package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Mix;
import bo.LichSuLuuTruBo;

/**
 * Servlet implementation class LichSuLuuTruController
 */
@WebServlet("/LichSuLuuTruController")
public class LichSuLuuTruController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LichSuLuuTruBo lsLuuTruBo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LichSuLuuTruController() {
        super();
        // TODO Auto-generated constructor stub
        lsLuuTruBo = new LichSuLuuTruBo();
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
		if(request.getParameter("search") != null) {
			int cmndid = Integer.parseInt(request.getParameter("cmndid"));
			try {
				ArrayList<Mix> listLS = lsLuuTruBo.layLichSuLuuTru(cmndid);
				request.setAttribute("listLS", listLS);
				request.getRequestDispatcher("DanhDachLichSu.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(request.getParameter("delete")!=null) {
			int cmndid = Integer.parseInt(request.getParameter("cmndid"));
			int hokhauid = Integer.parseInt(request.getParameter("hokhauid"));
			String ngay = request.getParameter("tbatdau");
			
			SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date ngaybatdau = new Date(dd.parse(ngay).getTime());
				try {
					lsLuuTruBo.xoaLichSuLuuTru(cmndid, hokhauid, ngaybatdau);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ArrayList<Mix> listLS;
			try {
				listLS = lsLuuTruBo.layLichSuLuuTru(cmndid);
				request.setAttribute("listLS", listLS);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("DanhDachLichSu.jsp").forward(request, response);
		}
	}

}
