<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ajax File Uploader Plugin For Jquery</title>
    <script src="http://code.jquery.com/jquery-2.2.0.min.js"></script>
    <script src="http://malsup.github.io/jquery.form.js"></script>
    <script src="js/ajaxfileupload.js"></script>
    <script type="text/javascript">
        function ajax2FileUpload() {
            $("#loading").ajaxStart(function() {
                $(this).show();
            }).ajaxComplete(function() {
                $(this).hide();
            });

            $.ajaxFileUpload({
                url : 'http://localhost:18000/album/upload',// servlet请求路径
                secureuri : false,
                fileElementId : 'fileToUpload',// 上传控件的id
                dataType : 'json',
                data : {}, // 其它请求参数
                success : function(data) {
                    alert(data)
                },
                error : function(data, status, e) {
                    alert('上传出错');
                }
            })

            return false;

        }
    </script>
</head>

<body>
<h1>Ajax文件上传例子,JAVA版</h1>

<form name="form" action="" method="POST" enctype="multipart/form-data">

    <input id="fileToUpload" type="file" size="45" name="fileToUpload"
           class="input">
    <button class="button" onclick="return ajax2FileUpload();">上传</button>
</form>
</body>
</html>