package com.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Esmaeil Sadeghi, 7/30/20 10:07 AM
 */
public class UserGetMethodeApi implements HttpMethodApi{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // create response list user
        request.getRequestDispatcher(request.getServletContext().getContextPath()
        + "/application/user.jsp").forward(request, response);

    }
}
