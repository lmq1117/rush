package com.buy.rush.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class HelloController {

    @GetMapping({"/", "/hello"})
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");

        //设置属性
        view.addObject("title","thymeleaf页面title");
        view.addObject("desc","欢迎进入本系统desc");

        Author author = new Author();
        author.setAge(22);
        author.setName("王总");
        author.setEmail("1837307557@qq.com");

        view.addObject("author",author);
        return view;
    }

    @GetMapping("index1")
    public String index1(HttpServletRequest request){
        request.setAttribute("title","thymeleaf页面title");
        request.setAttribute("desc","欢迎进入本系统desc index1");

        Author author = new Author();
        author.setAge(22);
        author.setName("王总");
        author.setEmail("1837307557@qq.com");
        request.setAttribute("author",author);
        return "index";




    }

    class Author {
        private int age;
        private String name;
        private String email;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

}
