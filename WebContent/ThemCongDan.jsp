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
	String stt = null;
	if(request.getAttribute("stt")!= null){
		stt = (String)request.getAttribute("stt");
	}
%>
<body><div class="container">
  <h2>Thêm công dân</h2>
  <%if(stt != null){ %>
  	<p><%=stt %></p>
  <%} %>
  <form action="CongDanController" method="post">
    <div class="form-group">
      <label for="email">Tên:</label>
      <input type="text" class="form-control" id="email" name="ten">
    </div>
    <div class="form-group">
      <label for="pwd">Họ:</label>
      <input type="text" class="form-control" id="pwd" name="ho">
    </div>
    <div class="form-group">
      <label for="pwd">Ngày sinh:</label>
      <input type="date" class="form-control" id="pwd" name="ngaysinh">
    </div>
    <div class="form-group">
      <label for="pwd">Giới tính:</label>
   	  <select class="form-control" id="sel1" name="gioitinh">
	    <option value="nam">Nam</option>
	    <option value="nu">Nữ</option>
	  </select>   	
    </div>
    <div class="form-group">
      <label for="pwd">Nơi sinh:</label>
      <input type="text" class="form-control" id="pwd" name="noisinh">
    </div>
    <div class="form-group">
      <label for="pwd">Tình trạng hôn nhân:</label>
      <input type="text" class="form-control" id="pwd" name="tthonnhan">
    </div>
    <div class="form-group">
      <label for="pwd">Nghề nghiệp:</label>
      <input type="text" class="form-control" id="pwd" name="nghenghiep">
    </div>
    <button type="submit" name="add" value=" " class="btn btn-default">Thêm</button>
  </form>
</div>
</body>
</html>