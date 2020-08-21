package com.mapsa.test.action;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Esmaeil Sadeghi, 7/30/20 10:13 AM
 */
public class HttpMethodApiFactory {

    private static Map<String, HttpMethodApi> actionMap = new HashMap<>();

    static {
        actionMap.put("GET/application/users", new UserGetMethodeApi());
        actionMap.put("POST/application/user", new UserPostMethodApi());
        actionMap.put("GET/notFund", new NotFundHttpMethodApi());
        // todo put & delete & patch for user
    }

    public synchronized HttpMethodApi getHttpMethodApi(HttpServletRequest request){ //
        String path = request.getServletPath() + request.getPathInfo();
        String key = request.getMethod() + path;
        // log
        HttpMethodApi httpMethodApi = actionMap.get(key);
        if(httpMethodApi == null){
            httpMethodApi = actionMap.get("GET/notFund");
        }
        return httpMethodApi;
    }
}
