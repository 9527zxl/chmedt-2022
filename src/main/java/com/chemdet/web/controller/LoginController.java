package com.chemdet.web.controller;

import com.chemdet.web.enums.ResultCode;
import com.chemdet.web.format.JsonResult;
import com.chemdet.web.pojo.SysUser;
import com.chemdet.web.service.SysUserService;
import com.google.code.kaptcha.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login")
    public String about() {

        return "manager/login";
    }

    @PostMapping("/login/check")
    public @ResponseBody JsonResult check(@RequestParam String user_name, @RequestParam String password, @RequestParam String captcha, HttpSession session) {
        // 验证码验证
        String kaptcha = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        System.out.println(kaptcha);
        if (!captcha.equalsIgnoreCase(kaptcha)) {
            return new JsonResult(ResultCode.ERROR.getCode(), "验证码错误");
        }

        return null;
    }
}
