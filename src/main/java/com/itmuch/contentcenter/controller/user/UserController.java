//package com.itmuch.contentcenter.controller.user;
//
//import com.itmuch.contentcenter.domain.entity.user.User;
//import com.itmuch.contentcenter.service.user.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/{id}")
//    public User findById(@PathVariable Integer id) {
//        return userService.findById(id);
//    }
//}
