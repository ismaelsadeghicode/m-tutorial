package com.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Esmaeil Sadeghi, 7/30/20 10:16 AM
 */
public class NotFundHttpMethodApi implements HttpMethodApi{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.sendRedirect(request.getContextPath()+"/notFund.html");
    }
}
