<%@page import="bean.HoKhauBean"%>
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
	ArrayList<HoKhauBean> listHoKhau = (ArrayList<HoKhauBean>)request.getAttribute("listHoKhau");
	int listSize = listHoKhau.size();
%>
<body>
<div class="container">
  <h2>Danh sách</h2>          
  <table class="table">
    <thead>
      <tr>
        <th>HoKhauId</th>
        <th>Tinh_TP</th>
        <th>Quan_Huyen</th>
        <th>Phuong_Xa</th>
        <th>To_Thon</th>
        <th>ChuHoId</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    <%for(int i=0;i<listSize;i++){ %>
    	<tr>
        <td><%=listHoKhau.get(i).getHoKhauId()%></td>
        <td><%=listHoKhau.get(i).getTinh_TP() %></td>
        <td><%=listHoKhau.get(i).getPhuong_Xa() %></td>
        <td><%=listHoKhau.get(i).getTo_Thong() %></td>
        <td><%=listHoKhau.get(i).getChuHoId() %></td>
        <form action="HoKhauController" method="post">
       		<input type="hidden" name="hokhauid" value="<%=listHoKhau.get(i).getHoKhauId()%>">
       		<td><button type="submit" name="edit" value=" " class="btn btn-primary">Sửa</button></td>
        </form>
      </tr>
    <%} %>
    </tbody>
  </table>
</div>
</body>
</html>