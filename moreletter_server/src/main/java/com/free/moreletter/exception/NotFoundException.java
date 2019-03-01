package com.free.moreletter.exception;

import com.free.moreletter.conf.constants.HttpCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class NotFoundException implements ErrorController {

    private static final String PATH = "/error";

    @Autowired
    private ErrorAttributes errorAttributes;

    @Override
    public String getErrorPath() {
        return PATH;
    }


    @RequestMapping
    @ResponseBody
    public Object doHandleError(HttpServletRequest request) {

        return new ExceptionResult("找不到路径:"+request.getRequestURL(), HttpCode.CODE_NOT_FOND);
    }

}
