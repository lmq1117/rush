package com.buy.rush.controller;

import com.buy.rush.entity.User;
import com.buy.rush.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private UserRepository userRepository;

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

    @GetMapping("/index1")
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


    @GetMapping("/test")
    public String test(HttpServletRequest request){
        request.setAttribute("title","thymeleaf页面title test");
        request.setAttribute("desc","欢迎进入本系统desc test");

        Author author = new Author();
        author.setAge(22);
        author.setName("王总");
        author.setEmail("1837307557@qq.com");
        request.setAttribute("author",author);

        final List<User> users = userRepository.findAllByUsername("u1");
        log.info("[条件查询] - [{}]", users);
        final List<User> users2 = userRepository.findByPassword("dsfd");
        log.info("[条件查询2] - [{}]", users2);



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
