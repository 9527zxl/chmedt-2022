package com.chemdet.web.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class CaptchaController {

    @Autowired
    private DefaultKaptcha captchaProducer;

    @GetMapping("/captcha.jpg")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 设置内容类型
        response.setContentType("image/jpeg");
        // 创建验证码文本
        String captchaText = captchaProducer.createText();
        // 将验证码存入Session
        HttpSession session = request.getSession();
        session.setAttribute("captcha", captchaText);
        // 创建验证码图片
        BufferedImage captchaImage = captchaProducer.createImage(captchaText);
        // 获取响应输出流
        ServletOutputStream outputStream = response.getOutputStream();
        // 输出验证码图片
        ImageIO.write(captchaImage, "jpeg", outputStream);
        outputStream.flush();
        outputStream.close();
    }
}
