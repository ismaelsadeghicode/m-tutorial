package com.mapsa.test;

import com.mapsa.test.action.HttpMethodApi;
import com.mapsa.test.action.HttpMethodApiFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Esmaeil Sadeghi, 7/30/20 10:03 AM
 */
@WebServlet(name = "FrontControllerServlet", urlPatterns = "/application/*")
public class FrontControllerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpMethodApiFactory httpMethodApiFactory = new HttpMethodApiFactory();
        HttpMethodApi httpMethodApi = httpMethodApiFactory.getHttpMethodApi(req);
        try {
            httpMethodApi.execute(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
