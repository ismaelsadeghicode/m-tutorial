package com.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Esmaeil Sadeghi, 7/30/20 10:05 AM
 */
// action
public interface HttpMethodApi {
    void execute(HttpServletRequest request,
                 HttpServletResponse response) throws Exception;
}
