<%@page import="bean.Mix"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="content/css/bootstrap.min.css">
<script src="content/js/bootstrap.min.js"></script>
</head>
<%
	ArrayList<Mix> listLS = null;
	if(request.getAttribute("listLS") != null){
		listLS = (ArrayList<Mix>)request.getAttribute("listLS");
	}
%>
<body>
<div class="container">
	<div class="row">
   <div class="input-group mb-3">
   <form action="LichSuLuuTruController" method="post">
   		<input type="number" class="form-control" placeholder="tìm" name="cmndid">
    	<div class="input-group-append">
      	<button class="btn btn-primary" type="submit" name="search" value=" " >Tìm</button>  
     	</div>
   </form></div>
   </div>
<div class="container">
   <%if(listLS != null){ %>
   	<h2>Lịch sử</h2>         
  <table class="table">
    <thead>
      <tr>
        <th>CmndId</th>
        <th>Họ</th>
        <th>Tên</th>
        <th>Tỉnh/TP</th>
        <th>Quận/Huyện</th>
        <th>Phường/Xã</th>
        <th>Tổ/Thôn</th>
        <th>Thời gian bắt đầu</th>
        <th>Thời gian kết thúc</th>
        <th>Tên loại lưu trú</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    	<%for(int i=0;i<listLS.size();i++){ %>
    	 <tr>
	        <td><%=listLS.get(i).getCongDan().getCmndID() %></td>
	        <td><%=listLS.get(i).getCongDan().getHo() %></td>
	        <td><%=listLS.get(i).getCongDan().getTen() %></td>
	        <td><%=listLS.get(i).getHoKhau().getTinh_TP() %></td>
	        <td><%=listLS.get(i).getHoKhau().getQuan_Huyen() %></td>
	        <td><%=listLS.get(i).getHoKhau().getPhuong_Xa() %></td>
	        <td><%=listLS.get(i).getHoKhau().getTo_Thong() %></td>
	        <td><%=listLS.get(i).getLichSuLT().getThoiGianBatDauLT() %></td>
	        <td><%=listLS.get(i).getLichSuLT().getThoiGianKetThucLT() %></td>
	        <td><%=listLS.get(i).getLoaiLT().getTenLoaiLuuTru() %></td>
	        <form action="LichSuLuuTruController" method="post">
	        	<input type="hidden" name="cmndid" value="<%=listLS.get(i).getCongDan().getCmndID()%>">
	        	<input type="hidden" name="hokhauid" value="<%=listLS.get(i).getHoKhau().getHoKhauId()%>">
	        	<input type="hidden" name="tbatdau" value="<%=listLS.get(i).getLichSuLT().getThoiGianBatDauLT()%>">
	        	<td><button class="btn btn-primary" type="submit" name="delete" value=" " >xóa</button></td>
	        </form>
	      </tr>
    	<%} %>
      
    </tbody>
  </table>
   <%} %>
</div>
</div>
</body>
</html>