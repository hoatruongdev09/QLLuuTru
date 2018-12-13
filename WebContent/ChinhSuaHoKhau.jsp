<%@page import="bean.HoKhauBean"%>
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
	HoKhauBean hokhau = (HoKhauBean)request.getAttribute("hokhau");
%>
<body>
<div class="container">
  <h2>Chỉnh sửa</h2>
  <form action="HoKhauController" method="post">
    <div class="form-group">
      <label for="email">Tỉnh thành phố:</label>
      <input type="text" class="form-control" id="email"  name="tinhtp" value="<%=hokhau.getTinh_TP()%>">
    </div>
    <div class="form-group">
      <label for="pwd">Quận huyện:</label>
      <input type="text" class="form-control" id="pwd" name="quanhuyen" value="<%=hokhau.getQuan_Huyen()%>">
    </div>
    <div class="form-group">
      <label for="pwd">Phường xã:</label>
      <input type="text" class="form-control" id="pwd" name="phuongxa" value="<%=hokhau.getPhuong_Xa()%>">
    </div>
    <div class="form-group">
      <label for="pwd">Tổ thôn:</label>
      <input type="text" class="form-control" id="pwd" name="tothon" value="<%=hokhau.getTo_Thong()%>">
    </div>
    <div class="form-group">
      <label for="pwd">Chủ hộ:</label>
      <input type="text" class="form-control" id="pwd" name="chuhoid" value="<%=hokhau.getChuHoId()%>">
    </div>
    <input type="hidden" name="hokhauid" value="<%=hokhau.getHoKhauId()%>">
    <button type="submit" class="btn btn-default" name="apply-change" value=" ">Thay đổi</button>
  </form>
</div>
</body>
</html>