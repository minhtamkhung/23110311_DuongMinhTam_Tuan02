<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập tài khoản</title>
    <!-- Assuming Bootstrap and Font Awesome are included -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <div class="container">
        <form action="login" method="post">
            <h2>Đăng nhập tài khoản</h2>
            <c:if test="${alert != null}">
                <h3 class="alert alert-danger">${alert}</h3>
            </c:if>
            <section>
                <label class="input login-input">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input type="text" placeholder="Tài khoản" name="username" class="form-control" required>
                    </div>
                </label>
            </section>
            <section>
                <label class="input login-input">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                        <input type="password" placeholder="Mật khẩu" name="password" class="form-control" required>
                    </div>
                </label>
            </section>
            <section>
                <button type="submit" class="btn btn-primary">Đăng nhập</button>
            </section>
        </form>
    </div>
</body>
</html>