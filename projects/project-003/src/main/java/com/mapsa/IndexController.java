package com.mapsa;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping
    public String index(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Employee createEmployee(@RequestBody Employee emp) {
        return emp;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody
    Employee deleteEmployee(@RequestBody Employee emp) {
        return emp;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody
    Employee putEmployee(@RequestBody Employee emp) {
        return emp;
    }
}
