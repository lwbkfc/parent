<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/1/6
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title></title>
    <script src="http://code.jquery.com/jquery-2.2.0.min.js"></script>
    <script src="http://malsup.github.io/jquery.form.js"></script>

  </head>
  <body>
  <form action="http://localhost:38000/albumtheme/multiinsert" method="post" >
    <input type="text" name="themeId" value="1"/>
    <input type="text" name="themeType" value="GOODS_FACE_PIC"/>
    <input type="text" name="multiAlbumIdStr" value="30,31,32,33"/>
    <input type="submit"/>
  </form>

  </body>
</html>
