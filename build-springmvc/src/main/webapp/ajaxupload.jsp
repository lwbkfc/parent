<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
          + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <!--
  <link rel="stylesheet" type="text/css" href="styles.css">
  -->
  <script language="javascript" src="js/jquery-2.2.0.min.js" ></script>
  <script language="javascript" src="js/ajaxfileupload.js" > </script>

  <script type="text/javascript">
    function ajaxFileUpload(){
      $.ajaxFileUpload({
                url:'http://localhost:38000/album/upload',             //需要链接到服务器地址
                secureuri:false,
                fileElementId:'uploadFileInput',
                  async: false,//文件选择框的id属性
                  contentType: "application/json;charset=utf-8",
                 dataType: 'json',                                     //服务器返回的格式，可以是json
                success: function (data){             //相当于java中try语句块的用法{
                    alert(data);
                },
                error: function (data, status, e)             //相当于java中catch语句块的用法
                {
                  $('#result').html('上传图片失败');
                }
              }
      );
    }
  </script>
</head>

<body>
<form name="form_uploadImg" action="" method="POST" enctype="multipart/form-data">
  <input id="uploadFileInput" type="file" size="45" name="file" class="input" />
  <input type="button" id="buttonUpload" onclick="return ajaxFileUpload();" value="上传图片"/>
</form>
</html>  