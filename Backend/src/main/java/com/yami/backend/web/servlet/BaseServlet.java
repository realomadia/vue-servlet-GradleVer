package com.yami.backend.web.servlet;

import com.alibaba.fastjson.JSON;
import com.yami.backend.web.dto.ApiResult;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class BaseServlet extends HttpServlet {
    /**
     * @param response
     * @param result
     */
        protected void write(HttpServletResponse response, ApiResult result) throws IOException {
            response.setContentType("application/json;charset=utf-8");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Allow-Methods", "*");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "Authorization,Origin,X-Requested-With,Content-Type,Accept,content-Type,origin,x-requested-with,content-type,accept,authorization,token,id,X-Custom-Header,X-Cookie,Connection,User-Agent,Cookie,*");
            response.setHeader("Access-Control-Request-Headers", "Authorization,Origin, X-Requested-With,Content-Type,Accept");
            String jsonStr = JSON.toJSONString(result);
            response.getWriter().write(jsonStr);
            response.getWriter().flush();
    }
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        super.service(request, response);
    }
}
