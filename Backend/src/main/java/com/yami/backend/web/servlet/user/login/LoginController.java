package com.yami.backend.web.servlet.user.login;

import com.yami.backend.web.dto.ApiResult;
import com.yami.backend.web.servlet.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = {"/api/login"})
public class LoginController extends BaseServlet {
    ApiResult result = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        System.out.println(id);
        System.out.println(password);
        result = new ApiResult();
        result.setCode("200");
        result.setMessage("에러메세지 또는 성공 메세지");
        result.setBody("백에서 가져갈 데이터");

        this.write(response,result);
    }
}
